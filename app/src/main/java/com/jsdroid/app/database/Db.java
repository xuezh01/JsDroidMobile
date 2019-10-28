package com.jsdroid.app.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jsdroid.app.dao.DaoMaster;
import com.jsdroid.app.dao.DaoSession;

public class Db {
    private static Db instance = new Db();
    private static String DB_NAME = "db_jsd11";

    public static Db getInstance() {
        return instance;
    }

    private DaoSession daoSession;

    private Db() {

    }

    private Context context;

    public void init(Context context) {
        if (this.context != null) {
            return;
        }
        this.context = context;
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(context, DB_NAME);
        SQLiteDatabase db = openHelper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);

        daoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
