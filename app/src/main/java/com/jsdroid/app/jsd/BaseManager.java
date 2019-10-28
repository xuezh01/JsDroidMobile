package com.jsdroid.app.jsd;

import android.os.Handler;
import android.os.Looper;

import java.util.ArrayList;
import java.util.List;

public class BaseManager {
    public interface Listener {
        void onChanged();
    }

    private List<Listener> listeners;

    public BaseManager() {
        listeners = new ArrayList<>();
    }

    public void addListener(Listener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    protected void onChanged() {

    }

    protected void fireChanged() {
        onChanged();
        Looper mainLooper = Looper.getMainLooper();
        Handler handler = new Handler(mainLooper);
        synchronized (listeners) {
            for (Listener listener : listeners) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            listener.onChanged();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }
        }
    }

    public void removeListener(Listener listener) {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }
}
