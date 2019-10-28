package com.yhao.floatwindow;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class FloatViewHelper {
    public static ViewGroup.LayoutParams getWindowParams() {
        WindowManager.LayoutParams wmLayoutParams = new WindowManager.LayoutParams();
        wmLayoutParams.type = getWindowType();
        wmLayoutParams.flags = getWindowFlags();
        return wmLayoutParams;
    }

    public static int getWindowFlags() {
        return WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS;

    }

    public static int getWindowType() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            return WindowManager.LayoutParams.TYPE_SYSTEM_ERROR;
        }
    }

    interface PermissionListener {
        void onSuccess();

        void onFailed();
    }

    private static void req(Context context, final PermissionListener permissionListener) {
        FloatActivity.request(context, new com.yhao.floatwindow.PermissionListener() {
            @Override
            public void onSuccess() {
                permissionListener.onSuccess();
            }

            @Override
            public void onFail() {
                permissionListener.onFailed();
            }
        });
    }

    public static void requestPermission(Context context, final PermissionListener permissionListener) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            req(context, permissionListener);
        } else if (Miui.rom()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                req(context, permissionListener);
            } else {
                Miui.req(context, new com.yhao.floatwindow.PermissionListener() {
                    @Override
                    public void onSuccess() {
                        permissionListener.onSuccess();
                    }

                    @Override
                    public void onFail() {
                        permissionListener.onFailed();
                    }
                });
            }
        } else {
            try {
                //尝试直接添加view
                View view = new View(context);
                WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
                assert windowManager != null;
                windowManager.addView(view, getWindowParams());
                windowManager.removeView(view);
                permissionListener.onSuccess();
            } catch (Throwable e) {
                //尝试直接申请权限
                req(context, permissionListener);
            }

        }
    }
}
