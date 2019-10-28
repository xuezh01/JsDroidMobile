package com.jsdroid.active.step;

import android.os.Build;

import com.jsdroid.active.ShellCommandBuilder;
import com.jsdroid.commons.RootHelper;
import com.jsdroid.commons.SocketUtil;
import com.jsdroid.commons.SyncThread;
import com.jsdroid.shell.ShellHelper;

import java.io.IOException;
import java.net.Socket;

public class ShellStep extends BaseStep {
    boolean testShell;
    boolean shellOk;
    boolean quicklyMode;
    String shellResult;
    boolean hasKillOld;

    @Override
    public boolean skip() {
        //杀死旧版服务
        killOld();
        //如果已经开启，则跳过
        return ShellHelper.waitPort(9800, 1);
    }

    @Override
    public void run() {
        testShell();
        if (shellOk) {
            print("正在启动服务...");
            startShell(quicklyMode);
        }
    }

    private boolean killAppProcess(String shell) {
        String ps = ShellHelper.shell(shell, 3000);
        boolean ret = false;
        if (ps != null && ps.contains("app_process")) {
            String[] liens = ps.split("\n");
            for (String line : liens) {
                if (line.contains("grep")) {
                    continue;
                }
                String[] split = line.split("[\n\t ]");
                for (String s : split) {
                    try {
                        Integer.parseInt(s.trim());
                        print("kill -9 " + s);
                        ShellHelper.shell("kill -9 " + s, 1000);
                        ret = true;
                        break;
                    } catch (Exception e) {
                    }
                }

            }
        }
        return ret;
    }

    //首次运行杀死旧版服务
    private void killOld() {
        //kill -9 $(ps -ef|grep shell.apk)
        if (!hasKillOld) {
            hasKillOld = true;
            if (ShellHelper.waitPort(9800, 1)) {
                print("正在停止旧版服务...");
                if (killAppProcess("ps |grep app_process")) {
                    killAppProcess("ps -ef|grep app_process");
                }
                if (ShellHelper.waitPort(9800, 1)) {
                    print("停止失败...");
                } else {
                    print("已经停止...");
                }
            }
        }

    }

    private String getDeviceInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("是否root：").append(RootHelper.isDeviceRooted() ? "是" : "否").append("\n");
        sb.append("手机cpu:").append(Build.CPU_ABI).append("\n");
        sb.append("手机厂商:").append(Build.BOARD).append("\n");
        sb.append("手机型号:").append(Build.MODEL).append("\n");
        return sb.toString();
    }

    private void startShell(boolean quickMode) {
        ShellCommandBuilder shellCommandBuilder = new ShellCommandBuilder();
        shellCommandBuilder
                .setShellApkFile(getShellInstaller().getJsdShellApkFile().getAbsolutePath())
                .setShellLibDir(getShellInstaller().getNativeLibraryDir())
                .setShellPkg(getContext().getPackageName())
                .setShellClass("com.jsdroid.server2_5.Main2_5");
        if (!quickMode) {
            shellCommandBuilder.setAndroidDataDir(ShellHelper.getAndroidDataDir());
        }
        ShellHelper.shell(shellCommandBuilder.build());
        ShellHelper.waitPort(9800, Integer.MAX_VALUE);
        print("启动成功！");
    }

    private void testShell() {
        try {
            if (!testShell) {
                print("正在测试快速方式...");
                shellOk = quicklyMode = testShell(false);
                if (!quicklyMode) {
                    print("正在测试兼容方式...");
                    shellOk = testShell(true);
                }
                testShell = true;
                print("测试完毕...");
                if (!shellOk) {
                    print("很遗憾，手机不支持JsDroid！\n返回结果：" + shellResult + "\n手机信息如下:\n" + getDeviceInfo());
                } else {
                    print("手机支持JsDroid! ");
                }

            }
        } catch (Exception e) {
            error(e);
        }
    }

    private boolean testShell(final boolean withAndroidData) {

        ShellCommandBuilder shellCommandBuilder = new ShellCommandBuilder();
        shellCommandBuilder
                .setShellApkFile(getShellInstaller().getJsdShellApkFile().getAbsolutePath())
                .setShellLibDir(getShellInstaller().getNativeLibraryDir())
                .setShellPkg(getContext().getPackageName())
                .setShellClass("com.jsdroid.server2_5.CheckShell");
        if (withAndroidData) {
            shellCommandBuilder.setAndroidDataDir(ShellHelper.getAndroidDataDir());
        }
        String command = shellCommandBuilder.build();
        print("连接shell...");
        Socket socket = ShellHelper.connect("127.0.0.1", 10666);
        print("连接shell成功!");
        final StringBuilder checkResult = new StringBuilder();
        String echo = "jsdroid_test_end";
        SocketUtil socketUtil = new SocketUtil(socket);
        try {
            socketUtil.sendLine(command);
            socketUtil.sendLine("echo " + echo);
            for (; ; ) {
                String line = socketUtil.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("mkdir:")) {
                    continue;
                }
                if (line.contains(echo)) {
                    break;
                }
                checkResult.append(line + "\n");

            }
        } catch (Exception err) {
            error(err);
        } finally {
            try {
                socketUtil.close();
            } catch (IOException e) {
            }
        }
        shellResult = checkResult.toString();
        return shellResult.contains("hello");

    }

}
