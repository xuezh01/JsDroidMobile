package com.jsdroid.app.shortcut;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.annotation.RequiresApi;

import com.jsdroid.app.R;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.eye.ToolActivity;

public class ToolShortcut {
    private Context context;
    Bitmap iconBitmap;
    String name;
    String pkg;

    public ToolShortcut(Context context, Tool tool) {
        this.context = context;
        this.name = tool.name;
        this.pkg = tool.pkg;
        if (tool.icon != null) {
            try {
                this.iconBitmap = BitmapFactory.decodeFile(tool.icon);
            } catch (Exception e) {
            }
        }
    }

    public void createShortcut() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            createShortcutByShortcutManager();
            return;
        }
        Shortcut shortcut = new Shortcut(context);
        if (iconBitmap == null) {
            shortcut.iconRes(R.drawable.logo_blue_dark);
        } else {
            shortcut.icon(iconBitmap);
        }
        shortcut.name(name)
                .targetClass(ToolActivity.class)
                .extras(new Intent().putExtra("pkg", pkg))
                .send();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void createShortcutByShortcutManager() {
        Icon icon;
        if (iconBitmap == null) {
            icon = Icon.createWithResource(context, R.drawable.logo_blue_dark);
        } else {
            icon = Icon.createWithBitmap(iconBitmap);
        }
        PersistableBundle extras = new PersistableBundle(1);
        extras.putString("pkg", pkg);
        Intent intent = new Intent(context, ToolActivity.class)
                .putExtra("pkg", pkg)
                .setAction(Intent.ACTION_MAIN);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ShortcutManager.getInstance(context).addPinnedShortcut(name, pkg, icon, intent);
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
                ShortcutManager.getInstance(context).addDynamicShortcut(name, pkg, icon, intent);
            }
        }

    }
}
