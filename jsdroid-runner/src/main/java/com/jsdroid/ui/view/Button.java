package com.jsdroid.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.jsdroid.api.context.JsdContext;

public class Button extends Text {

    {
        width = LinearLayout.LayoutParams.WRAP_CONTENT;
        height = LinearLayout.LayoutParams.WRAP_CONTENT;
        radius = 10;
        padding = 10;
        pressedColor = 0xff999999;
        backgroundColor = 0xffdddddd;
        borderColor = 0xffaaaaaa;
        gravity = "center";
    }

    public Button(JsdContext jsdContext) {
        super(jsdContext);
    }
    @Override
    public View createView(Context context) {
        View button = super.createView(context);
        button.setClickable(true);
        return button;
    }

    @Override
    public String getDesc() {
        return "按钮";
    }
}
