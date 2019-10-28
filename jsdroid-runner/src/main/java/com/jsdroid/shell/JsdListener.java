package com.jsdroid.shell;

import com.jsdroid.api.entity.Log;

import java.util.List;

public interface JsdListener {
    void onScriptError(String error, String filename, int line, int column);

    void onScriptLog(String log, String filename, int line, int column);

    void onSystemLog(Object log);

    void onScriptStop(String result);

    void onConnected(JsDroidApp app);

    void onDisconnected();

    void onConnectError(Throwable err);

    void onScriptStart();

    void onVolumeDown(boolean running);

    void onPreView(String jsdFile);
    List<Log> getLogs();
}
