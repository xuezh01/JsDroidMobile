package com.jsdroid.mvp.model;

public interface ILoadListener<T> {
    void onFailed(Throwable err, String msg);

    void onResult(T result);
}
