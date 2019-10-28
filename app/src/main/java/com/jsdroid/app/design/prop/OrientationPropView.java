package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

public class OrientationPropView extends SpinnerPropView {
    public OrientationPropView(Context context) {
        this(context, null);
    }

    public OrientationPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        String[] props = {"vertical",
                "horizontal"
        };
        setProps(props, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setProperty(props[position]);
            }
        });
    }
}
