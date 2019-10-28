package com.jsdroid.app.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.annotation.Nullable;

import com.jsdroid.app.App;
import com.jsdroid.app.option.JsdOption;

public class KeepScreenOnService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    PowerManager powerManager;
    PowerManager.WakeLock screenOn;

    @Override
    public void onCreate() {
        super.onCreate();
        powerManager = (PowerManager) getSystemService(POWER_SERVICE);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        boolean screenOn = false;
        if (intent != null) {
            screenOn = intent.getBooleanExtra("screenOn", false);
        }
        if (screenOn) {
            screenOn();
        } else {
            screenOff();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void screenOn() {
        if (screenOn != null) {
            return;
        }
        screenOn = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "screenOn");
        screenOn.acquire();
    }

    private void screenOff() {
        if (screenOn == null) {
            return;
        }
        screenOn.release();
        screenOn = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        screenOff();
    }

    public static void screenOn(Context context) {
        Intent intent = new Intent(context, KeepScreenOnService.class);
        intent.putExtra("screenOn", true);
        context.startService(intent);
    }

    public static void screenOff(Context context) {
        Intent intent = new Intent(context, KeepScreenOnService.class);
        intent.putExtra("screenOn", false);
        context.startService(intent);
    }

    private static void toggle() {
        try {
            if (JsdOption.getInstance().isKeepScreen()) {
                KeepScreenOnService.screenOn(App.getInstance());
            } else {
                KeepScreenOnService.screenOff(App.getInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenOption() {
        JsdOption.getInstance().addOptionListener(new JsdOption.OptionListener() {
            @Override
            public void onOptionChanged(JsdOption.Key key, Object value) {
                switch (key) {
                    case KEEP_SCREEN: {
                        toggle();
                        break;
                    }
                }
            }
        });
        toggle();
    }
}
