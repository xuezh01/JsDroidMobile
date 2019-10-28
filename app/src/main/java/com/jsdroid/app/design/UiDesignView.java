package com.jsdroid.app.design;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseView;

import butterknife.BindView;

public class UiDesignView extends BaseView<UiDesignView, UiDesignPresenter> {
    public UiDesignView(Context context) {
        super(context);
    }

    @Override
    protected UiDesignPresenter createPresenter() {
        return new UiDesignPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.view_ui_design;
    }

    @Override
    protected void initViews() {
        super.initViews();
    }
}
