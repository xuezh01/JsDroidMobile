package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

public class BoolPropView extends SpinnerPropView {
    public BoolPropView(Context context) {
        this(context, null);
    }

    public BoolPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        String[] props = {"true",
                "false"
        };
        setProps(props, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setProperty(props[position]);
            }
        });
    }
}
