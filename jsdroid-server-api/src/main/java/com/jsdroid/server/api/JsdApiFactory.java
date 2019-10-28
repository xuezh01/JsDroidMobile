package com.jsdroid.server.api;

import android.content.Context;

import com.alibaba.fastjson.JSON;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.jsdroid.server.Config;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class JsdApiFactory {


    static public class FastJsonConverterFactory extends Converter.Factory {

        public static FastJsonConverterFactory create() {
            return new FastJsonConverterFactory();
        }

        /**
         * 需要重写父类中responseBodyConverter，该方法用来转换服务器返回数据
         */
        @Override
        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
            return new FastJsonResponseBodyConverter<>(type);
        }

        /**
         * 需要重写父类中responseBodyConverter，该方法用来转换发送给服务器的数据
         */
        @Override
        public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
            return new FastJsonRequestBodyConverter<>();
        }

    }

    static public class FastJsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
        private final Type type;

        public FastJsonResponseBodyConverter(Type type) {
            this.type = type;
        }

        /*
         * 转换方法
         */
        @Override
        public T convert(ResponseBody value) throws IOException {
            BufferedSource bufferedSource = Okio.buffer(value.source());
            String tempStr = bufferedSource.readUtf8();
            bufferedSource.close();
            return JSON.parseObject(tempStr, type);

        }
    }

    static public class FastJsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
        private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

        @Override
        public RequestBody convert(T value) throws IOException {
            return RequestBody.create(MEDIA_TYPE, JSON.toJSONBytes(value));
        }
    }

    private OkHttpClient okHttpClient;
    private Retrofit retrofit;

    private SetCookieCache setCookieCache;
    private SharedPrefsCookiePersistor sharedPrefsCookiePersistor;

    public JsdApiFactory(Context context) {
        setCookieCache = new SetCookieCache();

        sharedPrefsCookiePersistor = new SharedPrefsCookiePersistor(context);
        ClearableCookieJar cookieJar =
                new PersistentCookieJar(setCookieCache, sharedPrefsCookiePersistor);
        //自动保存cookie
        okHttpClient = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .build();

        retrofit = new Retrofit.Builder().baseUrl(Config.API_URL)
                .addConverterFactory(FastJsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public void clearCache() {
        setCookieCache.clear();
        sharedPrefsCookiePersistor.clear();
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public <T> T createApi(Class<T> clazz) {
        return retrofit.create(clazz);
    }


}
