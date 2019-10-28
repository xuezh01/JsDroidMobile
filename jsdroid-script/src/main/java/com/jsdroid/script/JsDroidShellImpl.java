package com.jsdroid.script;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.RemoteException;

import com.alibaba.fastjson.JSON;
import com.jsdroid.api.IJpgReceiver;
import com.jsdroid.api.IJsDroidApp;
import com.jsdroid.api.IJsDroidIde;
import com.jsdroid.api.IJsDroidShell;
import com.jsdroid.api.annotations.MethodDoc;
import com.jsdroid.api.entity.DeviceInfo;
import com.jsdroid.api.entity.File;
import com.jsdroid.capture.EncodeThread;
import com.jsdroid.commons.ExceptionUtil;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.InputUtil;
import com.jsdroid.commons.ScreenUtil;
import com.jsdroid.device.DeviceInfoManager;
import com.jsdroid.event.JsDroidEvent;
import com.jsdroid.groovy.ScriptClassLoader;
import com.jsdroid.script.builder.JsdScriptBuilder;
import com.jsdroid.server2_5.JsdPath2_5;
import com.jsdroid.uiautomator2.UiDevice;

import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import eu.chainfire.libsuperuser.Shell;

public class JsDroidShellImpl implements IJsDroidShell, JsDroidEvent.EventListener {
    private static JsDroidShellImpl instance = new JsDroidShellImpl();

    public static JsDroidShellImpl getInstance() {
        return instance;
    }

    private Map<String, IJsDroidApp> appMap;
    private final Map<String, Boolean> runningMap;
    private IJsDroidIde jsDroidIde;
    private ExecutorService scriptThreadPool;

    private JsDroidShellImpl() {
        appMap = new HashMap<>();
        runningMap = new HashMap<>();
        scriptThreadPool = Executors.newCachedThreadPool();
        ScriptClassLoader.clearLibDir();
        JsDroidEvent.getInstance().addListener(this);

    }

    public void setVolumeDownControl(boolean volumeDownControl) {
    }


    public IJsDroidApp getJsDroidApp(String pkg) {
        if (pkg == null) {
            return getDefaultApp();
        }
        return appMap.get(pkg);
    }

    public IJsDroidIde getJsDroidIde() {
        return jsDroidIde;
    }


    @Override
    public void debug(String jsdFile) throws InterruptedException {
        IJsDroidApp app = getDefaultApp();
        if (app != null) {
            try {
                app.getPkg();
            } catch (Exception e) {
                throw new InterruptedException("请先启动JsDroid客户端APP！");
            }
            new java.io.File(jsdFile).setReadable(true, false);
            new java.io.File(jsdFile).setWritable(true, false);

            app.debug(jsdFile);
        } else {
            throw new InterruptedException("请先启动JsDroid客户端APP！");
        }
    }

