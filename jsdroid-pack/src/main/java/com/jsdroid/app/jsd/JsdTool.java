package com.jsdroid.app.jsd;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

import com.jsdroid.app.utils.AssetUtil;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.active.JsdShell;
import com.jsdroid.script.ScriptInfo;
import com.jsdroid.script.ScriptInstaller;
import com.jsdroid.ui.ViewScript;

import net.lingala.zip4j.exception.ZipException;

import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dalvik.system.DexClassLoader;

public class JsdTool {


    public interface JsdListener {
        void onToolChanged();
    }

    private static JsdTool instance = new JsdTool();

    public static JsdTool getInstance() {
        return instance;
    }

    private Map<String, DexClassLoader> classLoaderMap;
    private Context context;

    private JsdTool() {

    }

    private List<JsdListener> jsdListeners;

    public void init(Context context) {
        this.context = context;
        classLoaderMap = new HashMap<>();
        jsdListeners = new ArrayList<>();
    }

    public void addListener(JsdListener jsdListener) {
        synchronized (jsdListeners) {
            jsdListeners.add(jsdListener);
        }
    }

    public void removeListener(JsdListener jsdListener) {
        synchronized (jsdListeners) {
            jsdListeners.remove(jsdListener);
        }
    }

    protected void fireChanged() {
        Looper mainLooper = Looper.getMainLooper();
        Handler handler = new Handler(mainLooper);
        synchronized (jsdListeners) {
            for (final JsdListener jsdListener : jsdListeners) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        jsdListener.onToolChanged();
                    }
                });
            }
        }
    }

    public DexClassLoader getClassLoader() {
        return getClassLoader(context.getPackageName());
    }

    public DexClassLoader getClassLoader(String pkg) {
        DexClassLoader dexClassLoader = classLoaderMap.get(pkg);
        if (dexClassLoader == null) {
            return initClassLoader(pkg);
        }
        return dexClassLoader;
    }


    private DexClassLoader initClassLoader(String pkg) {
        ScriptInstaller scriptInstaller = JsdShell.getInstance().getScriptInstaller();
        String scriptInstallDir = scriptInstaller.getScriptInstallDir(pkg);
        //base.apk
        File apkFile = new File(scriptInstallDir, "base.apk");
        File optDir = new File(scriptInstallDir, "opt_dex");
        DexClassLoader dexClassLoader = new DexClassLoader(apkFile.getPath(), optDir.getPath(),
                getLibPath(scriptInstallDir), ViewScript.class.getClassLoader());
        classLoaderMap.put(pkg, dexClassLoader);
        return dexClassLoader;
    }


    /**
     * 文件结构如下
     * -lib
     * --x86
     * --arm
     * -assets
     * --用户文件
     * -config.json
     * -icon.png
     * -classes.dex
     *
     * @param jsdFile
     * @throws IOException
     * @throws ZipException
     */
    //安装Jsd文件
    public ScriptInfo install(String jsdFile) throws IOException, ScriptInstaller.InstallException, JSONException {
        ScriptInfo scriptInfo = JsDroidApp.getInstance().installScript(jsdFile);
        initClassLoader(scriptInfo.getPkg());
        //通知更新
        fireChanged();
        return scriptInfo;
    }

    public void install() throws IOException, ScriptInstaller.InstallException, JSONException {
        File file = new File(context.getFilesDir(), context.getPackageName());
        AssetUtil.releaseToFile(context, context.getPackageName(),
                file.getPath());
        install(file.getPath());
    }

    /**
     * 是否已经安装
     *
     * @return
     */
    public boolean hasInstalled() {
//        return JsdOption.getInstance().readBoolean(JsdOption.Key.HAS_INSTALLED);
        return false;
    }

    private String getLibPath(String scriptDir) {
        File libDir = new File(scriptDir, "lib");
        return new File(libDir, Build.CPU_ABI).getPath() +
                File.pathSeparator +
                new File(libDir, Build.CPU_ABI2).getPath();
    }


    public String getInstallDir(String pkg) {
        return JsdShell.getInstance().getScriptInstaller().getScriptInstallDir(pkg);
    }

    public String getScriptFile(String pkg) {
        return JsdShell.getInstance().getScriptInstaller().getScriptFile(pkg);
    }

    public File getSourceDir(String pkg) {

        return new File(JsdShell.getInstance().getScriptInstaller().getScriptInstallDir(pkg), "assets");
    }

}
