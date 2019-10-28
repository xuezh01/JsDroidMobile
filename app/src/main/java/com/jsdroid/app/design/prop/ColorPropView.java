package com.jsdroid.app.design.prop;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;
import com.jsdroid.app.view.BasePropView;

/**
 * 颜色选择器
 */
public class ColorPropView extends BasePropView {
    public ColorPropView(Context context) {
        this(context, null);
    }

    //选择颜色
    private Integer selectColor;

    public ColorPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //选择颜色
                ColorPickerDialogBuilder.with(context)
                        .setTitle(getHint().toString())
                        .initialColor(selectColor == null ? Color.GREEN : selectColor)
                        .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
                        .density(12)
                        .setOnColorSelectedListener(new OnColorSelectedListener() {
                            @Override
                            public void onColorSelected(int selectedColor) {
                            }
                        })
                        .setPositiveButton("确定", new ColorPickerClickListener() {
                            @Override
                            public void onClick(DialogInterface d, int lastSelectedColor, Integer[] allColors) {
                                selectColor = lastSelectedColor;
                                setProperty(String.format("#%08x", selectColor));
                                setTextColor(selectColor);
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .build().show();
            }
        });
    }

    @Override
    public void setProperty(String property) {
        super.setProperty(property);
        try {
            if (property != null) {
                selectColor = Color.parseColor(property);
                setTextColor(selectColor);
            }
        } catch (Exception e) {
        }
    }

    public Integer getSelectColor() {
        return selectColor;
    }
}
