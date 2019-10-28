package com.jsdroid.app.log;

import com.jsdroid.app.entity.Log;
import com.jsdroid.app.jsd.BaseManager;
import com.jsdroid.app.jsd.JsdLog;
import com.jsdroid.mvp.presenter.BasePresenter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LogPresenter extends BasePresenter<LogActivity> implements BaseManager.Listener {
    @Override
    protected void onCreate() {
        super.onCreate();
        loadLog();
        JsdLog.getInstance().addListener(this);
    }

    private void loadLog() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<Log> list = JsdLog.getInstance().list();
                Collections.sort(list, new Comparator<Log>() {
                    @Override
                    public int compare(Log o1, Log o2) {
                        return (int) (o2.time - o1.time);
                    }
                });
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        getView().showLogs(list);
                    }
                });
            }
        }).start();
    }

    @Override
    public void onChanged() {
        loadLog();
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        JsdLog.getInstance().removeListener(this);
    }

    public void clearLog() {

        JsdLog.getInstance().clear();
    }
}
