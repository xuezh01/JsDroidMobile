package com.jsdroid.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.ditclear.swipelayout.SwipeDragLayout;

public class FullSwipeDragLayout extends SwipeDragLayout {
    public FullSwipeDragLayout(Context context) {
        super(context);
    }

    public FullSwipeDragLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullSwipeDragLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        View menuView = getChildAt(1);
        ViewGroup.LayoutParams layoutParams = menuView.getLayoutParams();
        layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        menuView.setLayoutParams(layoutParams);
    }
}
