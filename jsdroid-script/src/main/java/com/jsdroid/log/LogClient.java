package com.jsdroid.log;

import com.jsdroid.ipc.Ipc;

public class LogClient {
    Ipc.Client client;
    ILog log;
    boolean connect;

    public LogClient() throws InterruptedException {
        client = Ipc.connectServer("127.0.0.1", 9777, new Ipc.ClientListener() {
            @Override
            public void onConnected(Ipc.Client client) {
                synchronized (LogClient.this) {
                    connect = true;
                    LogClient.this.notifyAll();
                }
            }

            @Override
            public void onConnectErr(Ipc.Client client, Throwable err) {

            }

            @Override
            public void onDisconnected(Ipc.Client client) {

            }
        });
        waitConnect();
        log = client.getService("logStr", ILog.class);
        log.connect();
    }

    public void log(String text) {
        log.log(text);
    }

    public void close() {
        client.shutdown();
    }

    public void waitConnect() throws InterruptedException {
        synchronized (this) {
            if (!connect) {
                this.wait(1000);
            }
        }
    }

    public boolean isConnect() {
        return connect;
    }
}
