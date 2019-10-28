package com.jsdroid.app.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.util.QMUIDrawableHelper;
import com.qmuiteam.qmui.widget.QMUIRadiusImageView;

public class ViewHelper {
    public static QMUIRadiusImageView createCircleImageView(Context context, int drawable, int dpWith, int dpHeight) {
        int width = QMUIDisplayHelper.dp2px(context, dpWith);
        int height = QMUIDisplayHelper.dp2px(context, dpHeight);
        QMUIRadiusImageView imageView = new QMUIRadiusImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        imageView.setImageDrawable(context.getResources().getDrawable(drawable));
        imageView.setCircle(true);

        return imageView;
    }

}
