package com.jsdroid.shell.util;

import java.io.File;

public class FilePermissions {
    public static void openExecutable(File file) {
        try {
            file.setReadable(true, false);
            file.setExecutable(true, false);
            file.setWritable(true, false);
        } catch (Throwable e) {
        }
    }

    /**
     * 递归
     *
     * @param file
     */
    public static void openExecutables(File file) {
        if (file.exists()) {
            openExecutable(file);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File child : files) {
                        openExecutables(child);
                    }
                }
            }
        }
    }
}
