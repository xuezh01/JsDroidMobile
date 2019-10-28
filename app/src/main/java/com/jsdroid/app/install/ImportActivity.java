package com.jsdroid.app.install;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;

import java.io.File;
import java.util.List;

import butterknife.BindView;

public abstract class ImportActivity extends BaseActivity<ImportActivity, ImportPresenter> {

    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.listView)
    ListView listView;
    SelectAdapter selectAdapter;
    @BindView(R.id.btnImport)
    QMUIRoundButton btnImport;

    @Override
    protected ImportPresenter createPresenter() {
        return new ImportPresenter();
    }

    @Override
    protected ImportActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activit_import;
    }

    CheckBox checkSelectAll;

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle(getTile());
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkSelectAll = new CheckBox(this);
        checkSelectAll.setButtonDrawable(R.drawable.check_white);
        checkSelectAll.setTextColor(Color.WHITE);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_VERTICAL);
        int dp5 = QMUIDisplayHelper.dp2px(this, 10);
        params.setMargins(dp5, dp5, dp5, dp5);
        topBar.addRightView(checkSelectAll, 1231, params);
        checkSelectAll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                selectAdapter.selectAll(isChecked);
            }
        });
    }


    @Override
    protected void initAdapters() {
        super.initAdapters();
        selectAdapter = new SelectAdapter(this);
        listView.setAdapter(selectAdapter);
    }


    public void addFile(File file) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                selectAdapter.addData(new SelectAdapter.SelectItem(file, false));
                selectAdapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().loadFiles();
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnImport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onImportFiles(selectAdapter.getSelectItems());
            }
        });

    }

    public abstract String getTile();

    public abstract String getFileType();

    public abstract void onImportFiles(List<File> files);

}
