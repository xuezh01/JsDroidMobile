package com.jsdroid.loader;

import com.jsdroid.commons.ZipUtil;

import java.io.File;

import dalvik.system.DexClassLoader;

public class JsDroidLib {
    private static LibClassLoader libClassLoader = new LibClassLoader(JsDroidLib.class.getClassLoader());

    public static void installMultiDex(String apkFile, String outputDexDir, String optimizedDirectory, String librarySearchPath) {
        //解压所有dex
        for (int i = 2; ; i++) {
            String name = "classes" + i + ".dex";
            String dexPath = new File(outputDexDir, name).getPath();
            if (!ZipUtil.unzipFileToFile(apkFile, name, dexPath)) {
                break;
            }
            addDexClassLoader(dexPath, optimizedDirectory, librarySearchPath);
        }
    }

    public static void addDexClassLoader(String dexPath, String optimizedDirectory, String librarySearchPath) {
        DexClassLoader dexClassLoader =
                new DexClassLoader(dexPath, optimizedDirectory, librarySearchPath, libClassLoader.getParent());
        libClassLoader.addClassLoader(dexClassLoader);
    }

    public static void installLib(String apkFile) {

    }

    public static LibClassLoader getLibClassLoader() {
        return libClassLoader;
    }

    public static void addPath(ClassLoader classLoader, String path) {

        //pathList
    }
}
