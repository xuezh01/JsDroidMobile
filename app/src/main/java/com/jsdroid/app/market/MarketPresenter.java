package com.jsdroid.app.market;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdTool;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class MarketPresenter extends BasePresenter<MarketActivity> {
    @Override
    protected void onCreate() {
        super.onCreate();
        refresh();
    }

    private int page = 1;

    public void refresh() {
        page = 1;
        loadMore(true);
    }

    public void loadMore() {
        loadMore(false);
    }

    private void loadMore(boolean clear) {
        Call<List<JsdTool>> list = JsdApi.getInstance().getJsdToolApi().list(page++, 10);
        list.enqueue(new Callback<List<JsdTool>>() {
            @Override
            public void onResponse(Call<List<JsdTool>> call, Response<List<JsdTool>> response) {
                List<JsdTool> tools = response.body();
                postCheckView(new Check<MarketActivity>() {
                    @Override
                    public void ok(MarketActivity view) {
                        if (tools != null && tools.size() > 0) {
                            view.addTools(tools, clear);
                        }
                        view.finishRefresh();
                    }
                });
            }

            @Override
            public void onFailure(Call<List<JsdTool>> call, Throwable t) {
                postCheckView(new Check<MarketActivity>() {
                    @Override
                    public void ok(MarketActivity view) {
                        view.showError("连接服务器失败！");
                        view.finishRefresh();
                    }
                });

            }
        });
    }
}
