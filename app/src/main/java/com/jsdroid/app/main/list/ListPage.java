package com.jsdroid.app.main.list;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.pager.Page;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.jsdroid_letter_list.LetterItemRender;
import com.jsdroid.jsdroid_letter_list.LetterListView;

import butterknife.BindView;

public class ListPage extends Page<ListPage, ListPresenter> {
    @BindView(R.id.pinyinListView)
    LetterListView letterListView;

    public ListPage(Context context) {
        super(context);
    }

    @Override
    protected ListPresenter createPresenter() {
        return new ListPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_script_list_page;
    }

    @Override
    protected void initViews() {
        super.initViews();
    }

    @Override
    protected void initAdapters() {
        letterListView.setLetterItemRender(new LetterItemRender<ToolModel>() {
            @Override
            protected View renderModel(ViewGroup viewGroup, View view, ToolModel toolModel) {
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_search_item, viewGroup, false);
                }
                TextView item_name = view.findViewById(R.id.item_name);
                item_name.setText(toolModel.name);
                View btn_delete = view.findViewById(R.id.btn_delete);
                btn_delete.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().uninstall(toolModel);

                    }
                });
                View btn_open = view.findViewById(R.id.btn_open);
                btn_open.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().open(toolModel);
                    }
                });
                btn_open.setOnLongClickListener(new OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        Dialogs.showMenu(v, null, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                switch (which) {
                                    case 0: {
                                        getPresenter().open(toolModel);
                                        break;
                                    }
                                    case 1: {
                                        getPresenter().share(toolModel.tool);
                                        break;
                                    }
                                    case 2: {
                                        getPresenter().shortcut(toolModel.tool);
                                        break;
                                    }
                                    case 3: {
                                        getPresenter().uninstall(toolModel);
                                        break;
                                    }
                                }
                            }
                        }, "打开", "分享", "创建快捷方式", "卸载");

                        return true;
                    }
                });
                CheckBox favorite = view.findViewById(R.id.item_favorite);
                favorite.setOnCheckedChangeListener(null);
                favorite.setChecked(toolModel.tool.favorite);
                favorite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        toolModel.tool.favorite = isChecked;
                        getPresenter().favorite(toolModel);
                    }
                });
                ImageView item_img = view.findViewById(R.id.item_img);
                String icon = toolModel.tool.getIcon();
                if (icon != null) {
                    item_img.setImageBitmap(BitmapFactory.decodeFile(icon));
                } else {
                    item_img.setImageResource(R.drawable.logo_blue_dark);
                }
                return view;
            }
        });
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
    }

    @Override
    public void onScroll() {
        letterListView.closeSidebarTip();
    }
}
