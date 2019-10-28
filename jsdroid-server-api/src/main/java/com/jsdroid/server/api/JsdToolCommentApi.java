package com.jsdroid.server.api;

import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdToolComment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;

/**
 * 添加回复，删除回复
 */
public interface JsdToolCommentApi {
    @FormUrlEncoded
    @POST("tool/comment/add")
    Call<AjaxResult> add(@Field("toolId") Integer id, @Field("content") String content);

    @FormUrlEncoded
    @POST("tool/comment/remove")
    Call<AjaxResult> remove(@Field("ids") String ids);

    @GET("tool/comment/list?orderByColumn=createTime&isAsc=desc")
    Call<List<JsdToolComment>> list(@Query("toolId") int toolId, @Query("pageNum") int pageNum, @Query("pageSize") int pageSize);

}