    @Override
    public boolean runFile(final String appPkg, final String scriptDir, final String scriptFile) {
        //启动
        scriptThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 30; i++) {
                        try {
                            if (new java.io.File(scriptFile).canRead()) {
                                break;
                            }
                        } catch (Exception e) {
                            if (i == 29) {
                                printError(e);
                            }
                        }
                        Thread.sleep(100);
                    }
                    JsdScriptBuilder.ApkBuilder scriptBuilder = new JsdScriptBuilder.ApkBuilder();
                    scriptBuilder.setAppPkg(appPkg);
                    scriptBuilder.setScriptDir(scriptDir);
                    scriptBuilder.setScriptFile(scriptFile);
                    scriptBuilder.setScriptLibDir(JsdPath2_5.getScriptLibDir(scriptDir));
                    scriptBuilder.setScriptOptDexDir(JsdPath2_5.getScriptOptDir(scriptDir));
                    JsDroidScript build = scriptBuilder.build();
                    build.setExitOnEnd(true);
                    runScript(build);
                } catch (Throwable e) {
                    e.printStackTrace();
                    printError(e);
                }
            }
        });
        return true;
    }

    public boolean isRunning(String pkg) {
        synchronized (runningMap) {
            Boolean b = runningMap.get(pkg);
            return b != null && b;
        }
    }

    private void setRunning(String pkg, boolean running) {
        synchronized (runningMap) {
            runningMap.put(pkg, running);
        }
    }

    private boolean runScript(final JsDroidScript script) {

        if (isRunning(script.getAppPkg())) {
            return false;
        }
        setRunning(script.getAppPkg(), true);
        Thread thread = Thread.currentThread();
        Thread.UncaughtExceptionHandler systemUncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        String result = null;
        try {
            if (jsDroidIde != null) {
                try {
                    jsDroidIde.onStart();
                } catch (Exception e) {
                }
            }

            Object run = script.run();
            if (run != null) {
                result = run.toString();
            } else {
                result = null;
            }
        } catch (Throwable throwable) {

            result = throwable.getMessage();
            printError(throwable);
            //发送异常给脚本处理
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null &&
                    (!uncaughtExceptionHandler.equals(systemUncaughtExceptionHandler))) {
                uncaughtExceptionHandler.uncaughtException(thread, throwable);
            }
        } finally {
//            ClassLoader classLoader = script.getClass().getClassLoader();
//            if (classLoader instanceof ScriptClassLoader) {
//                try {
//                    ((ScriptClassLoader) classLoader).finalize();
//                } catch (Throwable e) {
//                    e.printStackTrace();
//                }
//            }

            //等待日志输出完毕
            try {
                script.getPrintQueue().waitPrintStop(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setRunning(script.getAppPkg(), false);
            IJsDroidApp app = appMap.get(script.getAppPkg());
            if (app != null) {
                try {
                    app.onScriptStop(result);
                } catch (Exception e) {
                }
            }
            if (jsDroidIde != null) {
                try {
                    jsDroidIde.onStop(result);
                } catch (Exception e) {
                }
            }
            Object existOnEnd = script.getProperty("exitOnEnd");
            if (existOnEnd instanceof Boolean) {
                if (existOnEnd.equals(false)) {
                    script.setExitOnEnd(false);
                }
            }
            if (script.isExitOnEnd()) {
                if (jsDroidIde != null) {
                    try {
                        jsDroidIde.onError("【系统提示】运行结束,服务将重启，取消重启请在脚本第一行输入exitOnEnd=false",
                                "MainScript.groovy", 0);
                    } catch (Exception e) {
                    }
                }
                System.exit(0);
            }

        }


        return true;
    }

    /**
     * 发送错误到app
     *
     * @param throwable
     */
    public void printError(Throwable throwable) {
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

        try {
            IJsDroidApp app = getDefaultApp();
            if (app != null) {
                app.saveScriptError(log, fileName, lineNumber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (jsDroidIde != null) {
                jsDroidIde.onError(log, fileName, lineNumber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printLog(Object log) {
        if (log instanceof Throwable) {
            printError((Throwable) log);
        } else {
            try {
                IJsDroidApp app = getDefaultApp();
                if (app != null) {
                    app.saveScriptLog("" + log, "系统", 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean runGroovy(final String appPkg, final String code) {
        scriptThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    JsdScriptBuilder.GroovyCodeBuilder scriptBuilder = new JsdScriptBuilder.GroovyCodeBuilder();
//                    scriptBuilder.setAppPkg("com.jsdroid.app");
                    scriptBuilder.setCode(code);
                    scriptBuilder.setAppPkg(appPkg);
                    runScript(scriptBuilder.build());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return true;
    }

    @Override
    public boolean runJs(final String appPkg, final String js) {
        try {
            Runnable runnable = new Runnable() {
                public void run() {
                    JsdScriptBuilder.JsCodeBuilder scriptBuilder = new JsdScriptBuilder.JsCodeBuilder();
                    scriptBuilder.setAppPkg(appPkg);
                    scriptBuilder.setCode(js);
                    try {
                        runScript(scriptBuilder.build());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            scriptThreadPool.execute(runnable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void exit() {
        System.exit(0);
    }


    @Override
    public void ideConnect(IJsDroidIde ide) {
        this.jsDroidIde = ide;
    }

    @Override
    public void appConnect(String pkg, final IJsDroidApp app) {
        appMap.put(pkg, app);
    }

    @Override
    public void onEvent(int[] event) {
        //1,114,1
        if (event[0] == 1 && event[1] == 114 && event[2] == 1) {
            scriptThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (String pkg : appMap.keySet()) {
                        //音量键按下
                        try {
                            IJsDroidApp app = appMap.get(pkg);
                            app.onVolumeDown(isRunning(pkg));
                        } catch (Exception e) {
                        }
                    }
                }
            });

        }
    }


    public Bitmap capture(float scale) {
        return ScreenUtil.screenshot(scale);
    }

    @Override
    public byte[] capturePng(float scale, int quality) {
        Bitmap image = capture(scale);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG, quality, outputStream);
        return outputStream.toByteArray();
    }


    @Override
    public byte[] captureJpg(float scale, int quality) {
        Bitmap image = capture(scale);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
        return outputStream.toByteArray();
    }

    @Override
    public byte[] cap(int left, int top, int right, int bottom) {
        Bitmap bitmap = ScreenUtil.screenshot(1.0f);
        if (right > bitmap.getWidth() - 1) {
            right = bitmap.getWidth() - 1;
        }
        if (bottom > bitmap.getHeight() - 1) {
            bottom = bitmap.getHeight() - 1;
        }
        if (left < 0) {
            left = 0;
        }
        if (top < 0) {
            top = 0;
        }
        bitmap = Bitmap.createBitmap(bitmap,
                left,
                top,
                right - left + 1,
                bottom - top + 1);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        return outputStream.toByteArray();
    }

    @Override
    public String getNodes() {
        return JSON.toJSONString(UiDevice.getInstance().getNodes());
    }

    @Override
    public void touchDown(int x, int y) {
        UiDevice.getInstance().getInteractionController().touchDown(x, y);
    }

    @Override
    public void touchMove(int x, int y) {
        UiDevice.getInstance().getInteractionController().touchMove(x, y);
    }

    @Override
    public void touchUp(int x, int y) {
        UiDevice.getInstance().getInteractionController().touchUp(x, y);
    }

    @Override
    public DeviceInfo getDeviceInfo() {
        return DeviceInfoManager.getDeviceInfo();
    }


    /**
     * 中转消息
     */
    @Override
    public void showXml(String xml) {
        IJsDroidApp app = getDefaultApp();
        if (app != null) {
            app.showXml(xml);
        }

    }

    public IJsDroidApp getDefaultApp() {
        if (appMap.isEmpty()) {
            return null;
        }

        String defaultAppPkg = JsdPath2_5.getDefaultAppPkg();
        if (appMap.containsKey(defaultAppPkg)) {
            return appMap.get(defaultAppPkg);
        }

        String launchAppPkg = JsdPath2_5.getLaunchAppPkg();
        if (launchAppPkg != null) {
            if (appMap.containsKey(launchAppPkg)) {
                return appMap.get(launchAppPkg);
            }
        }

        Iterator<IJsDroidApp> iterator = appMap.values().iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    public IJsDroidApp getLaunchApp() {
        return appMap.get(JsdPath2_5.getLaunchAppPkg());
    }

    @Override
    public void preView(String apk) {
        IJsDroidApp app = getDefaultApp();
        if (app != null) {
            app.preView(apk);
        }
    }

    /**
     * 中转消息
     */
    @Override
    public void input(String text) {
        IJsDroidApp launchApp = getLaunchApp();
        if (launchApp != null) {
            launchApp.inputText(text);
        }
    }

    /**
     * 中转消息
     */
    @Override
    public void clear(int before, int after) {
        IJsDroidApp launchApp = getLaunchApp();
        if (launchApp != null) {
            launchApp.clearText(before, after);
        }
    }

    @Override
    public void pressKeyCode(int keyCode) {
        UiDevice.getInstance().pressKeyCode(keyCode);
    }

    @Override
    public void pressBack() {
        UiDevice.getInstance().pressBack();
    }

    @Override
    public void pressHome() {
        UiDevice.getInstance().pressHome();
    }

    @Override
    public void pressRecent() {
        try {
            UiDevice.getInstance().pressRecentApps();
        } catch (RemoteException e) {
        }
    }

    @Override
    public void receiveJpg(final IJpgReceiver jpgReceiver, final float scale, final int quality) {
        EncodeThread.receiveJpg(jpgReceiver, scale, quality);
    }

    @Override
    public void wakeUp() throws InterruptedException {
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    UiDevice.getInstance().unlock();
                } catch (RemoteException e) {
                }
            }
        };
        new Thread(runnable).start();
    }

    @Override
    public File[] getFiles(String path) throws InterruptedException {
        java.io.File file = new java.io.File(path);
        java.io.File[] files = file.listFiles();
        if (files != null) {
            File[] result = new File[files.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = new File();
                result[i].path = files[i].getPath();
                result[i].file = files[i].isFile();
                String[] list = files[i].list();
                if (list == null || list.length == 0) {
                    result[i].hasChild = false;
                } else {
                    result[i].hasChild = true;
                }
            }
            return result;
        }
        return new File[0];
    }

    @Override
    public void pushFile(String name, byte[] data) throws InterruptedException {
        FileUtil.writeBytes(name, data);
    }

    @Override
    public byte[] pullFile(String name) throws InterruptedException {

        return FileUtil.readBytes(name);
    }

    @Override
    public String exec(String shell) throws InterruptedException {
        List<String> run = Shell.SH.run(shell.split("\n"));
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : run) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @MethodDoc("打开jsd输入法")
    @Override
    public void openInputMethod() throws InterruptedException {
        IJsDroidApp launchApp = getLaunchApp();
        if (launchApp != null) {
            String pkg = launchApp.getPkg();
            String id = pkg + "/" + new ComponentName(pkg,
                    "com.jsdroid.input.Input").getShortClassName();
            InputUtil.setIME(id);
        }
    }

    @Deprecated
    @MethodDoc("已经停止维护这个方法了")
    @Override
    public void closeInputMethod() {
    }

    @Override
    public void unzipFile(String file, String dir) throws InterruptedException {

    }

    @Override
    public void zipDir(String dir) throws InterruptedException {

    }

    @Override
    public void deleteFile(String file) throws InterruptedException {
        java.io.File file1 = new java.io.File(file);
        if (file1.isFile()) {
            file1.delete();
        } else {
            try {
                FileUtils.deleteDirectory(file1);
            } catch (IOException e) {
            }
        }
    }

    @Override
    public void copyFile(String file, String toFile) throws InterruptedException {
        try {
            FileUtils.copyFile(new java.io.File(file), new java.io.File(toFile));
        } catch (IOException e) {
        }
    }

    @Override
    public boolean ping() throws InterruptedException {
        return true;
    }

    @Override
    public boolean testMinicap() throws InterruptedException {
        return false;
    }


    @Override
    public void setMinicapEnable(boolean enable) {
    }


}
