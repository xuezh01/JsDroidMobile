package com.jsdroid.thread;

public interface Function<From, To> {
    To apply(From data) throws Throwable;
}
