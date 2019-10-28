package com.android.api;

import android.app.ActivityThread;
import android.app.Application;

public class Apps {
    public static Application getApp() {
        //ActivityThread.currentActivityThread().getApplication()
        return ActivityThread.currentActivityThread().getApplication();
    }
}
