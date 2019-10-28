package com.jsdroid.commons;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;

import com.jsdroid.uiautomator2.By;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BitmapUtil {

    public static void save(String picFile, Bitmap bmp) {
        File dir = new File(picFile).getParentFile();
        if (!dir.exists()) {
            dir.mkdirs();
        }
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(picFile);
            bmp.compress(CompressFormat.PNG, 100, out);
        } catch (FileNotFoundException e) {
        } finally {
            try {
                out.close();
            } catch (IOException e) {
            }
        }
    }

    public static void save(String path, String picName, Bitmap bmp) {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File picFile = new File(dir, picName);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(picFile);
            bmp.compress(CompressFormat.PNG, 100, out);
        } catch (FileNotFoundException e) {
        } finally {
            try {
                out.close();
            } catch (IOException e) {
            }
        }

    }

    public static Bitmap read(String file) {
        byte[] data = FileUtil.readBytes(file);
        return BitmapFactory.decodeByteArray(data, 0, data.length);
    }

    public static byte[] getBytes(Bitmap bitmap, CompressFormat format, int quality) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        bitmap.compress(format, quality, out);
        return out.toByteArray();
    }
}
