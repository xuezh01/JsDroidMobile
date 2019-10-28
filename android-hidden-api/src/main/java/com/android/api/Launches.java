package com.android.api;

import android.app.ActivityThread;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.lang.reflect.Field;

public class Launches {
    /**
     * 初始化context用得到哦
     */
    public static void systemMain() {
        try {
            Field mSystem = Resources.class.getDeclaredField("mSystem");
            mSystem.setAccessible(true);
            final DisplayMetrics metrics = new DisplayMetrics();
            metrics.setToDefaults();
            final Configuration config = new Configuration();
            config.setToDefaults();
            Resources resources = new Resources(AssetManagers.getSystem(), metrics, config);
            mSystem.set(null, resources);
        } catch (Throwable e) {
        }
        try {
            ActivityThread.systemMain();
        } catch (Throwable e) {
        }
    }

}
