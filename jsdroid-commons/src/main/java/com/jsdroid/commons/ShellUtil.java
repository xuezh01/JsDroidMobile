package com.jsdroid.commons;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import eu.chainfire.libsuperuser.Shell;
import eu.chainfire.libsuperuser.StreamGobbler;

public class ShellUtil {

    public static String exec(String cmd) {
        StringBuilder ret = new StringBuilder();
        List<String> result = null;
        result = Shell.SH.run(cmd);
        for (String line : result) {
            ret.append(line);
            ret.append("\n");
        }
        return ret.toString().trim();
    }

    public static String su(String cmd) {
        StringBuilder ret = new StringBuilder();
        List<String> result = null;
        result = Shell.SU.run(cmd);
        for (String line : result) {
            ret.append(line);
            ret.append("\n");
        }
        return ret.toString().trim();
    }

    static boolean waitFor(Process process, long timeout, TimeUnit unit) throws InterruptedException {
        long startTime = System.nanoTime();
        long rem = unit.toNanos(timeout);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException ex) {
                if (rem > 0)
                    Thread.sleep(
                            Math.min(TimeUnit.NANOSECONDS.toMillis(rem) + 1, 100));
            }
            rem = unit.toNanos(timeout) - (System.nanoTime() - startTime);
        } while (rem > 0);
        return false;
    }

    public static void rootShell(String shell, final ShellReader.Output output, final ShellReader.Output error) throws IOException, InterruptedException {
//        Process su = Runtime.getRuntime().exec("su");
//        su.getOutputStream().write(shell.getBytes());
//        new ShellReader(su, output, error);
        new Shell.Builder().useSU().setOnSTDOUTLineListener(new StreamGobbler.OnLineListener() {
            @Override
            public void onLine(String line) {
                if (output != null) {
                    output.onReadLine(line);
                }
            }
        }).setOnSTDERRLineListener(new StreamGobbler.OnLineListener() {
            @Override
            public void onLine(String line) {
                if (error != null) {
                    error.onReadLine(line);
                }
            }
        }).addCommand(shell).open();

    }

    public static void rootShell(String shell, ShellReader.Output output) throws IOException, InterruptedException {
        rootShell(shell, output, output);
    }
}
