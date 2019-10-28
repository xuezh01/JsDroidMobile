package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Image {
    @Id(autoincrement = true)
    public Long id;
    public byte[] image;

    @Generated(hash = 49319710)
    public Image(Long id, byte[] image) {
        this.id = id;
        this.image = image;
    }

    @Generated(hash = 1590301345)
    public Image() {
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
