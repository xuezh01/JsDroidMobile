package com.jsdroid.app.jsd;

import android.util.Log;

import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.dao.PlanDao;
import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Plan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class JsdPlan extends BaseManager {
    //每次循环空闲时间
    public static final int IDLE_TIME = 1000;
    private static JsdPlan instance = new JsdPlan();

    public static JsdPlan getInstance() {
        return instance;
    }

    private Timer timer;
    List<Plan> plans;

    private JsdPlan() {

    }

    public void init() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (plans == null) {
                    plans = list();
                }
                for (Plan plan : plans) {
                    Plan.CycleType cycleType = Plan.CycleType.valueOf(plan.cycleType);
                    Date runDate = plan.getRunDate();
                    long runDateTime = runDate.getTime();
                    //运行日期小于当前日期就运行
                    if (runDateTime <= System.currentTimeMillis()) {
                        switch (cycleType) {
                            case NONE: {
                                //一次性任务，当前时间超过计划时间就运行，运行后删除
                                delete(plan);
                                break;
                            }
                            case TIME: {
                                //每隔多少时间就运行，需要更新下次运行时间，+周期时间
                                setToNextRunDate(plan);
                                update(plan);
                                break;
                            }
                            case DAY_TIME: {
                                //每天的几点运行，需要更新下次运行时间，+一天
                                setToNextRunDate(plan);
                                update(plan);
                                break;
                            }
                            case WEEK_DAY: {
                                //每周几运行，需要更新下次运行时间，+一周
                                setToNextRunDate(plan);
                                update(plan);
                                break;
                            }
                        }
                        //运行
                        runPlan(plan);
                    }
                }
                fireChanged();
            }
        }, IDLE_TIME, IDLE_TIME);
    }

    public void setToNextRunDate(Plan plan) {
        if (plan.runDate.getTime() < System.currentTimeMillis() && plan.circleTime > 0) {
            plan.runDate.setTime(plan.runDate.getTime() + plan.circleTime);
            setToNextRunDate(plan);
        }
    }

    private void runPlan(Plan plan) {
        Plan.PlanType planType = Plan.PlanType.valueOf(plan.getPlanType());
        switch (planType) {
            case REBOOT:
                JsdCore.getInstance().reboot();
                break;
            case RUN_CODE:
                JsdCore.getInstance().runCode(plan.content);
                break;
            case RUN_SCRIPT:
                JsdCore.getInstance().runScript(plan.content);
                break;
            case RESTART_SCRIPT:
                JsdCore.getInstance().stopScript();
                JsdCore.getInstance().runLast();
                break;
        }
    }

    public Long insert(Plan plan) {
        try {
            return Db.getInstance().getDaoSession().getPlanDao().insert(plan);
        } finally {
            fireChanged();
        }
    }

    public void delete(Long... ids) {
        try {
            Db.getInstance().getDaoSession().getPlanDao().deleteByKeyInTx(ids);
        } finally {
            fireChanged();
        }
    }

    public void delete(Plan... plans) {
        try {
            Db.getInstance().getDaoSession().getPlanDao().deleteInTx(plans);
        } finally {
            fireChanged();
        }
    }

    public void update(Plan plan, boolean notifyChanged) {
        try {
            Db.getInstance().getDaoSession().getPlanDao().update(plan);
        } finally {
            if (notifyChanged) {
                fireChanged();
            }
        }
    }

    @Override
    protected void onChanged() {
        super.onChanged();
        plans = null;
    }

    public void update(Plan plan) {
        update(plan, true);
    }

    public List<Plan> list() {
        return Db.getInstance().getDaoSession().getPlanDao().queryBuilder().orderAsc(PlanDao.Properties.RunDate).list();
    }

    public Plan get(long planId) {
        return Db.getInstance().getDaoSession().getPlanDao().load(planId);
    }


}
