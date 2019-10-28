package com.jsdroid.groovy.node;

import com.jsdroid.groovy.info.ClassInfo;

import java.util.HashMap;
import java.util.Map;

public class ClassInfoMap {
    private Map<String, Map<String, ClassInfo>> classInfoMap;

    private ClassInfoMap() {
        classInfoMap = new HashMap<>();
    }

    private static ClassInfoMap instance = new ClassInfoMap();

    public static ClassInfoMap getInstance() {
        return instance;
    }

    public void putClassInfo(String filename, ClassInfo classInfo) {
        Map<String, ClassInfo> map = classInfoMap.get(filename);
        if (map == null) {
            map = new HashMap<>();
            classInfoMap.put(filename, map);
        }
        map.put(classInfo.getName(), classInfo);

    }

    public void putSystemClassInfo(ClassInfo classInfo) {
        putClassInfo("system", classInfo);
    }

    public ClassInfo searchClassInfo(String name) {
        for (Map<String, ClassInfo> map : classInfoMap.values()) {
            for (ClassInfo classInfo : map.values()) {
                if (classInfo.getName().equals(name)) {
                    return classInfo;
                }
            }
        }
        return null;
    }


}
