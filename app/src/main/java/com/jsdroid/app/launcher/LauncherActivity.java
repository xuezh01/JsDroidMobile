package com.jsdroid.app.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jsdroid.mvp.view.BaseActivity;

public class LauncherActivity extends BaseActivity<LauncherActivity, LauncherPresenter> {
    @Override
    protected LauncherPresenter createPresenter() {
        return new LauncherPresenter();
    }

    @Override
    protected LauncherActivity createView() {
        return this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
