package com.jsdroid.app.capture;

import android.content.Intent;

import com.ditclear.swipelayout.SwipeDragLayout;
import com.jsdroid.app.entity.Capture;
import com.jsdroid.app.jsd.BaseManager;
import com.jsdroid.app.jsd.JsdCapture;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

class CaptureListPresenter extends BasePresenter<CaptureListActivity> implements BaseManager.Listener {
    @Override
    protected void onCreate() {
        super.onCreate();
        JsdCapture.getInstance().addListener(this);
        loadCapture();
    }

    @Override
    public void onChanged() {
        loadCapture();
    }

    public void loadCapture() {
        try {
            getView().dataAdapter.setDatas(JsdCapture.getInstance().list());
            getView().dataAdapter.notifyDataSetChanged();
        } catch (Exception e) {
        }
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        JsdCapture.getInstance().removeListener(this);
    }

    public void open(Capture capture) {
        try {
            Intent intent = new Intent(getView(), CaptureActivity.class);
            intent.putExtra("capture", capture.id);
            getView().startActivity(intent);
        } catch (Exception e) {
        }
    }

    public void delete(Capture capture) {
        JsdCapture.getInstance().delete(capture);
    }

    public void rename(Capture capture) {

        try {
            QMUIDialog.EditTextDialogBuilder builder = new QMUIDialog.EditTextDialogBuilder(getView());
            builder.setTitle("重命名");
            builder.setPlaceholder(capture.name);
            builder.addAction("取消", new QMUIDialogAction.ActionListener() {
                @Override
                public void onClick(QMUIDialog dialog, int index) {
                    dialog.dismiss();
                }
            });
            builder.addAction("确定", new QMUIDialogAction.ActionListener() {
                @Override
                public void onClick(QMUIDialog dialog, int index) {
                    dialog.dismiss();
                    String name = builder.getEditText().getText().toString();
                    capture.name = name;
                    JsdCapture.getInstance().update(capture);
                }
            });

            QMUIDialog dialog = builder.create();
            dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
