package com.jsdroid.app.utils;

import android.content.Context;
import android.net.Uri;

import com.jsdroid.commons.FileUtil;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class Uris {
    
    public static File getFileFromUri(Context context, Uri uri) throws IOException {
        clearCache(context);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = UUID.randomUUID().toString();
        }
        File file = new File(getCacheDir(context), lastPathSegment);
        FileUtil.cpyStream(context.getContentResolver().openInputStream(uri), new FileOutputStream(file));
        return file;
    }

    public static File getCacheDir(Context context) {
        return context.getDir("cache", 0);
    }

    public static void clearCache(Context context) throws IOException {
        FileUtils.deleteDirectory(getCacheDir(context));
    }

}
