package com.jsdroid.app.install;

import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;

class ImportPresenter extends BasePresenter<ImportActivity> {
    //从sdcard扫描jsd文件
    public void loadFiles() {
        QMUITipDialog loading = Dialogs.showLoading(getView(), "正在扫描文件...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                ImportActivity view = getView();
                String fileType = view.getFileType();
                String[] fileTypes = fileType.split("\\|");

                FileUtil.searchSDCard(new FileUtil.FileSearch() {
                    @Override
                    public boolean stop() {
                        //如果界面结束，则停止扫描咯
                        ImportActivity view = getView();
                        if (view == null || view.isDestroyed()) {
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public boolean compare(File file) {
                        for (String fileType : fileTypes) {
                            if (file.getName().endsWith(fileType)) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override
                    public void onSearched(File file) {

                        loading.dismiss();
                        try {
                            //等待100毫秒，防止界面太卡
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }
                        getView().addFile(file);
                    }
                });
                loading.dismiss();
            }
        }).start();

    }
}
