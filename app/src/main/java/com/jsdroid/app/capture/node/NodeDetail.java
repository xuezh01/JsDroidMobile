package com.jsdroid.app.capture.node;

public class NodeDetail {
    public String name;
    public String value;

    public NodeDetail(String name, Object value) {
        this.name = name;
        this.value = value + "";
    }
}
