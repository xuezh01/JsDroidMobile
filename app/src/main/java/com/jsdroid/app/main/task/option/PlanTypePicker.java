package com.jsdroid.app.main.task.option;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

import com.jsdroid.app.design.prop.SpinnerPropView;
import com.jsdroid.app.entity.Plan;

public class PlanTypePicker extends SpinnerPropView {
    public PlanTypePicker(Context context) {
        this(context, null);
    }

    String planTypes[] = new String[]{
            "运行脚本", "重启脚本", "重启手机"
    };
    Plan.PlanType planType;

    public PlanTypePicker(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setProps(planTypes, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        planType = Plan.PlanType.RUN_SCRIPT;
                        break;
                    case 1:
                        planType = Plan.PlanType.RESTART_SCRIPT;
                        break;
                    case 2:
                        planType = Plan.PlanType.REBOOT;
                        break;
                }
                setProperty(planTypes[position]);
            }
        });
        planType = Plan.PlanType.RUN_SCRIPT;
        setProperty(planTypes[0]);
    }

    public Plan.PlanType getPlanType() {
        return planType;
    }
}
