package com.jsdroid.app.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.Comparator;

@Entity
public class Log implements Comparator<Log> {
    public static int TYPE_BUG = 1;
    public static int TYPE_LOG = 2;
    @Id(autoincrement = true)
    public Long id;
    public int type;//bug/print
    public String content;
    public String filename;
    public String className;
    public String methodName;
    public int lineNumber;
    public long image;
    public long time;

    @Generated(hash = 2088319760)
    public Log(Long id, int type, String content, String filename, String className,
            String methodName, int lineNumber, long image, long time) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.filename = filename;
        this.className = className;
        this.methodName = methodName;
        this.lineNumber = lineNumber;
        this.image = image;
        this.time = time;
    }

    @Generated(hash = 1364647056)
    public Log() {
    }

    @Override
    public int compare(Log o1, Log o2) {
        return (int) (o1.time - o2.time);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public long getImage() {
        return this.image;
    }

    public void setImage(long image) {
        this.image = image;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
