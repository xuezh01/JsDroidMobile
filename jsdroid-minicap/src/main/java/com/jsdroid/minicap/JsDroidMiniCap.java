package com.jsdroid.minicap;

import android.graphics.Bitmap;

import com.jsdroid.commons.ScreenUtil;


public class JsDroidMiniCap {

    static native void init();

    static native void release();

    static native void setRealSize(int width, int height);

    static native void setDesiredSize(int width, int height, int rotation);

    static native boolean readImage(Bitmap image);

    static native byte[] readJpg(int quality);

    public static synchronized void initMiniCap() {
        System.loadLibrary("jsdroid-minicap");
        init();
        setRealSize(ScreenUtil.getNaturalWidth(), ScreenUtil.getNaturalHeight());
    }

    private static int mWidth, mHeight, mRotation;

    public static synchronized byte[] readJpg(int width, int height, int rotation, int quality) {
        if (width != mWidth || mHeight != height || rotation != mRotation) {
            setDesiredSize(width, height, rotation);
            mWidth = width;
            mHeight = height;
            mRotation = rotation;
        }
        return readJpg(quality);
    }
}
