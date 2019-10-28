package com.jsdroid.commons;

import android.os.Build;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class LibraryUtil {

    /**
     * 至少安卓版本号为14，即安卓4.0
     *
     * @param classLoader
     * @param libFile
     * @throws Exception
     */
    public static void addNativeLibDir(ClassLoader classLoader, File libFile) throws Exception {
        //dalvik.system.DexPathList
        Object pathList = getPathList(classLoader);
        //获取当前类的属性
        if (Build.VERSION.SDK_INT >= 26) {
            //需要替换 dalvik.system.DexPathList.NativeLibraryElement nativeLibraryPathElements[]
            //NativeLibraryElement(Dir)
            Class<?> aClass = Class.forName("dalvik.system.DexPathList$NativeLibraryElement");
            Constructor<?> constructor = aClass.getConstructor(File.class);
            constructor.setAccessible(true);
            Object needAddElement = constructor.newInstance(libFile);
            Field nativeLibraryPathElementsFile = pathList.getClass().getDeclaredField("nativeLibraryPathElements");
            nativeLibraryPathElementsFile.setAccessible(true);
            Object nativeLibraryPathElements = nativeLibraryPathElementsFile.get(pathList);
            Object newElements = arrAdd(nativeLibraryPathElements, needAddElement);
            nativeLibraryPathElementsFile.set(pathList, newElements);
        } else if (Build.VERSION.SDK_INT >= 23) {
            //需要替换 dalvik.system.DexPathList.Element nativeLibraryPathElements[]
            Class<?> aClass = Class.forName("dalvik.system.DexPathList$Element");
            //File,boolean,File,dalvik.system.DexFile
            Constructor<?> constructor = aClass.getConstructor(File.class, boolean.class, File.class, Class.forName("dalvik.system.DexFile"));
            constructor.setAccessible(true);
            Object needAddElement = constructor.newInstance(libFile, true, null, null);
            Field nativeLibraryPathElementsFile = pathList.getClass().getDeclaredField("nativeLibraryPathElements");
            nativeLibraryPathElementsFile.setAccessible(true);
            Object nativeLibraryPathElements = nativeLibraryPathElementsFile.get(pathList);
            Object newElements = arrAdd(nativeLibraryPathElements, needAddElement);
            nativeLibraryPathElementsFile.set(pathList, newElements);
        } else {
            //小于22，直接替换即可
            Field nativeLibraryDirectoriesField = pathList.getClass().getDeclaredField("nativeLibraryDirectories");
            nativeLibraryDirectoriesField.setAccessible(true);
            Object nativeLibraryDirectories = nativeLibraryDirectoriesField.get(pathList);
            Object newFiles = arrAdd(nativeLibraryDirectories, libFile);
            nativeLibraryDirectoriesField.set(pathList, newFiles);
        }
    }

    private static Object arrAdd(Object arr, Object add) {
        int length = Array.getLength(arr);
        Object newElements = Array.newInstance(add.getClass(), length + 1);
        Array.set(newElements, 0, add);
        for (int i = 1; i < length + 1; i++) {
            Array.set(newElements, i, Array.get(arr, i - 1));
        }
        return newElements;
    }

    private static Object getPathList(Object obj) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        return getField(obj, Class.forName("dalvik.system.BaseDexClassLoader"), "pathList");
    }

    private static Object getField(Object obj, Class cls, String str) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }


}
