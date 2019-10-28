package com.jsdroid.float_menu.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class FloatPermissionActivity extends AppCompatActivity {
    public interface PermissionListener {
        void onSuccess();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FloatPermissionHelper.applyPermission(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (FloatPermissionHelper.checkPermission(this)) {
            for (PermissionListener permissionListener : permissionListeners) {
                permissionListener.onSuccess();
            }
            permissionListeners.clear();

        }
        finish();
    }

    private static List<PermissionListener> permissionListeners = new ArrayList<>();

    public synchronized static void requestPermission(Context context, PermissionListener permissionListener) {
        if (FloatPermissionHelper.checkPermission(context)) {
            permissionListener.onSuccess();
            return;
        }
        permissionListeners.add(permissionListener);
        Intent intent = new Intent(context, FloatPermissionActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}
