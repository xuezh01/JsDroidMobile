package com.jsdroid.loader;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import dalvik.system.PathClassLoader;

public class LibClassLoader extends ClassLoader {
    private ClassLoader originClassLoader;
    private List<ClassLoader> classLoaders;
    private Method findClassMethod;

    public LibClassLoader(ClassLoader originClassLoader) {
        super(originClassLoader.getParent());
        try {
            findClassMethod = ClassLoader.class.getMethod("findClass", String.class);
            findClassMethod.setAccessible(true);
            replaceParent(originClassLoader, this);
        } catch (Exception e) {
        }
        this.originClassLoader = originClassLoader;
        classLoaders = new ArrayList<>();
    }

    public ClassLoader getOriginClassLoader() {
        return originClassLoader;
    }

    public void addClassLoader(ClassLoader classLoader) {
        classLoaders.add(classLoader);
    }

    private void replaceParent(ClassLoader classLoader, ClassLoader parent) throws NoSuchFieldException, IllegalAccessException {
        Field parentField = ClassLoader.class.getDeclaredField("parent");
        parentField.setAccessible(true);
        parentField.set(classLoader, parent);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        try {
            Class<?> aClass = super.loadClass(name, resolve);
            if (aClass != null) {
                return aClass;
            }
        } catch (Exception e) {
        }
        for (ClassLoader classLoader : classLoaders) {
            try {
                Class<?> aClass = classLoader.loadClass(name);
                if (aClass != null) {
                    return aClass;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
}
