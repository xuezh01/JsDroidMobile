package com.jsdroid.groovy.info;

public class ImportInfo {
    //是否带*
    public boolean MUL;
    //别名
    public String alias;
    //加载的名字
    public String qualifiedName;
    //是否静态
    public boolean STATIC;

    @Override
    public String toString() {
        return "ImportInfo{" +
                "MUL=" + MUL +
                ", alias='" + alias + '\'' +
                ", qualifiedName='" + qualifiedName + '\'' +
                ", STATIC=" + STATIC +
                '}';
    }
}
