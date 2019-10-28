package com.jsdroid.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

public class CheckBox extends android.widget.CheckBox {
    Paint paint;


    public CheckBox(Context context) {
        this(context, null);
    }

    public CheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private Bitmap cache;
    private int checkColor;
    private int unCheckColor;

    @Override
    protected void onDraw(Canvas canvas) {
        cache = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas1 = new Canvas(cache);
        super.onDraw(canvas1);
        if (isChecked()) {
            fillColor(cache, checkColor);
        } else {
            fillColor(cache, unCheckColor);
        }
        canvas.drawBitmap(cache, 0, 0, paint);

    }

    public void setCheckColor(int checkColor) {
        this.checkColor = checkColor;
    }

    public void setUnCheckColor(int unCheckColor) {
        this.unCheckColor = unCheckColor;
    }

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
