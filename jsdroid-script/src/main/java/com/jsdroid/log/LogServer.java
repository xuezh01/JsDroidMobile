package com.jsdroid.log;

import android.util.Log;

import com.jsdroid.ipc.Ipc;

public class LogServer implements ILog {

    Ipc.Server server;
    boolean clientConnected;
    StringBuilder logStr;

    public LogServer() {
        logStr = new StringBuilder();
        server = Ipc.startServer(9777, null);
        server.addService("logStr", LogServer.this);
    }

    public void close() {
        server.shutdown();
    }

    @Override
    public void log(String log) {
        Log.e("SHELL_LOG", log);
        logStr.append(log + "\n");
    }

    public String getLog() {
        return logStr.toString();
    }

    @Override
    public void connect() {
        synchronized (this) {
            clientConnected = true;
            this.notifyAll();
        }
    }

    @Override
    public void disconnect() {
        synchronized (this) {
            logEnd = true;
            this.notifyAll();
        }
    }

    public boolean isClientConnected() {
        return clientConnected;
    }

    private boolean logEnd;

    public void waitLog(long timeout, String log) {
        long end = System.currentTimeMillis() + timeout;
        synchronized (this) {
            while (!logStr.toString().contains(log)) {
                try {
                    this.wait(1000);
                } catch (InterruptedException e) {
                }
                if (System.currentTimeMillis() > end) {
                    break;
                }
            }
        }
    }

    public void waitClientConnect(long timeout) {
        synchronized (this) {
            while (!clientConnected) {
                try {
                    this.wait(timeout);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
