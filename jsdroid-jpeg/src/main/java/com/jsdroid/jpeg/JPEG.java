package com.jsdroid.jpeg;

import android.graphics.Bitmap;

public class JPEG {
    static {
        try {
            System.loadLibrary("jsdroid-jpeg");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public synchronized static native byte[] encode(Bitmap bitmap, int quality);

    /**
     * 将图片2与图片1相同的颜色设置为0
     *
     * @param image1
     * @param image2
     */
    public synchronized static native int dealImage2(Bitmap image1, Bitmap image2);

    public synchronized static native boolean needUpdate(Bitmap image1, Bitmap image2);
}
