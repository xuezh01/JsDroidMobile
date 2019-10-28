package com.jsdroid.server.api;

import com.jsdroid.server.bean.AjaxResult;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 用户下载统计
 */
public interface JsdToolDownApi {
    /**
     * 用户下载
     *
     * @param toolId
     * @return
     */
    @FormUrlEncoded
    @POST("tool/download/add")
    Call<AjaxResult> add(@Field("toolId") Integer toolId);
}
