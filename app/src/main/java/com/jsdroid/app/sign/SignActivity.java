package com.jsdroid.app.sign;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;

public class SignActivity extends BaseActivity<SignActivity, SignPresenter> {
    @Override
    protected SignPresenter createPresenter() {
        return new SignPresenter();
    }

    @Override
    protected SignActivity createView() {
        return this;
    }

    @BindView(R.id.topBar)
    QMUITopBar topBar;

    @BindView(R.id.edit_username)
    MaterialEditText editUsername;
    @BindView(R.id.edit_password)
    MaterialEditText editPassword;
    @BindView(R.id.edit_repassword)
    MaterialEditText editRePassword;
    @BindView(R.id.btn_login)
    QMUIRoundButton btnLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sign;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("注册");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().sign(editUsername.getText().toString(), editPassword.getText().toString(), editRePassword.getText().toString());
            }
        });
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, SignActivity.class));
    }
}
