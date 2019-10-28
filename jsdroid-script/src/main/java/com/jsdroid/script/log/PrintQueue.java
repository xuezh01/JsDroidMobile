package com.jsdroid.script.log;

import android.util.Log;

import java.util.LinkedList;

public class PrintQueue extends Thread {
    LinkedList<LogPrint> logQueue;
    boolean stopFlag;
    Object lock;

    public PrintQueue() {
        logQueue = new LinkedList<>();
        lock = new Object();
        start();
    }

    @Override
    public void run() {
        try {
            while (!stopFlag) {
                synchronized (lock) {
                    try {
                        lock.wait(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                printQueue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printQueue() {
        try {
            while (true) {
                LogPrint logPrint = dequeue();
                if (logPrint == null) {
                    break;
                }
                logPrint.run();
            }
        } catch (Exception e) {
        }
    }

    public void enqueue(LogPrint logPrint) {
        synchronized (lock) {
            logQueue.add(logPrint);
            lock.notifyAll();
        }
    }

    private LogPrint dequeue() {
        synchronized (lock) {
            return logQueue.poll();
        }
    }

    public void stopPrint() {
        synchronized (lock) {
            stopFlag = true;
            lock.notifyAll();
        }
    }

    public void waitPrintStop(int timeout) throws InterruptedException {

        long et = System.currentTimeMillis() + timeout;

        while (System.currentTimeMillis() < et) {
            if (logQueue.isEmpty()) {
                break;
            }
            Thread.sleep(100);
        }
    }


}
