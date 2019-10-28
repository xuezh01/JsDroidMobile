package com.jsdroid.float_menu.window;

import android.content.Context;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

import com.jsdroid.float_menu.permission.FloatPermissionActivity;
import com.jsdroid.float_menu.window.view.FloatMainView;
import com.jsdroid.float_menu.window.view.FloatMenuView;

import java.util.List;


/**
 * 悬浮窗管理类
 *
 * @author toeii
 * @version 1.0.0.0
 * @date 2016/9/6
 * @path https://github.com/toeii/FloatWindow
 */
public class FloatMenuManager {

    public final int VIEW_MAIN = 0;
    public final int VIEW_HIDE = 1;
    public final int VIEW_REMIND = 2;
    public final int VIEW_MENU = 3;

    private static FloatMenuManager floatMenuManager;
    private Context context;
    private WindowManager windowManager;

    private FloatMainView floatMainView;
    private FloatMenuView floatMenuView;

    private static WindowManager.LayoutParams mWindowParams;

    private boolean isFullHide = false;//是否完全隐藏

    private FloatMenuManager(Context context) {
        this.context = context;
    }

    public void setWindowParams(WindowManager.LayoutParams mWindowParams) {
        FloatMenuManager.mWindowParams = mWindowParams;
    }

    public static FloatMenuManager getInstance(Context context) {
        if (null == floatMenuManager) {
            floatMenuManager = new FloatMenuManager(context);
        }
        return floatMenuManager;
    }

    //初始化窗口管理器
    public WindowManager getWindowManager() {
        if (windowManager == null) {
            windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        }
        return windowManager;
    }

    //初始化悬浮窗参数
    public WindowManager.LayoutParams getLayoutParams(int type) {
        WindowManager.LayoutParams wmLayoutParams = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            wmLayoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            wmLayoutParams.type = WindowManager.LayoutParams.TYPE_PHONE;
        }
        wmLayoutParams.format = PixelFormat.RGBA_8888;
        wmLayoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS;
        wmLayoutParams.flags = wmLayoutParams.flags | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;
        wmLayoutParams.alpha = 1.0f;

        if (type == VIEW_MAIN || type == VIEW_MENU) {
            wmLayoutParams.gravity = Gravity.LEFT | Gravity.TOP; // 调整悬浮窗口至左上角
            wmLayoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
            wmLayoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
//            wmLayoutParams.height = ScreenUtils.dip2px(context, 48);
        }
        // 以屏幕左上角为原点，设置x、y初始值
        wmLayoutParams.x = 0;
        wmLayoutParams.y = 0;
        return wmLayoutParams;
    }

    public void setIsFullHide(boolean isFullHide) {
        this.isFullHide = isFullHide;
    }

    //判断悬浮窗是否存在
    public boolean isShowing() {
        return floatMainView != null || floatMenuView != null;
    }

    //显示悬浮窗
    public void show() {
        FloatPermissionActivity.requestPermission(context, new FloatPermissionActivity.PermissionListener() {
            @Override
            public void onSuccess() {
                setIsFullHide(false);
                createMainWindow(context);
                registerSensorEventListener();

            }
        });
    }

    //销毁悬浮窗
    public void hide() {
        setIsFullHide(true);
        removeMainWindow();
        unregisterSensorEventListener();
    }

    //创建主窗
    public void createMainWindow(Context context) {
        if (isFullHide) {
            return;
        }
        WindowManager windowManager = getWindowManager();
        floatMainView = new FloatMainView(context.getApplicationContext());
        if (logo != null) {
            floatMainView.setLogo(logo);
        }
        if (null == mWindowParams) {
            mWindowParams = getLayoutParams(VIEW_MAIN);
        }
        floatMainView.setWindowParams(mWindowParams);
        try {
            windowManager.addView(floatMainView, mWindowParams);
        } catch (Exception e) {
        }
    }

    //创建菜单窗
    public void createMenuWindow(Context context) {
        WindowManager windowManager = getWindowManager();
        if (null == floatMenuView) {
            floatMenuView = new FloatMenuView(context, floatMenus);
        }
        floatMenuView.setVisibility(View.GONE);
        try {
            windowManager.addView(floatMenuView, getLayoutParams(VIEW_MENU));
        } catch (Exception e) {
        }

    }


    //移除主窗
    public void removeMainWindow() {
        if (null == floatMainView) {
            return;
        }
        WindowManager windowManager = getWindowManager();
        try {
            windowManager.removeView(floatMainView);
            floatMainView = null;
            //将其他悬浮窗也一并移除
            removeMenuWindow();
        } catch (Exception e) {
        }
    }

    //移除菜单窗
    public void removeMenuWindow() {
        if (null == floatMenuView) {
            return;
        }
        WindowManager windowManager = getWindowManager();
        try {
            windowManager.removeView(floatMenuView);
            floatMenuView = null;
        } catch (Exception e) {
        }
    }

    public FloatMainView getFloatMainView() {
        return floatMainView;
    }

    public FloatMenuView getFloatMenuView() {
        if (null == floatMenuView) {
            createMenuWindow(context);
        }
        return floatMenuView;
    }


    public void registerSensorEventListener() {
        if (!isShowing()) {
            return;
        }
        floatMainView.registerSensorEventListener();
    }

    public void unregisterSensorEventListener() {
        if (!isShowing()) {
            return;
        }
        floatMainView.unregisterSensorEventListener();
    }

    private Drawable logo;

    public void setLogo(int logo) {
        setLogo(context.getResources().getDrawable(logo));
    }

    public void setLogo(Drawable logo) {
        this.logo = logo;
        if (floatMainView != null) {
            floatMainView.setLogo(this.logo);
        }
    }

    List<FloatMenu> floatMenus;

    public void setFloatMenus(List<FloatMenu> floatMenus) {
        this.floatMenus = floatMenus;
        if (isShowing()) {
            hide();
            show();
        }
    }
}
