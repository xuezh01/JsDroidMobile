package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

public class GravityPropView extends SpinnerPropView {
    public GravityPropView(Context context) {
        this(context, null);
    }

    public GravityPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        String[] props = {"left",
                "top",
                "right",
                "bottom",
                "start",
                "stop",
                "center",
                "centerVertical",
                "centerHorizontal",
                "right|centerVertical",
                "bottom|centerHorizontal",
                "right|bottom"

        };
        setProps(props, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setProperty(props[position]);
            }
        });
    }
}
