package com.jsdroid.active;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.ZipUtil;
import com.jsdroid.shell.util.APKVersionCodeUtils;
import com.jsdroid.shell.util.FilePermissions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import dalvik.system.PathClassLoader;

/**
 * 释放jsdroid.sh到/data/data/[pkg]/jsdroid.sh
 * 释放shell.apk到/data/data/[pkg]/shell.apk
 * 创建文件夹/data/data/[pkg]/shell_dex_cache
 * 创建文件夹/data/data/[pkg]/script
 * 创建文件夹/data/data/[pkg]/download
 * 设置/data/data/[pkg]/可读写
 * 设置/data/data/[pkg]/shell_dex_cache/可读写
 * 设置/data/data/[pkg]/jsdroid.sh可读写
 * 设置/data/data/[pkg]/shell.apk可读写
 * 设置/data/data/[pkg]/script可读写
 * 设置/data/data/[pkg]/download可读写
 */
public class ShellInstaller {
    private Context context;

    private File appDir;
    private File dexCacheDir;
    private File scriptDir;
    private File downloadDir;
    private File androidDataDir;
    private File jsdShellDir;
    private File jsdVersionFile;
    private File jsdShellApkFile;

    public ShellInstaller(Context context) {
        this.context = context;
        initDir();
    }

    private void initDir() {
        appDir = context.getFilesDir().getParentFile();
        jsdShellDir = getAppFile("shell");
        androidDataDir = getAppFile("android_data");
        jsdShellApkFile = getAppFile("shell/shell.apk");
        dexCacheDir = getAppFile("shell_dex_cache");
        scriptDir = getAppFile("script");
        downloadDir = getAppFile("download");
        jsdVersionFile = getAppFile("version");

    }

    public void install() throws IOException {

        if (!jsdShellDir.exists()) {
            jsdShellDir.mkdir();
        }
        if (!scriptDir.exists()) {
            scriptDir.mkdir();
        }
        if (!downloadDir.exists()) {
            downloadDir.mkdir();
        }
        if (!skipInstall()) {
            releaseAsset("shell/shell.apk", jsdShellApkFile.getAbsolutePath());
            //解压shell.apk到shell
            ZipUtil.unzipFile(jsdShellApkFile.getAbsolutePath(), jsdShellDir.getAbsolutePath());
            writeInstallVersion(getVersion());
        }
        String sh = "trap \"\" HUP INT TERM\n" + getShellSoPath() + "\n";
        FilePermissions.openExecutable(appDir);
        FilePermissions.openExecutables(jsdShellDir);
        FilePermissions.openExecutable(dexCacheDir);
        FilePermissions.openExecutables(androidDataDir);
        FilePermissions.openExecutable(scriptDir);
        FilePermissions.openExecutable(downloadDir);

    }

    public String getShellSoPath() {
        return findNativeLibraryPath("shell");
    }

    public String getNativeLibraryDir() {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    public String findNativeLibraryPath(String libraryName) {
        if (context == null) {
            return null;
        }

        String dexPath = context.getPackageCodePath();
        //注意这个地方
        //取的是ApplicationInfo中的nativeLibraryDir
        String nativeLibraryDir = context.getApplicationInfo().nativeLibraryDir;
        //创建PathClassLoader
        PathClassLoader pathClassLoader = new PathClassLoader(dexPath, nativeLibraryDir,
                ClassLoader.getSystemClassLoader());

        //利用PathClassLoader来获取so的路径
        return pathClassLoader.findLibrary(libraryName);
    }

    public boolean isDebuggable() {
        boolean debuggable = false;
        PackageManager pm = context.getPackageManager();
        try {
            ApplicationInfo appinfo = pm.getApplicationInfo(context.getPackageName(), 0);
            debuggable = (0 != (appinfo.flags & ApplicationInfo.FLAG_DEBUGGABLE));
        } catch (PackageManager.NameNotFoundException e) {
            /*debuggable variable will remain false*/
        }
        return debuggable;
    }

    private boolean skipInstall() {
        if (isDebuggable()) {
            return false;
        }
        String installVersion = readInstallVersion();
        String version = getVersion();
        if (installVersion != null && version.equals(installVersion.trim())) {
            return true;
        }
        return false;
    }

    private String getVersion() {
        return APKVersionCodeUtils.getVerName(context) + "." + APKVersionCodeUtils.getVersionCode(context);
    }

    private String readInstallVersion() {
        return FileUtil.read(jsdVersionFile);
    }

    private void writeInstallVersion(String version) {
        FileUtil.write(jsdVersionFile, version);
    }

    public File getAppDir() {
        return appDir;
    }

    public Context getContext() {
        return context;
    }


    public File getJsdShellApkFile() {
        return jsdShellApkFile;
    }

    public File getDexCacheDir() {
        return dexCacheDir;
    }

    public File getScriptDir() {
        return scriptDir;
    }

    public File getDownloadDir() {
        return downloadDir;
    }

    public File getAndroidDataDir() {
        return androidDataDir;
    }

    private File getAppFile(String name) {
        return new File(getAppDir(), name);
    }

    private void releaseAsset(String name, String outputFile) throws IOException {
        InputStream input = context.getAssets().open(name);
        FileOutputStream output = new FileOutputStream(outputFile);
        FileUtil.cpyStream(input, output);
    }

}
