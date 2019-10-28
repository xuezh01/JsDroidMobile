package com.jsdroid.groovy;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import dalvik.system.DexClassLoader;

public class ScriptClassLoader extends DexClassLoader {
    private Map<String, String> libraryMap = new HashMap<>();
    File libDir;

    public ScriptClassLoader(String dexPath, String optimizedDirectory, String librarySearchPath, ClassLoader parent) {
        super(dexPath, optimizedDirectory, librarySearchPath, parent);
        libDir = new File("/data/local/tmp/lib/" + hashCode());
        if (!libDir.exists()) {
            libDir.mkdirs();
        }

    }

    @Override
    public void finalize() throws Throwable {
        FileUtils.deleteDirectory(libDir);
        super.finalize();
    }


    public static void clearLibDir() {
        try {
            FileUtils.deleteDirectory(new File("/data/local/tmp/lib"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String findLibrary(String name) {
        if (libraryMap.containsKey(name)) {
            return libraryMap.get(name);
        }
        String lib = super.findLibrary(name);
        if (lib == null) {
            return null;
        }
        //复制到新的地方,保证每个so都是唯一的
        File tempFile = new File(libDir, name + ".so");
        try {
            FileUtils.copyFile(new File(lib), tempFile);
        } catch (IOException e) {
        }
        tempFile.setExecutable(true);
        tempFile.setReadable(true);
        tempFile.setWritable(true);
        libraryMap.put(name, tempFile.getPath());
        return tempFile.getPath();
    }
}
