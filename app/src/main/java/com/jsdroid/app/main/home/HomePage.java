package com.jsdroid.app.main.home;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.SectionAdapter;
import com.jsdroid.app.adapter.SectionItem;
import com.jsdroid.app.adapter.SectionHeader;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.pager.Page;
import com.qmuiteam.qmui.widget.section.QMUISection;
import com.qmuiteam.qmui.widget.section.QMUIStickySectionLayout;

import java.text.SimpleDateFormat;

import butterknife.BindView;

public class HomePage extends Page<HomePage, HomePresenter> {
    @BindView(R.id.section_layout)
    QMUIStickySectionLayout sectionLayout;


    SectionAdapter sectionAdapter;

    public HomePage(Context context) {
        super(context);
    }

    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_home_page;
    }

    @Override
    protected void initViews() {
        super.initViews();
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
        sectionAdapter = new SectionAdapter() {
            @Override
            protected View createHeaderView(ViewGroup viewGroup) {
                return new TopView(viewGroup.getContext());
            }

            @Override
            protected View createSectionItemView(ViewGroup viewGroup) {
                LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
                return inflater.inflate(R.layout.home_section_item, null);
            }

            SimpleDateFormat timeFormat = new SimpleDateFormat("上次运行：yyyy-MM-dd HH:mm:ss SSS");

            @Override
            protected void onBindSectionItem(ViewHolder holder, int position, QMUISection<SectionHeader, SectionItem> section, int itemIndex) {
                SectionItem item = section.getItemAt(itemIndex);
                TextView item_name = holder.itemView.findViewById(R.id.item_name);
                TextView item_run_time = holder.itemView.findViewById(R.id.item_run_time);
                ImageView item_img = holder.itemView.findViewById(R.id.item_img);

                CheckBox item_favorite = holder.itemView.findViewById(R.id.item_favorite);
                item_favorite.setOnCheckedChangeListener(null);
                View btn_open = holder.itemView.findViewById(R.id.btn_open);

                btn_open.setOnClickListener(null);
                if (item.item instanceof Tool) {
                    Tool tool = (Tool) item.item;
                    item_name.setText(tool.name);
                    item_favorite.setChecked(tool.favorite);
                    item_favorite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            tool.favorite = isChecked;
                            JsdTool.getInstance().update(tool);
                        }
                    });
                    btn_open.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            getPresenter().openTool(tool);
                        }
                    });
                    if (tool.lastRunTime != null) {
                        item_run_time.setText(timeFormat.format(tool.lastRunTime));
                    } else {
                        item_run_time.setText(null);
                    }
                    String icon = tool.getIcon();
                    if (icon != null) {
                        item_img.setImageBitmap(BitmapFactory.decodeFile(icon));
                    } else {
                        item_img.setImageResource(R.drawable.logo_blue_dark);
                    }
                }
                if (section.getHeader().type == SectionHeader.Type.TOOL_FAVORITE) {
                    item_favorite.setVisibility(VISIBLE);
                } else {
                    item_favorite.setVisibility(GONE);
                }
                if (section.getHeader().type == SectionHeader.Type.TOOL_RECENT) {
                    item_run_time.setVisibility(VISIBLE);

                } else {
                    item_run_time.setVisibility(GONE);
                }

            }
        };
        sectionLayout.setAdapter(sectionAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
//        layoutManager.setSpanSizeLookup(new SectionGridSpanSizeLookup(sectionAdapter, layoutManager));
        sectionLayout.setLayoutManager(layoutManager);


    }


}
