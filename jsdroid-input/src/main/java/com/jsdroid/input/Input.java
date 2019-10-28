package com.jsdroid.input;

import android.inputmethodservice.InputMethodService;

public class Input extends InputMethodService {
    private static Input instance;

    public static Input getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public void clear(int before, int after) {
        getCurrentInputConnection().deleteSurroundingText(before, after);
    }

    public void input(String text) {
        getCurrentInputConnection().commitText(text, 0);
    }
}
