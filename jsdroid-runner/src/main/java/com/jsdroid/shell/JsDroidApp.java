package com.jsdroid.shell;

import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Process;
import android.os.Vibrator;
import android.view.Gravity;
import android.widget.Toast;

import com.jsdroid.active.JsdShell;
import com.jsdroid.active.ShellInstaller;
import com.jsdroid.api.ApiUtil;
import com.jsdroid.api.IJsDroidApp;
import com.jsdroid.api.IJsDroidShell;
import com.jsdroid.api.context.JsdContext;
import com.jsdroid.api.entity.File;
import com.jsdroid.api.entity.GlobalField;
import com.jsdroid.api.entity.GlobalMethod;
import com.jsdroid.api.entity.Log;
import com.jsdroid.api.entity.Script;
import com.jsdroid.api.mannager.ConfigManager;
import com.jsdroid.commons.AppUtil;
import com.jsdroid.groovy.JsDroidShell;
import com.jsdroid.input.Input;
import com.jsdroid.ipc.Ipc;
import com.jsdroid.ipc.call.SyncRunnable;
import com.jsdroid.script.JsDroidScriptTaskHandler;
import com.jsdroid.script.ScriptInfo;
import com.jsdroid.script.ScriptInstaller;
import com.jsdroid.script.ScriptTask;
import com.jsdroid.ui.ViewScript;
import com.jsdroid.ui.parser.ViewParser;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 启动停止脚本
 * 添加删除监听器
 * 控制shell端
 * 启动shell端
 */
