package com.jsdroid.float_menu.window;

import android.graphics.drawable.Drawable;

public class FloatMenu {
    public interface OnClickListener {
        void onClick(FloatMenu floatMenu);
    }

    private String name;
    private Drawable icon;

    private OnClickListener onClickListener;

    public FloatMenu() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }
}
