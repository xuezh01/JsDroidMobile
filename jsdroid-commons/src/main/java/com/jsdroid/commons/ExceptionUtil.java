package com.jsdroid.commons;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ExceptionUtil {
    public static String dumpException(Throwable throwable) {
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputStream);
        throwable.printStackTrace(ps);
        return outputStream.toString();
    }
}
