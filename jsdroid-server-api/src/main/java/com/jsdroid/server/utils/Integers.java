package com.jsdroid.server.utils;

public class Integers {
    public static int value(Integer integer) {
        if (integer == null) {
            return 0;
        }
        return integer;
    }

    public static String toString(Integer integer) {
        if (integer == null) {
            return "0";
        }
        return integer.toString();
    }
}
