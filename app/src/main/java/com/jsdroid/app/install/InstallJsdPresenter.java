package com.jsdroid.app.install;

import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.eye.ToolActivity;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

class InstallJsdPresenter extends BasePresenter<InstallJsdActivity> {
    public void installJsd(File file) {
        QMUITipDialog loading = getView().showLoading("正在安装。。。");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Tool install = JsdTool.getInstance().install(file.getPath());
                    openJsd(install);
                } catch (Exception e) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            getView().finish();
                        }
                    });
                } finally {
                    loading.dismiss();
                }
            }
        }).start();

    }

    private void openJsd(Tool install) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ToolActivity.openTool(getView(), install.pkg);
                getView().finish();

            }
        });
    }
}
