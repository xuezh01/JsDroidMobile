package com.jsdroid.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.api.mannager.ConfigManager;

public class Text extends JsdView {
    public Text(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    public View createView(Context context) {
        TextView textView = new TextView(context);
        if (name != null) {
            if (ConfigManager.getInstance().contains(name + ".text")) {
                text = ConfigManager.getInstance().readString(name + ".text");
            }

        }
        textView.setText(text);
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
        if (textSize != 0) {
            textView.setTextSize(textSize);
        }
        return textView;
    }

    public void setText(String text) {
        this.text = text;
        TextView textView = (TextView) view;
        textView.setText(text);
    }

    @Override
    public String getDesc() {
        return "文字";
    }
}
