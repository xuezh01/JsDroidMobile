package com.jsdroid.app.utils;

import android.content.Context;

import com.jsdroid.commons.FileUtil;

import java.io.FileOutputStream;
import java.io.IOException;

public class AssetUtil {
    public static boolean hasFile(Context context, String name) {
        try {
            context.getAssets().open(name).close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static void releaseToFile(Context context, String name, String outFile) throws IOException {
        FileUtil.cpyStream(context.getAssets().open(name), new FileOutputStream(outFile));
    }
}
