package com.klinker.android.talon.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;

import com.klinker.android.talon.R;
import com.klinker.android.talon.manipulations.NetworkedCacheableImageView;
import com.klinker.android.talon.ui.UserProfileActivity;
import com.klinker.android.talon.utils.Utils;

import java.util.ArrayList;

import twitter4j.Twitter;
import twitter4j.User;

/**
 * Created by luke on 11/27/13.
 */
public class UserListMembersArrayAdapter extends PeopleArrayAdapter {

    private int listId;

    public UserListMembersArrayAdapter(Context context, ArrayList<User> users, int listId) {
        super(context, users);
        this.listId = listId;
    }

    @Override
    public void bindView(final View view, Context mContext, final User user) {
        final ViewHolder holder = (ViewHolder) view.getTag();

        holder.name.setText(user.getName());
        holder.screenName.setText("@" + user.getScreenName());

        holder.picture.loadImage(user.getBiggerProfileImageURL(), true, null, NetworkedCacheableImageView.CIRCLE);

        holder.picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewProfile = new Intent(context, UserProfileActivity.class);
                viewProfile.putExtra("name", user.getName());
                viewProfile.putExtra("screenname", user.getScreenName());
                viewProfile.putExtra("proPic", user.getBiggerProfileImageURL());
                //viewProfile.putExtra("tweetid", holder.tweetId);
                viewProfile.putExtra("retweet", false);

                context.startActivity(viewProfile);
            }
        });

        holder.background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(context)
                        .setTitle(context.getResources().getString(R.string.remove_user))
                        .setMessage(context.getResources().getString(R.string.remove) + " " + user.getName() + " " + context.getResources().getString(R.string.from_list) + "?")
                        .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                try {
                                    new RemoveUser().execute(user.getId() + "");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                        .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create()
                        .show();
            }
        });
    }

    class RemoveUser extends AsyncTask<String, Void, Boolean> {

        protected Boolean doInBackground(String... urls) {
            try {
                Twitter twitter =  Utils.getTwitter(context);

                twitter.destroyUserListMember(listId, Long.parseLong(urls[0]));

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        protected void onPostExecute(Boolean removed) {
            if (removed) {
                Toast.makeText(context, R.string.removed_user, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, R.string.error, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
