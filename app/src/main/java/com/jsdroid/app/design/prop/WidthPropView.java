package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;

public class WidthPropView extends SpinnerPropView {
    public WidthPropView(Context context) {
        this(context, null);
    }

    public WidthPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        String[] props = {"wrap", "match", "自定义"};
        setProps(props, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 2:
                        //自定义，弹出输入框
                        input(getProperty(), EditorInfo.TYPE_CLASS_NUMBER | EditorInfo.TYPE_NUMBER_FLAG_DECIMAL);
                        break;
                    default:
                        setProperty(props[position]);
                        break;
                }
            }
        });
    }
}
