package com.jsdroid.colors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

class FontUtil {

    public static int[] bitmap2IntArr(Bitmap bitmap) {
        int[] arr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(arr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return arr;
    }

    public static Bitmap intArr2Bitmap(int[] arr, int width, int height) {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(arr, 0, width, 0, 0, width, height);
        return bitmap;
    }

    public static Bitmap createFontImg(String code, float codeSize) {
        Paint paint = new Paint();
        paint.setTextSize(codeSize);
        paint.setColor(Color.RED);
        float width = paint.measureText(code);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);

        int w = (int) width * 10;
        int h = (int) codeSize * 10;

        Bitmap bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        canvas.drawColor(Color.WHITE);
        canvas.drawText(code, w / 2, h / 2, paint);

        int left = getFontLeft(bmp, bmp.getPixel(0, 0));
        int right = getFontRight(bmp, bmp.getPixel(0, 0));
        int top = getFontTop(bmp, bmp.getPixel(0, 0));
        int bottom = getFontBottom(bmp, bmp.getPixel(0, 0));
        Log.e("findpic", String.format("caonima:%d %d %d %d", left, right, top, bottom));
        Bitmap bitmap = Bitmap.createBitmap(bmp, left, top, right - left + 1, bottom - top + 1);
        return bitmap;
    }


    public static int getFontLeft(Bitmap bitmap, int bgColor) {
        Loop:
        for (int i = 0; i < bitmap.getWidth(); i++) {
            for (int j = 0; j < bitmap.getHeight(); j++) {
                int pixel = bitmap.getPixel(i, j);
                if (pixel != bgColor) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getFontRight(Bitmap bitmap, int bgColor) {
        Loop:
        for (int i = bitmap.getWidth() - 1; i >= 0; i--) {
            for (int j = 0; j < bitmap.getHeight(); j++) {
                int pixel = bitmap.getPixel(i, j);
                if (pixel != bgColor) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getFontTop(Bitmap bitmap, int bgColor) {
        Loop:
        for (int i = 0; i < bitmap.getHeight(); i++) {
            for (int j = 0; j < bitmap.getWidth(); j++) {
                int pixel = bitmap.getPixel(j, i);
                if (pixel != bgColor) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getFontBottom(Bitmap bitmap, int bgColor) {
        Loop:
        for (int i = bitmap.getHeight() - 1; i >= 0; i--) {
            for (int j = 0; j < bitmap.getWidth(); j++) {
                int pixel = bitmap.getPixel(j, i);
                if (pixel != bgColor) {
                    return i;
                }
            }
        }
        return -1;
    }
}
