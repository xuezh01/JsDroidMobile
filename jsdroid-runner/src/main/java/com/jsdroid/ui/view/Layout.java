package com.jsdroid.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.jsdroid.api.context.JsdContext;

public class Layout extends JsdView {

    public Layout(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    public String getDesc() {
        return "线性布局";
    }

    @Override
    protected View createView(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        int o = LinearLayout.VERTICAL;
        if (orientation != null && orientation.startsWith("hor")) {
            o = LinearLayout.HORIZONTAL;
        }
        linearLayout.setOrientation(o);
        //添加子view
        if (children != null) {
            for (JsdView child : children) {
                if (child != null && child.view != null) {
                    linearLayout.addView(child.view);
                }
            }
        }
        return linearLayout;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }
}
