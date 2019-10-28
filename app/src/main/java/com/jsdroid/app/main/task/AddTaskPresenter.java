package com.jsdroid.app.main.task;

import android.util.Log;

import com.jsdroid.app.entity.Plan;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.jsd.JsdPlan;
import com.jsdroid.mvp.presenter.BasePresenter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class AddTaskPresenter extends BasePresenter<AddTaskActivity> {
    public void createPlan(Tool tool, Plan.PlanType planType,
                           Plan.CycleType cycleType,
                           String cycleText,
                           long cycleTime,
                           Date cycleDate,
                           Date runDate) {
        Plan plan = new Plan();
        switch (planType) {
            case RESTART_SCRIPT:
                break;
            case REBOOT:
                break;
            case RUN_SCRIPT:
                if (tool == null) {
                    getView().showError("请选择脚本！");
                    return;
                }
                plan.setContent(tool.pkg);
                break;
        }

        plan.setCircleDate(cycleDate);
        plan.setCycleText(cycleText);
        plan.setCircleTime(cycleTime);
        plan.setPlanType(planType.name());
        plan.setCycleType(cycleType.name());
        plan.setRunDate(runDate);
        JsdPlan.getInstance().setToNextRunDate(plan);
        JsdPlan.getInstance().insert(plan);
        getView().finish();
    }
}
