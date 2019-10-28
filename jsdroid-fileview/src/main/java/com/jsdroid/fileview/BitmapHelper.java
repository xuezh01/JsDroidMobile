package com.jsdroid.fileview;

import android.graphics.Bitmap;
import android.graphics.Color;

public class BitmapHelper {
    public static void fillColor(Bitmap img, int color) {
        int r = Color.red(color);
        int g = Color.green(color);
        int b = Color.blue(color);
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int pixel = img.getPixel(i, j);
                int alpha = Color.alpha(pixel);
                int set = Color.argb(alpha, r, g, b);
                if (r != 0) {
                    img.setPixel(i, j, set);
                }
            }
        }
    }
}
