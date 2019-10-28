package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Script {
    @Id(autoincrement = true)
    public Long id;
    public String name;
    public String code;
    public Date lastRunTime;
    public boolean favorite;
    @Generated(hash = 555954315)
    public Script(Long id, String name, String code, Date lastRunTime,
            boolean favorite) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.lastRunTime = lastRunTime;
        this.favorite = favorite;
    }
    @Generated(hash = 231174866)
    public Script() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
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
