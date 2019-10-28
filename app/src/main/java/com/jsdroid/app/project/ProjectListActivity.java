package com.jsdroid.app.project;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.project.demo.DemoProjectActivity;
import com.jsdroid.app.project.render.ProjectItemRender;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.widget.QMUITopBar;

import java.util.List;

import butterknife.BindView;

/**
 * 工程列表
 */
public class ProjectListActivity extends BaseActivity<ProjectListActivity, ProjectListPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    QMUIAlphaImageButton btnCreateProject;
    QMUIAlphaImageButton btnBack;
    @BindView(R.id.listView)
    ListView listView;
    View demoView;

    @Override
    protected ProjectListPresenter createPresenter() {
        return new ProjectListPresenter();
    }

    @Override
    protected ProjectListActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_project_list;
    }

    @Override
    protected void initViews() {
        initListView();
    }

    protected void initTopBar() {
        topBar.setTitle("工程列表");
        //关闭

        btnBack = topBar.addLeftBackImageButton();
        btnCreateProject = topBar.addRightImageButton(R.drawable.ic_add, 2);

    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnCreateProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(v.getContext(), v);
                popupMenu.inflate(R.menu.menu_project_list);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_create_project: {
                                //创建工程
                                getPresenter().createProject();
                                break;
                            }
                            case R.id.menu_import_project: {
                                //导入工程
                                getPresenter().importProject();
                                break;
                            }
                        }
                        return false;
                    }
                });
                MenuBuilder menuBuilder = (MenuBuilder) popupMenu.getMenu();
                menuBuilder.setOptionalIconsVisible(true);
                //对齐右边
                popupMenu.setGravity(Gravity.RIGHT);
                popupMenu.show();
            }
        });
        demoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoProjectActivity.open(ProjectListActivity.this);
            }
        });
    }

    DataAdapter dataAdapter;

    @Override
    protected void initAdapters() {
        super.initAdapters();
        dataAdapter = new DataAdapter(this);
        dataAdapter.addDataRender(new ProjectItemRender(getPresenter()));
        listView.setAdapter(dataAdapter);

    }

    void initListView() {
        demoView = LayoutInflater.from(this).inflate(R.layout.layout_project_list_header, null);
//        listView.addHeaderView(demoView);
    }


    @Override
    protected void fetchData() {
        super.fetchData();
        getPresenter().fetchProjects();
    }


    public void showProjects(List<Project> projects) {
        dataAdapter.setDatas(projects);
        dataAdapter.notifyDataSetChanged();
    }
}
