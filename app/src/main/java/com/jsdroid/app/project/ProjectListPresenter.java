package com.jsdroid.app.project;

import android.content.Intent;

import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.install.ImportProjectActivity;
import com.jsdroid.app.install.ImportToolActivity;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.project.create.CreateProjectActivity;
import com.jsdroid.mvp.presenter.BasePresenter;

import java.util.List;

public class ProjectListPresenter extends BasePresenter<ProjectListActivity> implements JsdProject.ProjectListener {

    public void createProject() {
        getView().startActivity(new Intent(getView(), CreateProjectActivity.class));
    }

    @Override
    protected void onCreate() {
        super.onCreate();

        JsdProject.getInstance().addProjectListener(this);
    }

    public void fetchProjects() {
        List<Project> projects = Db.getInstance().getDaoSession().getProjectDao().loadAll();
        getView().showProjects(projects);
    }

    @Override
    public void onProjectChanged() {
        fetchProjects();
    }

    @Override
    public void onOpenProject(Project project) {

    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        JsdProject.getInstance().removeProjectListener(this);
    }

    public void openProject(Project project) {
        JsdProject.getInstance().openProject(getView(), project);

    }

    public void importProject() {
        ImportProjectActivity.open(getView());
    }
}
