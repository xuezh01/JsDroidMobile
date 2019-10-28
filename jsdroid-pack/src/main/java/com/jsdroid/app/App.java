package com.jsdroid.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.multidex.MultiDexApplication;

import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.floaty.JsdFloatMenu;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.app.service.KeepScreenOnService;
import com.jsdroid.app.utils.AssetUtil;
import com.jsdroid.groovy.JsDroidShell;

import java.io.File;


public class App extends MultiDexApplication {
    private static final String TAG = App.class.getName();


    private static App instance;

    public static App getInstance() {
        return instance;
    }

    //region 初始化

    public App() {
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        JsdCore.getInstance().init(this);
        JsdTool.getInstance().init(this);
        JsdOption.getInstance().init(this);
        JsdFloatMenu.getInstance().init(this);
        //屏幕常亮
        KeepScreenOnService.listenOption();
        //注册启动脚本监听
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                JsdCore.getInstance().stopScript();
                String pkg = intent.getStringExtra("pkg");
                if (pkg != null) {
                    JsdCore.getInstance().runScript(pkg);
                } else {
                    JsdCore.getInstance().runLast();
                }

            }
        }, new IntentFilter("com.jsdroid.app.RestartScript"));
    }


}
