package com.jsdroid.check;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.R;


public class JsdCheckActivity extends BaseActivity<JsdCheckActivity, JsdCheckPresenter> {
    TextView textLoading;
    JsdCheckThread jsdCheckThread;

    @Override
    protected JsdCheckPresenter createPresenter() {
        return new JsdCheckPresenter();
    }

    @Override
    protected JsdCheckActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_jsd_install;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jsdCheckThread = new JsdCheckThread(this);
        jsdCheckThread.addStep(new WifiPortCheckStep());
        jsdCheckThread.addStep(new ShellPortCheckStep());
        jsdCheckThread.addStep(new ShellCheckStep());
        jsdCheckThread.start();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            jsdCheckThread.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void initViews() {
        super.initViews();
        textLoading = findViewById(R.id.textLoading);
    }

}
