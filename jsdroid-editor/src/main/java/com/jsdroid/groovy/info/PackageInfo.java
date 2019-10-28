package com.jsdroid.groovy.info;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PackageInfo implements Serializable{
    private static final long serialVersionUID = 1L;
    public String pkg;
    private Map<String, ClassInfo> classInfoMap = new HashMap<>();

    public void put(ClassInfo classInfo) {
        classInfoMap.put(classInfo.getName(), classInfo);
    }

    public Map<String, ClassInfo> getClassInfoMap() {
        return classInfoMap;
    }
}
