package com.jsdroid.app.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.KeyEvent;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.ui.ViewScript;
import com.jsdroid.ui.closure.XmlActivity;

import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

public class ToolActivity extends BaseActivity<ToolActivity, ToolPresenter> {
    @Override
    protected ToolPresenter createPresenter() {
        return new ToolPresenter();
    }

    @Override
    protected ToolActivity createView() {
        return this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载tool
        try {
            Class<?> mainView = JsdTool.getInstance().getClassLoader().loadClass("MainView");
            ViewScript viewScript = (ViewScript) mainView.newInstance();
            viewScript.activity = this;
            String pkg = getPackageName();
            viewScript.jsdContext = JsdContext.getInstance(pkg);
            viewScript.jsdContext.addDirectory(JsdTool.getInstance().getSourceDir(pkg));
            viewScript.dir = JsdTool.getInstance().getInstallDir(pkg);
            viewScript.pkg = pkg;
            viewScript.app = new ViewScript.IApp() {
                @Override
                public void showFloatMenu() {
                    JsdOption.getInstance().setShowFloatMenu(true);
                }

                @Override
                public void hideFloatMenu() {
                    JsdOption.getInstance().setShowFloatMenu(false);
                }

            };
            getPresenter().setViewScript(viewScript);
            JsDroidApp.getInstance().addViewScript(viewScript);
            viewScript.run();
            viewScript.fireCreate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, PERMISSIONS_STORAGE, 111);
            }
        }
    }

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        ViewScript viewScript = getPresenter().getViewScript();
        if (viewScript != null && viewScript.fireKeyDown(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public static void open(HomeActivity homeActivity) {
        homeActivity.startActivity(new Intent(homeActivity, ToolActivity.class));
    }


}
