package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Tool implements Cloneable {
    @Id(autoincrement = true)
    public Long id;
    public String pkg;
    public String name;
    public String version;
    public String icon;
    public String note;
    public String downloadUrl;
    public Date lastRunTime;
    public boolean favorite;
    @Generated(hash = 825304606)
    public Tool(Long id, String pkg, String name, String version, String icon,
            String note, String downloadUrl, Date lastRunTime, boolean favorite) {
        this.id = id;
        this.pkg = pkg;
        this.name = name;
        this.version = version;
        this.icon = icon;
        this.note = note;
        this.downloadUrl = downloadUrl;
        this.lastRunTime = lastRunTime;
        this.favorite = favorite;
    }
    @Generated(hash = 1059748735)
    public Tool() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPkg() {
        return this.pkg;
    }
    public void setPkg(String pkg) {
        this.pkg = pkg;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVersion() {
        return this.version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getIcon() {
        return this.icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getNote() {
        return this.note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public Date getLastRunTime() {
        return this.lastRunTime;
    }
    public void setLastRunTime(Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }
    public boolean getFavorite() {
        return this.favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


}
