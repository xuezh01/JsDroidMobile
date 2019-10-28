package com.jsdroid.thread;


public interface End<To> {
    void onEnd(StepThread stepThread, To to);

    void onError(StepThread stepThread, Throwable err);
}
