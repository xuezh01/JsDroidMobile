package com.jsdroid.app.jsd;

import com.jsdroid.app.dao.LogDao;
import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Log;

import org.greenrobot.greendao.query.DeleteQuery;

import java.util.List;

public class JsdLog extends BaseManager {
    private static JsdLog instance = new JsdLog();

    public static JsdLog getInstance() {
        return instance;
    }

    private JsdLog() {

    }

    public Long insert(Log log) {
        try {
            long count = Db.getInstance().getDaoSession().getLogDao().count();
            if (count > 1000) {
                DeleteQuery<Log> logDeleteQuery = Db.getInstance().getDaoSession().getLogDao().queryBuilder().limit(500).buildDelete();
                logDeleteQuery.executeDeleteWithoutDetachingEntities();
            }
            return Db.getInstance().getDaoSession().getLogDao().insert(log);
        } catch (Exception err) {
            return 0l;
        } finally {
            fireChanged();
        }
    }

    public void delete(Long... ids) {
        try {
            Db.getInstance().getDaoSession().getLogDao().deleteByKeyInTx(ids);
        } finally {
            fireChanged();
        }
    }

    public void delete(Log... logs) {
        try {
            Db.getInstance().getDaoSession().getLogDao().deleteInTx(logs);
        } finally {
            fireChanged();
        }
    }

    public void update(Log log, boolean notifyChanged) {
        try {
            Db.getInstance().getDaoSession().getLogDao().update(log);
        } finally {
            if (notifyChanged) {
                fireChanged();
            }
        }
    }

    public void update(Log log) {
        update(log, true);
    }

    public List<Log> list() {
        return Db.getInstance().getDaoSession().getLogDao().loadAll();
    }

    public List<Log> listNews() {
        return Db.getInstance().getDaoSession().getLogDao().queryBuilder().orderDesc(LogDao.Properties.Time).limit(5).build().list();
    }

    public Log get(long captureId) {
        return Db.getInstance().getDaoSession().getLogDao().load(captureId);
    }

    public void clear() {
        try {
            Db.getInstance().getDaoSession().getLogDao().deleteAll();
        } finally {
            fireChanged();
        }
    }
}
