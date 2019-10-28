package com.jsdroid.app.main.task;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.jsdroid.app.view.BasePropView;

public class PropView extends BasePropView {
    public PropView(Context context) {
        super(context);
        setClickable(false);
        setOnClickListener(null);
    }

    public PropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(null);
        setClickable(false);
    }
}
