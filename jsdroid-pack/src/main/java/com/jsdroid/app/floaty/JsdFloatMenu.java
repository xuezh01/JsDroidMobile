package com.jsdroid.app.floaty;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import com.jsdroid.app.App;
import com.jsdroid.app.R;
import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.float_menu.window.FloatMenu;
import com.jsdroid.float_menu.window.FloatMenuManager;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.util.QMUIDrawableHelper;

import java.util.ArrayList;
import java.util.List;

public class JsdFloatMenu implements JsdOption.OptionListener {

    private Context context;

    private static JsdFloatMenu instance = new JsdFloatMenu();

    public static JsdFloatMenu getInstance() {
        return instance;
    }

    private JsdFloatMenu() {

    }

    public void init(Context context) {
        this.context = context;
        initMenu();
    }

    private void initMenu() {
        JsdOption.getInstance().addOptionListener(this);
        FloatMenuManager.getInstance(context).setLogo(R.mipmap.ic_launcher);
        List<FloatMenu> floatMenus = new ArrayList<>();
        floatMenus.add(createFloatMenu(context, "运行", R.drawable.icon_run, new FloatMenu.OnClickListener() {
            @Override
            public void onClick(FloatMenu floatMenu) {
                JsdCore.getInstance().runScript(App.getInstance().getPackageName());
            }
        }));

        floatMenus.add(createFloatMenu(context, "停止", R.drawable.icon_close, new FloatMenu.OnClickListener() {
            @Override
            public void onClick(FloatMenu floatMenu) {
                JsdCore.getInstance().stopScript();
            }
        }));

        floatMenus.add(createFloatMenu(context, "隐藏", R.drawable.icon_close, new FloatMenu.OnClickListener() {
            @Override
            public void onClick(FloatMenu floatMenu) {
                JsdOption.getInstance().putBoolean(JsdOption.Key.SHOW_FLOAT_MENU, false);
            }
        }));

        FloatMenuManager.getInstance(context).setFloatMenus(floatMenus);
        toggle(JsdOption.getInstance().isShowFloatMenu());
    }


    public void toggle(boolean state) {
        if (state) {
            FloatMenuManager.getInstance(context).show();
        } else {
            FloatMenuManager.getInstance(context).hide();
        }
    }


    private static FloatMenu createFloatMenu(Context context, String text, int resId, FloatMenu.OnClickListener onClickListener) {
        FloatMenu floatMenu = new FloatMenu();
        floatMenu.setName(text);
        floatMenu.setOnClickListener(onClickListener);
        floatMenu.setIcon(createBitmapDrawable(context, resId, 25, 25, Color.WHITE));
        return floatMenu;
    }

    private static Drawable createBitmapDrawable(Context context, int resId,
                                                 int dpWith, int dpHeight, int color) {
        int width = QMUIDisplayHelper.dp2px(context, dpWith);
        int height = QMUIDisplayHelper.dp2px(context, dpHeight);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resId);
        float scaleX = width * 1.0f / bitmap.getWidth();
        float scaleY = height * 1.0f / bitmap.getHeight();
        Matrix m = new Matrix();
        m.postScale(scaleX, scaleY);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(),
                Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m, false));
        QMUIDrawableHelper.setDrawableTintColor(bitmapDrawable, color);
        return bitmapDrawable;
    }

    @Override
    public void onOptionChanged(JsdOption.Key key, Object value) {
        switch (key) {
            case SHOW_FLOAT_MENU:
                toggle((Boolean) value);
                break;
        }
    }
}
