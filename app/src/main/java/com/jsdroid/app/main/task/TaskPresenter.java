package com.jsdroid.app.main.task;

import com.jsdroid.app.entity.Plan;
import com.jsdroid.app.jsd.BaseManager;
import com.jsdroid.app.jsd.JsdPlan;
import com.jsdroid.mvp.presenter.BasePresenter;

import java.util.List;

class TaskPresenter extends BasePresenter<TaskPage> implements BaseManager.Listener {
    @Override
    protected void onCreate() {
        super.onCreate();
        loadPlans();
        JsdPlan.getInstance().addListener(this);
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        JsdPlan.getInstance().removeListener(this);
    }

    @Override
    public void onChanged() {
        loadPlans();
    }

    private void loadPlans() {
        List<Plan> list = JsdPlan.getInstance().list();
        getView().showPlans(list);

    }
}
