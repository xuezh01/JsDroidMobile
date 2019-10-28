package com.jsdroid.api;

import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.call.IpcCall;

/**
 * 需要ide显示日志
 */
public interface IJsDroidIde extends IpcCall {

    @Timeout(1000)
    void log(String text, String filename, int line);

    @Timeout(1000)
    void onStart();

    @Timeout(1000)
    void onStop(String result);

    @Timeout(1000)
    void onError(String error, String filename, int line);

}
