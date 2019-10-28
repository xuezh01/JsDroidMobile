package com.jsdroid.app.capture.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.jsdroid.app.capture.node.Node;
import com.jsdroid.app.capture.node.NodeHelper;
import com.jsdroid.app.capture.node.Rect;
import com.jsdroid.app.entity.Capture;

public class CaptureImageView extends View {
    public CaptureImageView(Context context) {
        super(context);
        setLongClickable(true);
    }

    public CaptureImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setLongClickable(true);
    }

    private Bitmap image;

    private Bitmap scaleImage;
    private Paint paint = new Paint();
    private Node select;
    private Node root;

    public void setCapture(Capture capture) {
        select = null;
        image = null;
        scaleImage = null;
        if (capture.image != null) {
            image = BitmapFactory.decodeFile(capture.image);
        }
        postInvalidate();
    }

    //节点图片缩放成绘制图片的比例
    float getImageScale() {
        //缩放
        float scaleW = getWidth() * 1.0f / image.getWidth();
        float scaleH = getHeight() * 1.0f / image.getHeight();
        float scale;
        if (scaleW < scaleH) {
            scale = scaleW;
        } else {
            scale = scaleH;
        }
        return scale;
    }


    //节点图片，缩放成绘制图片
    Bitmap getScaleImage() {
        //缩放
        float imageScale = getImageScale();
        Matrix m = new Matrix();
        m.postScale(imageScale, imageScale);
        scaleImage = Bitmap.createBitmap(image, 0, 0, image.getWidth(), image.getHeight(), m, false);
        return scaleImage;
    }


    public void setSelectNode(Node node) {
        select = node;
        postInvalidate();
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (image != null) {
            Bitmap scaleImage = getScaleImage();
            if (scaleImage != null) {
                canvas.drawBitmap(scaleImage, (getWidth() - scaleImage.getWidth()) / 2, (getHeight() - scaleImage.getHeight()) / 2, paint);
            }
        }
        //绘制选择节点
        if (select != null) {
            Rect screenRect = select.getScreenRect();
            float scaleW = getWidth() * 1.0f / screenRect.width();
            float scaleH = getHeight() * 1.0f / screenRect.height();
            float scale;
            if (scaleW < scaleH) {
                scale = scaleW;
            } else {
                scale = scaleH;
            }
            Rect rect = new Rect(select.rect);
            rect.scale(scale);
            rect.offset((int) (getWidth() - screenRect.width() * scale) / 2, (int) (getHeight() - screenRect.height() * scale) / 2);
            //绘制rect
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(3);
            paint.setColor(Color.RED);
            canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, paint);
        }

    }


    public interface SelectListener {
        void onSelectNode(Node node);
    }

    private SelectListener selectListener;

    public void setSelectListener(SelectListener selectListener) {
        this.selectListener = selectListener;
    }

    void onAction(float x, float y, boolean up) {
        if (root != null) {
            Rect screenRect = root.getScreenRect();
            float scaleW = getWidth() * 1.0f / screenRect.width();
            float scaleH = getHeight() * 1.0f / screenRect.height();
            float scale;
            if (scaleW < scaleH) {
                scale = scaleW;
            } else {
                scale = scaleH;
            }
            float offx = (getWidth() - screenRect.width() * scale) / 2;
            float offy = (getHeight() - screenRect.height() * scale) / 2;
            int nx = (int) (x / scale - offx);
            int ny = (int) ((y / scale) - offy);
            Node tapNode = NodeHelper.getTapNode(root, nx, ny);
            setSelectNode(tapNode);
            if (up) {
                if (selectListener != null) {
                    selectListener.onSelectNode(tapNode);
                }
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        if ((event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_UP) {
            onAction(x, y, true);
        } else {
            onAction(x, y, false);
        }

        return super.onTouchEvent(event);
    }
}
