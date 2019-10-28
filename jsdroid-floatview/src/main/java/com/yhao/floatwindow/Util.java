package com.yhao.floatwindow;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by yhao on 2017/12/22.
 * https://github.com/yhaolpz
 */

class Util {


    static View inflate(Context applicationContext, int layoutId) {
        LayoutInflater inflate = (LayoutInflater) applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return inflate.inflate(layoutId, null);
    }

    private static Point sPoint;

    static int getScreenWidth(Context context) {
//        if (sPoint == null) {
//            sPoint = new Point();
//            WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//            wm.getDefaultDisplay().getSize(sPoint);
//        }

//        return sPoint.x;
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    static int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            return resources.getDimensionPixelSize(resourceId);
        }
        return 0;
    }

    static int getScreenHeight(Context context) {
//        if (sPoint == null) {
//            sPoint = new Point();
//            WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//            wm.getDefaultDisplay().getSize(sPoint);
//        }
//        return sPoint.y;
        //屏幕方向变化大小也会变化
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    static boolean isViewVisible(View view) {
        return view.getGlobalVisibleRect(new Rect());
    }
}
