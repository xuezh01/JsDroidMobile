package com.jsdroid.app.market;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.market.tool.MarketToolActivity;
import com.jsdroid.app.view.LoadListView;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdTool;
import com.jsdroid.server.utils.Integers;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.pullRefreshLayout.QMUIPullRefreshLayout;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;

public class MarketActivity extends BaseActivity<MarketActivity, MarketPresenter> {


    @BindView(R.id.listView)
    LoadListView listView;
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    DataAdapter dataAdapter;
    @BindView(R.id.refreshLayout)
    QMUIPullRefreshLayout refreshLayout;
    QMUIAlphaImageButton btnSearch;

    @Override
    protected MarketPresenter createPresenter() {
        return new MarketPresenter();
    }

    @Override
    protected MarketActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_market;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("市场");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSearch = topBar.addRightImageButton(R.drawable.ic_search, 1);
        btnSearch.setColorFilter(Color.WHITE);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("未开放搜索！");
            }
        });
    }

    @Override
    protected void initViews() {
        super.initViews();
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
        dataAdapter = new DataAdapter(this);
        dataAdapter.addDataRender(new ToolRender());
        listView.setAdapter(dataAdapter);

    }


    public void addTools(List tools, boolean clear) {
        if (clear) {
            dataAdapter.clear();
        }
        for (Object tool : tools) {
            dataAdapter.addData(tool);
        }
        dataAdapter.notifyDataSetChanged();
    }


    @Override
    protected void bindEvents() {
        super.bindEvents();
        refreshLayout.setOnPullListener(new QMUIPullRefreshLayout.OnPullListener() {
            @Override
            public void onMoveTarget(int offset) {

            }

            @Override
            public void onMoveRefreshView(int offset) {

            }

            @Override
            public void onRefresh() {
                getPresenter().refresh();

            }
        });
        listView.setOnLoadListener(new LoadListView.OnLoadListener() {
            @Override
            public void onLoad(LoadListView loadListView) {
                getPresenter().loadMore();
            }
        });
    }

    public void finishRefresh() {
        refreshLayout.finishRefresh();
        listView.loadComplete();
    }

    class ToolRender extends DataAdapter.DataRender {

        @Override
        public int getLayoutId() {
            return R.layout.list_item_market_tool;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof JsdTool;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            final JsdTool tool = (JsdTool) data;
            DataAdapter.ViewTool viewTool = viewHolder.createViewTool();
            ImageView toolIcon = (ImageView) viewTool.findView(R.id.toolIcon);
            String ossUrl = JsdApi.getInstance().getOssUrl(tool.getIcon());
            Picasso.with(toolIcon.getContext()).load(ossUrl).placeholder(R.drawable.logo_blue_dark).into(toolIcon);
            viewTool.setText(R.id.toolName, tool.getName() + tool.getVersion());
            viewTool.setText(R.id.commentCount, Integers.toString(tool.getCommentCount()) + "评论");
            viewTool.setText(R.id.downloadCount, Integers.toString(tool.getDownloadCount()) + "下载");
            viewTool.setText(R.id.zanCount, Integers.toString(tool.getZanCount()) + "点赞");
            viewHolder.getContentView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MarketToolActivity.open(v.getContext(), tool.getId());
                }
            });

        }
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, MarketActivity.class));
    }
}
