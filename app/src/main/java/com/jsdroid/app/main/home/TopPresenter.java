package com.jsdroid.app.main.home;

import android.content.Intent;

import com.jsdroid.app.capture.CaptureListActivity;
import com.jsdroid.app.doc.DocActivity;
import com.jsdroid.app.market.MarketActivity;
import com.jsdroid.app.project.ProjectListActivity;
import com.jsdroid.mvp.presenter.BasePresenter;

class TopPresenter extends BasePresenter<TopView> {
    public void openProjectView() {
        Intent intent = new Intent(getView().getContext(), ProjectListActivity.class);
        getView().getContext().startActivity(intent);
    }

    public void openCaptureView() {
        CaptureListActivity.open(getView().getContext());
    }

    public void openMarketView() {
        if (true) {
            getView().showError("普通版不能打开市场！");
            return;
        }
        MarketActivity.open(getView().getContext());
    }
}
