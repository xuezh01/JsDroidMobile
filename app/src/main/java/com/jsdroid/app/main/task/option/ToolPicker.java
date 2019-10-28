package com.jsdroid.app.main.task.option;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

import com.jsdroid.app.design.prop.SpinnerPropView;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.jsd.JsdTool;

import java.util.List;

public class ToolPicker extends SpinnerPropView {
    public ToolPicker(Context context) {
        this(context, null);
    }

    private String names[];
    private List<Tool> list;
    private Tool selectTool;

    public Tool getSelectTool() {
        return selectTool;
    }

    public ToolPicker(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        list = JsdTool.getInstance().list();
        names = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Tool tool = list.get(i);
            names[i] = tool.name;
        }
        setProps(names, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setProperty(names[position]);
                selectTool = list.get(position);
            }
        });
        if (list.size() > 0) {
            selectTool = list.get(0);
            setProperty(names[0]);
        } else {
            setProperty("空");
        }

    }

}
