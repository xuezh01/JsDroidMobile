package com.jsdroid.server.api;

import android.content.Context;
import android.content.SharedPreferences;

import com.alibaba.fastjson.JSON;
import com.jsdroid.server.Config;
import com.jsdroid.server.bean.JsdDemoProject;
import com.jsdroid.server.bean.JsdUser;

import java.io.IOException;

public class JsdApi {
    private JsdApiFactory factory;
    private JsdToolApi jsdToolApi;
    private JsdUserApi jsdUserApi;
    private JsdToolCommentApi jsdToolCommentApi;
    private JsdToolZanApi jsdToolZanApi;
    private JsdToolDownApi jsdToolDownApi;
    private JsdDemoApi jsdDemoApi;
    private Context context;

    private JsdApi(Context context) {
        this.context = context;
        factory = new JsdApiFactory(context);
        jsdToolApi = factory.createApi(JsdToolApi.class);
        jsdUserApi = factory.createApi(JsdUserApi.class);
        jsdToolCommentApi = factory.createApi(JsdToolCommentApi.class);
        jsdToolZanApi = factory.createApi(JsdToolZanApi.class);
        jsdToolDownApi = factory.createApi(JsdToolDownApi.class);
        jsdDemoApi = factory.createApi(JsdDemoApi.class);
    }

    public static void init(Context context) {
        instance = new JsdApi(context);
    }

    public static void init(Context context, String host) {
        instance = new JsdApi(context);
        Config.HOST = host;
    }

    private static JsdApi instance;

    public static JsdApi getInstance() {
        return instance;
    }

    public JsdToolApi getJsdToolApi() {
        return jsdToolApi;
    }

    public JsdUserApi getJsdUserApi() {
        return jsdUserApi;
    }

    public JsdToolCommentApi getJsdToolCommentApi() {
        return jsdToolCommentApi;
    }

    public JsdToolZanApi getJsdToolZanApi() {
        return jsdToolZanApi;
    }

    public JsdToolDownApi getJsdToolDownApi() {
        return jsdToolDownApi;
    }

    public JsdUser getLocalUser() {
        SharedPreferences userprofile = context.getSharedPreferences("user", 0);
        String profile = userprofile.getString("profile", null);
        if (profile == null) {
            return null;
        }
        return JSON.parseObject(profile, JsdUser.class);
    }

    public void saveLocalUser(JsdUser user) {
        SharedPreferences userprofile = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor edit = userprofile.edit();
        edit.putString("profile", JSON.toJSONString(user));
        edit.commit();
    }

    public void removeLocalUser() {
        SharedPreferences userprofile = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor edit = userprofile.edit();
        edit.remove("profile");
        edit.commit();
        //删除cookie
        factory.clearCache();
    }

    public static String getAvatarUrl(String avatar) {
        return Config.PROFILE_URL + "avatar/" + avatar;
    }

    public static String getOssUrl(String icon) {
        return Config.OSS_URL + icon;
    }

    public JsdDemoApi getJsdDemoApi() {
        return jsdDemoApi;
    }
}
