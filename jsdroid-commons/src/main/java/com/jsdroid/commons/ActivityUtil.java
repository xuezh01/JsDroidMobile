package com.jsdroid.commons;

import com.android.api.Activities;
import android.content.Intent;

public class ActivityUtil {
    public static void launch(String pkg) {
        Activities.launch(pkg);
    }

    public static void startActivity(Intent intent) {
        Activities.startActivity(intent);

    }
}
