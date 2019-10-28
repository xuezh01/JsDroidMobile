package com.jsdroid.ipc.service;

import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.call.IpcCall;

public interface IHeart extends IpcCall {
    @Timeout(1000)
    boolean heart();

    @Timeout(3000)
    boolean heart3000();
}
