package com.jsdroid.ipc;

import com.jsdroid.commons.FileUtil;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Printer {
    public static void print(Object text) {
        printLog(text + "");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        String at = stackTrace[1].getClassName() + "(" + stackTrace[1].getFileName() + ":" + stackTrace[1].getLineNumber() + ")";
        printLog("\n\tat:" + at);
    }

    public synchronized static void printError(Throwable err) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        err.printStackTrace(new PrintStream(out));
        FileUtil.append("/data/local/tmp/log", out.toString());
        try {
            out.close();
        } catch (Exception e) {
        }
    }


    public synchronized static void printLog(String text) {
        FileUtil.append("/data/local/tmp/log", text);
    }
}
