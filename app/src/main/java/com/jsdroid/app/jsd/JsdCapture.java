package com.jsdroid.app.jsd;

import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Capture;

import java.util.List;

public class JsdCapture extends BaseManager {

    private static JsdCapture instance = new JsdCapture();

    public static JsdCapture getInstance() {
        return instance;
    }

    public Long insert(Capture capture) {
        try {
            return Db.getInstance().getDaoSession().getCaptureDao().insert(capture);
        } finally {
            fireChanged();
        }
    }

    public void delete(Long... ids) {
        try {
            Db.getInstance().getDaoSession().getCaptureDao().deleteByKeyInTx(ids);
        } finally {
            fireChanged();
        }
    }

    public void delete(Capture... captures) {
        try {
            Db.getInstance().getDaoSession().getCaptureDao().deleteInTx(captures);
        } finally {
            fireChanged();
        }
    }

    public void update(Capture capture, boolean notifyChanged) {
        try {
            Db.getInstance().getDaoSession().getCaptureDao().update(capture);
        } finally {
            if (notifyChanged) {
                fireChanged();
            }
        }
    }

    public void update(Capture capture) {
        update(capture, true);
    }

    public List<Capture> list() {
        return Db.getInstance().getDaoSession().getCaptureDao().loadAll();
    }

    public Capture get(long captureId) {
        return Db.getInstance().getDaoSession().getCaptureDao().load(captureId);
    }
}
