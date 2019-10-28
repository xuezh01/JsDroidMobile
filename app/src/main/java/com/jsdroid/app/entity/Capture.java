package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Capture {
    @Id(autoincrement = true)
    public Long id;
    public String image;//截图
    public String nodes;//节点
    public String selectIndex;
    public String name;//名字
    @Generated(hash = 1139118846)
    public Capture(Long id, String image, String nodes, String selectIndex,
            String name) {
        this.id = id;
        this.image = image;
        this.nodes = nodes;
        this.selectIndex = selectIndex;
        this.name = name;
    }
    @Generated(hash = 1608568235)
    public Capture() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImage() {
        return this.image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getNodes() {
        return this.nodes;
    }
    public void setNodes(String nodes) {
        this.nodes = nodes;
    }
    public String getSelectIndex() {
        return this.selectIndex;
    }
    public void setSelectIndex(String selectIndex) {
        this.selectIndex = selectIndex;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
