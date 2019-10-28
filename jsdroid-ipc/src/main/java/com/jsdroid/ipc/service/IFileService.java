package com.jsdroid.ipc.service;


import com.jsdroid.ipc.call.IpcCall;

public interface IFileService extends IpcCall {
    byte[] readFile(String filePath);

    void saveFile(String filePath, byte[] fileData);
}
