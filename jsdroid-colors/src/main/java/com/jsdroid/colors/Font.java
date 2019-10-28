package com.jsdroid.colors;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Font {

    long id;
    String code;
    int width;
    int height;


    private Font(String code, Bitmap img, int color, int offset) {
        this.code = code;
        this.width = img.getWidth();
        this.height = img.getHeight();
        id = nativeCreateFont(img, color, offset);
    }

    public static Font createFont(String code, String imgFile, int color, int offset) {
        return createFont(code, BitmapFactory.decodeFile(imgFile), color, offset);
    }

    public static Font createFont(String code, Bitmap img, int color, int offset) {
        return new Font(code, img, color, offset);
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getCode() {
        return code;
    }

    public long getId() {
        return id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        nativeReleaseFont(id);
    }

    static native long nativeCreateFont(Bitmap img, int color, int offset);

    static native void nativeReleaseFont(long id);

}
