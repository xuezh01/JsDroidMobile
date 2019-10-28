package com.yhao.floatwindow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于在内部自动申请权限
 * https://github.com/yhaolpz
 */

public class FloatActivity extends Activity {

    private static List<PermissionListener> mPermissionListenerList;
    private static PermissionListener mPermissionListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestAlertWindowPermission();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void requestAlertWindowPermission() {
        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivityForResult(intent, 756232212);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.e("floaty", "request:result ", new Exception());
        if (requestCode == 756232212) {
            if (PermissionUtil.hasPermissionOnActivityResult(this)) {
                Log.e("floaty", "request:success ", new Exception());
                mPermissionListener.onSuccess();
            } else {
                Log.e("floaty", "request:failed ", new Exception());
                mPermissionListener.onFail();
            }
        }
        finish();
    }

    public static synchronized void request(Context context, PermissionListener permissionListener) {

        if (PermissionUtil.hasPermission(context)) {
            permissionListener.onSuccess();
            return;
        }
        Log.e("floaty", "request:start ", new Exception());
        if (mPermissionListenerList == null) {
            mPermissionListenerList = new ArrayList<>();
            mPermissionListener = new PermissionListener() {
                @Override
                public void onSuccess() {
                    for (PermissionListener listener : mPermissionListenerList) {
                        listener.onSuccess();
                    }
                    mPermissionListenerList.clear();
                }

                @Override
                public void onFail() {
                    for (PermissionListener listener : mPermissionListenerList) {
                        listener.onFail();
                    }
                    mPermissionListenerList.clear();
                }
            };
            Intent intent = new Intent(context, FloatActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
        mPermissionListenerList.add(permissionListener);
    }


}
