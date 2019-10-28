package com.jsdroid.app.project.create;

import android.content.DialogInterface;

import com.jsdroid.app.entity.Project;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;
import java.io.IOException;

class ImportProjectPresenter extends BasePresenter<ImportProjectActivity> {

    private void openProject(String pkg) {
        Project project = JsdProject.getInstance().findProject(pkg);
        if (project != null) {
            JsdProject.getInstance().openProject(getView(), project);
        }
        getView().finish();
    }

    public void importProject(String projectFile) throws IOException {
        importProject(new File(projectFile));
    }

    public void importProject(File projectFile) throws IOException {

        //读取config文件
        Project project = JsdProject.getInstance().readProjectInfo(projectFile);

        Project dbProject = JsdProject.getInstance().findProject(project.pkg);
        if (dbProject != null) {
            QMUIDialogAction cancel = Dialogs.newAction(getView(), "取消", new QMUIDialogAction.ActionListener() {
                @Override
                public void onClick(QMUIDialog dialog, int index) {
                    //打开已经
                    openProject(dbProject.pkg);
                    dialog.dismiss();
                }
            });
            QMUIDialogAction override = Dialogs.newAction(getView(), "覆盖", new QMUIDialogAction.ActionListener() {
                @Override
                public void onClick(QMUIDialog dialog, int index) {

                    //删除旧的，再次导入
                    JsdProject.getInstance().deleteProject(dbProject);
                    importProjectImpl(project, projectFile);
                    dialog.dismiss();
                }
            });
            QMUIDialog dialog = Dialogs.showDialog(getView(), "提示", "项目已经存在，是否覆盖？", cancel, override);
            dialog.setCancelable(false);

        } else {
            importProjectImpl(project, projectFile);
        }
    }

    //导入项目
    private void importProjectImpl(Project project, File projectFile) {
        QMUITipDialog loading = getView().showLoading("正在导入。。。");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    JsdProject.getInstance().importProject(project, projectFile);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            openProject(project.pkg);
                        }
                    });

                } catch (Exception e) {
                    showErrorAndFinish("提示", "导入错误：" + e.getMessage(), e.getMessage());
                } finally {
                    loading.dismiss();
                }
            }
        }).start();

    }

    public void showErrorAndFinish(String title, String content, String copy) {
        QMUIDialog dialog = Dialogs.showCopyDialog(getView(), "提示", content, copy);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                getView().finish();
            }
        });
    }
}
