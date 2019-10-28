package com.jsdroid.app.project.create;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;

public class CreateProjectActivity extends BaseActivity<CreateProjectActivity, CreateProjectPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    QMUIAlphaImageButton btnOk;
    QMUIAlphaImageButton btnBack;
    @BindView(R.id.icon)
    ImageView icon;
    @BindView(R.id.edit_icon)
    MaterialEditText editIcon;
    @BindView(R.id.edit_name)
    MaterialEditText editName;
    @BindView(R.id.edit_pkg)
    MaterialEditText editPkg;
    @BindView(R.id.edit_note)
    MaterialEditText editNote;

    @Override
    protected CreateProjectPresenter createPresenter() {
        return new CreateProjectPresenter();
    }

    @Override
    protected CreateProjectActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.view_create_project;
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
    }

    @Override
    protected void initTopBar() {
        topBar.setTitle("创建工程");
        btnBack = topBar.addLeftBackImageButton();
        btnOk = topBar.addRightImageButton(R.drawable.icon_ok, 1);
        btnOk.setColorFilter(Color.WHITE);
    }

    @Override
    protected void bindEvents() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().createProject();
            }
        });
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });

    }

    @Override
    protected void initViews() {
        super.initViews();
        editPkg.setText("com.example.time" + System.currentTimeMillis());
    }

    public void selectImage() {
        startActivityForResult(new Intent(this, TakePhoto.class), 1);
    }

    public void selectImage(String path) {
        editIcon.setText(path);
        //显示图片
        icon.setImageBitmap(BitmapFactory.decodeFile(path));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == TakePhoto.SUCCESS) {
                    String image = data.getStringExtra("image");
                    selectImage(image);
                }
                break;
        }
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, CreateProjectActivity.class));
    }
}
