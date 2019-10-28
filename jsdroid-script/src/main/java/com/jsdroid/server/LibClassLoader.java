package com.jsdroid.server;

import java.io.File;
import java.lang.reflect.Field;

public class LibClassLoader extends ClassLoader {
    private File libDir;

    public LibClassLoader(File libDir) {
        this.libDir = libDir;
    }


    public LibClassLoader(ClassLoader parent, File libDir) {
        super(parent);
        System.out.println("ok");
        this.libDir = libDir;
    }

    @Override
    protected String findLibrary(String libname) {
        System.out.println(libDir);
        System.out.println(libname);
        File file = new File(libDir, "lib" + libname + ".so");
        if (file.exists()) {
            System.out.println(file.getPath());
            return file.getPath();
        }
        return super.findLibrary(libname);
    }

    public void replaceParent(ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException {
        Field parentField = ClassLoader.class.getDeclaredField("parent");
        parentField.setAccessible(true);
        parentField.set(classLoader, this);
    }
}
