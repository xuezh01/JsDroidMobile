package com.jsdroid.commons;

public class SyncThread<T> extends Thread {
    private T result;
    private boolean end;
    private Sync<T> sync;

    public SyncThread(Sync<T> sync) {
        this.sync = sync;
        start();
    }

    public interface Sync<T> {
        T run();
    }

    public T waitResult(long timeout) {
        synchronized (SyncThread.this) {
            if (!end) {
                try {
                    SyncThread.this.wait(timeout);
                } catch (InterruptedException e) {
                }
            }
        }
        try {
            stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void run() {
        try {
            result = sync.run();
        } finally {
            synchronized (SyncThread.this) {
                end = true;
                SyncThread.this.notifyAll();
            }
        }
    }
}
