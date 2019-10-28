package com.jsdroid.app.install;

import android.content.Context;
import android.content.Intent;

import com.jsdroid.app.entity.Project;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.utils.Dialogs;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImportProjectActivity extends ImportActivity {
    @Override
    public String getTile() {
        return "导入JsDroid工程";
    }

    @Override
    public String getFileType() {
        return ".jsdp";
    }

    @Override
    public void onImportFiles(List<File> files) {

        Dialogs.showDialog(this, "提示", "是否覆盖已存在项目？",
                Dialogs.newAction(this, "不覆盖", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        importProject(files, false);
                    }
                }), Dialogs.newAction(this, "覆盖", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        importProject(files, true);
                    }
                }));

    }

    void importProject(List<File> files, boolean override) {
        QMUITipDialog loading = showLoading("正在导入中。。。");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (File file : files) {
                    try {
                        Project project = JsdProject.getInstance().readProjectInfo(file);
                        Project dbProject = JsdProject.getInstance().findProject(project.pkg);
                        if (dbProject != null) {
                            //判断是否覆盖
                            if (override) {
                                JsdProject.getInstance().deleteProject(dbProject);
                                JsdProject.getInstance().importProject(project, file);
                            }
                        } else {
                            //不存在，直接导入
                            JsdProject.getInstance().importProject(project, file);
                        }
                    } catch (Exception e) {
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
    public static void open(Context context){
        context.startActivity(new Intent(context,ImportProjectActivity.class));
    }
}
