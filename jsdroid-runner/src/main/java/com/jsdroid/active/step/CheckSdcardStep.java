package com.jsdroid.active.step;


import java.io.File;

public class CheckSdcardStep extends BaseStep {
    @Override
    public boolean skip() {
        if (new File("/sdcard").exists()) {
            return true;
        }
        if (new File("/mnt/sdcard").exists()) {
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        //申请sdcard权限

    }
}
