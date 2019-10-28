package com.jsdroid.api.mannager;

import android.content.Context;
import android.content.SharedPreferences;

public class ConfigManager {
    private static ConfigManager instance = new ConfigManager();

    public static ConfigManager getInstance() {
        return instance;
    }

    private SharedPreferences sharedPreferences;

    private ConfigManager() {
    }

    public void init(Context context) {
        sharedPreferences = context.getSharedPreferences("config", 0);
    }

    public synchronized void saveString(String name, String value) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(name, value);
        edit.commit();
    }

    public synchronized void saveInt(String name, int value) {
        saveString(name, value + "");
    }

    public synchronized void saveBoolean(String name, boolean value) {
        saveString(name, value + "");
    }


    public synchronized String readString(String name) {
        return sharedPreferences.getString(name, null);
    }

    public synchronized boolean readBoolean(String name) {
        try {
            return Boolean.parseBoolean(readString(name));
        } catch (Exception e) {
            return false;
        }
    }

    public synchronized int readInt(String name) {
        try {
            return Integer.parseInt(readString(name));
        } catch (Exception e) {
            return 0;
        }
    }

    public synchronized boolean contains(String name) {
        return sharedPreferences.contains(name);
    }
}
