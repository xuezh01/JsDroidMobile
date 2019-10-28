package com.jsdroid.server2_5;


import com.android.api.Launches;
import com.android.api.Loopers;
import com.jsdroid.box.BoxServer;
import com.jsdroid.device.DeviceInfoManager;
import com.jsdroid.ipc.Ipc;
import com.jsdroid.script.JsDroidShellImpl;
import com.jsdroid.server.JsdHttpServer;
import com.jsdroid.uiautomator2.UiDevice;

public class Main2_5 {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                printError(e);
            }
        });
        JsdPath2_5.init();
        Loopers.prepare();
        Launches.systemMain();
        server();
        Loopers.loop();
    }

    public static void server() {
        //启动socket服务
        Ipc.startServer(9800, new Ipc.ServerListener() {
            @Override
            public void onStart(Ipc.Server server) {
                initServer(server);
            }

            @Override
            public void onClose(Ipc.Server server) {
                try {
                    server.shutdown();
                } finally {
                    System.exit(1);
                }
            }
        });

    }

    public static void initServer(Ipc.Server server) {
        //获取设备信息
        try {
            DeviceInfoManager.init();
        } catch (Throwable e) {
            printError(e);
        }
        //连接系统服务
        try {
            UiDevice.getInstance();
        } catch (Throwable e) {
            printError(e);
        } //添加service
        server.addService("jsdroid", JsDroidShellImpl.getInstance());
        new BoxServer(9809);
        //启动Jsd服务
        try {
            new JsdHttpServer(9801).start();
        } catch (Exception e) {
        }
    }

    public synchronized static void printError(Throwable err) {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        err.printStackTrace(new PrintStream(out));
//        System.out.println(out.toByteArray());
//        FileUtil.append(JsdPath2_5.getLogFile().getPath(), out.toString());
//        try {
//            out.close();
//        } catch (Exception e) {
//        }
        err.printStackTrace();
    }

}
