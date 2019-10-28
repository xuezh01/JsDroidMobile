package com.jsdroid.app.core;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import com.jsdroid.api.mannager.ConfigManager;
import com.jsdroid.app.entity.Capture;
import com.jsdroid.app.entity.Log;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.eye.ToolActivity;
import com.jsdroid.app.jsd.JsdCapture;
import com.jsdroid.app.jsd.JsdLog;
import com.jsdroid.app.jsd.JsdPlan;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.commons.ExceptionUtil;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.RootHelper;
import com.jsdroid.float_menu.window.FloatMenu;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.shell.JsdListener;
import com.jsdroid.shell.ShellHelper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        JsDroidApp.getInstance().setListener(this);
        JsDroidApp.getInstance().init(application);
        JsdPlan.getInstance().init();
        caughtException();
    }

    @Override
    public void onScriptError(String error, String filename, int line, int column) {
        Log save = new Log();
        save.setContent(error);
        save.setFilename(filename);
        save.setLineNumber(line);
        save.setType(Log.TYPE_BUG);
        save.setTime(System.currentTimeMillis());
        JsdLog.getInstance().insert(save);
    }

    public String printError(Throwable throwable) {
        throwable.printStackTrace();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        StackTraceElement element = stackTrace[0];
        String log = throwable.getMessage();
        boolean isGroovyBug = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            String fileName = stackTraceElement.getFileName();

            if (fileName != null && fileName.endsWith(".groovy")) {
                element = stackTraceElement;
                isGroovyBug = true;
                break;
            }
        }
        if (!isGroovyBug) {
            log = ExceptionUtil.dumpException(throwable);
        }
        String fileName = element.getFileName();
        int lineNumber = element.getLineNumber();
        onScriptError(log, fileName, lineNumber, 0);
        return log;
    }

    @Override
    public void onScriptLog(String log, String filename, int line, int column) {
        Log save = new Log();
        save.setContent(log);
        save.setFilename(filename);
        save.setLineNumber(line);
        save.setType(Log.TYPE_LOG);
        save.setTime(System.currentTimeMillis());
        JsdLog.getInstance().insert(save);
    }

    @Override
    public void onSystemLog(Object log) {
        if (log instanceof Throwable) {
            try {
                printError((Throwable) log);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        Log save = new Log();
        if (log != null) {
            String content = log.toString();
            if (content.length() == 0) {
                return;
            }
            save.setContent(content);
        }
        save.setType(Log.TYPE_LOG);
        save.setTime(System.currentTimeMillis());
        JsdLog.getInstance().insert(save);
    }

    @Override
    public void onScriptStop(String result) {
        onSystemLog("脚本停止.");
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
        onSystemLog("脚本启动.");
    }

    @Override
    public void onVolumeDown(final boolean running) {
        if (JsdOption.getInstance().isVolumeDownControl()) {
            if (running) {
                JsDroidApp.getInstance().vibrate(500);
                JsDroidApp.getInstance().stopScript();
                JsDroidApp.getInstance().toast("停止运行");
            } else {
                if (JsDroidApp.getInstance().runCurrentScript()) {
                    JsDroidApp.getInstance().vibrate(500);
                    JsDroidApp.getInstance().toast("开始运行");
                }
            }
        }
    }

    public void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    @Override
    public void onPreView(String jsdFile) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    JsDroidApp.getInstance().log("正在安装jsd工具...");
                    String installFile = ShellHelper.getReadableFile(jsdFile,
                            "/sdcard/script.zip");
                    if (installFile == null) {
                        JsDroidApp.getInstance().log("请开启sdcard读取权限！");
                        return;
                    }
                    Tool install = JsdTool.getInstance().install(installFile);
                    runOnMainThread(new Runnable() {
                        @Override
                        public void run() {
                            ToolActivity.openTool(application, install.getPkg());
                        }
                    });
                } catch (Exception e) {
                    JsDroidApp.getInstance().log(e);
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public List<com.jsdroid.api.entity.Log> getLogs() {
        List<Log> logs = JsdLog.getInstance().listNews();
        List<com.jsdroid.api.entity.Log> ret = new ArrayList<>();
        for (Log log : logs) {
            com.jsdroid.api.entity.Log r = new com.jsdroid.api.entity.Log();
            r.setClassName(log.getClassName());
            r.setContent(log.getContent());
            r.setFilename(log.getFilename());
            r.setMethodName(log.getMethodName());
            r.setTime(log.getTime());
            r.setLineNumber(log.getLineNumber());
            r.setType(log.getType());
            ret.add(r);
        }
        return ret;
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
        JsdTool.getInstance().updateRuntime(pkg);
        JsDroidApp.getInstance().addApkScriptTask(pkg);
    }

    public void setCurrentScript(String pkg) {
        JsDroidApp.getInstance().setCurrentScript(pkg);
    }

    public void runLast() {
        JsDroidApp.getInstance().runCurrentScript();
    }

    public void capture(FloatMenu floatMenu) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Capture capture = new Capture();
                try {
                    capture.nodes = JsDroidApp.getInstance().getJsDroidShell().getNodes();
                    capture.image = randomImageFile();
                    FileUtil.writeBytes(capture.image,
                            JsDroidApp.getInstance().getJsDroidShell().captureJpg(1.0f, 80));
                    capture.name = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date());
                    JsdCapture.getInstance().insert(capture);
                    JsDroidApp.getInstance().toast("截屏成功！");
                } catch (Exception e) {
                    if (RootHelper.isDeviceRooted()) {
                        JsDroidApp.getInstance().toast("截屏失败，请授权root权限！");
                    } else {
                        JsDroidApp.getInstance().toast("截屏失败，请开启wifi调试！");
                    }
                }
            }
        }).start();


    }

    private String randomImageFile() {
        return getImageFile(UUID.randomUUID().toString()).getPath();
    }

    private File getImageFile(String image) {
        return new File(application.getDir("image", 0), image);
    }

    public void reboot() {
        JsDroidApp.getInstance().runGroovyCode("runGroovyCode 'reboot'");
    }

    public void caughtException() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                printError(e);
                if (defaultUncaughtExceptionHandler != null) {
                    defaultUncaughtExceptionHandler.uncaughtException(t, e);
                }
            }
        });

    }
}
