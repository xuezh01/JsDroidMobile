package com.jsdroid.server.api;

import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdUser;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

public interface JsdUserApi {
    /**
     * 登录
     *
     * @param username
     * @param password
     * @param rememberMe
     * @return
     */
    @FormUrlEncoded
    @POST("user/login")
    Call<AjaxResult> login(@Field("username") String username, @Field("password") String password, @Field("rememberMe") boolean rememberMe);

    /**
     * 注册
     *
     * @param username
     * @param password
     * @param rePassword
     * @return
     */
    @FormUrlEncoded
    @POST("user/sign")
    Call<AjaxResult> sign(@Field("username") String username, @Field("password") String password, @Field("rePassword") String rePassword);

    /**
     * 资料
     *
     * @return
     */
    @GET("user/profile")
    Call<JsdUser> profile();

    /**
     * 资料
     *
     * @param userId
     * @return
     */
    @GET("user/profile/{userId}")
    Call<JsdUser> profile(@Path("userId") Long userId);

    /**
     * 检查是否登录
     *
     * @return
     */
    @GET("user/check")
    Call<AjaxResult> check();


    /**
     * 上传头像
     *
     * @param file PartFactory.create(name,file)
     * @return
     */
    @Multipart
    @POST("user/updateAvatar")
    Call<AjaxResult> updateAvatar(@Part MultipartBody.Part file);


}
