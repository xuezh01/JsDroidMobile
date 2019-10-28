package com.jsdroid.app.main.home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseView;

import butterknife.BindView;

/**
 * 截图 工程 教程
 */
public class TopView extends BaseView<TopView, TopPresenter> implements View.OnClickListener {
    @BindView(R.id.btnProject)
    View btnProject;
    @BindView(R.id.btnCapture)
    View btnCapture;
    @BindView(R.id.btnMarket)
    View btnMarket;

    public TopView(Context context) {
        super(context);
    }

    @Override
    protected void initLayoutParams() {
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    protected TopPresenter createPresenter() {
        return new TopPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_top_view;
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnCapture.setOnClickListener(this);
        btnProject.setOnClickListener(this);
        btnMarket.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCapture:
                getPresenter().openCaptureView();
                break;
            case R.id.btnProject:
                getPresenter().openProjectView();
                break;
            case R.id.btnMarket:
                getPresenter().openMarketView();
                break;
        }
    }
}
