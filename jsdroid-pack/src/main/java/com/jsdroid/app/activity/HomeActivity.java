package com.jsdroid.app.activity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.mvp.view.BaseActivity;

import butterknife.BindView;

/**
 * 请求文件读写权限
 */
public class HomeActivity extends BaseActivity<HomeActivity, HomePresenter> {
    @BindView(R.id.appName)
    TextView appName;

    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    protected HomeActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            CharSequence appName = getPackageManager().getApplicationLabel(packageInfo.applicationInfo);
            this.appName.setText(appName);
        } catch (PackageManager.NameNotFoundException e) {
        }
        install();
    }

    private void install() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    JsdTool.getInstance().install();
                    //加载类
                    try {
                        JsdTool.getInstance().getClassLoader().loadClass("MainView");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    open();
                } catch (Exception e) {
                    showError("提示", "加载错误：" + e.getMessage());
                }
            }
        }).start();


    }

    public void open() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ToolActivity.open(HomeActivity.this);
                finish();
            }
        });
    }

}
