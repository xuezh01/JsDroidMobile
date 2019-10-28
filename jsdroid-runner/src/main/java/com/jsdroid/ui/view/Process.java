package com.jsdroid.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;

import com.jsdroid.api.context.JsdContext;

public class Process extends JsdView {
    public Process(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    protected View createView(Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        if (backgroundColor != 0) {
            progressBar.getIndeterminateDrawable().setColorFilter(
                    backgroundColor,
                    android.graphics.PorterDuff.Mode.SRC_IN);
        }
        return progressBar;
    }

    @Override
    protected Drawable createDrawAble(Context context) {

        return null;
    }

    @Override
    public String getDesc() {
        return "进度条";
    }
}
