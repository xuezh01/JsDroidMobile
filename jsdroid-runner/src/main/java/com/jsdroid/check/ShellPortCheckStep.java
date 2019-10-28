package com.jsdroid.check;

import com.jsdroid.active.JsdShell;
import com.jsdroid.adb.AdbShell;
import com.jsdroid.commons.ExceptionUtil;
import com.jsdroid.commons.RootHelper;
import com.jsdroid.commons.ShellUtil;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.shell.ShellHelper;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

public class ShellPortCheckStep implements JsdCheckStep {
    private static final int SHELL_PORT = 10666;
    JsdCheckActivity activity;

    @Override
    public void check(final JsdCheckActivity activity) {
        this.activity = activity;
        QMUIDialog qmuiDialog = activity.uiSync(new BaseActivity.ISync<QMUIDialog>() {
            @Override
            public QMUIDialog run() {
                if (!RootHelper.isDeviceRooted()) {
                    return Dialogs.showDialog(activity, "提示", "正在启动shell服务,接下来,请同意usb调试模式请求。",
                            Dialogs.newAction(activity, "开始", new QMUIDialogAction.ActionListener() {
                                @Override
                                public void onClick(QMUIDialog dialog, int index) {
                                    dialog.dismiss();
                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            openShell();
                                        }
                                    }).start();
                                }
                            }));
                } else {
                    return Dialogs.showDialog(activity, "提示", "正在启动shell服务,截下来,请同意root授权请求。",
                            Dialogs.newAction(activity, "开始", new QMUIDialogAction.ActionListener() {
                                @Override
                                public void onClick(QMUIDialog dialog, int index) {
                                    dialog.dismiss();
                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            openShell();
                                        }
                                    }).start();
                                }
                            }));
                }
            }
        });
        qmuiDialog.setCancelable(false);
        ShellHelper.waitPort(SHELL_PORT, Integer.MAX_VALUE);
        qmuiDialog.dismiss();
    }

    private void openShell() {
        String shellSoPath = JsdShell.getInstance().getShellInstaller().getShellSoPath();
        if (RootHelper.isDeviceRooted()) {
            try {
                //启动jsdshell
                ShellUtil.rootShell(shellSoPath, null);
            } catch (Exception e) {
            }
        } else {
            boolean shell = false;
            try {
                shell = AdbShell.shell(activity, shellSoPath,
                        3000, null);
            } catch (Exception e) {
                JsDroidApp.getInstance().log(ExceptionUtil.dumpException(e));
            }
            if (!shell) {
                activity.uiSync(new BaseActivity.ISync<QMUIDialog>() {
                    @Override
                    public QMUIDialog run() {
                        return Dialogs.showDialog(activity, "提示", "貌似没有同意usb调试模式请求，请重试。",
                                Dialogs.newAction(activity, "退出", new QMUIDialogAction.ActionListener() {
                                    @Override
                                    public void onClick(QMUIDialog dialog, int index) {
                                        dialog.dismiss();
                                        activity.finish();
                                    }
                                }),
                                Dialogs.newAction(activity, "重试", new QMUIDialogAction.ActionListener() {
                                    @Override
                                    public void onClick(QMUIDialog dialog, int index) {
                                        dialog.dismiss();
                                        new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                openShell();
                                            }
                                        }).start();
                                    }
                                }));
                    }
                });
            }
        }
    }

    @Override
    public boolean isOk() {
        return ShellHelper.waitPort(SHELL_PORT, 1);
    }


}
