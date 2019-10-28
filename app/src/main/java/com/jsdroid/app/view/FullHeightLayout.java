package com.jsdroid.app.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.qmuiteam.qmui.util.QMUIDisplayHelper;

/**
 * 填充高度，用于界面避免被输入法挤压变形
 */
public class FullHeightLayout extends LinearLayout {
    public FullHeightLayout(Context context) {
        super(context);
        setFullMode();
    }

    public FullHeightLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFullMode();
    }

    void setFullMode() {
        Object context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        }
    }
}
