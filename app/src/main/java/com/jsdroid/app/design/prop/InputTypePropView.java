package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;

public class InputTypePropView extends SpinnerPropView {
    public InputTypePropView(Context context) {
        this(context, null);
    }

    public InputTypePropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        String[] props = {"normal", "number", "password"};
        setProps(props, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setProperty(props[position]);
            }
        });
    }
}
