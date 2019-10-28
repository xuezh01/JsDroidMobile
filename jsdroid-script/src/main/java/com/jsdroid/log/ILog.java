package com.jsdroid.log;

import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.call.IpcCall;

public interface ILog extends IpcCall {
    @Timeout(1000)
    void log(String log);

    @Timeout(1000)
    void connect();

    @Timeout(1000)
    void disconnect();
}
