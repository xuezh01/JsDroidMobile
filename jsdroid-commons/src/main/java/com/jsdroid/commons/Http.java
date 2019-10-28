package com.jsdroid.commons;

import android.os.Handler;
import android.os.Looper;

import com.alibaba.fastjson.JSON;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class Http {
    public static Handler handler;

    static {
        try {
            handler = new Handler(Looper.getMainLooper());
        } catch (Throwable e) {
        }
    }

    public interface Callback<T> {

        void onFailed(Throwable err);

        void onSuccess(T data);

    }

    private Connection connect;

    public Connection getConnect() {
        return connect;
    }

    public static Http get(String url) {
        return new Http(url);
    }

    public static Http post(String url) {
        return new Http(url).post();
    }

    private Http post() {
        connect.method(Connection.Method.POST);
        return this;
    }

    public Http(String url) {
        connect = Jsoup.connect(url).ignoreContentType(true).ignoreHttpErrors(true).followRedirects(true);
    }

    public Http timeout(int timeout) {
        connect.timeout(timeout);
        return this;
    }

    public Http header(String name, String value) {
        connect.header(name, value);
        return this;
    }

    public Http cookie(String name, String value) {
        connect.cookie(name, value);
        return this;
    }

    public Http cookies(Map cookies) {
        connect.cookies(cookies);
        return this;
    }

    public Http param(String name, String value) {
        connect.data(name, value);
        return this;
    }

    public Http body(String body) {
        connect.requestBody(body);
        return this;
    }

    public Http json(Object json) {
        body(JSON.toJSONString(json));
        return this;
    }

    public String string() throws IOException {
        return connect.execute().body();
    }

    public byte[] bytes() throws IOException {
        return connect.execute().bodyAsBytes();
    }


    public void save(String file) throws IOException {
        FileUtil.cpyStream(connect.execute().bodyStream(), new FileOutputStream(file));
    }

    public void string(final Http.Callback<String> callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final String body = string();
                    if (handler != null) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onSuccess(body);
                            }
                        });
                    } else {
                        callback.onSuccess(body);
                    }
                } catch (final Exception e) {
                    if (handler != null) {

                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailed(e);
                            }
                        });
                    } else {
                        callback.onFailed(e);
                    }
                }
            }
        }).start();
    }

    public void bytes(final Http.Callback<byte[]> callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final byte[] body = bytes();
                    if (handler != null) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onSuccess(body);
                            }
                        });
                    } else {
                        callback.onSuccess(body);
                    }
                } catch (final Exception e) {
                    if (handler != null) {

                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailed(e);
                            }
                        });
                    } else {
                        callback.onFailed(e);
                    }
                }
            }
        }).start();
    }

    public <T> T object(Class<T> clazz) throws IOException {
        String body = string();
        return JSON.parseObject(body, clazz);
    }

    public <T> void object(final Http.Callback<T> callback, final Class<T> clazz) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final T result = object(clazz);
                    if (handler != null) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onSuccess(result);
                            }
                        });
                    } else {
                        callback.onSuccess(result);
                    }
                } catch (final Exception e) {
                    if (handler != null) {

                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailed(e);
                            }
                        });
                    } else {
                        callback.onFailed(e);
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) {
    }

}