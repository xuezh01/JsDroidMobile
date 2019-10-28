package com.jsdroid.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;

public class NoInterceptDrawerLayout extends DrawerLayout {
    public NoInterceptDrawerLayout(@NonNull Context context) {
        super(context);
    }

    public NoInterceptDrawerLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    boolean dispatch;

    boolean isDrawerView(View child) {
        final int gravity = ((LayoutParams) child.getLayoutParams()).gravity;
        final int absGravity = GravityCompat.getAbsoluteGravity(gravity,
                ViewCompat.getLayoutDirection(child));
        if ((absGravity & Gravity.LEFT) != 0) {
            // This child is a left-edge drawer
            return true;
        }
        if ((absGravity & Gravity.RIGHT) != 0) {
            // This child is a right-edge drawer
            return true;
        }
        return false;
    }

    private int getDrawerViewAbsoluteGravity(View drawerView) {
        final int gravity = ((LayoutParams) drawerView.getLayoutParams()).gravity;
        return GravityCompat.getAbsoluteGravity(gravity, ViewCompat.getLayoutDirection(this));
    }

    private View findDrawerWithGravity(int gravity) {
        final int absHorizGravity = GravityCompat.getAbsoluteGravity(
                gravity, ViewCompat.getLayoutDirection(this)) & Gravity.HORIZONTAL_GRAVITY_MASK;
        final int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = getChildAt(i);
            final int childAbsGravity = getDrawerViewAbsoluteGravity(child);
            if ((childAbsGravity & Gravity.HORIZONTAL_GRAVITY_MASK) == absHorizGravity) {
                return child;
            }
        }
        return null;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();

        if ((action & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN) {
            dispatch = false;
            View view;
            if ((view = findDrawerWithGravity(Gravity.LEFT)) != null) {
                if (isDrawerOpen(view)) {
                    if (ev.getX() < view.getWidth()) {
                        dispatch = true;
                    }
                }
            }
            if ((view = findDrawerWithGravity(Gravity.RIGHT)) != null) {
                if (isDrawerOpen(view)) {
                    int w = getWidth() - view.getWidth();
                    if (ev.getX() > w) {
                        dispatch = true;
                    }
                }
            }

        }
        if (dispatch) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }
}
