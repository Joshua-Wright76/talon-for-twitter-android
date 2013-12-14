/*
 * Copyright 2013 Jacob Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klinker.android.talon.adapters.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.klinker.android.talon.R;
import com.klinker.android.talon.ui.widgets.EmojiKeyboard;

public class OtherEmojiAdapter extends BaseEmojiAdapter {

    public OtherEmojiAdapter(Context context, EmojiKeyboard keyboard) {
        super(context, keyboard);
    }

    @Override
    public int getCount() {
        return mEmojiTexts.length;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            int scale = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, context.getResources().getDisplayMetrics());
            imageView.setPadding(scale, (int)(scale*1.2), scale, (int)(scale * 1.2));
            imageView.setAdjustViewBounds(true);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageDrawable(res.getDrawable(sIconIds[position]));
        imageView.setBackgroundResource(R.drawable.pressed_button);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyboard.insertEmoji(mEmojiTexts[position], sIconIds[position]);
            }
        });

        return imageView;
    }

    public static final String[] mEmojiTexts = {
            // other
            "\uD83D\uDD1d", "\uD83D\uDD19", "\uD83D\uDD1b", "\uD83D\uDD1c", "\uD83D\uDD1a",
            "\u23f3", "\u231b", "\u23f0", "\u2648", "\u2649",
            "\u264a", "\u264b", "\u264c", "\u264d", "\u264e",
            "\u264f", "\u2650", "\u2651", "\u2652", "\u2653",
            "\u26ce", "\uD83D\uDD31", "\uD83D\uDD2f", "\uD83D\uDEbb", "\uD83D\uDEae",
            "\uD83D\uDEaf", "\uD83D\uDEb0", "\uD83D\uDEb1", "\uD83C\uDD70", "\uD83C\uDD71",
            "\uD83C\uDD8e", "\uD83C\uDD7e", "\uD83D\uDCae", "\uD83D\uDCaf", "\uD83D\uDD20",
            "\uD83D\uDD21", "\uD83D\uDD22", "\uD83D\uDD23", "\uD83D\uDD24", "\u27bf",
            "\uD83D\uDCf6", "\uD83D\uDCf3", "\uD83D\uDCf4", "\uD83D\uDCf5", "\uD83D\uDEb9",
            "\uD83D\uDEba", "\uD83D\uDEbc", "\u267f", "\u267b", "\uD83D\uDEad",
            "\uD83D\uDEa9", "\u26a0", "\uD83C\uDE01", "\uD83D\uDD1e", "\u26d4",
            "\uD83C\uDD92", "\uD83C\uDD97", "\uD83C\uDD95", "\uD83C\uDD98", "\uD83C\uDD99",
            "\uD83C\uDD93", "\uD83C\uDD96", "\uD83C\uDD9a", "\uD83C\uDE32", "\uD83C\uDE33",
            "\uD83C\uDE34", "\uD83C\uDE35", "\uD83C\uDE36", "\uD83C\uDE37", "\uD83C\uDE38",
            "\uD83C\uDE39", "\uD83C\uDE02", "\uD83C\uDE3a", "\uD83C\uDE50", "\uD83C\uDE51",
            "\u3299", "\u00ae", "\u00a9", "\u2122", "\uD83C\uDE1a",
            "\uD83C\uDE2f", "\u3297", "\u2b55", "\u274c", "\u274e",
            "\u2139", "\uD83D\uDEab", "\u2705", "\u2714", "\uD83D\uDD17",
            "\u2734", "\u2733", "\u2795", "\u2796", "\u2716",
            "\u2797", "\uD83D\uDCa0", "\uD83D\uDCa1", "\uD83D\uDCa4", "\uD83D\uDCa2",
            "\uD83D\uDD25", "\uD83D\uDCa5", "\uD83D\uDCa6", "\uD83D\uDCa8", "\uD83D\uDCab",
            "\uD83D\uDD5b", "\uD83D\uDD67", "\uD83D\uDD50", "\uD83D\uDD5c", "\uD83D\uDD51",
            "\uD83D\uDD5d", "\uD83D\uDD52", "\uD83D\uDD5e", "\uD83D\uDD53", "\uD83D\uDD5f",
            "\uD83D\uDD54", "\uD83D\uDD60", "\uD83D\uDD54", "\uD83D\uDD61", "\uD83D\uDD56",
            "\uD83D\uDD62", "\uD83D\uDD57", "\uD83D\uDD63", "\uD83D\uDD58", "\uD83D\uDD64",
            "\uD83D\uDD59", "\uD83D\uDD65", "\uD83D\uDD5a", "\uD83D\uDD66", "\u2195",
            "\u2b06", "\u2197", "\u27a1", "\u2198", "\u2b07",
            "\u2199", "\u2b05", "\u2196", "\u2194", "\u2934",
            "\u2935", "\u23ea", "\u23e9", "\u23eb", "\u23ec",
            "\u25c0", "\u25b6", "\uD83D\uDD3d", "\uD83D\uDD3c", "\u2747",
            "\u2728", "\uD83D\uDD34", "\uD83D\uDD35", "\u26aa", "\u26ab",
            "\uD83D\uDD33", "\uD83D\uDD32", "\u2b50", "\uD83C\uDF1f", "\uD83C\uDF20",
            "\u25ab", "\u25aa", "\u25fd", "\u25fe", "\u25fc",
            "\u25fb", "\u2b1b", "\u2b1c", "\uD83D\uDD39", "\uD83D\uDD38",
            "\uD83D\uDD37", "\uD83D\uDD36", "\uD83D\uDD3a", "\uD83D\uDD3b", "\uD83D\uDD1f",
            "\u20e3", "\u2754", "\u2753", "\u2755", "\u2757",
            "\u203c", "\u2049", "\u3030", "\u27b0", "\u2660",
            "\u2665", "\u2663", "\u2666", "\uD83C\uDD94", "\uD83D\uDD11",
            "\u21a9", "\uD83C\uDD91", "\uD83D\uDD0d", "\uD83D\uDD12", "\uD83D\uDD13",
            "\u21aa", "\uD83D\uDD10", "\u2611", "\uD83D\uDD18", "\uD83D\uDD0e",
            "\uD83D\uDD16", "\uD83D\uDD0f", "\uD83D\uDD03", "\uD83D\uDD00", "\uD83D\uDD01",
            "\uD83D\uDD02", "\uD83D\uDD04", "\uD83D\uDCe7", "\uD83D\uDD05", "\uD83D\uDD06",
            "\uD83D\uDD07", "\uD83D\uDD08", "\uD83D\uDD09", "\uD83D\uDD0a", "\uD83C\uDDe6",
            "\uD83C\uDDe7", "\uD83C\uDDe8", "\uD83C\uDDe9", "\uD83C\uDDea", "\uD83C\uDDeb",
            "\uD83C\uDDec", "\uD83C\uDDed", "\uD83C\uDDee", "\uD83C\uDDef", "\uD83C\uDDf0",
            "\uD83C\uDDf1", "\uD83C\uDDf2", "\uD83C\uDDf3", "\uD83C\uDDf4", "\uD83C\uDDf5",
            "\uD83C\uDDf6", "\uD83C\uDDf7", "\uD83C\uDDf8", "\uD83C\uDDf9", "\uD83C\uDDfa",
            "\uD83C\uDDfb", "\uD83C\uDDfc", "\uD83C\uDDfd", "\uD83C\uDDfe", "\uD83C\uDDff"
    };

    private static final String pack = "com.klinker.android.emoji_keyboard_trial";
    private static Resources res;
    private static int[] sIconIds;

    public static void init(Context context) {
        try {
            res = context.getPackageManager().getResourcesForApplication(pack);
        } catch (Exception e) {
            e.printStackTrace();
        }

        sIconIds = new int[] {
                res.getIdentifier("emoji_u1f51d", "drawable", pack),
                res.getIdentifier("emoji_u1f519", "drawable", pack),
                res.getIdentifier("emoji_u1f51b", "drawable", pack),
                res.getIdentifier("emoji_u1f51c", "drawable", pack),
                res.getIdentifier("emoji_u1f51a", "drawable", pack),
                res.getIdentifier("emoji_u23f3", "drawable", pack),
                res.getIdentifier("emoji_u231b", "drawable", pack),
                res.getIdentifier("emoji_u23f0", "drawable", pack),
                res.getIdentifier("emoji_u2648", "drawable", pack),
                res.getIdentifier("emoji_u2649", "drawable", pack),
                res.getIdentifier("emoji_u264a", "drawable", pack),
                res.getIdentifier("emoji_u264b", "drawable", pack),
                res.getIdentifier("emoji_u264c", "drawable", pack),
                res.getIdentifier("emoji_u264d", "drawable", pack),
                res.getIdentifier("emoji_u264e", "drawable", pack),
                res.getIdentifier("emoji_u264f", "drawable", pack),
                res.getIdentifier("emoji_u2650", "drawable", pack),
                res.getIdentifier("emoji_u2651", "drawable", pack),
                res.getIdentifier("emoji_u2652", "drawable", pack),
                res.getIdentifier("emoji_u2653", "drawable", pack),
                res.getIdentifier("emoji_u26ce", "drawable", pack),
                res.getIdentifier("emoji_u1f531", "drawable", pack),
                res.getIdentifier("emoji_u1f52f", "drawable", pack),
                res.getIdentifier("emoji_u1f6bb", "drawable", pack),
                res.getIdentifier("emoji_u1f6ae", "drawable", pack),
                res.getIdentifier("emoji_u1f6af", "drawable", pack),
                res.getIdentifier("emoji_u1f6b0", "drawable", pack),
                res.getIdentifier("emoji_u1f6b1", "drawable", pack),
                res.getIdentifier("emoji_u1f170", "drawable", pack),
                res.getIdentifier("emoji_u1f171", "drawable", pack),
                res.getIdentifier("emoji_u1f18e", "drawable", pack),
                res.getIdentifier("emoji_u1f17e", "drawable", pack),
                res.getIdentifier("emoji_u1f4ae", "drawable", pack),
                res.getIdentifier("emoji_u1f4af", "drawable", pack),
                res.getIdentifier("emoji_u1f520", "drawable", pack),
                res.getIdentifier("emoji_u1f521", "drawable", pack),
                res.getIdentifier("emoji_u1f522", "drawable", pack),
                res.getIdentifier("emoji_u1f523", "drawable", pack),
                res.getIdentifier("emoji_u1f524", "drawable", pack),
                res.getIdentifier("emoji_u27bf", "drawable", pack),
                res.getIdentifier("emoji_u1f4f6", "drawable", pack),
                res.getIdentifier("emoji_u1f4f3", "drawable", pack),
                res.getIdentifier("emoji_u1f4f4", "drawable", pack),
                res.getIdentifier("emoji_u1f4f5", "drawable", pack),
                res.getIdentifier("emoji_u1f6b9", "drawable", pack),
                res.getIdentifier("emoji_u1f6ba", "drawable", pack),
                res.getIdentifier("emoji_u1f6bc", "drawable", pack),
                res.getIdentifier("emoji_u267f", "drawable", pack),
                res.getIdentifier("emoji_u267b", "drawable", pack),
                res.getIdentifier("emoji_u1f6ad", "drawable", pack),
                res.getIdentifier("emoji_u1f6a9", "drawable", pack),
                res.getIdentifier("emoji_u26a0", "drawable", pack),
                res.getIdentifier("emoji_u1f201", "drawable", pack),
                res.getIdentifier("emoji_u1f51e", "drawable", pack),
                res.getIdentifier("emoji_u26d4", "drawable", pack),
                res.getIdentifier("emoji_u1f192", "drawable", pack),
                res.getIdentifier("emoji_u1f197", "drawable", pack),
                res.getIdentifier("emoji_u1f195", "drawable", pack),
                res.getIdentifier("emoji_u1f198", "drawable", pack),
                res.getIdentifier("emoji_u1f199", "drawable", pack),
                res.getIdentifier("emoji_u1f193", "drawable", pack),
                res.getIdentifier("emoji_u1f196", "drawable", pack),
                res.getIdentifier("emoji_u1f19a", "drawable", pack),
                res.getIdentifier("emoji_u1f232", "drawable", pack),
                res.getIdentifier("emoji_u1f233", "drawable", pack),
                res.getIdentifier("emoji_u1f234", "drawable", pack),
                res.getIdentifier("emoji_u1f235", "drawable", pack),
                res.getIdentifier("emoji_u1f236", "drawable", pack),
                res.getIdentifier("emoji_u1f237", "drawable", pack),
                res.getIdentifier("emoji_u1f238", "drawable", pack),
                res.getIdentifier("emoji_u1f239", "drawable", pack),
                res.getIdentifier("emoji_u1f202", "drawable", pack),
                res.getIdentifier("emoji_u1f23a", "drawable", pack),
                res.getIdentifier("emoji_u1f250", "drawable", pack),
                res.getIdentifier("emoji_u1f251", "drawable", pack),
                res.getIdentifier("emoji_u3299", "drawable", pack),
                res.getIdentifier("emoji_u00ae", "drawable", pack),
                res.getIdentifier("emoji_u00a9", "drawable", pack),
                res.getIdentifier("emoji_u2122", "drawable", pack),
                res.getIdentifier("emoji_u1f21a", "drawable", pack),
                res.getIdentifier("emoji_u1f22f", "drawable", pack),
                res.getIdentifier("emoji_u3297", "drawable", pack),
                res.getIdentifier("emoji_u2b55", "drawable", pack),
                res.getIdentifier("emoji_u274c", "drawable", pack),
                res.getIdentifier("emoji_u274e", "drawable", pack),
                res.getIdentifier("emoji_u2139", "drawable", pack),
                res.getIdentifier("emoji_u1f6ab", "drawable", pack),
                res.getIdentifier("emoji_u2705", "drawable", pack),
                res.getIdentifier("emoji_u2714", "drawable", pack),
                res.getIdentifier("emoji_u1f517", "drawable", pack),
                res.getIdentifier("emoji_u2734", "drawable", pack),
                res.getIdentifier("emoji_u2733", "drawable", pack),
                res.getIdentifier("emoji_u2795", "drawable", pack),
                res.getIdentifier("emoji_u2796", "drawable", pack),
                res.getIdentifier("emoji_u2716", "drawable", pack),
                res.getIdentifier("emoji_u2797", "drawable", pack),
                res.getIdentifier("emoji_u1f4a0", "drawable", pack),
                res.getIdentifier("emoji_u1f4a1", "drawable", pack),
                res.getIdentifier("emoji_u1f4a4", "drawable", pack),
                res.getIdentifier("emoji_u1f4a2", "drawable", pack),
                res.getIdentifier("emoji_u1f525", "drawable", pack),
                res.getIdentifier("emoji_u1f4a5", "drawable", pack),
                res.getIdentifier("emoji_u1f4a6", "drawable", pack),
                res.getIdentifier("emoji_u1f4a8", "drawable", pack),
                res.getIdentifier("emoji_u1f4ab", "drawable", pack),
                res.getIdentifier("emoji_u1f55b", "drawable", pack),
                res.getIdentifier("emoji_u1f567", "drawable", pack),
                res.getIdentifier("emoji_u1f550", "drawable", pack),
                res.getIdentifier("emoji_u1f55c", "drawable", pack),
                res.getIdentifier("emoji_u1f551", "drawable", pack),
                res.getIdentifier("emoji_u1f55d", "drawable", pack),
                res.getIdentifier("emoji_u1f552", "drawable", pack),
                res.getIdentifier("emoji_u1f55e", "drawable", pack),
                res.getIdentifier("emoji_u1f553", "drawable", pack),
                res.getIdentifier("emoji_u1f55f", "drawable", pack),
                res.getIdentifier("emoji_u1f554", "drawable", pack),
                res.getIdentifier("emoji_u1f560", "drawable", pack),
                res.getIdentifier("emoji_u1f555", "drawable", pack),
                res.getIdentifier("emoji_u1f561", "drawable", pack),
                res.getIdentifier("emoji_u1f556", "drawable", pack),
                res.getIdentifier("emoji_u1f562", "drawable", pack),
                res.getIdentifier("emoji_u1f557", "drawable", pack),
                res.getIdentifier("emoji_u1f563", "drawable", pack),
                res.getIdentifier("emoji_u1f558", "drawable", pack),
                res.getIdentifier("emoji_u1f564", "drawable", pack),
                res.getIdentifier("emoji_u1f559", "drawable", pack),
                res.getIdentifier("emoji_u1f565", "drawable", pack),
                res.getIdentifier("emoji_u1f55a", "drawable", pack),
                res.getIdentifier("emoji_u1f566", "drawable", pack),
                res.getIdentifier("emoji_u2195", "drawable", pack),
                res.getIdentifier("emoji_u2b06", "drawable", pack),
                res.getIdentifier("emoji_u2197", "drawable", pack),
                res.getIdentifier("emoji_u27a1", "drawable", pack),
                res.getIdentifier("emoji_u2198", "drawable", pack),
                res.getIdentifier("emoji_u2b07", "drawable", pack),
                res.getIdentifier("emoji_u2199", "drawable", pack),
                res.getIdentifier("emoji_u2b05", "drawable", pack),
                res.getIdentifier("emoji_u2196", "drawable", pack),
                res.getIdentifier("emoji_u2194", "drawable", pack),
                res.getIdentifier("emoji_u2934", "drawable", pack),
                res.getIdentifier("emoji_u2935", "drawable", pack),
                res.getIdentifier("emoji_u23ea", "drawable", pack),
                res.getIdentifier("emoji_u23e9", "drawable", pack),
                res.getIdentifier("emoji_u23eb", "drawable", pack),
                res.getIdentifier("emoji_u23ec", "drawable", pack),
                res.getIdentifier("emoji_u25c0", "drawable", pack),
                res.getIdentifier("emoji_u25b6", "drawable", pack),
                res.getIdentifier("emoji_u1f53d", "drawable", pack),
                res.getIdentifier("emoji_u1f53c", "drawable", pack),
                res.getIdentifier("emoji_u2747", "drawable", pack),
                res.getIdentifier("emoji_u2728", "drawable", pack),
                res.getIdentifier("emoji_u1f534", "drawable", pack),
                res.getIdentifier("emoji_u1f535", "drawable", pack),
                res.getIdentifier("emoji_u26aa", "drawable", pack),
                res.getIdentifier("emoji_u26ab", "drawable", pack),
                res.getIdentifier("emoji_u1f533", "drawable", pack),
                res.getIdentifier("emoji_u1f532", "drawable", pack),
                res.getIdentifier("emoji_u2b50", "drawable", pack),
                res.getIdentifier("emoji_u1f31f", "drawable", pack),
                res.getIdentifier("emoji_u1f320", "drawable", pack),
                res.getIdentifier("emoji_u25ab", "drawable", pack),
                res.getIdentifier("emoji_u25aa", "drawable", pack),
                res.getIdentifier("emoji_u25fd", "drawable", pack),
                res.getIdentifier("emoji_u25fe", "drawable", pack),
                res.getIdentifier("emoji_u25fc", "drawable", pack),
                res.getIdentifier("emoji_u25fb", "drawable", pack),
                res.getIdentifier("emoji_u2b1b", "drawable", pack),
                res.getIdentifier("emoji_u2b1c", "drawable", pack),
                res.getIdentifier("emoji_u1f539", "drawable", pack),
                res.getIdentifier("emoji_u1f538", "drawable", pack),
                res.getIdentifier("emoji_u1f537", "drawable", pack),
                res.getIdentifier("emoji_u1f536", "drawable", pack),
                res.getIdentifier("emoji_u1f53a", "drawable", pack),
                res.getIdentifier("emoji_u1f53b", "drawable", pack),
                res.getIdentifier("emoji_u1f51f", "drawable", pack),
                res.getIdentifier("emoji_u20e3", "drawable", pack),
                res.getIdentifier("emoji_u2754", "drawable", pack),
                res.getIdentifier("emoji_u2753", "drawable", pack),
                res.getIdentifier("emoji_u2755", "drawable", pack),
                res.getIdentifier("emoji_u2757", "drawable", pack),
                res.getIdentifier("emoji_u203c", "drawable", pack),
                res.getIdentifier("emoji_u2049", "drawable", pack),
                res.getIdentifier("emoji_u3030", "drawable", pack),
                res.getIdentifier("emoji_u27b0", "drawable", pack),
                res.getIdentifier("emoji_u2660", "drawable", pack),
                res.getIdentifier("emoji_u2665", "drawable", pack),
                res.getIdentifier("emoji_u2663", "drawable", pack),
                res.getIdentifier("emoji_u2666", "drawable", pack),
                res.getIdentifier("emoji_u1f194", "drawable", pack),
                res.getIdentifier("emoji_u1f511", "drawable", pack),
                res.getIdentifier("emoji_u21a9", "drawable", pack),
                res.getIdentifier("emoji_u1f191", "drawable", pack),
                res.getIdentifier("emoji_u1f50d", "drawable", pack),
                res.getIdentifier("emoji_u1f512", "drawable", pack),
                res.getIdentifier("emoji_u1f513", "drawable", pack),
                res.getIdentifier("emoji_u21aa", "drawable", pack),
                res.getIdentifier("emoji_u1f510", "drawable", pack),
                res.getIdentifier("emoji_u2611", "drawable", pack),
                res.getIdentifier("emoji_u1f518", "drawable", pack),
                res.getIdentifier("emoji_u1f50e", "drawable", pack),
                res.getIdentifier("emoji_u1f516", "drawable", pack),
                res.getIdentifier("emoji_u1f50f", "drawable", pack),
                res.getIdentifier("emoji_u1f503", "drawable", pack),
                res.getIdentifier("emoji_u1f500", "drawable", pack),
                res.getIdentifier("emoji_u1f501", "drawable", pack),
                res.getIdentifier("emoji_u1f502", "drawable", pack),
                res.getIdentifier("emoji_u1f504", "drawable", pack),
                res.getIdentifier("emoji_u1f4e7", "drawable", pack),
                res.getIdentifier("emoji_u1f505", "drawable", pack),
                res.getIdentifier("emoji_u1f506", "drawable", pack),
                res.getIdentifier("emoji_u1f507", "drawable", pack),
                res.getIdentifier("emoji_u1f508", "drawable", pack),
                res.getIdentifier("emoji_u1f509", "drawable", pack),
                res.getIdentifier("emoji_u1f50a", "drawable", pack),
                res.getIdentifier("emoji_u1f1e6", "drawable", pack),
                res.getIdentifier("emoji_u1f1e7", "drawable", pack),
                res.getIdentifier("emoji_u1f1e8", "drawable", pack),
                res.getIdentifier("emoji_u1f1e9", "drawable", pack),
                res.getIdentifier("emoji_u1f1ea", "drawable", pack),
                res.getIdentifier("emoji_u1f1eb", "drawable", pack),
                res.getIdentifier("emoji_u1f1ec", "drawable", pack),
                res.getIdentifier("emoji_u1f1ed", "drawable", pack),
                res.getIdentifier("emoji_u1f1ee", "drawable", pack),
                res.getIdentifier("emoji_u1f1ef", "drawable", pack),
                res.getIdentifier("emoji_u1f1f0", "drawable", pack),
                res.getIdentifier("emoji_u1f1f1", "drawable", pack),
                res.getIdentifier("emoji_u1f1f2", "drawable", pack),
                res.getIdentifier("emoji_u1f1f3", "drawable", pack),
                res.getIdentifier("emoji_u1f1f4", "drawable", pack),
                res.getIdentifier("emoji_u1f1f5", "drawable", pack),
                res.getIdentifier("emoji_u1f1f6", "drawable", pack),
                res.getIdentifier("emoji_u1f1f7", "drawable", pack),
                res.getIdentifier("emoji_u1f1f8", "drawable", pack),
                res.getIdentifier("emoji_u1f1f9", "drawable", pack),
                res.getIdentifier("emoji_u1f1fa", "drawable", pack),
                res.getIdentifier("emoji_u1f1fb", "drawable", pack),
                res.getIdentifier("emoji_u1f1fc", "drawable", pack),
                res.getIdentifier("emoji_u1f1fd", "drawable", pack),
                res.getIdentifier("emoji_u1f1fe", "drawable", pack),
                res.getIdentifier("emoji_u1f1ff", "drawable", pack)
        };
    }
}