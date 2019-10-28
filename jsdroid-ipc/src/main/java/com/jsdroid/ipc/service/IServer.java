package com.jsdroid.ipc.service;

import com.jsdroid.ipc.service.ISocket;

import java.io.IOException;

public interface IServer {
    ISocket accept() throws IOException;

    void close() throws IOException;
}
