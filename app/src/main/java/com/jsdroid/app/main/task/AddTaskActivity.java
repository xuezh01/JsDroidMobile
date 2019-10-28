package com.jsdroid.app.main.task;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import com.jsdroid.app.R;
import com.jsdroid.app.main.task.option.CycleTypePicker;
import com.jsdroid.app.main.task.option.ToolPicker;
import com.jsdroid.app.main.task.option.PlanTypePicker;
import com.jsdroid.app.main.task.option.TimeView;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;

public class AddTaskActivity extends BaseActivity<AddTaskActivity, AddTaskPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.cycleTypePicker)
    CycleTypePicker cycleTypePicker;
    @BindView(R.id.scriptPicker)
    ToolPicker toolPicker;
    @BindView(R.id.taskTypePicker)
    PlanTypePicker planTypePicker;
    @BindView(R.id.timeView)
    TimeView timeView;
    @BindView(R.id.timePicker)
    TimePicker timePicker;
    Button btnCreate;

    @Override
    protected AddTaskPresenter createPresenter() {
        return new AddTaskPresenter();
    }

    @Override
    protected AddTaskActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_task;
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("创建任务");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCreate = topBar.addRightTextButton("创建", 111);
    }

    @Override
    protected void initViews() {
        super.initViews();
        timePicker.setIs24HourView(true);
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                calendar.set(Calendar.MINUTE, minute);
                timeView.setTime(calendar.getTime());
            }
        });
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date cycleDate = cycleTypePicker.getCycleDate();
                Calendar runDate = Calendar.getInstance();
                if (cycleDate != null) {
                    runDate.setTime(cycleDate);
                }
                runDate.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
                runDate.set(Calendar.MINUTE, timePicker.getCurrentMinute());

                getPresenter().createPlan(toolPicker.getSelectTool(),
                        planTypePicker.getPlanType(),
                        cycleTypePicker.getCycleType(),
                        cycleTypePicker.getProperty(),
                        cycleTypePicker.getCycleTime(),
                        cycleDate,
                        runDate.getTime()
                );
            }
        });
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, AddTaskActivity.class));
    }
}
