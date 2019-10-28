package com.jsdroid.script;

import java.util.ArrayList;
import java.util.List;

public class JsDroidScriptTaskHandler implements Runnable {

    public interface ScriptTaskCallback {
        boolean runScript(ScriptTask script);
    }

    private List<ScriptTask> scripts;
    private Object lock;
    private ScriptTaskCallback scriptTaskCallback;
    private boolean exit;
    private Thread runningThread;
    private ScriptTask currentScript;

    public void setCurrentScript(ScriptTask currentScript) {
        this.currentScript = currentScript;
    }

    public JsDroidScriptTaskHandler(ScriptTaskCallback scriptTaskCallback) {
        lock = new Object();
        scripts = new ArrayList<>();
        this.scriptTaskCallback = scriptTaskCallback;
    }

    public void add(ScriptTask script) {
        scripts.clear();
        scripts.add(script);
        notifyStart();
    }

    public boolean runCurrentScript() {
        if (currentScript != null) {
            add(currentScript);
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        synchronized (lock) {
            if (exit) {
                return;
            }
            runningThread = Thread.currentThread();
        }
        while (exit == false) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            if (scripts.size() == 0) {
                continue;
            }
            try {
                ScriptTask scriptTask = scripts.get(0);
                currentScript = scriptTask;
                boolean start = scriptTaskCallback.runScript(scriptTask);
                if (start) {
                    scripts.remove(0);
                }
            } catch (Exception e) {

            }
        }
    }

    public void notifyStart() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public void exit() {
        synchronized (lock) {
            exit = true;
            if (runningThread != null) {
                runningThread.interrupt();
            }
        }
    }

}
