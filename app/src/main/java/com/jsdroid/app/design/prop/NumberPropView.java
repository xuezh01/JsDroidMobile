package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;

import com.jsdroid.app.view.BasePropView;

public class NumberPropView extends BasePropView {
    public NumberPropView(Context context) {
        this(context, null);
    }

    public NumberPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                input(getProperty(),EditorInfo.TYPE_CLASS_NUMBER| EditorInfo.TYPE_NUMBER_FLAG_DECIMAL);
            }
        });
    }
}
