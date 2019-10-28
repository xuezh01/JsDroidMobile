package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.jsdroid.app.view.BasePropView;

public class TextPropView extends BasePropView {

    public TextPropView(Context context) {
        this(context, null);
    }


    public TextPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                input(getProperty());
            }
        });
    }
}
