package com.jsdroid.check;

import com.jsdroid.commons.RootHelper;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.ShellHelper;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

public class WifiPortCheckStep implements JsdCheckStep {
    private static final int WIFI_SHELL_PORT = 5555;
    JsdCheckActivity activity;

    @Override
    public void check(final JsdCheckActivity activity) {
        this.activity = activity;
        QMUIDialog qmuiDialog = activity.uiSync(new BaseActivity.ISync<QMUIDialog>() {
            @Override
            public QMUIDialog run() {
                return Dialogs.showDialog(activity, "提示",
                        "正在等待调试模式。。。\n【温馨提示】\n\t手机未root，开机后首次运行需要开启usb调试模式，连接电脑，使用JsDroid专属激活工具激活。。。",
                        Dialogs.newAction(activity, "取消", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                                activity.finish();
                            }
                        }));
            }
        });
        qmuiDialog.setCancelable(false);
        ShellHelper.waitPort(WIFI_SHELL_PORT, Integer.MAX_VALUE);
        qmuiDialog.dismiss();
    }

    @Override
    public boolean isOk() {
        if (RootHelper.isDeviceRooted()) {
            return true;
        }
        return ShellHelper.waitPort(WIFI_SHELL_PORT, 1);
    }


}
