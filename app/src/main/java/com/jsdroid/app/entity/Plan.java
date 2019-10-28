package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

import org.greenrobot.greendao.annotation.Generated;

/**
 * 任务/计划
 * 1.设置任务类型：
 * 2.设置周期类型
 * 3.设置下次运行时间
 * 4.设置运行周期
 * 5.选择脚本
 */
@Entity
public class Plan {
    //计划类型
    public enum PlanType {
        //重启手机
        REBOOT,
        //运行脚本
        RUN_SCRIPT,
        //运行代码
        RUN_CODE,
        //重启脚本
        RESTART_SCRIPT;

        public String text() {
            switch (this) {
                case REBOOT:
                    return "重启手机";
                case RUN_CODE:
                    return "运行代码";
                case RESTART_SCRIPT:
                    return "重启脚本";
                case RUN_SCRIPT:
                    return "运行脚本";
            }
            return "";
        }
    }

    //周期类型
    public enum CycleType {
        WEEK_DAY,//周几
        DAY_TIME,//每天的几点
        TIME,//每隔多久
        NONE//无周期，具体时间
    }

    @Id(autoincrement = true)
    public Long id;
    public String cycleText;
    public String planType;
    public String cycleType;
    public Date runDate;//运行日期
    public Date circleDate;//运行周期日期：星期几、每天几点
    public long circleTime;//周期时间
    public String content;//脚本id或者代码

    @Generated(hash = 846616647)
    public Plan(Long id, String cycleText, String planType, String cycleType,
                Date runDate, Date circleDate, long circleTime, String content) {
        this.id = id;
        this.cycleText = cycleText;
        this.planType = planType;
        this.cycleType = cycleType;
        this.runDate = runDate;
        this.circleDate = circleDate;
        this.circleTime = circleTime;
        this.content = content;
    }

    @Generated(hash = 592612124)
    public Plan() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanType() {
        return this.planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getCycleType() {
        return this.cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public Date getRunDate() {
        return this.runDate;
    }

    public void setRunDate(Date runDate) {
        this.runDate = runDate;
    }

    public Date getCircleDate() {
        return this.circleDate;
    }

    public void setCircleDate(Date circleDate) {
        this.circleDate = circleDate;
    }

    public long getCircleTime() {
        return this.circleTime;
    }

    public void setCircleTime(long circleTime) {
        this.circleTime = circleTime;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCycleText() {
        return this.cycleText;
    }

    public void setCycleText(String cycleText) {
        this.cycleText = cycleText;
    }

}