public class JsDroidApp implements IJsDroidApp,
        Ipc.ClientListener,
        JsDroidScriptTaskHandler.ScriptTaskCallback {

    public interface IXmlViewer {
        void showXml(String xml);

    }

    private static JsDroidApp instance = new JsDroidApp();

    public static JsDroidApp getInstance() {
        return instance;
    }

    //用于预览xml
    private IXmlViewer xmlViewer;
    private IJsDroidShell jsDroidShell;
    private ExecutorService threadPool;
    private Application application;
    private Handler handler;
    private JsdListener jsdListener;
    private JsDroidScriptTaskHandler scriptHandler;
    private Ipc.Client client;
    private boolean running;
    private boolean connected;

    private final Map<String, ViewScript> viewScriptMap;

    public IJsDroidShell getJsDroidShell() {
        return jsDroidShell;
    }

    private JsDroidApp() {
        viewScriptMap = new HashMap<>();
    }

    public void addViewScript(ViewScript viewScript) {
        final ViewScript history = viewScriptMap.get(viewScript.pkg);
        if (history != null) {
            post(new Runnable() {
                @Override
                public void run() {
                    try {
                        history.activity.finish();
                    } catch (Exception e) {
                    }
                }
            });
        }
        synchronized (viewScriptMap) {

            viewScriptMap.put(viewScript.pkg, viewScript);
        }
    }

    public void removeViewScript(ViewScript viewScript) {
        synchronized (viewScriptMap) {
            viewScriptMap.remove(viewScript.pkg);
        }
    }

    /**
     * 初始化，初始化配置
     *
     * @param application
     */
    public void init(Application application) {
        this.application = application;
        handler = new Handler();
        threadPool = Executors.newCachedThreadPool();
        scriptHandler = new JsDroidScriptTaskHandler(this);
        threadPool.execute(scriptHandler);
        JsdShell.getInstance().init(application);
        connectServer();
    }

    private void connectServer() {
        if (client == null) {
            //连接服务
            client = Ipc.connectServer("127.0.0.1", 9800, JsDroidApp.this);
        }
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                JsdShell.getInstance().shell();
            }
        });
    }

    public boolean isConnected() {
        return connected;
    }

    @Override
    public void onConnected(Ipc.Client client) {
        fireConnected(client);
    }

    @Override
    public void onConnectErr(Ipc.Client client, Throwable err) {
        fireConnectErr(err);
    }

    @Override
    public void onDisconnected(Ipc.Client client) {
        fireDisconnected();
        fireScriptStop();
        JsdShell.getInstance().shell();

    }


    public void log(Object log) {
        jsdListener.onSystemLog(log);
        fireLog(log + "");

    }

    private void fireLog(String log) {
        synchronized (viewScriptMap) {
            for (ViewScript viewScript : viewScriptMap.values()) {
                viewScript.fireLog(log);
            }
        }
    }

    public void setXmlViewer(IXmlViewer xmlViewer) {
        this.xmlViewer = xmlViewer;
    }


    public void setListener(JsdListener jsdListener) {
        this.jsdListener = jsdListener;
    }

    public Application getApplication() {
        return application;
    }


    public void execute(Runnable runnable) {
        threadPool.execute(runnable);
    }

    public void post(Runnable runnable) {
        handler.post(runnable);
    }

    public void executeSync(Runnable runnable) {
        SyncRunnable syncRunnable = new SyncRunnable(runnable);
        threadPool.execute(syncRunnable);
        syncRunnable.sync();
    }

    public void executeSync(Runnable runnable, int timeout) {
        SyncRunnable syncRunnable = new SyncRunnable(runnable);
        threadPool.execute(syncRunnable);
        syncRunnable.sync(timeout);
    }


    public void exit() {
        stopServer();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }


    public void stopServer() {
        executeSync(new Runnable() {
            @Override
            public void run() {
                try {
                    jsDroidShell.exit();
                } catch (Exception e) {
                }
            }
        }, 300);

    }


    public boolean isRunning() {
        return running;
    }

    private void fireConnectErr(Throwable err) {
        if (jsdListener != null) {
            jsdListener.onConnectError(err);
        }
    }

    private void fireConnected(final Ipc.Client client) {
        client.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    jsDroidShell = client.getService("jsdroid", IJsDroidShell.class);
                    jsDroidShell.appConnect(getPkg(), JsDroidApp.getInstance());
                    connected = true;
                    scriptHandler.notifyStart();
                    if (jsdListener != null) {
                        jsdListener.onConnected(JsDroidApp.getInstance());
                    }
                    synchronized (viewScriptMap) {
                        for (ViewScript viewScript : viewScriptMap.values()) {
                            viewScript.fireConnected();
                        }
                    }
                } catch (Throwable err) {
                }

            }
        });
    }

    private void fireDisconnected() {
        connected = false;
        if (jsdListener != null) {
            jsdListener.onDisconnected();
        }
        synchronized (viewScriptMap) {
            for (ViewScript viewScript : viewScriptMap.values()) {
                viewScript.fireDisconnected();
            }
        }
    }

    /**
     * 由服务端反馈，或者网络断开都会执行该方法
     */
    private void fireScriptStop() {
        if (running) {
            running = false;
            if (jsdListener != null) {
                jsdListener.onScriptStop(null);
            }
            scriptHandler.notifyStart();
            synchronized (viewScriptMap) {
                for (ViewScript viewScript : viewScriptMap.values()) {
                    viewScript.fireScriptStop();
                }
            }
        }
    }

    private void onScriptStart() {
        if (!running) {
            running = true;
        }

        if (jsdListener != null) {
            jsdListener.onScriptStart();
        }
        synchronized (viewScriptMap) {
            for (ViewScript viewScript : viewScriptMap.values()) {
                viewScript.fireScriptStart();
            }
        }
    }

    public void stopScript() {
        //停止服务即停止脚本= =
        stopServer();
    }

    @Override
    public List<Script> getScriptList() {
        List<Script> scripts = new ArrayList<>();
        List<ScriptInfo> installedScripts = getInstalledScripts();
        for (ScriptInfo installedScript : installedScripts) {
            Script script = new Script();
            script.setName(installedScript.getName());
            script.setNote(installedScript.getNote());
            script.setPkg(installedScript.getPkg());
            script.setVersion(installedScript.getVersion());
            scripts.add(script);
        }
        return scripts;
    }

    @Override
    public List<Log> getLog() {
        if (jsdListener != null) {
            return jsdListener.getLogs();
        }
        return null;
    }

    @Override
    public boolean runScript(ScriptTask script) {
        switch (script.getType()) {
            case PKG:
                return runScript(script.getPkg());
            case CODE:
                return runGroovy(script.getCode());
        }
        return false;
    }

    @Override
    public boolean runScript(String scriptPkg) {
        if (!connected) {
            return false;
        }
        if (running) {
            return false;
        }
        try {
            jsDroidShell.runFile(getPkg(), getScriptInstallDir(scriptPkg), getScriptFile(scriptPkg));
            onScriptStart();
        } catch (Exception e) {
            log(e);
        }
        return true;
    }

    public String getScriptInstallDir(String scriptPkg) {
        return JsdShell.getInstance().getScriptInstallDir(scriptPkg);
    }

    public String getScriptFile(String scriptPkg) {
        return JsdShell.getInstance().getScriptFile(scriptPkg);
    }

    public ScriptInfo installScript(String apkFile) throws JSONException, ScriptInstaller.InstallException, IOException {
        return JsdShell.getInstance().installScript(apkFile);
    }

    public ScriptInfo getScriptInfo(String scriptPkg) throws Exception {
        return JsdShell.getInstance().getScriptInfo(scriptPkg);
    }

    public List<ScriptInfo> getInstalledScripts() {
        return JsdShell.getInstance().getInstalledScripts();
    }

    private boolean runGroovy(String groovy) {
        if (!connected) {
            return false;
        }
        if (running) {
            return false;
        }
        try {
            jsDroidShell.runGroovy(getPkg(), groovy);
            onScriptStart();
        } catch (Exception e) {
        }
        return true;
    }

    /**
     * 添加apk脚本
     *
     * @param pkg
     */
    public void addApkScriptTask(String pkg) {
        scriptHandler.add(new ScriptTask(ScriptTask.ScriptType.PKG, pkg, null));
    }


    /**
     * 添加代码脚本
     *
     * @param code
     */
    public void addCodeScriptTask(String code) {
        scriptHandler.add(new ScriptTask(ScriptTask.ScriptType.CODE, null, code));
    }

    public void runGroovyCode(final String code) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    jsDroidShell.runGroovy(getPkg(), code);
                } catch (InterruptedException e) {
                }
            }
        }).start();

    }

    Toast toast;

    //region IJsDroidApp
    @Override
    public void toast(final String text) {
        handler.post(new Runnable() {
            public void run() {
                if (toast != null) {
                    toast.cancel();
                    toast = null;
                }
                toast = Toast.makeText(application.getApplicationContext(), text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    @Override
    public String getPkg() {
        return application.getPackageName();
    }

    @Override
    public String getVersion() {
        return AppUtil.getVersionName(application);
    }

    @Override
    public void tips(final String xml) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                try {
                    ViewParser.ViewContainer viewContainer = ViewParser.parseXml(JsdContext.DEFAULT, xml);
                    viewContainer.rootView.initView(application);
                    Toast toast = new Toast(application);
                    toast.setView(viewContainer.rootView.view);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } catch (Exception e) {
                }
            }
        });
    }

    public JsdContext getJsdContext() {
        return JsdContext.DEFAULT;
    }

    @Override
    public String readConfig(String name) {
        return ConfigManager.getInstance().readString(name);
    }

    @Override
    public void saveConfig(String name, String value) {
        ConfigManager.getInstance().saveString(name, value);
    }

    @Override
    public void inputText(String text) {
        Input input = Input.getInstance();
        if (input != null) {
            input.input(text);
        }
    }

    @Override
    public void clearText(int before, int after) {
        Input input = Input.getInstance();
        if (input != null) {
            input.clear(before, after);
        }
    }

    @Override
    public void showXml(String xml) {
        if (xmlViewer != null) {
            xmlViewer.showXml(xml);
        }
    }

    @Override
    public void preView(final String jsdFile) {
        jsdListener.onPreView(jsdFile);
    }

    @Override
    public void debug(String jsdFile) {
        try {
            ScriptInfo scriptInfo = installScript(jsdFile);
            addApkScriptTask(scriptInfo.getPkg());
            return;
        } catch (Exception e) {
            log(e);
        }
        try {
            if (!new java.io.File("/sdcard/").exists()) {
                log("请开启sdcard读取权限！");
                return;
            }
            ShellHelper.shell("cp " + jsdFile + " /sdcard/script.zip", 3000);
            ScriptInfo scriptInfo = installScript("/sdcard/script.zip");
            addApkScriptTask(scriptInfo.getPkg());
        } catch (Exception e) {
            log(e);

        }


    }

    @Override
    public String install(String jsdFile) {
        try {
            ScriptInfo scriptInfo = installScript(jsdFile);
            return scriptInfo.getPkg();
        } catch (Exception e) {
            log(e);
        }
        try {
            if (!new java.io.File("/sdcard/").exists()) {
                log("请开启sdcard读取权限！");
                return null;
            }
            ShellHelper.shell("cp " + jsdFile + " /sdcard/script.zip", 3000);
            ScriptInfo scriptInfo = installScript("/sdcard/script.zip");
            return scriptInfo.getPkg();
        } catch (Exception e) {
            log(e);

        }
        return null;
    }


    /**
     * 打印日志
     *
     * @param text
     * @param filename
     * @param line
     */
    @Override
    public void saveScriptLog(String text, String filename, int line) {
        if (jsdListener != null) {
            jsdListener.onScriptLog(text, filename, line, 0);
        }
        fireLog(text);
    }


    /**
     * 运行错误，不能用于断言是否停止
     *
     * @param error
     * @param filename
     * @param line
     */
    @Override
    public void saveScriptError(String error, String filename, int line) {
        if (jsdListener != null) {
            jsdListener.onScriptError(error, filename, line, 0);
        }
        fireLog(error);
    }

    @Override
    public GlobalField[] getGlobalViewFields() {
        return ApiUtil.getFields(ViewScript.class);
    }

    @Override
    public GlobalMethod[] getGlobalViewMethods() {
        return ApiUtil.getMethods(ViewScript.class);
    }

    MediaPlayer player;

    @Override
    public int playMusic(String musicFile) {
        stopMusic();
        try {
            player = new MediaPlayer();
            player.setDataSource(musicFile);
            player.prepare();
            player.start();
            return player.getDuration();
        } catch (IOException e) {
        }
        return 0;
    }

    @Override
    public void stopMusic() {
        if (player != null) {
            player.stop();
        }
        player = null;
    }

    @Override
    public String getInputId() {
        return null;
    }


    @Override
    public void onVolumeDown(final boolean scriptRunning) {
        if (jsdListener != null) {
            jsdListener.onVolumeDown(scriptRunning);
        }

    }

    @Override
    public void uninstall(String pkg) {

    }


    public boolean runCurrentScript() {
        return scriptHandler.runCurrentScript();
    }

    public void setCurrentScript(String pkg) {
        scriptHandler.setCurrentScript(new ScriptTask(ScriptTask.ScriptType.PKG, pkg, null));
    }

    public void vibrate(int ms) {
        try {
            Vibrator b = (Vibrator) application.getSystemService(Service.VIBRATOR_SERVICE);
            b.vibrate(ms);
        } catch (Throwable e) {
        }
    }

    /**
     * 脚本停止
     *
     * @param result
     */
    @Override
    public void onScriptStop(String result) {

        fireScriptStop();
    }


    public void startNotificationListener() {

        post(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent intent = new Intent(getApplication(), NotificationListener.class);
                    getApplication().startService(intent);
                } catch (Exception e) {
                }
            }
        });


    }

    public String getNotificationListenerId() {
        String pkg = getPkg();
        String name = NotificationListener.class.getName();
        String shortClassName = new ComponentName(pkg, name).getShortClassName();
        return pkg + "/" + shortClassName;
    }

}
