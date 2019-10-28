package com.jsdroid.app.login;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdUser;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class LoginPresenter extends BasePresenter<LoginActivity> {
    public void login(String username, String password) {
        checkView(new Check<LoginActivity>() {
            @Override
            public void ok(LoginActivity view) {
                QMUITipDialog loading = view.showLoading("正在登录...");
                loading.setCancelable(false);
                JsdApi.getInstance().getJsdUserApi().login(username, password, true).enqueue(new Callback<AjaxResult>() {
                    @Override
                    public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                        loading.dismiss();
                        AjaxResult body = response.body();
                        if (body.getCode() == AjaxResult.Type.SUCCESS.value()) {
                            fetchProfile();
                        } else {
                            postCheckView(new Check<LoginActivity>() {
                                @Override
                                public void ok(LoginActivity view) {
                                    view.showError("登录失败：" + body.getMsg());
                                }
                            });
                        }
                    }

                    @Override
                    public void onFailure(Call<AjaxResult> call, Throwable t) {
                        loading.dismiss();
                        postCheckView(new Check<LoginActivity>() {
                            @Override
                            public void ok(LoginActivity view) {
                                view.showError("连接服务器失败！");
                            }
                        });
                    }
                });
            }
        });


    }

    private void fetchProfile() {
        postCheckView(new Check<LoginActivity>() {
            @Override
            public void ok(LoginActivity view) {
                QMUITipDialog loading = view.showLoading("正在获取用户资料...");
                loading.setCancelable(false);
                JsdApi.getInstance().getJsdUserApi().profile().enqueue(new Callback<JsdUser>() {
                    @Override
                    public void onResponse(Call<JsdUser> call, Response<JsdUser> response) {
                        loading.dismiss();
                        JsdUser localUser = response.body();
                        JsdApi.getInstance().saveLocalUser(localUser);
                        postCheckView(new Check<LoginActivity>() {
                            @Override
                            public void ok(LoginActivity view) {
                                //获取资料成功
                                view.finish();
                            }
                        });
                    }

                    @Override
                    public void onFailure(Call<JsdUser> call, Throwable t) {
                        loading.dismiss();
                        postCheckView(new Check<LoginActivity>() {
                            @Override
                            public void ok(LoginActivity view) {
                                //结束
                                view.showError("连接服务器失败！");
                            }
                        });
                    }
                });
            }
        });


    }
}
