package com.jsdroid.groovy;

import android.content.Context;
import android.util.Log;

import com.android.dx.command.Main;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import dalvik.system.DexClassLoader;

public class ClassPath {
    private Map<String, DexClassLoader> classLoaderMap;

    public ClassPath() {
        this.classLoaderMap = new HashMap<>();
    }

    public void addJar(Context context, String file) throws IOException {
        if (file.endsWith(".jar")) {
            File optDir = context.getDir("lib_dex", 0);
            String dexFile = file.substring(0, file.length() - 4) + ".apk";
            //将file编译成dex
            //dx --dex --output
            com.android.dx.command.dexer.Main.Arguments args = new com.android.dx.command.dexer.Main.Arguments();
            args.parse(new String[]{"--output=" + dexFile, file});
            args.targetApiLevel = 14;
            com.android.dx.command.dexer.Main.run(args);
            DexClassLoader dexClassLoader = new DexClassLoader(dexFile, optDir.getPath(), null, null);
            classLoaderMap.put(file, dexClassLoader);
        }
    }

    public Class loadClass(String className) throws ClassNotFoundException {
        for (DexClassLoader dexClassLoader : classLoaderMap.values()) {
            try {
                Class<?> aClass = dexClassLoader.loadClass(className);
                if (aClass != null) {
                    return aClass;
                }
            } catch (Throwable e) {
            }
        }
        throw new ClassNotFoundException("not found class:" + className);
    }


}
