package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

import org.greenrobot.greendao.annotation.Generated;

/**
 * 工程
 */
@Entity
public class Project {
    @Id(autoincrement = true)
    public Long id;
    public String name;
    //文件夹(列表显示)
    public String fold;
    //文件位置
    public String file;
    //图标
    public String icon;
    //介绍文字
    public String note;
    //包名
    public String pkg;
    public String version;
    //创建日期
    public Date createTime;
    //上次更新日期
    public Date updateTime;

    @Generated(hash = 742851029)
    public Project(Long id, String name, String fold, String file, String icon,
            String note, String pkg, String version, Date createTime,
            Date updateTime) {
        this.id = id;
        this.name = name;
        this.fold = fold;
        this.file = file;
        this.icon = icon;
        this.note = note;
        this.pkg = pkg;
        this.version = version;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Generated(hash = 1767516619)
    public Project() {
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

    public String getFold() {
        return this.fold;
    }

    public void setFold(String fold) {
        this.fold = fold;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public String getPkg() {
        return this.pkg;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
