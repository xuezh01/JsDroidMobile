package com.jsdroid.app.pager;

import android.content.Context;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.mvp.view.BaseView;

public abstract class Page<V, P extends BasePresenter<V>> extends BaseView<V, P> {
    public Page(Context context) {
        super(context);
    }

    public void onScroll() {

    }
}
