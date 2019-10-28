package com.jsdroid.api;

import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.call.IpcCall;

public interface IInstallCallback extends IpcCall {
    @Timeout(1000)
    void onStart();

    @Timeout(1000)
    void pushProcess(int allCount, int position, String message);

    @Timeout(1000)
    void onEnd();
}
