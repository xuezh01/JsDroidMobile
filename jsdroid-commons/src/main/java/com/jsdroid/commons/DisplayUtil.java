package com.jsdroid.commons;

import com.android.api.Apps;
import android.app.Service;
import android.content.Context;
import android.view.WindowManager;

public class DisplayUtil {
    public static int getRotation() {
        WindowManager windowManager = (WindowManager)
                getContext().getSystemService(Service.WINDOW_SERVICE);
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static Context getContext() {
        return Apps.getApp();
    }
}
