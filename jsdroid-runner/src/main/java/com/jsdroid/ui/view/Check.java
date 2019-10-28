package com.jsdroid.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.api.mannager.ConfigManager;
import com.jsdroid.ui.widget.CheckBox;

import groovy.lang.Closure;

public class Check extends JsdView {
    public Check(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    public View createView(Context context) {
        final CheckBox checkBox = new CheckBox(context);
        checkBox.setText(text);
        if (ConfigManager.getInstance().contains(name + ".checked")) {
            checked = Boolean.valueOf(ConfigManager.getInstance().readString(name + ".checked"));
        }
        checkBox.setChecked(checked);
        ConfigManager.getInstance().saveString(name + ".checked", checked + "");
        if (textColor != 0) {
            checkBox.setCheckColor(textColor);
            checkBox.setUnCheckColor(textColor);
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checked = isChecked;
                ConfigManager.getInstance().saveString(name + ".checked", Boolean.toString(checked));
                if (checkClosure != null) {
                    checkClosure.call(Check.this, isChecked);
                }

            }
        });
        return checkBox;
    }

    private Closure checkClosure;

    public void onCheck(final Closure closure) {
        checkClosure = closure;

    }

    @Override
    public String getDesc() {
        return "单选框";
    }
}
