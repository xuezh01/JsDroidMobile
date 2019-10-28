package com.jsdroid.os;

public class Os {
    static {

        try {
            System.loadLibrary("jsd-os");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static native int mkfifo(String path, int mode);
}
