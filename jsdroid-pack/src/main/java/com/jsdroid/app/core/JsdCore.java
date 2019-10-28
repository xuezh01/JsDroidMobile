package com.jsdroid.app.core;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import com.jsdroid.api.entity.Log;
import com.jsdroid.api.mannager.ConfigManager;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.shell.JsdListener;

import java.io.File;
import java.util.List;
import java.util.UUID;

public class JsdCore implements JsdListener {
    private static JsdCore instance = new JsdCore();


    public static JsdCore getInstance() {
        return instance;
    }

    private Application application;

    private JsdCore() {
    }

    public void init(Application application) {
        this.application = application;
        ConfigManager.getInstance().init(application);
        JsDroidApp.getInstance().init(application);
        JsDroidApp.getInstance().setListener(this);
    }

    @Override
    public void onScriptError(String error, String filename, int line, int column) {
    }


    @Override
    public void onScriptLog(String log, String filename, int line, int column) {
    }

    @Override
    public void onSystemLog(Object log) {
    }

    @Override
    public void onScriptStop(String result) {
    }

    @Override
    public void onConnected(JsDroidApp app) {
    }

    @Override
    public void onDisconnected() {
    }

    @Override
    public void onConnectError(Throwable err) {

    }

    @Override
    public void onScriptStart() {
        
    }

    @Override
    public void onVolumeDown(final boolean running) {
        if (JsdOption.getInstance().isVolumeDownControl()) {
            if (running) {
                JsDroidApp.getInstance().toast("停止运行");
                JsDroidApp.getInstance().vibrate(500);
                JsDroidApp.getInstance().stopScript();
            } else {
                JsDroidApp.getInstance().toast("开始运行");
                if (!JsDroidApp.getInstance().runCurrentScript()) {
                    runScript(application.getPackageName());
                }
                JsDroidApp.getInstance().vibrate(500);

            }
        }
    }

    public void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    @Override
    public void onPreView(String jsdFile) {
    }

    @Override
    public List<Log> getLogs() {
        return null;
    }

    public void runCode(String code) {
        JsDroidApp.getInstance().addCodeScriptTask(code);
    }

    public void stopScript() {
        JsDroidApp.getInstance().stopScript();
    }

    public boolean isRunning() {
        return JsDroidApp.getInstance().isRunning();
    }

    public void runScript(String pkg) {
        JsDroidApp.getInstance().addApkScriptTask(pkg);
    }

    public void setCurrentScript(String pkg) {
        JsDroidApp.getInstance().setCurrentScript(pkg);
    }

    public void runLast() {
        JsDroidApp.getInstance().runCurrentScript();
    }


    private String randomImageFile() {
        return getImageFile(UUID.randomUUID().toString()).getPath();
    }

    private File getImageFile(String image) {
        return new File(application.getDir("image", 0), image);
    }
}
