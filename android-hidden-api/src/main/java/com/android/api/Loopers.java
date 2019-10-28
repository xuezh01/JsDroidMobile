package com.android.api;

import android.os.Looper;

public class Loopers {
    public static void prepare() {
        Looper.prepare();
    }

    public static void loop() {
        Looper.loop();
    }
}
