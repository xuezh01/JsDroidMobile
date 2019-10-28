package com.jsdroid.script;

public class ScriptTask {
    public enum ScriptType {
        PKG, CODE
    }

    private ScriptType type;
    private String pkg;
    private String code;

    public ScriptTask() {
    }

    public ScriptType getType() {
        return type;
    }

    public void setType(ScriptType type) {
        this.type = type;
    }

    public String getPkg() {
        return pkg;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ScriptTask(ScriptType type, String pkg, String code) {
        this.type = type;
        this.pkg = pkg;
        this.code = code;
    }

    @Override
    public String toString() {
        return "ScriptTask{" +
                "type=" + type +
                ", apk='" + pkg + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

