package com.jsdroid.app.project.dev;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.jsdroid.app.design.prop.PropListView;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.mvp.view.BaseView;

public class ConfigView extends BaseView<ConfigView, BasePresenter<ConfigView>> {
    public ConfigView(Context context) {
        super(context);
    }

    public ConfigView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

}
