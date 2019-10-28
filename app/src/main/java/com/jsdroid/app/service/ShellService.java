package com.jsdroid.app.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


/**
 * 启动shell服务
 */
public class ShellService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //启动
//        ShellStarter.getInstance().start(getApplicationContext());
    }

    public static void start(Context context) {
        context.startService(new Intent(context, ShellService.class));
    }

}
