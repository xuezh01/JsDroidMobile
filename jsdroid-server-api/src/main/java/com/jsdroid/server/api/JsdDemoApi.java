package com.jsdroid.server.api;

import com.jsdroid.server.bean.JsdDemoProject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsdDemoApi {
    @GET("demo/list")
    Call<List<JsdDemoProject>> list(@Query("pageNum") int pageNum, @Query("pageSize") int pageSize);
}
