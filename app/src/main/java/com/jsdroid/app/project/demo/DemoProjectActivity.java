package com.jsdroid.app.project.demo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.project.render.ProjectItemRender;
import com.jsdroid.app.view.LoadListView;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdDemoProject;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.pullRefreshLayout.QMUIPullRefreshLayout;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;

public class DemoProjectActivity extends BaseActivity<DemoProjectActivity, DemoProjectPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    QMUIAlphaImageButton btnBack;
    @BindView(R.id.listView)
    LoadListView listView;
    @BindView(R.id.refreshLayout)
    QMUIPullRefreshLayout refreshLayout;

    @Override
    protected DemoProjectPresenter createPresenter() {
        return new DemoProjectPresenter();
    }

    @Override
    protected DemoProjectActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_demo_project;
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, DemoProjectActivity.class));
    }


    protected void initTopBar() {
        topBar.setTitle("示例");
        //关闭
        btnBack = topBar.addLeftBackImageButton();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    DataAdapter dataAdapter;

    @Override
    protected void initAdapters() {
        super.initAdapters();
        dataAdapter = new DataAdapter(this);
        dataAdapter.addDataRender(new DemoProjectItemRender());
        listView.setAdapter(dataAdapter);
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

    public void showDemos(List<JsdDemoProject> projects, boolean clear) {
        if (clear) {
            dataAdapter.clear();
        }
        for (JsdDemoProject project : projects) {
            dataAdapter.addData(project);
        }
        dataAdapter.notifyDataSetChanged();
    }

    class DemoProjectItemRender extends DataAdapter.DataRender {


        @Override
        public int getLayoutId() {
            return R.layout.demo_project_item_render;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof JsdDemoProject;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            final JsdDemoProject project = (JsdDemoProject) data;
            ImageView img_icon = viewHolder.getView(R.id.img_icon);
            Picasso.with(img_icon.getContext()).load(JsdApi.getOssUrl(project.getIcon())).placeholder(R.drawable.logo_blue_dark)
                    .into(img_icon);
            TextView tv_project_name = viewHolder.getView(R.id.tv_project_name);
            tv_project_name.setText(project.getName());
            viewHolder.getContentView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getPresenter().createProject(project);
                }
            });
        }


    }

}
