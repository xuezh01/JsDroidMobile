package com.android.api;

import java.io.File;

public class Files {
    public static void setReadable(File file, boolean readable) {
        file.setReadable(readable, false);
    }

    public static void setExecutable(File file, boolean executable) {
        file.setExecutable(executable, false);
    }

    public static void setWritable(File file, boolean writable) {
        file.setWritable(writable, false);
    }

}
