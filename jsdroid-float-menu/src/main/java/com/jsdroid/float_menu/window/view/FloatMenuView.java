package com.jsdroid.float_menu.window.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jsdroid.float_menu.R;
import com.jsdroid.float_menu.window.FloatMenu;
import com.jsdroid.float_menu.window.FloatMenuManager;

import java.util.ArrayList;
import java.util.List;

public class FloatMenuView extends LinearLayout {

    private Context mContext;

    private LinearLayout menuLayout;

    private List<FloatMenu> floatMenus = new ArrayList<>();


    public FloatMenuView(Context context, List<FloatMenu> floatMenus) {
        super(context);
        this.mContext = context;
        this.floatMenus = floatMenus;
        LayoutInflater.from(context).inflate(R.layout.float_menu, this);
        menuLayout = (LinearLayout) findViewById(R.id.layout);
        setFloatMenus();
    }

    private void setFloatMenus() {
        if (floatMenus == null) {
            return;
        }
        menuLayout.removeAllViews();
        for (int i = 0; i < floatMenus.size(); i++) {
            FloatMenu bean = floatMenus.get(i);
            if (null != bean) {
                View menuView = LayoutInflater.from(mContext).inflate(R.layout.float_menu_item, null);
                createMenuItem(menuView, bean);
                menuLayout.addView(menuView);
            }
        }
        invalidate();

    }

    private void createMenuItem(View menuLayout, final FloatMenu floatMenu) {
        ImageView menuIv = menuLayout.findViewById(R.id.img);
        if (floatMenu.getIcon() != null) {
            menuIv.setImageDrawable(floatMenu.getIcon());
        }
        TextView menuTv = menuLayout.findViewById(R.id.text);
        menuTv.setText(floatMenu.getName());
        menuLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setVisibility(GONE);
                FloatMenuManager.getInstance(mContext).getFloatMainView().setAddedMenu(false);
                FloatMenu.OnClickListener onClickListener = floatMenu.getOnClickListener();
                if (onClickListener != null) {
                    onClickListener.onClick(floatMenu);
                }
            }
        });

    }


}
