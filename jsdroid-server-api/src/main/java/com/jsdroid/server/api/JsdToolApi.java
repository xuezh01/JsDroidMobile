package com.jsdroid.server.api;

import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdTool;

import java.util.List;
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

/**
 * 工具接口：列出最新工具、列出自己的工具列表、上传、
 */
public interface JsdToolApi {

    /**
     * 列出工具
     *
     * @return
     */
    @FormUrlEncoded
    @POST("tool/list")
    Call<List<JsdTool>> list(@Field("pageNum") Integer pageNum, @Field("pageSize") Integer pageSize);

    /**
     * 列出指定工具
     *
     * @return
     */
    @GET("tool/{id}")
    Call<JsdTool> getById(@Path("id") Integer id);

    /**
     * 列出自己的工具
     *
     * @return
     */
    @FormUrlEncoded
    @POST("tool/listSelf")
    Call<List<JsdTool>> listSelf(@Field("pageNum") Integer pageNum, @Field("pageSize") Integer pageSize);

    /**
     * 上传工具
     *
     * @param file PartFactory.create(name,file)
     * @return
     */
    @Multipart
    @POST("tool/upload")
    Call<AjaxResult> upload(@Part MultipartBody.Part file, @PartMap Map<String, RequestBody> params);

    /**
     * 删除工具
     *
     * @param ids
     * @return
     */
    @FormUrlEncoded
    @POST("tool/remove")
    Call<AjaxResult> remove(@Field("ids") String ids);

}
