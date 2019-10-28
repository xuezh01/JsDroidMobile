package com.jsdroid.app.login;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.jsdroid.app.R;
import com.jsdroid.app.sign.SignActivity;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;

public class LoginActivity extends BaseActivity<LoginActivity, LoginPresenter> {
    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected LoginActivity createView() {
        return this;
    }

    @BindView(R.id.topBar)
    QMUITopBar topBar;

    @BindView(R.id.edit_username)
    MaterialEditText editUsername;
    @BindView(R.id.edit_password)
    MaterialEditText editPassword;
    @BindView(R.id.btn_login)
    QMUIRoundButton btnLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("登录");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button button = topBar.addRightTextButton("注册", 1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignActivity.open(LoginActivity.this);
            }
        });
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().login(editUsername.getText().toString(), editPassword.getText().toString());
            }
        });
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
