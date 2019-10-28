package com.jsdroid.app.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.util.QMUIDrawableHelper;

public class DrawableHelper {

    public static Drawable createBitmapDrawable(Context context, int resId,
                                                int dpWith, int dpHeight) {
        int width = QMUIDisplayHelper.dp2px(context, dpWith);
        int height = QMUIDisplayHelper.dp2px(context, dpHeight);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resId);
        float scaleX = width * 1.0f / bitmap.getWidth();
        float scaleY = height * 1.0f / bitmap.getHeight();
        Matrix m = new Matrix();
        m.postScale(scaleX, scaleY);
        return new BitmapDrawable(context.getResources(),
                Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m, false));
    }

    public static Drawable createBitmapDrawable(Context context, int resId,
                                                int dpWith, int dpHeight, int color) {
        int width = QMUIDisplayHelper.dp2px(context, dpWith);
        int height = QMUIDisplayHelper.dp2px(context, dpHeight);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resId);
        float scaleX = width * 1.0f / bitmap.getWidth();
        float scaleY = height * 1.0f / bitmap.getHeight();
        Matrix m = new Matrix();
        m.postScale(scaleX, scaleY);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(),
                Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m, false));
        QMUIDrawableHelper.setDrawableTintColor(bitmapDrawable, color);
        return bitmapDrawable;
    }
}
