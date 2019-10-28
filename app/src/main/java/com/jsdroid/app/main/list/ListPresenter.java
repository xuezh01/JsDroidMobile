package com.jsdroid.app.main.list;

import android.content.Intent;
import android.os.Environment;

import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.eye.ToolActivity;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.shortcut.ToolShortcut;
import com.jsdroid.app.utils.Shares;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ListPresenter extends BasePresenter<ListPage> implements JsdTool.JsdListener {
    @Override
    protected void onCreate() {
        super.onCreate();
        listScript();
        JsdTool.getInstance().addListener(this);
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        JsdTool.getInstance().removeListener(this);
    }

    @Override
    public void onToolChanged() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                listScript();
            }
        });

    }

    public void listScript() {

        ListPage view = getView();
        List<ToolModel> models = new ArrayList<>();
        List<Tool> tools = Db.getInstance().getDaoSession().getToolDao().loadAll();

        for (Tool tool : tools) {
            ToolModel toolModel = new ToolModel(tool);
            models.add(toolModel);
        }
        view.letterListView.setModels(models);

    }

    public void uninstall(ToolModel letterModel) {
        QMUITipDialog qmuiTipDialog = getView().showLoading("正在卸载...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    JsdTool.getInstance().uninstall(letterModel.tool.pkg);
                } catch (Exception e) {
                } finally {
                    qmuiTipDialog.dismiss();
                }
            }
        }).start();

    }

    public void open(ToolModel letterModel) {
        ListPage view = getView();
        if (view == null) {
            return;
        }
        try {
            Intent intent = new Intent(getView().getContext(), ToolActivity.class);
            intent.putExtra("pkg", letterModel.tool.pkg);
            view.getContext().startActivity(intent);
        } catch (Exception e) {
            view.showError("打开失败,确定是否已经卸载？");
        }

    }

    public void favorite(ToolModel toolModel) {
        JsdTool.getInstance().update(toolModel.tool);
    }

    public void shortcut(Tool tool) {
        new ToolShortcut(getView().getContext(), tool).createShortcut();
    }

    public void share(Tool tool) {
        try {
            File apkFile = JsdTool.getInstance().getApkFile(tool.pkg);
            File shareFile = new File(Environment.getExternalStorageDirectory(), tool.getName() + ".jsd");
            FileUtils.copyFile(apkFile, shareFile);
            Shares.shareFile(getView().getContext(), shareFile);
        } catch (Exception e) {
        }
    }
}
