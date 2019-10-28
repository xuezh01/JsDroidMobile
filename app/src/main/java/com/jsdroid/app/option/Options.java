package com.jsdroid.app.option;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
//import android.util.Log;
//import android.util.PackageUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.jsdroid.app.R;
import com.jsdroid.app.utils.DrawableHelper;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

public class Options {
    public enum OptionType {
        ACCESSORY_TYPE_NONE,
        ACCESSORY_TYPE_CHEVRON,
        ACCESSORY_TYPE_SWITCH,
        ACCESSORY_TYPE_CUSTOM;

        public int value() {
            switch (this) {
                case ACCESSORY_TYPE_NONE:
                    return QMUICommonListItemView.ACCESSORY_TYPE_NONE;
                case ACCESSORY_TYPE_CUSTOM:
                    return QMUICommonListItemView.ACCESSORY_TYPE_CUSTOM;
                case ACCESSORY_TYPE_SWITCH:
                    return QMUICommonListItemView.ACCESSORY_TYPE_SWITCH;
                case ACCESSORY_TYPE_CHEVRON:
                    return QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON;
            }
            return QMUICommonListItemView.ACCESSORY_TYPE_NONE;
        }

    }

    public interface OptionItemListener {
        void onCreate(OptionItem optionItem);

        void onClick(OptionItem optionItem);
    }

    public static class OptionItem {
        public Integer iconRes;
        public String title;
        public String desc;
        public JsdOption.Key key;
        public OptionType optionType;
        public QMUICommonListItemView itemView;
        public OptionItemListener optionItemListener;
        public boolean horizontal;

        public OptionItem() {
            optionType = OptionType.ACCESSORY_TYPE_NONE;
        }


        public OptionItem iconRes(int iconRes) {
            this.iconRes = iconRes;
            return this;
        }

        public OptionItem title(String title) {
            this.title = title;
            return this;
        }

        public OptionItem desc(String desc) {
            this.desc = desc;
            return this;
        }

        public OptionItem optionType(OptionType optionType) {
            this.optionType = optionType;
            return this;
        }

        public OptionItem horizontal() {
            horizontal = true;
            return this;
        }

        public static OptionItem create() {
            return new OptionItem();
        }

        private void performBind() {
            if (itemView != null && key != null) {
                CheckBox aSwitch = itemView.getSwitch();
                aSwitch.setChecked(JsdOption.getInstance().readBoolean(key));
                aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        JsdOption.getInstance().putBoolean(key, isChecked);
                    }
                });

            }

        }

        public OptionItem listen(OptionItemListener optionItemListener) {
            this.optionItemListener = optionItemListener;
            return this;
        }

        public OptionItem bind(JsdOption.Key key) {
            this.key = key;
            return this;
        }

        public void update() {
            if (key != null && itemView != null) {
                boolean checked = JsdOption.getInstance().readBoolean(key);
                CheckBox aSwitch = itemView.getSwitch();
                if (aSwitch != null) {
                    aSwitch.setChecked(checked);
                }
            }
        }
    }

    private static Drawable createMenuDrawable(Context context, int resId) {
        return DrawableHelper.createBitmapDrawable(context,
                resId, 25, 25, Color.GRAY);
    }

    /**
     * @param groupListView
     * @param sectionTitle                标题
     * @param useTitleViewForSectionSpace 顶部外边距
     * @param items                       项
     */
    public static void addOptions(QMUIGroupListView groupListView, String sectionTitle, boolean useTitleViewForSectionSpace, OptionItem... items) {
        QMUIGroupListView.Section section = QMUIGroupListView.newSection(groupListView.getContext()).setUseTitleViewForSectionSpace(useTitleViewForSectionSpace).setTitle(sectionTitle);
        for (OptionItem item : items) {
            item.itemView = groupListView.createItemView(item.title);
            item.itemView.setAccessoryType(item.optionType.value());
            if (item.iconRes != null) {
                item.itemView.setImageDrawable(createMenuDrawable(groupListView.getContext(), item.iconRes));
            } else {
                item.itemView.setImageDrawable(createMenuDrawable(groupListView.getContext(), R.drawable.icon_option));
            }
            item.itemView.setText(item.title);
            item.itemView.setDetailText(item.desc);
            section.addItemView(item.itemView, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (item.optionItemListener != null) {
                        item.optionItemListener.onClick(item);
                    }
                }
            });
            if (!item.horizontal) {
                item.itemView.setOrientation(QMUICommonListItemView.VERTICAL);
            }
            item.performBind();
            if (item.optionItemListener != null) {
                item.optionItemListener.onCreate(item);
            }
        }

        section.addTo(groupListView);
    }
}
