package com.jsdroid.app.install;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.utils.Dialogs;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;
import java.util.List;

public class ClearActivity extends ImportActivity {
    @Override
    public String getTile() {
        return "清理相关文件";
    }

    @Override
    public String getFileType() {
        return ".jsd|.jsdp";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnImport.setText("清理");
    }

    @Override
    public void onImportFiles(List<File> files) {
        QMUITipDialog loading = showLoading("正在清理中。。。");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (File file : files) {
                    file.delete();
                }
                //导入完毕
                loading.dismiss();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //清除列表文件
                        for (File file : files) {
                            selectAdapter.delete(new SelectAdapter.SelectItem<File>(file, false));
                        }
                        selectAdapter.notifyDataSetChanged();
                        end();
                    }
                });

            }
        }).start();


    }


    void end() {
        Dialogs.showDialog(this, "提示", "清理完毕。",
                Dialogs.newAction(this, "确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                }));

    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, ClearActivity.class));
    }
}
