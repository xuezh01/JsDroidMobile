package com.yhao.floatwindow;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class FloatRootView extends LinearLayout {
    private static final String TAG = FloatRootView.class.getName();
    private boolean interceptTouchEvent = true;

    public FloatRootView(Context context) {
        super(context);
        setLayoutParams(new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setOrientation(VERTICAL);
    }

    public FloatRootView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FloatRootView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public FloatRootView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, event);
        }

        return false;
    }

    float rawX, rawY;

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (interceptTouchEvent && onTouchListener != null) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    rawX = event.getRawX();
                    rawY = event.getRawY();
                    break;
                case MotionEvent.ACTION_UP: {
                    final float scale = getContext().getResources().getDisplayMetrics().density;//density=dpi/160
                    int clickDistance = (int) (3 * scale + 0.5f);
                    if (Math.abs(event.getRawX() - rawX) <= clickDistance && Math.abs(event.getRawY() - rawY) <= clickDistance) {
                        return false;
                    }
                    onTouchListener.onTouch(this, event);
                    return true;
                }
            }

            onTouchListener.onTouch(this, event);
        }
        return false;
    }

    public void setInterceptTouchEvent(boolean interceptTouchEvent) {
        this.interceptTouchEvent = interceptTouchEvent;
    }

    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
    }


    OnTouchListener onTouchListener;

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        onTouchListener = l;
    }

    private IFloatWindow floatWindow;

    public void setFloatWindow(IFloatWindow floatWindow) {
        this.floatWindow = floatWindow;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (changed) {
            checkChanged();
        }
    }

    private void checkChanged() {
        if (floatWindow != null) {
//            int screenWidth = ScreenUtil.getScreenWidth(getContext());
//            int screenHeight = ScreenUtil.getScreenHeight(getContext());
//            int statusBarHeight = ScreenUtil.getStatusBarHeight(getContext());
//            if (floatWindow.getX() > screenWidth - getWidth()) {
//                int x = screenWidth - getWidth();
//                floatWindow.updateX(x);
//            }
//            if (floatWindow.getY() > screenHeight - getHeight() - statusBarHeight) {
//                int y = screenHeight - getHeight() - statusBarHeight;
//                floatWindow.updateY(y);
//            }
            floatWindow.onLayoutChanged();
        }
        if (onLayoutChangeListener != null) {
            onLayoutChangeListener.onLayoutChanged();
        }
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        checkChanged();
    }

    public interface OnLayoutChangeListener {
        void onLayoutChanged();
    }

    OnLayoutChangeListener onLayoutChangeListener;

    public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
        this.onLayoutChangeListener = onLayoutChangeListener;
    }
}
