package com.jsdroid.check;

import com.jsdroid.commons.RootHelper;
import com.jsdroid.commons.SocketUtil;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.ShellHelper;
import com.jsdroid.active.ShellCommandBuilder;
import com.jsdroid.active.ShellInstaller;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

import java.io.IOException;
import java.net.Socket;

public class ShellCheckStep implements JsdCheckStep {
    private static final int SHELL_PORT = 10666;
    JsdCheckActivity activity;

    @Override
    public void check(final JsdCheckActivity activity) {
        this.activity = activity;
        QMUIDialog qmuiDialog = activity.uiSync(new BaseActivity.ISync<QMUIDialog>() {
            @Override
            public QMUIDialog run() {
                try {
                    return Dialogs.showDialog(activity, "提示", "测试shell服务。");
                } catch (Exception e) {
                    try {
                        activity.finish();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    return null;
                }
            }
        });
        if (qmuiDialog == null) {
            return;
        }
        qmuiDialog.setCancelable(false);
        if (!testShell(false)) {
            if (!RootHelper.isDeviceRooted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                testShell(true);
            }
        }
        qmuiDialog.dismiss();
    }

    private boolean testShell(final boolean withAndroidData) {
        ShellInstaller shellInstaller = new ShellInstaller(activity);
        try {
            shellInstaller.install();
        } catch (IOException e) {
        }
        ShellCommandBuilder shellCommandBuilder = new ShellCommandBuilder();
        shellCommandBuilder
                .setShellApkFile(shellInstaller.getJsdShellApkFile().getAbsolutePath())
                .setShellLibDir(shellInstaller.getNativeLibraryDir())
                .setShellPkg(activity.getPackageName())
                .setShellClass("com.jsdroid.server2_5.CheckShell");
        if (withAndroidData) {
            shellCommandBuilder.setAndroidDataDir(ShellHelper.getAndroidDataDir());
        }
        String command = shellCommandBuilder.build();
        Socket socket = ShellHelper.connect("127.0.0.1", SHELL_PORT);
        final StringBuilder checkResult = new StringBuilder();
        SocketUtil socketUtil = new SocketUtil(socket);
        String echo = "jsdroid_test_end";
        try {
            socketUtil.sendLine(command);
            socketUtil.sendLine("echo " + echo);
            for (; ; ) {
                String line = socketUtil.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains(echo)) {
                    break;
                }
                checkResult.append(line + "\n");
            }
        } catch (Exception err) {
        } finally {
            try {
                socketUtil.close();
            } catch (IOException e) {
            }
        }
        boolean success = checkResult.toString().contains("hello");
        if (success) {
            QMUIDialog dialog = activity.uiSync(new BaseActivity.ISync<QMUIDialog>() {
                @Override
                public QMUIDialog run() {
                    return Dialogs.showDialog(activity, "测试结果", "恭喜测试成功！",
                            Dialogs.newAction(activity, "关闭", new QMUIDialogAction.ActionListener() {
                                @Override
                                public void onClick(QMUIDialog dialog, int index) {
                                    dialog.dismiss();
                                    activity.finish();
                                }
                            }));
                }
            });
            dialog.setCancelable(false);
        } else {
            QMUIDialog dialog = activity.uiSync(new BaseActivity.ISync<QMUIDialog>() {
                @Override
                public QMUIDialog run() {
                    return Dialogs.showDialog(activity, "测试结果", "很遗憾，SHELL" + (withAndroidData ? "慢速方式" : "快速方式") + "测试失败了，日志：" + checkResult.toString(),
                            Dialogs.newAction(activity, "关闭", new QMUIDialogAction.ActionListener() {
                                @Override
                                public void onClick(QMUIDialog dialog, int index) {
                                    dialog.dismiss();
                                }
                            }));
                }
            });
            dialog.setCancelable(false);
        }
        return success;
    }

    @Override
    public boolean isOk() {
        return false;
    }


}
