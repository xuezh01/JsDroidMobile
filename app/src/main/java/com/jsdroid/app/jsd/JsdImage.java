package com.jsdroid.app.jsd;

import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Capture;
import com.jsdroid.app.entity.Image;

public class JsdImage extends BaseManager {

    private static JsdImage instance = new JsdImage();

    public static JsdImage getInstance() {
        return instance;
    }

    public Long insert(Image image) {
        try {
            return Db.getInstance().getDaoSession().getImageDao().insert(image);
        } finally {
            fireChanged();
        }
    }

    public void delete(Long... ids) {
        try {
            Db.getInstance().getDaoSession().getImageDao().deleteByKeyInTx(ids);
        } finally {
            fireChanged();
        }
    }

    public void update(Image image) {
        try {
            Db.getInstance().getDaoSession().getImageDao().update(image);
        } finally {
            fireChanged();
        }
    }

    public void deleteAll() {
        try {
            Db.getInstance().getDaoSession().getImageDao().deleteAll();
        } finally {
            fireChanged();
        }
    }

    public Image get(Long image) {
        return Db.getInstance().getDaoSession().getImageDao().load(image);
    }
}
