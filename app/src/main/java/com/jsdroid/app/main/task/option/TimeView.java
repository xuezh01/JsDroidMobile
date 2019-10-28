package com.jsdroid.app.main.task.option;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.jsdroid.app.view.BasePropView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeView extends BasePropView {
    public TimeView(Context context) {
        this(context, null);
    }

    public TimeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(null);
        setTime(new Date());
    }

    public void setTime(Date time) {
        setProperty(new SimpleDateFormat("HH:mm").format(time));
    }
}
