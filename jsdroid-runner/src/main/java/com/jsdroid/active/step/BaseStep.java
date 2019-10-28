package com.jsdroid.active.step;

import android.content.Context;
import android.util.Log;

import com.jsdroid.active.JsdShell;
import com.jsdroid.active.ShellInstaller;
import com.jsdroid.commons.ExceptionUtil;
import com.jsdroid.script.ScriptInstaller;

public abstract class BaseStep implements Step {
    private JsdShell jsdShell;

    @Override
    public void init(JsdShell jsdShell) {
        this.jsdShell = jsdShell;
    }

    public JsdShell getJsdShell() {
        return jsdShell;
    }

    public Context getContext() {
        return jsdShell.getContext();
    }

    public ScriptInstaller getScriptInstaller() {
        return jsdShell.getScriptInstaller();
    }

    public ShellInstaller getShellInstaller() {
        return jsdShell.getShellInstaller();
    }


    public void print(String log) {
        Log.d("BaseStep", "print: "+log);
        jsdShell.print(log);
    }

    public void error(Throwable err) {
        print(ExceptionUtil.dumpException(err));
    }
}
