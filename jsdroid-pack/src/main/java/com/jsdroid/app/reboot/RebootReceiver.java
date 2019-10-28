package com.jsdroid.app.reboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RebootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            startRebootService(context);
        }

    }

    private void startRebootService(Context context) {
        //启动脚本服务
        context.startService(new Intent(context, RebootService.class));
    }
}
