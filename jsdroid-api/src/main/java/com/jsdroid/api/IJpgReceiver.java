package com.jsdroid.api;

import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.call.IpcCall;

public interface IJpgReceiver extends IpcCall {
    @Timeout(1000)
    void onReceive(byte[] jpgBytes);
}
