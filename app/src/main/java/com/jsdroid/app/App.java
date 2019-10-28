package com.jsdroid.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.database.Db;
import com.jsdroid.app.floaty.JsdFloatMenu;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.app.service.KeepScreenOnService;
import com.jsdroid.server.api.JsdApi;


public class App extends Application {
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    String getCurProcessName(Context context) {
        int pid = android.os.Process.myPid();
        ActivityManager mActivityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        if (mActivityManager != null) {
            for (ActivityManager.RunningAppProcessInfo appProcess : mActivityManager
                    .getRunningAppProcesses()) {
                if (appProcess.pid == pid) {
                    return appProcess.processName;
                }
            }
        }
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initApp();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);

    }

    public void installMultiDex() {

    }

    private void initApp() {
        //非当前进程，返回
        if (!getPackageName().equals(getCurProcessName(this))) {
            return;
        }
        //初始化数据库
        Db.getInstance().init(this);
        //初始化配置
        JsdOption.getInstance().init(this);
        //初始化悬浮窗
        JsdFloatMenu.getInstance().init(this);
        //屏幕常亮服务监听配置
        KeepScreenOnService.listenOption();
        //异常捕获
        //接口
        JsdApi.init(this, "v2.jsdroid.com");
        //初始化内核
        JsdCore.getInstance().init(this);
    }
}
