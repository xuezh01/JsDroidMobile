package com.jsdroid.mvp.presenter;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public class BasePresenter<T> {
    public static class ViewNullException extends NullPointerException {
        public ViewNullException() {
        }

        public ViewNullException(String message) {
            super(message);
        }

    }

    private T mView;

    public void attachView(T view) {
        this.mView = view;
    }

    public void detachView() {
        mView = null;

    }


    /**
     * 如果界面关闭了，mView则为空值，线程中调用的话，请注意判断mView空值。
     * 建议使用 postWithView更新界面。
     *
     * @return
     */
    public T getView() {

        return mView;
    }

    public interface Check<T> {
        void ok(T view);
    }

    public void postCheckView(final Check<T> check) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mView != null) {
                    check.ok(mView);
                }
            }
        });
    }

    public void checkView(final Check<T> check) {
        if (mView != null) {
            check.ok(mView);
        }
    }

    protected void onCreate() {

    }

    public void performOnCreate() {
        onCreate();
    }

    public void runOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    protected void onDestroyed() {

    }

    public void performOnDestroyed() {
        onDestroyed();
    }

    protected void onPause() {

    }

    public void performOnPause() {
        onPause();
    }

    protected void onResume() {

    }

    public void performOnResume() {
        onResume();
    }

    protected void onStop() {

    }

    public void performOnStop() {

    }

    protected void onStart() {
    }

    public void performOnStart() {
        onStart();
    }

    public void uiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public Activity getActivity() throws Exception {
        T view = getView();
        if (view instanceof Activity) {
            return (Activity) view;
        }
        return null;
    }

}
