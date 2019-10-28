package com.jsdroid.commons;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class RootHelper {
    private static Boolean root;

    public static boolean hasApp32() {
        return new File("/system/bin/app_process32").exists();
    }

    public static boolean isDeviceRooted() {
        if (root == null) {
            root = checkRootMethod1() || checkRootMethod2() || checkRootMethod3();
        }
        return root;
    }

    private static boolean checkRootMethod1() {
        String buildTags = android.os.Build.TAGS;
        return buildTags != null && buildTags.contains("login-keys");
    }

    private static boolean checkRootMethod2() {
        String[] paths = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/ipcData/local/xbin/su", "/ipcData/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/ipcData/local/su", "/su/bin/su"};
        for (String path : paths) {
            if (new File(path).exists()) return true;
        }
        return false;
    }

    private static boolean checkRootMethod3() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            if (in.readLine() != null) return true;
            return false;
        } catch (Throwable t) {
            return false;
        } finally {
            if (process != null) process.destroy();
        }
    }
}
