package com.yhao.floatwindow;

import android.view.View;

/**
 * Created by yhao on 17-11-14.
 * https://github.com/yhaolpz
 */

public abstract class FloatView {

    abstract void setSize(int width, int height);

    abstract void setView(View view);

    abstract void setGravity(int gravity, int xOffset, int yOffset);

    abstract void requestPermission();

    abstract void dismiss();

    abstract void setFlags(int flags);

    void updateXY(int x, int y) {
    }

    void updateX(int x) {
    }

    void updateY(int y) {
    }

    int getX() {
        return 0;
    }

    int getY() {
        return 0;
    }

}
