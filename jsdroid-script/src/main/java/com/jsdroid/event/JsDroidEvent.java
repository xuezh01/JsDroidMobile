package com.jsdroid.event;

import android.app.UiAutomation;
import android.graphics.Point;

import com.jsdroid.uiautomator2.UiDevice;

import java.util.ArrayList;
import java.util.List;


public class JsDroidEvent extends Thread {
    public interface EventListener {
        void onEvent(int[] event);
    }

    private static JsDroidEvent instance = new JsDroidEvent();

    public static JsDroidEvent getInstance() {
        return instance;
    }

    private static boolean init;

    static {
        try {
            System.loadLibrary("jsd-event");
            init = true;
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public List<EventListener> listeners;

    private JsDroidEvent() {
        listeners = new ArrayList<>();
        start();
    }

    @Override
    public void run() {
        if (!init) {
            return;
        }
        try {
            init();
        } catch (Throwable e) {
            e.printStackTrace();
            return;
        }
        int event[] = new int[10];
        while (true) {
            try {
                readEvent(event);
                synchronized (listeners) {
                    if (listeners.size() == 0 && singleListener == null) {
                        try {
                            listeners.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    try {
                        for (EventListener listener : listeners) {
                            listener.onEvent(event);
                        }
                    } catch (Exception e) {
                    }
                    try {
                        if (singleListener != null) {
                            singleListener.onEvent(event);
                        }
                    } catch (Exception e) {
                    }
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    public void addListener(EventListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
            listeners.notifyAll();
        }
    }

    private EventListener singleListener;

    public void setListener(EventListener listener) {
        synchronized (listeners) {
            singleListener = listener;
            listeners.notifyAll();
        }
    }

    public void clearListener() {
        synchronized (listeners) {
            listeners.clear();
        }
    }

    private static native int init();

    private static native int readEvent(int[] ret);

    private static native int sendEvent(int type, int code, int value);

    private static native int sendEvent2(int type, int code, int value);

    private static native int xmin();

    private static native int xmax();

    private static native int ymin();

    private static native int ymax();


    public static Point toOriginPoint(int x, int y) {
        int rotation = UiDevice.getInstance().getRotation();
        int width = UiDevice.getInstance().getDisplayWidth();
        int height = UiDevice.getInstance().getDisplayHeight();
        int rWidth = xmax() - xmin();
        int rHeight = ymax() - ymin();
        int tempx = 0;
        int tempy = 0;
        int tempWidth = 0;
        int tempHeight = 0;
        // 将xy旋转回来
        switch (rotation) {
            case UiAutomation.ROTATION_FREEZE_0:
                break;
            case UiAutomation.ROTATION_FREEZE_90:
                // 原来的x = 现在的y，原来的y = 现在的宽度-现在的x
                tempx = y;
                tempy = width - x;
                x = tempx;
                y = tempy;
                tempWidth = height;
                tempHeight = width;
                break;
            case UiAutomation.ROTATION_FREEZE_180:
                // 原来的x = 现在的宽度-现在的x，原来的y=现在的高度-现在的y
                tempx = width - x;
                tempy = height - y;
                x = tempx;
                y = tempy;
                break;
            case UiAutomation.ROTATION_FREEZE_270:
                // 原来的x = 现在的高度-现在的y，原来的y=现在的x
                tempx = height - y;
                tempy = x;
                x = tempx;
                y = tempy;
                tempWidth = height;
                tempHeight = width;
                width = tempWidth;
                height = tempHeight;
                break;
        }
        // 缩放到驱动坐标
        x = (x * rWidth / width);
        y = (y * rHeight / height);
        return new Point(x, y);
    }

    public synchronized static void touchDown(int x, int y) {
        Point origin = toOriginPoint(x, y);
        // set x
        sendEvent(3, 53, origin.x);
        // set y
        sendEvent(3, 54, origin.y);
        // touchDown
        sendEvent(1, 330, 1);
        // sync
        sendEvent(0, 0, 0);
    }

    public synchronized static void touchMove(int x, int y)
            throws InterruptedException {
        Point origin = toOriginPoint(x, y);
        // set x
        sendEvent(3, 53, origin.x);
        // set y
        sendEvent(3, 54, origin.y);
        // sync
        sendEvent(0, 0, 0);
    }

    public synchronized static void touchUp() {
        // touchUp
        sendEvent(1, 330, 0);
        // sync
        sendEvent(0, 0, 0);
    }
}
