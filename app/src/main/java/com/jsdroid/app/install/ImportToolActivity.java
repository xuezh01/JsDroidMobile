package com.jsdroid.app.install;

import android.content.Context;
import android.content.Intent;

import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.commons.ExceptionUtil;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.uiautomator2.Tracer;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;
import java.util.List;

public class ImportToolActivity extends ImportActivity {
    @Override
    public String getTile() {
        return "导入JsDroid工具";
    }

    @Override
    public String getFileType() {
        return ".jsd";
    }

    @Override
    public void onImportFiles(List<File> files) {
        QMUITipDialog loading = showLoading("正在导入中。。。");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (File file : files) {
                    try {
                        JsdTool.getInstance().install(file.getPath());
                    } catch (Exception e) {
                        JsDroidApp.getInstance().log(ExceptionUtil.dumpException(e));
                    }
                }
                //导入完毕
                loading.dismiss();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        end();
                    }
                });
            }
        }).start();
    }


    void end() {
        Dialogs.showDialog(this, "提示", "导入完毕。",
                Dialogs.newAction(this, "确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();

                    }
                }));

    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, ImportToolActivity.class));
    }
}
