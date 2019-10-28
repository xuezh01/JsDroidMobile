package com.jsdroid.app.profile;

import android.util.Log;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdUser;
import com.jsdroid.server.utils.PartFactory;

import java.io.File;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class ProfilePresenter extends BasePresenter<ProfileActivity> {

    public void refresh() {
        JsdApi.getInstance().getJsdUserApi().profile().enqueue(new Callback<JsdUser>() {
            @Override
            public void onResponse(Call<JsdUser> call, Response<JsdUser> response) {
                //更新资料成功
                JsdUser body = response.body();
                if (body != null) {
                    JsdApi.getInstance().saveLocalUser(body);
                }
                postCheckView(new Check<ProfileActivity>() {
                    @Override
                    public void ok(ProfileActivity view) {
                        view.initProfiles();
                        view.finishRefresh();
                    }
                });
            }

            @Override
            public void onFailure(Call<JsdUser> call, Throwable t) {
                postCheckView(new Check<ProfileActivity>() {
                    @Override
                    public void ok(ProfileActivity view) {
                        view.finishRefresh();
                    }
                });
            }
        });
    }

    public void updateAvatar(String path) {
        JsdApi.getInstance().getJsdUserApi().updateAvatar(PartFactory.createPart("file", new File(path)))
                .enqueue(new Callback<AjaxResult>() {
                    @Override
                    public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {

                        postCheckView(new Check<ProfileActivity>() {
                            @Override
                            public void ok(ProfileActivity view) {
                                //修改头像成功之后更新用户资料
                                refresh();
                            }
                        });
                    }

                    @Override
                    public void onFailure(Call<AjaxResult> call, Throwable t) {

                    }
                });
    }
}
