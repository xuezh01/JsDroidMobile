package com.jsdroid.app.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

import static android.content.Context.CLIPBOARD_SERVICE;

public class ClipboardUtil {
    public static void copy(Context context, String text) {
        ClipboardManager clipboardManager =
                (ClipboardManager) context.getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("text", text);
        clipboardManager.setPrimaryClip(clip);
    }
}
