package com.jsdroid.app.capture.node;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

public class HView extends HorizontalScrollView {
    public HView(Context context) {
        super(context);
    }

    public HView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        int childCount = getChildCount();
        if (childCount > 0) {
            View childAt = getChildAt(0);
            return childAt.onTouchEvent(ev);
        }
        return true;
    }
}
