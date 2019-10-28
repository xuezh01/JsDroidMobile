package com.jsdroid.mvp.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    public static final int LAYOUT_NONE = -1;

    private T presenter;

    protected abstract T createPresenter();

    protected abstract V createView();

    public T getPresenter() {
        return presenter;
    }

    protected int getLayoutId() {
        return LAYOUT_NONE;
    }

    public void showError(final String title, final String error) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                QMUIDialog.MessageDialogBuilder builder = new QMUIDialog.MessageDialogBuilder(BaseActivity.this);
                builder.setTitle(title);
                builder.setMessage(error);
                builder.addAction("关闭", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                });
                builder.addAction("复制", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        putClipboard(error);
                        showInfo("复制成功！");
                    }
                });
                builder.create().show();
            }
        });
    }

    public void putClipboard(String text) {
        ClipboardManager clipboardManager =
                (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("text", text);
        clipboardManager.setPrimaryClip(clip);
    }

    public interface ActivityListener {
        void onStart();

        void onResume();

        void onPause();

        void onStop();

        void onDestroyed();
    }

    List<ActivityListener> activityListenerList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivityListeners();
        presenter = createPresenter();
        if (presenter != null) {
            presenter.attachView(createView());
        }
        int layoutId = getLayoutId();
        if (layoutId != LAYOUT_NONE) {
            setContentView(layoutId);
            ButterKnife.bind(this);
            initViews();
            initTopBar();
            initAdapters();
            fetchData();
            bindEvents();
        }
        if (presenter != null) {
            presenter.performOnCreate();
        }

    }

    private void initActivityListeners() {
        activityListenerList = new ArrayList<>();

    }

    public void addActivityListener(ActivityListener activityListener) {
        synchronized (activityListenerList) {
            activityListenerList.add(activityListener);
        }
    }

    public void removeActivityListener(ActivityListener activityListener) {
        synchronized (activityListenerList) {
            activityListenerList.remove(activityListener);
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.performOnDestroyed();
            presenter.detachView();
        }
        synchronized (activityListenerList) {
            for (ActivityListener activityListener : activityListenerList) {
                activityListener.onDestroyed();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (presenter != null) {
            presenter.performOnStart();
        }
        synchronized (activityListenerList) {
            for (ActivityListener activityListener : activityListenerList) {
                activityListener.onStart();
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (presenter != null) {
            presenter.performOnStop();
        }
        synchronized (activityListenerList) {
            for (ActivityListener activityListener : activityListenerList) {
                activityListener.onStop();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (presenter != null) {
            presenter.performOnResume();
        }
        synchronized (activityListenerList) {
            for (ActivityListener activityListener : activityListenerList) {
                activityListener.onResume();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (presenter != null) {
            presenter.performOnPause();
        }
        synchronized (activityListenerList) {
            for (ActivityListener activityListener : activityListenerList) {
                activityListener.onPause();
            }
        }
    }

    protected void initViews() {

    }

    protected void bindEvents() {

    }

    protected void initAdapters() {

    }

    private QMUITipDialog showTip(int type, String content) {
        QMUITipDialog.Builder builder = new QMUITipDialog.Builder(this);
        builder.setTipWord(content);
        builder.setIconType(type);
        final QMUITipDialog qmuiTipDialog = builder.create();
        qmuiTipDialog.setCancelable(true);
        qmuiTipDialog.setCanceledOnTouchOutside(true);
        try {
            qmuiTipDialog.show();
        } catch (Throwable e) {
        }
        if (type != QMUITipDialog.Builder.ICON_TYPE_LOADING) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    try {
                        qmuiTipDialog.dismiss();
                    } catch (Exception e) {
                    }
                }
            }, 3000);
        }
        return qmuiTipDialog;
    }

    public QMUITipDialog showError(String error) {
        return showTip(QMUITipDialog.Builder.ICON_TYPE_FAIL, error);
    }

    public void toast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public QMUITipDialog showInfo(String info) {
        return showTip(QMUITipDialog.Builder.ICON_TYPE_INFO, info);
    }

    public QMUITipDialog showLoading(String loading) {
        return showTip(QMUITipDialog.Builder.ICON_TYPE_LOADING, loading);
    }

    public QMUITipDialog showSuccess(String success) {
        return showTip(QMUITipDialog.Builder.ICON_TYPE_SUCCESS, success);
    }

    protected void fetchData() {

    }

    protected void initTopBar() {

    }

    public void setStatusBarColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(color);   //这里动态修改颜色
        }
    }

    public interface ISync<T> {
        T run();
    }

    private class Sync<T> {
        private T ret;
        private boolean end;
        private ISync<T> sync;

        private Sync(ISync<T> sync) {
            this.sync = sync;
        }

        final void sync() {
            try {
                this.ret = sync.run();
            } finally {
                synchronized (Sync.this) {
                    this.end = true;
                    Sync.this.notifyAll();
                }
            }
        }

        final T async() {
            synchronized (Sync.this) {
                if (!end) {
                    try {
                        Sync.this.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            return ret;
        }

    }

    public <T> T uiSync(final ISync<T> sync) {
        final Sync<T> tSync = new Sync<>(sync);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tSync.sync();
            }
        });
        return tSync.async();
    }
}
