package com.jsdroid.commons;

import com.android.api.Inputs;

import java.util.List;

public class InputUtil {


    public static List<String> list() {
        return Inputs.list();
    }

    public static void setIME(String id) {
        Inputs.setIME(id);
    }

}
