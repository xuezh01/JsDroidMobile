package com.jsdroid.ui.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;

import com.jsdroid.api.context.JsdContext;


public class RoundBitmapDrawable extends GradientDrawable {
    private static final String TAG = RoundBitmapDrawable.class.getName();
    private float[] radiusArray = {0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f};
    private Paint bitmapPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Bitmap bitmapFrame;
    private String backgroundBitmap;
    private Bitmap bitmap;
    float radius;
    private JsdContext jsdContext;


    public RoundBitmapDrawable(JsdContext jsdContext) {
        this.jsdContext = jsdContext;
    }

    private Bitmap makeRoundRectFrame(int w, int h) {
        Bitmap bm = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bm);
        Path path = new Path();
        path.addRoundRect(new RectF(0, 0, w, h), radius, radius, Path.Direction.CW);
        Paint bitmapPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bitmapPaint.setColor(Color.WHITE); // 颜色随意，不要有透明度。
        c.drawPath(path, bitmapPaint);
        return bm;
    }

    @Override
    public void setCornerRadius(float radius) {
        this.radius = radius;
        super.setCornerRadius(radius);
    }


    public void setBackgroundBitmap(String backgroundBitmap) {
        this.backgroundBitmap = backgroundBitmap;

    }

    @Override
    public void draw(Canvas canvas) {
        //绘制背景图
        Rect bounds = getBounds();
        if (backgroundBitmap != null) {
            if (bitmap == null && bounds.width() > 0 && bounds.height() > 0) {
                bitmap = jsdContext.getImage(backgroundBitmap, bounds.width(), bounds.height());
            }
            if (bitmap != null) {
                int sc = canvas.saveLayer(0, 0, bounds.width(), bounds.height(), null, Canvas.ALL_SAVE_FLAG);
                if (bitmapFrame == null) {
                    bitmapFrame = makeRoundRectFrame(bounds.width(), bounds.height());
                }
                canvas.drawBitmap(bitmapFrame, 0, 0, bitmapPaint);
                // 利用Xfermode取交集（利用bitmapFrame作为画框来裁剪backgroundBitmap）
                bitmapPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0, 0, bitmapPaint);
                bitmapPaint.setXfermode(null);
                canvas.restoreToCount(sc);
            }

        }

        //绘制背景
        super.draw(canvas);


    }
}
