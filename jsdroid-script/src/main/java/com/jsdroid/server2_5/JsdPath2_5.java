package com.jsdroid.server2_5;

import android.os.Build;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsdPath2_5 {
    private static File scriptDir;
    private static File appDir;
    private static File defaultScriptDir;
    private static File groovyTmpDexDir;
    private static File groovyOptDexCacheDir;
    private static String appPkg;

    /**
     * export SHELL_DEX_CACHE_DIR
     * export SHELL_LIB_DIR
     * export PKG
     * export ANDROID_DATA
     */
    public static void init() {
        initAppPkg();
        initAppDir();
        initScriptDir();
        initDefaultScriptDir();
        initGroovyTmpDexDir();
        initGroovyOptDexDir();
    }


    private static void initAppPkg() {
        appPkg = System.getenv("PKG");
    }

    private static void initAppDir() {
        appDir = new File("/data/data/" + appPkg);
    }

    private static void initScriptDir() {
        scriptDir = new File(appDir, "script");
    }

    private static void initGroovyTmpDexDir() {
        groovyTmpDexDir = new File(appDir, "groovy_tmp_dex");
        if (!groovyTmpDexDir.exists()) {
            groovyTmpDexDir.mkdir();
            groovyTmpDexDir.setExecutable(true, false);
            groovyTmpDexDir.setReadable(true, false);
            groovyTmpDexDir.setWritable(true, false);
        }
    }

    private static void initGroovyOptDexDir() {
        groovyOptDexCacheDir = new File(appDir, "groovy_opt_dex");
        if (!groovyOptDexCacheDir.exists()) {
            groovyOptDexCacheDir.mkdir();
            groovyOptDexCacheDir.setExecutable(true, false);
            groovyOptDexCacheDir.setReadable(true, false);
            groovyOptDexCacheDir.setWritable(true, false);
        }
    }

    private static void initDefaultScriptDir() {
        defaultScriptDir = new File(scriptDir, appPkg);
        if (!defaultScriptDir.exists()) {
            defaultScriptDir.mkdir();
            defaultScriptDir.setWritable(true, false);
            defaultScriptDir.setReadable(true, false);
            defaultScriptDir.setExecutable(true, false);
        }
    }


    public static File getDefaultScriptDir() {
        return defaultScriptDir;
    }

    public static File getScriptDir() {
        return scriptDir;
    }

    public static File getAppDir() {
        return appDir;
    }

    public static String getLaunchAppPkg() {
        return appPkg;
    }

    public static File getGroovyTmpDexDir() {
        return groovyTmpDexDir;
    }

    public static File getGroovyOptDexCacheDir() {
        return groovyOptDexCacheDir;
    }


    public static String getScriptLibDir(String scriptDir) {
        if (scriptDir == null) {
            return null;
        }
        List<File> libFiles = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            for (String supportedAbi : Build.SUPPORTED_ABIS) {
                java.io.File file = new java.io.File(scriptDir, "lib/" + supportedAbi);
                if (file.exists()) {
                    libFiles.add(file);
                }
            }
        } else {
            if (Build.CPU_ABI != null) {
                java.io.File file = new java.io.File(scriptDir, "lib/" + Build.CPU_ABI);
                if (file.exists()) {
                    libFiles.add(file);
                }
            }
            if (Build.CPU_ABI2 != null) {
                java.io.File file = new java.io.File(scriptDir, "lib/" + Build.CPU_ABI2);
                if (file.exists()) {
                    libFiles.add(file);
                }
            }

        }
        if (libFiles.size() > 0) {
            StringBuilder libDirBuilder = new StringBuilder();
            libDirBuilder.append(libFiles.get(0).getAbsoluteFile());
            for (int i = 1; i < libFiles.size(); i++) {
                libDirBuilder.append(":");
                libDirBuilder.append(libFiles.get(i).getAbsoluteFile());
            }
            return libDirBuilder.toString();
        }
        return null;
    }

    public static String getScriptOptDir(String scriptDir) {
        if (scriptDir == null) {
            return null;
        }
        File script_opt_dex = new File(scriptDir, "script_opt_dex");
        if (!script_opt_dex.exists()) {
            script_opt_dex.mkdirs();
        }
        return script_opt_dex.getAbsolutePath();
    }

    public static String getDefaultAppPkg() {
        return "com.jsdroid.app";
    }
}
