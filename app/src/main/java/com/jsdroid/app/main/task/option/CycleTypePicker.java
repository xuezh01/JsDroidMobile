package com.jsdroid.app.main.task.option;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.jsdroid.app.design.prop.SpinnerPropView;
import com.jsdroid.app.entity.Plan;
import com.jsdroid.app.jsd.JsdPlan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CycleTypePicker extends SpinnerPropView {
    public CycleTypePicker(Context context) {
        this(context, null);
    }

    private String cycleTypes[] = new String[]{
            "每周", "每天", "每隔", "无"
    };
    private Plan.CycleType cycleType;
    private long cycleTime;
    private Date cycleDate;

    public Plan.CycleType getCycleType() {
        return cycleType;
    }

    public long getCycleTime() {
        return cycleTime;
    }

    public Date getCycleDate() {
        return cycleDate;
    }

    public CycleTypePicker(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        cycleType = Plan.CycleType.NONE;
        setProperty("无");
        cycleTime = 24 * 60 * 60 * 1000L;
        setProps(cycleTypes, new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0: {
                        String[] weekStrings = {
                                "每周一",
                                "每周二",
                                "每周三",
                                "每周四",
                                "每周五",
                                "每周六",
                                "每周七",
                        };
                        //每周几
                        showSpinner(weekStrings, new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Calendar calendar = Calendar.getInstance();
                                switch (position) {
                                    case 0:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
                                        break;
                                    case 1:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
                                        break;
                                    case 2:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
                                        break;
                                    case 3:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
                                        break;
                                    case 4:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
                                        break;
                                    case 5:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
                                        break;
                                    case 6:
                                        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
                                        break;
                                }
                                cycleType = Plan.CycleType.WEEK_DAY;
                                cycleTime = 7 * 24 * 60 * 60 * 1000L;
                                cycleDate = calendar.getTime();
                                setProperty(weekStrings[position]);

                            }
                        });
                        break;
                    }
                    case 1: {
                        //每天
                        cycleType = Plan.CycleType.DAY_TIME;
                        cycleTime = 24 * 60 * 60 * 1000L;
                        cycleDate = new Date();
                        setProperty(cycleTypes[position]);
                        break;
                    }
                    case 2: {
                        //每隔一段时间
                        input("每隔多少分钟？", "请输入分钟", InputType.TYPE_CLASS_NUMBER, new InputListener() {
                            @Override
                            public void onInput(String text) {

                                try {
                                    cycleTime = Integer.parseInt(text) * 60 * 1000L;
                                } catch (NumberFormatException e) {
                                    cycleTime = 60 * 1000L;
                                }
                                if (cycleTime <= 0) {
                                    cycleTime = 60 * 1000L;
                                }
                                cycleType = Plan.CycleType.TIME;
                                cycleDate = new Date();
                                setProperty("每隔" + cycleTime / (60 * 1000L) + "分钟");

                            }
                        });
                        break;
                    }
                    default: {
                        //无
                        cycleTime = 24 * 60 * 60 * 1000L;
                        cycleType = Plan.CycleType.NONE;
                        setProperty(cycleTypes[position]);
                        break;
                    }

                }
            }
        });
    }

}
