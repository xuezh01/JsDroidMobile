package com.jsdroid.app.sign;

import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.AjaxResult;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class SignPresenter extends BasePresenter<SignActivity> {
    public void sign(String username, String password, String rePassword) {
        checkView(new Check<SignActivity>() {
            @Override
            public void ok(SignActivity view) {
                QMUITipDialog loading = view.showLoading("正在注册...");
                loading.setCancelable(false);
                JsdApi.getInstance().getJsdUserApi().sign(username, password, rePassword).enqueue(new Callback<AjaxResult>() {
                    @Override
                    public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                        loading.dismiss();
                        AjaxResult body = response.body();
                        if (body.getCode() == AjaxResult.Type.SUCCESS.value()) {
                            //注册成功
                            signSuccess();
                        } else {
                            signFailed(body.getMsg());
                        }
                    }

                    @Override
                    public void onFailure(Call<AjaxResult> call, Throwable t) {
                        loading.dismiss();
                        signFailed("连接服务器失败！");
                    }
                });
            }
        });


    }

    private void signFailed(String message) {
        postCheckView(new Check<SignActivity>() {
            @Override
            public void ok(SignActivity view) {
                view.showError("注册失败：" + message);
            }
        });
    }

    private void signSuccess() {
        postCheckView(new Check<SignActivity>() {
            @Override
            public void ok(SignActivity view) {
                Dialogs.showDialog(view, "提示", "注册成功！", Dialogs.newAction(view,
                        "确定", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                                view.finish();
                            }
                        }));
            }
        });

    }
}
