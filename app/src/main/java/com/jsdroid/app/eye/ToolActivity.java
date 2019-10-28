package com.jsdroid.app.eye;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;

import com.jsdroid.app.utils.Uris;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.ui.ViewScript;

import java.io.File;

public class ToolActivity extends BaseActivity<ToolActivity, ToolPresenter> implements JsDroidApp.IXmlViewer {
    @Override
    protected ToolPresenter createPresenter() {
        return new ToolPresenter();
    }

    @Override
    protected ToolActivity createView() {
        return this;
    }

    @Override
    protected void onResume() {
        super.onResume();
        JsDroidApp.getInstance().setXmlViewer(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String pkg = getIntent().getStringExtra("pkg");
        Uri data = getIntent().getData();
        if (pkg != null) {
            getPresenter().loadScript(pkg);
        } else if (data != null) {
            //安装
            File file;
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
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        ViewScript viewScript = getPresenter().getViewScript();

        if (viewScript != null && viewScript.fireKeyDown(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public static void openTool(Context context, String pkg) {
        Intent intent = new Intent(context, ToolActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("pkg", pkg);
        context.startActivity(intent);
    }

    @Override
    public void showXml(String xml) {
        getPresenter().showXml(xml);
    }
}
