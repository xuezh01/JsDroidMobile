package com.jsdroid.app.option;

import android.content.Context;
import android.content.SharedPreferences;


import java.util.ArrayList;
import java.util.List;

public class JsdOption {


    public enum Key {
        SHOW_FLOAT_MENU, REBOOT_RUN, VOLUME_DOWN_CONTROL, KEEP_SCREEN, AUTO_UPDATE, SHOW_HELP
    }


    public interface OptionListener {
        void onOptionChanged(Key key, Object value);
    }

    private static JsdOption instance = new JsdOption();

    public static JsdOption getInstance() {
        return instance;
    }

    private List<OptionListener> optionListenerList;
    private Context context;


    private SharedPreferences option;

    private JsdOption() {

    }

    public void init(Context context) {
        this.context = context;
        optionListenerList = new ArrayList<>();
        option = context.getSharedPreferences("option", 0);
    }


    public void addOptionListener(OptionListener optionListener) {
        optionListenerList.add(optionListener);
    }

    public void removeOptionListener(OptionListener optionListener) {
        optionListenerList.remove(optionListener);
    }

    private void fireOptionChanged(Key key, Object value) {
        for (OptionListener optionListener : optionListenerList) {
            optionListener.onOptionChanged(key, value);
        }
    }

    public void putBoolean(Key key, boolean value) {
        SharedPreferences.Editor edit = option.edit();
        edit.putBoolean(key.name(), value);
        edit.apply();
        fireOptionChanged(key, value);
    }


    public boolean readBoolean(Key key) {
        return option.getBoolean(key.name(), false);
    }


    public void setShowFloatMenu(boolean showFloatMenu) {
        if (isShowFloatMenu() == showFloatMenu) {
            return;
        }
        putBoolean(Key.SHOW_FLOAT_MENU, showFloatMenu);
    }

    public boolean isShowFloatMenu() {
        return readBoolean(Key.SHOW_FLOAT_MENU);
    }

    public void setRebootRun(boolean state) {
        if (isRebootLaunch() == state) {
            return;
        }
        putBoolean(Key.REBOOT_RUN, state);
    }

    public boolean isRebootLaunch() {
        return readBoolean(Key.REBOOT_RUN);
    }

    public void setVolumeDownControl(boolean state) {
        if (isVolumeDownControl() == state) {
            return;
        }
        putBoolean(Key.VOLUME_DOWN_CONTROL, state);
    }

    public boolean isVolumeDownControl() {
        return readBoolean(Key.VOLUME_DOWN_CONTROL);
    }


    public void setKeepScreen(boolean state) {
        if (state == isKeepScreen()) {
            return;
        }
        putBoolean(Key.KEEP_SCREEN, state);
    }

    public boolean isKeepScreen() {
        return readBoolean(Key.KEEP_SCREEN);
    }

    public void setAutoUpdate(boolean state) {
        if (state == isAutoUpdate()) {
            return;
        }
        putBoolean(Key.AUTO_UPDATE, state);
    }

    public boolean isAutoUpdate() {
        return readBoolean(Key.AUTO_UPDATE);
    }

}
