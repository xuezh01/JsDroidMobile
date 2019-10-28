package com.jsdroid.app.install;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.jsdroid.app.R;
import com.jsdroid.app.utils.Uris;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;

import java.io.File;
import java.io.IOException;

import butterknife.BindView;

public class InstallJsdActivity extends BaseActivity<InstallJsdActivity, InstallJsdPresenter> {
    @Override
    protected InstallJsdPresenter createPresenter() {
        return new InstallJsdPresenter();
    }

    @Override
    protected InstallJsdActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_install_jsd;
    }

    @BindView(R.id.topBar)
    QMUITopBar topBar;

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data != null) {
            File file = null;
            try {
                file = Uris.getFileFromUri(this, data);
                //安装
                getPresenter().installJsd(file);
            } catch (Exception e) {
                finish();
            }

        }
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("导入jsd文件");
    }
}
