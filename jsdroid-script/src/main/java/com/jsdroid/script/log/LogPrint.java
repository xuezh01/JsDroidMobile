package com.jsdroid.script.log;

import com.jsdroid.api.IJsDroidApp;
import com.jsdroid.api.IJsDroidIde;
import com.jsdroid.script.JsDroidShellImpl;

public class LogPrint implements Runnable {
    String log;
    String fileName;
    int lineNumber;
    IJsDroidApp jsDroidApp;


    public LogPrint(String log, String fileName, int lineNumber, IJsDroidApp jsDroidApp) {
        this.log = log;
        this.fileName = fileName;
        this.lineNumber = lineNumber;
        this.jsDroidApp = jsDroidApp;
    }

    @Override
    public void run() {
        try {
            if (jsDroidApp != null) {
                jsDroidApp.saveScriptLog(log,
                        fileName,
                        lineNumber);
            }
            IJsDroidIde jsDroidIde = JsDroidShellImpl.getInstance().getJsDroidIde();
            if (jsDroidIde != null) {
                jsDroidIde.log(log,
                        fileName,
                        lineNumber);
            }
        } catch (Throwable e) {
        }
    }
}
