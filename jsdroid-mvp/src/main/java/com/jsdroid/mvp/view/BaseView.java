package com.jsdroid.mvp.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import butterknife.ButterKnife;

/**
 * @param <V> View
 * @param <P> Presenter
 */
public abstract class BaseView<V, P extends BasePresenter<V>> extends LinearLayout {
    public static final int LAYOUT_NONE = -1;
    private View root;

    public BaseView(Context context) {
        this(context, null);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initLayoutParams();
        onCreate();
        bindBaseActivity();
    }

    protected void initLayoutParams() {
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    private void bindBaseActivity() {

        Context context = getContext();
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).addActivityListener(new BaseActivity.ActivityListener() {
                @Override
                public void onStart() {
                    performOnStart();
                }

                @Override
                public void onResume() {
                    performOnResume();
                }

                @Override
                public void onPause() {
                    performOnPause();
                }

                @Override
                public void onStop() {
                    performOnStop();
                }

                @Override
                public void onDestroyed() {
                    performOnDestroyed();
                }
            });
        }
    }

    private P presenter;

    protected P createPresenter() {
        return null;
    }

    protected V createView() {
        try {
            return (V) this;
        } catch (Throwable e) {
            return null;
        }
    }

    public P getPresenter() {
        return presenter;
    }

    protected void onCreate() {
        presenter = createPresenter();
        if (presenter != null) {
            presenter.attachView(createView());
        }
        int layoutId = getLayoutId();
        if (layoutId != LAYOUT_NONE) {
            root = LayoutInflater.from(getContext()).inflate(layoutId, this, false);
            addView(root);
            ButterKnife.bind(this);
        }
        initViews();
        initAdapters();
        bindEvents();
        if (presenter != null) {
            presenter.performOnCreate();
        }
    }


    public View getRoot() {
        return root;
    }

    protected int getLayoutId() {
        return LAYOUT_NONE;
    }

    protected void onResume() {
        if (presenter != null) {
            presenter.performOnResume();
        }
    }

    public void performOnResume() {
        onResume();
    }

    protected void onDestroyed() {
        if (presenter != null) {
            presenter.performOnDestroyed();
            presenter.detachView();
        }
    }

    public void performOnDestroyed() {
        onDestroyed();
    }

    protected void onPause() {
        if (presenter != null) {
            presenter.performOnPause();
        }
    }

    public void performOnPause() {
        onPause();
    }

    protected void onStart() {
        if (presenter != null) {
            presenter.performOnStart();
        }
    }

    public void performOnStart() {
        onStart();
    }

    protected void onStop() {
        if (presenter != null) {
            presenter.performOnStop();
        }
    }

    public void performOnStop() {
        onStop();
    }

    protected void initViews() {

    }

    protected void bindEvents() {

    }

    protected void initAdapters() {

    }

    private QMUITipDialog showTip(int type, String content) {
        QMUITipDialog.Builder builder = new QMUITipDialog.Builder(getContext());
        builder.setTipWord(content);
        builder.setIconType(type);
        QMUITipDialog qmuiTipDialog = builder.create();
        if (type == QMUITipDialog.Builder.ICON_TYPE_LOADING) {
            qmuiTipDialog.setCancelable(false);
        } else {
            qmuiTipDialog.setCancelable(true);
        }
        qmuiTipDialog.setCanceledOnTouchOutside(true);
        qmuiTipDialog.show();
        return qmuiTipDialog;
    }

    public QMUITipDialog showError(String error) {
        return showTip(QMUITipDialog.Builder.ICON_TYPE_FAIL, error);
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

    public void finish() {
        Context context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}
