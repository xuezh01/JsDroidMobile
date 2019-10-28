package com.jsdroid.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.jsdroid.api.context.JsdContext;
import com.jsdroid.api.mannager.ConfigManager;

import java.util.ArrayList;
import java.util.List;

import groovy.lang.Closure;

/**
 * 下拉框
 */
public class Spinner extends JsdView {

    public Spinner(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    protected View createView(Context context) {
        List<String> items = new ArrayList<>();
        if (children != null) {
            for (JsdView child : children) {
                if (child.text != null) {
                    items.add(child.text);
                }
            }
        }
        MaterialSpinner niceSpinner = new MaterialSpinner(context);
        niceSpinner.setItems(items);
        if (select < items.size()) {
            niceSpinner.setSelectedIndex(select);
        }
        if (ConfigManager.getInstance().contains(name + ".select")) {
            int position = ConfigManager.getInstance().readInt(name + ".select");
            if (position < items.size()) {
                niceSpinner.setSelectedIndex(position);
            }
        }
        niceSpinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                ConfigManager.getInstance().saveInt(name + ".select", position);
                if (selectClosure != null) {
                    selectClosure.call(Spinner.this, position, item);
                }
            }
        });
        if (textColor != 0) {
            niceSpinner.setTextColor(textColor);
            niceSpinner.setArrowColor(textColor);
        }
        if (backgroundColor != 0) {
            niceSpinner.setBackgroundColor(backgroundColor);
        }

        if (textSize != 0) {
            niceSpinner.setTextSize(textSize);
        }
        return niceSpinner;
    }

    @Override
    protected void setDrawable(Drawable drawable) {
//        super.setDrawable(drawable);
    }

    private Closure selectClosure;

    public void onSelect(final Closure closure) {
        selectClosure = closure;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public String getDesc() {
        return "下拉框";
    }
}
