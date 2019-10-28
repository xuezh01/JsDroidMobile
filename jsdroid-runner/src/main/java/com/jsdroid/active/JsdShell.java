package com.jsdroid.active;

import android.content.Context;
import android.util.Log;

import com.jsdroid.active.step.InstallStep;
import com.jsdroid.active.step.ShellStep;
import com.jsdroid.active.step.ShellPortStep;
import com.jsdroid.active.step.Step;
import com.jsdroid.active.step.WifiPortStep;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.script.ScriptInfo;
import com.jsdroid.script.ScriptInstaller;
import com.jsdroid.shell.JsDroidApp;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsdShell {
    private static JsdShell instance = new JsdShell();

    public static JsdShell getInstance() {
        return instance;
    }

    private Context context;
    private ShellInstaller shellInstaller;
    private ScriptInstaller scriptInstaller;
    private List<Step> shellSteps;

    private JsdShell() {
        shellSteps = new ArrayList<>();
    }

    public void init(Context context) {
        this.context = context;
        shellInstaller = new ShellInstaller(context);
        scriptInstaller = new ScriptInstaller(context);
        shellSteps.add(new InstallStep());
        shellSteps.add(new WifiPortStep());
        shellSteps.add(new ShellPortStep());
        shellSteps.add(new ShellStep());
        for (Step shellStep : shellSteps) {
            shellStep.init(this);
        }
    }

    public Context getContext() {
        return context;
    }

    public synchronized void shell() {
        for (Step shellStep : shellSteps) {
            if (shellStep.skip()) {
                continue;
            }
            shellStep.run();
        }
    }

    public ShellInstaller getShellInstaller() {
        return shellInstaller;
    }

    public ScriptInstaller getScriptInstaller() {
        return scriptInstaller;
    }

    public String getScriptInstallDir(String pkg) {
        return scriptInstaller.getScriptInstallDir(pkg);
    }

    public String getScriptFile(String scriptPkg) {
        return scriptInstaller.getScriptFile(scriptPkg);
    }

    public ScriptInfo installScript(String apkFile) throws ScriptInstaller.InstallException, IOException, JSONException {
        return scriptInstaller.install(apkFile);
    }

    public ScriptInfo getScriptInfo(String pkg) throws Exception {
        String scriptInstallDir = getScriptInstallDir(pkg);
        File file = new File(scriptInstallDir, "config.json");
        String read = FileUtil.read(file);
        JSONObject jsonObject = new JSONObject(read);
        ScriptInfo scriptInfo = new ScriptInfo();
        scriptInfo.setPkg(pkg);
        if (jsonObject.has("name")) {
            scriptInfo.setName(jsonObject.getString("name"));
        }
        if (jsonObject.has("version")) {
            scriptInfo.setVersion(jsonObject.getString("version"));
        }
        if (jsonObject.has("node")) {

            scriptInfo.setNote(jsonObject.getString("note"));
        }
        if (jsonObject.has("type")) {
            scriptInfo.setType(jsonObject.getString("type"));
        }
        return scriptInfo;
    }

    public List<ScriptInfo> getInstalledScripts() {
        List<ScriptInfo> ret = new ArrayList<>();
        File scriptDir = scriptInstaller.getScriptDir();
        if (scriptDir.exists()) {
            File[] files = scriptDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        try {
                            ScriptInfo scriptInfo = getScriptInfo(file.getName());
                            ret.add(scriptInfo);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }
        return ret;
    }

    public void print(String log) {
        JsDroidApp.getInstance().log(log);
    }
}
