package com.jsdroid.server.api;

import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdToolZan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 用户点赞与取消点赞
 */
public interface JsdToolZanApi {
    @FormUrlEncoded
    @POST("tool/zan/add")
    Call<AjaxResult> add(@Field("toolId") Integer toolId);

    @FormUrlEncoded
    @POST("tool/zan/remove")
    Call<AjaxResult> remove(@Field("ids") String ids);

    @FormUrlEncoded
    @POST("tool/zan/list")
    Call<List<JsdToolZan>> list(@Field("toolId") int toolId);

}
