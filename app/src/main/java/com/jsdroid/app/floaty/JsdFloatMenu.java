package com.jsdroid.app.floaty;

import android.content.Context;
import android.graphics.Color;

import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.app.R;
import com.jsdroid.app.utils.DrawableHelper;
import com.jsdroid.float_menu.window.FloatMenu;
import com.jsdroid.float_menu.window.FloatMenuManager;

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
        JsdOption.getInstance().addOptionListener(this);
        initMenu();
        if (JsdOption.getInstance().isShowFloatMenu()) {
            toggle(true);
        }
    }

    private void initMenu() {
        FloatMenuManager.getInstance(context).setLogo(R.drawable.logo_circle_float);
        List<FloatMenu> floatMenus = new ArrayList<>();
        floatMenus.add(createFloatMenu(context, "运行", R.drawable.run, new FloatMenu.OnClickListener() {
            @Override
            public void onClick(FloatMenu floatMenu) {
                JsdCore.getInstance().runLast();
            }
        }));
        floatMenus.add(createFloatMenu(context, "停止", R.drawable.close, new FloatMenu.OnClickListener() {
            @Override
            public void onClick(FloatMenu floatMenu) {
                JsdCore.getInstance().stopScript();
            }
        }));
        floatMenus.add(createFloatMenu(context, "截屏", R.drawable.capture, new FloatMenu.OnClickListener() {
            @Override
            public void onClick(FloatMenu floatMenu) {
                JsdCore.getInstance().capture(floatMenu);
            }
        }));
        FloatMenuManager.getInstance(context).setFloatMenus(floatMenus);
    }


    private void toggle(boolean state) {
        if (state) {
            FloatMenuManager.getInstance(context).show();
        } else {
            FloatMenuManager.getInstance(context).hide();
        }
    }

    @Override
    public void onOptionChanged(JsdOption.Key key, Object value) {
        switch (key) {
            case SHOW_FLOAT_MENU:
                if (value instanceof Boolean) {
                    toggle((Boolean) value);
                }
                break;
        }
    }

    private static FloatMenu createFloatMenu(Context context, String text, int resId, FloatMenu.OnClickListener onClickListener) {
        FloatMenu floatMenu = new FloatMenu();
        floatMenu.setName(text);
        floatMenu.setOnClickListener(onClickListener);
        floatMenu.setIcon(DrawableHelper.createBitmapDrawable(context, resId, 25, 25, Color.WHITE));
        return floatMenu;
    }
}
