package com.jsdroid.shell.util;

import android.content.Context;

import com.jsdroid.commons.FileUtil;

import java.io.FileOutputStream;
import java.io.IOException;

public class AssetUtil {
    public static boolean hasFile(Context context, String name) {
        try {
            context.getAssets().open(name).close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void releaseToFile(Context context, String name, String outFile) throws IOException {
        FileUtil.cpyStream(context.getAssets().open(name), new FileOutputStream(outFile));
    }

    public static String readFile(Context context, String name) {
        try {
            return FileUtil.read(context.getAssets().open(name));
        } catch (Exception e) {
        }
        return null;
    }
}
