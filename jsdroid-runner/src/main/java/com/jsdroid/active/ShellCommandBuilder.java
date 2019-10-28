package com.jsdroid.active;

import android.os.Build;
import android.support.annotation.NonNull;

import com.jsdroid.commons.RootHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ShellCommandBuilder {

    private String shellApkFile;
    private String shellPkg;
    private String shellClass;
    private String androidDataDir;
    private String shellLibDir;
    private boolean copyShell;


    public ShellCommandBuilder setShellLibDir(String shellLibDir) {
        this.shellLibDir = shellLibDir;
        return this;
    }


    public ShellCommandBuilder setAndroidDataDir(String androidDataDir) {
        this.androidDataDir = androidDataDir;
        return this;
    }

    public ShellCommandBuilder setShellApkFile(String shellApkFile) {
        this.shellApkFile = shellApkFile;
        return this;
    }

    public ShellCommandBuilder setShellPkg(String shellPkg) {
        this.shellPkg = shellPkg;
        return this;
    }

    public ShellCommandBuilder setShellClass(String shellClass) {
        this.shellClass = shellClass;
        return this;
    }

    public ShellCommandBuilder setCopyShell(boolean copyShell) {
        this.copyShell = copyShell;
        return this;
    }

    /**
     * dalvikvm -cp /data/data/pkg/shell/shell.apk com.jsdroid.server2_5.Main2_5
     *
     * @return
     */
    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append("trap \"\" HUP INT TERM\n");
        if (shellPkg != null) {
            sb.append("export PKG=" + shellPkg + "\n");
        }
        if (androidDataDir != null) {
            if (!RootHelper.isDeviceRooted()) {
                sb.append("export ANDROID_DATA=" + androidDataDir + "\n");
                sb.append("mkdir $ANDROID_DATA\n");
                sb.append("mkdir $ANDROID_DATA/dalvik-cache\n");
            }
        }
        String apk = shellApkFile;
        if (copyShell) {
            apk = "/data/local/tmp/shell.apk";
            sb.append("cat " + shellApkFile + ">" + apk + "\n");
        }
        //如果存在/system/bin/dalvikvm32,则用dalvikvm32
        if (new File("/system/bin/app_process32").exists()) {
            sb.append("app_process32");
        } else {
            sb.append("app_process");
        }
        sb.append(" -Djava.library.path=" + getLibPath());
        sb.append(" -Djava.class.path=" + apk);
        sb.append(" / ");
        sb.append(shellClass);
        sb.append("\n");
        return sb.toString();
    }

    @NonNull
    public List<String> getLibDirs() {
        List<String> libDirs = new ArrayList<>();
        //将shellLibDir传入
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (Build.SUPPORTED_ABIS != null) {
                for (String supportedAbi : Build.SUPPORTED_ABIS) {
                    if (new File(shellLibDir, supportedAbi).exists()) {
                        libDirs.add(new File(shellLibDir, supportedAbi).getAbsolutePath());
                    }
                }
            }
        } else {
            if (Build.CPU_ABI != null) {
                if (new File(shellLibDir, Build.CPU_ABI).exists()) {
                    libDirs.add(new File(shellLibDir, Build.CPU_ABI).getAbsolutePath());
                }
            }
            if (Build.CPU_ABI2 != null) {
                if (new File(shellLibDir, Build.CPU_ABI2).exists()) {
                    libDirs.add(new File(shellLibDir, Build.CPU_ABI2).getAbsolutePath());
                }
            }

        }
        libDirs.add(shellLibDir);
        return libDirs;
    }

    private String getLibPath() {
        String library = System.getProperty("java.library.path");
        if (library == null || "".equals(library.trim())) {
            library = ".";
        }
        StringBuilder sb = new StringBuilder();
        List<String> libDirs = getLibDirs();
        sb.append(library);
        for (String libDir : libDirs) {
            sb.append(":").append(libDir);
        }
        return sb.toString();
    }
}
