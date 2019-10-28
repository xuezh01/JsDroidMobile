package com.jsdroid.fileview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CheckBox extends View {
    private boolean checked;
    Paint paint;
    OnCheckChangedListener onCheckChangedListener;
    OnClickListener onClickListener;
    int color;

    public void setOnCheckChangedListener(OnCheckChangedListener onCheckChangedListener) {
        this.onCheckChangedListener = onCheckChangedListener;
    }


    public interface OnCheckChangedListener {
        void onCheckChanged(CheckBox checkBox, boolean checked);
    }

    public CheckBox(Context context) {
        this(context, null);
    }

    public CheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null) {
                    onClickListener.onClick(CheckBox.this);
                }
                toggle();
            }
        });
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.fv_CheckBox);
        color = a.getColor(R.styleable.fv_CheckBox_fv_bg_color, 0);
        a.recycle();
    }

    Bitmap checkUnSel;
    Bitmap checkSel;

    @Override
    protected void onDraw(Canvas canvas) {
        PaintFlagsDrawFilter drawFilter = new PaintFlagsDrawFilter(0, Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
        canvas.setDrawFilter(drawFilter);
        if (paint == null) {
            paint = new Paint();
            paint.setAntiAlias(true);
        }
        float width = getWidth();
        float height = getHeight();

        if (isChecked()) {
            if (checkSel == null) {
                checkSel = BitmapFactory.decodeResource(getResources(), R.drawable.res_ic_check_sel);
                Matrix m = new Matrix();
                m.postScale(width * 1.0f / checkSel.getWidth(), height * 1.0f / checkSel.getHeight());
                checkSel = Bitmap.createBitmap(checkSel, 0, 0, checkSel.getWidth(), checkSel.getHeight(), m, true);
                BitmapHelper.fillColor(checkSel, color);
            }

            canvas.drawBitmap(checkSel, 0, 0, paint);
        } else {
            if (checkUnSel == null) {
                checkUnSel = BitmapFactory.decodeResource(getResources(), R.drawable.res_ic_check_unsel);
                Matrix m = new Matrix();
                m.postScale(width * 1.0f / checkUnSel.getWidth(), height * 1.0f / checkUnSel.getHeight());
                checkUnSel = Bitmap.createBitmap(checkUnSel, 0, 0, checkUnSel.getWidth(), checkUnSel.getHeight(), m, true);

                BitmapHelper.fillColor(checkUnSel, color);
            }
            canvas.drawBitmap(checkUnSel, 0, 0, paint);
        }
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        postInvalidate();
    }

    private void toggle() {
        if (isChecked()) {
            setChecked(false);
        } else {
            setChecked(true);
        }
        if (onCheckChangedListener != null) {
            onCheckChangedListener.onCheckChanged(this, checked);
        }
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        onClickListener = l;
    }
}
