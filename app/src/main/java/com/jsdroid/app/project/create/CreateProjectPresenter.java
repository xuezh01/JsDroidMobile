package com.jsdroid.app.project.create;

import android.content.DialogInterface;

import com.jsdroid.app.entity.Project;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

import java.io.File;
import java.io.IOException;

class CreateProjectPresenter extends BasePresenter<CreateProjectActivity> {
    public void createProject() {
        CreateProjectActivity view = getView();
        if (view == null) {
            return;
        }
        Project project = new Project();
        project.icon = view.editIcon.getText().toString().trim();
        project.name = view.editName.getText().toString().trim();
        project.pkg = view.editPkg.getText().toString().trim();
        project.file = new File(view.getFilesDir(), project.pkg).getPath();
        project.note = view.editNote.getText().toString();
        try {
            JsdProject.getInstance().createProject(project);
            openProject(project.pkg);

        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    private void openProject(String pkg) {
        Project project = JsdProject.getInstance().findProject(pkg);
        if (project != null) {
            JsdProject.getInstance().openProject(getView(), project);
        }
        getView().finish();
    }

}
