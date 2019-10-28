package com.jsdroid.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.jsdroid.api.context.JsdContext;

public class Item extends JsdView {
    public Item(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    protected View createView(Context context) {
        return null;
    }

    @Override
    protected void setParams(LinearLayout.LayoutParams params) {

    }

    @Override
    public String getDesc() {
        return "项";
    }
}
