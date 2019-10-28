package com.jsdroid.app.project.create;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jsdroid.app.utils.Uris;
import com.jsdroid.mvp.view.BaseActivity;

import java.io.File;
import java.io.IOException;

public class ImportProjectActivity extends BaseActivity<ImportProjectActivity, ImportProjectPresenter> {
    @Override
    protected ImportProjectPresenter createPresenter() {
        return new ImportProjectPresenter();
    }

    @Override
    protected ImportProjectActivity createView() {
        return this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String projectFile = getIntent().getStringExtra("file");
        if (projectFile != null) {
            try {
                getPresenter().importProject(projectFile);
            } catch (IOException e) {
                finish();
            }
        } else {
            //导入工程
            Uri data = getIntent().getData();
            if (data != null) {
                //安装
                File file = null;
                try {
                    file = Uris.getFileFromUri(this, data);
                    //安装项目
                    getPresenter().importProject(file);
                } catch (Exception e) {
                    getPresenter().showErrorAndFinish("提示", "导入错误：" + e.getMessage(), e.getMessage());
                }
            }
        }
    }
}
