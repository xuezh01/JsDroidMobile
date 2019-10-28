package com.jsdroid.shell;

import com.jsdroid.commons.RootHelper;
import com.jsdroid.commons.SocketUtil;
import com.jsdroid.commons.SyncThread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ShellHelper {
    public static boolean readable(File file) {
        try {
            new FileInputStream(file).close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String getReadableFile(String originFile, String tempFile) {
        if (readable(new File(originFile))) {
            return originFile;
        } else {
            ShellHelper.shell("cp " + originFile + " " + tempFile, 3000);
            if (new File(tempFile).exists()) {
                return tempFile;
            }
        }
        return null;
    }

    public static String shell(String command, long timeout) {
        return shell(command, timeout, false);
    }

    public static String shell(String command) {
        return shell(command, 0, true);
    }

    public static String shell(String command, long timeout, boolean nowait) {
        //等待10666端口
        final Socket shellSocket = ShellHelper.connect("127.0.0.1", 10666);
        final SocketUtil socketUtil = new SocketUtil(shellSocket);
        try {
            socketUtil.sendLine(command);
            socketUtil.sendLine("exit");
        } catch (IOException e) {
            return null;
        }
        SyncThread<String> stringSyncThread = new SyncThread<>(new SyncThread.Sync<String>() {
            @Override
            public String run() {

                StringBuilder result = new StringBuilder();
                //接收数据
                try {
                    for (; ; ) {
                        String line = socketUtil.readLine();
                        if (line == null) {
                            break;
                        }
                        result.append(line).append("\n");
                    }
                } catch (Exception ignored) {
                } finally {
                    try {
                        socketUtil.close();
                    } catch (IOException ignored) {
                    }
                }

                return result.toString();
            }
        });
        if (nowait) {
            return null;
        }
        if (timeout <= 0) {
            timeout = 10 * 1000;
        }
        try {
            return stringSyncThread.waitResult(timeout);
        } finally {
            try {
                socketUtil.close();
            } catch (Exception e) {
            }
        }

    }

    public static boolean waitPort(int port, int count) {
        for (int i = 0; i < count; i++) {
            try {
                new Socket("127.0.0.1", port).close();
                return true;
            } catch (Exception e) {
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        return false;
    }

    public static Socket connect(String host, int port) {
        for (; ; ) {
            try {
                return new Socket(host, port);
            } catch (Exception e) {
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        return null;
    }

    public static void requestRootPermission() {
        try {
            Process su = Runtime.getRuntime().exec("su");
            OutputStream outputStream = su.getOutputStream();
            outputStream.write("exit\n".getBytes());
            for (; ; ) {
                try {
                    su.exitValue();
                    return;
                } catch (Exception e) {
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

    public static String getAndroidDataDir() {
        if (RootHelper.isDeviceRooted()) {
            return "/data/local/tmp/android_data_root";
        }
        return "/data/local/tmp/android_data";
    }
}
