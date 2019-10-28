package com.jsdroid.app.project.render;

import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.project.ProjectListPresenter;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

import java.io.File;

public class ProjectItemRender extends DataAdapter.DataRender {
    ProjectListPresenter presenter;

    public ProjectItemRender(ProjectListPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public int getLayoutId() {
        return R.layout.simple_project_item_render;
    }

    @Override
    public boolean canFillData(Object data) {
        return data instanceof Project;
    }

    @Override
    public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {

        final Project project = (Project) data;
        ImageView img_icon = viewHolder.getView(R.id.img_icon);
        File file = new File(project.getFile(), "icon.png");
        if (file.exists()) {
            img_icon.setImageBitmap(BitmapFactory.decodeFile(file.getPath()));
        } else {
            img_icon.setImageResource(R.drawable.logo_blue_dark);
        }

        View btn_delete = viewHolder.getView(R.id.btn_delete);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QMUIDialog.MessageDialogBuilder builder = new QMUIDialog.MessageDialogBuilder(v.getContext());
                builder.setMessage("确定删除工程：" + project.name + "?");
                builder.setTitle("删除工程");
                builder.addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                });
                builder.addAction("确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        JsdProject.getInstance().deleteProject(project);
                        presenter.getView().showInfo("删除成功！");
                    }
                });
                builder.create().show();
            }
        });
        TextView tv_project_name = viewHolder.getView(R.id.tv_project_name);
        tv_project_name.setText(project.name);
        TextView tv_project_pkg = viewHolder.getView(R.id.tv_project_pkg);
        tv_project_pkg.setText(project.pkg);
        viewHolder.getContentView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.openProject(project);
            }
        });
    }


}
