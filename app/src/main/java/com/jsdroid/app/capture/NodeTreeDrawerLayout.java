package com.jsdroid.app.capture;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.jsdroid.app.R;

public class NodeTreeDrawerLayout extends DrawerLayout {
    public NodeTreeDrawerLayout(@NonNull Context context) {
        super(context);
    }

    public NodeTreeDrawerLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    View treeView;
    boolean dispatch;

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (treeView == null) {
            treeView = findViewById(R.id.treeView);
        }
        int action = ev.getAction();

        if ((action & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN) {
            dispatch = false;
            if (treeView != null) {
                Rect rect = new Rect();
                treeView.getGlobalVisibleRect(rect);
//                treeView.getBoundsOnScreen(rect);
                if (rect.contains((int) ev.getRawX(), (int) ev.getRawY())) {
                    dispatch = true;
                }
            }
        }
        if (dispatch) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }
}
