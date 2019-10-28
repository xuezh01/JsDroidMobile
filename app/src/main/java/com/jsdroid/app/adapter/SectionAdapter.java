package com.jsdroid.app.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jsdroid.app.R;
import com.jsdroid.app.view.SectionHeaderView;
import com.qmuiteam.qmui.widget.section.QMUIDefaultStickySectionAdapter;
import com.qmuiteam.qmui.widget.section.QMUISection;
import com.qmuiteam.qmui.widget.section.QMUISectionDiffCallback;

import java.util.List;

/**
 * 分组标题悬浮列表适配器，用于QMUIStickySectionLayout
 */
public class SectionAdapter extends QMUIDefaultStickySectionAdapter<SectionHeader, SectionItem> {
    static class EmptyView extends View {

        public EmptyView(Context context) {
            super(context);
            setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        }

        public EmptyView(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
            setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        }
    }

    public static final int ITEM_INDEX_LIST_HEADER = -1;
    public static final int ITEM_INDEX_LIST_FOOTER = -2;
    public static final int ITEM_INDEX_SECTION_TIP_START = -3;
    public static final int ITEM_INDEX_SECTION_TIP_END = -4;

    public static final int ITEM_TYPE_LIST_HEADER = 1;
    public static final int ITEM_TYPE_LIST_FOOTER = 2;
    public static final int ITEM_TYPE_SECTION_TIP_START = 3;
    public static final int ITEM_TYPE_SECTION_TIP_END = 4;
    private boolean showArrow = true;

    public void setShowArrow(boolean showArrow) {
        this.showArrow = showArrow;
    }

    @NonNull
    @Override
    protected ViewHolder onCreateSectionHeaderViewHolder(@NonNull ViewGroup viewGroup) {
        return new ViewHolder(createSectionHeaderView(viewGroup));
    }

    @NonNull
    @Override
    protected ViewHolder onCreateSectionItemViewHolder(@NonNull ViewGroup viewGroup) {
        return new ViewHolder(createSectionItemView(viewGroup));
    }

    @Override
    protected void onBindSectionHeader(final ViewHolder holder, final int position, final QMUISection<SectionHeader, SectionItem> section) {
        SectionHeaderView sectionHeaderView = (SectionHeaderView) holder.itemView;
        sectionHeaderView.setText(section.getHeader().text);
        if (showArrow) {
            sectionHeaderView.setArrowOpen(!section.isFold());
            sectionHeaderView.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int pos = holder.isForStickyHeader ? position : holder.getAdapterPosition();
                    toggleFold(pos, false);
                }
            });
        }
    }

    @Override
    protected void onBindSectionItem(ViewHolder holder, int position, QMUISection<SectionHeader, SectionItem> section, int itemIndex) {

    }

    @NonNull
    @Override
    protected ViewHolder onCreateCustomItemViewHolder(@NonNull ViewGroup viewGroup, int type) {
        switch (type) {
            case ITEM_TYPE_LIST_HEADER: {
                return new ViewHolder(createHeaderView(viewGroup));
            }
            case ITEM_TYPE_LIST_FOOTER: {
                return new ViewHolder(createFooterView(viewGroup));
            }
            case ITEM_TYPE_SECTION_TIP_START: {
                return new ViewHolder(createSectionStartView(viewGroup));
            }
            case ITEM_TYPE_SECTION_TIP_END: {
                return new ViewHolder(createSectionEndView(viewGroup));
            }
        }

        return new ViewHolder(new View(viewGroup.getContext()));
    }

    /**
     * 单元标题
     *
     * @param viewGroup
     * @return
     */
    protected View createSectionHeaderView(ViewGroup viewGroup) {
        SectionHeaderView sectionHeaderView = new SectionHeaderView(viewGroup.getContext());
        sectionHeaderView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        sectionHeaderView.setBackgroundColor(Color.WHITE);
        return sectionHeaderView;
    }


    /**
     * 单元项
     *
     * @param viewGroup
     * @return
     */
    protected View createSectionItemView(ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return inflater.inflate(R.layout.home_section_item, null);
    }

    /**
     * 头部
     *
     * @param viewGroup
     * @return
     */
    protected View createHeaderView(ViewGroup viewGroup) {
        return new EmptyView(viewGroup.getContext());
    }

    /**
     * 脚部
     *
     * @param viewGroup
     * @return
     */
    protected View createFooterView(ViewGroup viewGroup) {
        return new EmptyView(viewGroup.getContext());
    }

    /**
     * 单元开始
     *
     * @param viewGroup
     * @return
     */
    protected View createSectionStartView(ViewGroup viewGroup) {
        return new EmptyView(viewGroup.getContext());
    }

    /**
     * 单元结尾
     *
     * @param viewGroup
     * @return
     */
    protected View createSectionEndView(ViewGroup viewGroup) {
        return new EmptyView(viewGroup.getContext());
    }

    @Override
    protected int getCustomItemViewType(int itemIndex, int position) {
        if (itemIndex == ITEM_INDEX_LIST_HEADER) {
            return ITEM_TYPE_LIST_HEADER;
        } else if (itemIndex == ITEM_INDEX_LIST_FOOTER) {
            return ITEM_TYPE_LIST_FOOTER;
        } else if (itemIndex == ITEM_INDEX_SECTION_TIP_START) {
            return ITEM_TYPE_SECTION_TIP_START;
        } else if (itemIndex == ITEM_INDEX_SECTION_TIP_END) {
            return ITEM_TYPE_SECTION_TIP_END;
        }
        return super.getCustomItemViewType(itemIndex, position);
    }

    @Override
    protected QMUISectionDiffCallback<SectionHeader, SectionItem> createDiffCallback(List<QMUISection<SectionHeader, SectionItem>> lastData, List<QMUISection<SectionHeader, SectionItem>> currentData) {
        return new QMUISectionDiffCallback<SectionHeader, SectionItem>(lastData, currentData) {
            @Override
            protected void onGenerateCustomIndexBeforeSectionList(IndexGenerationInfo generationInfo, List<QMUISection<SectionHeader, SectionItem>> list) {
                generationInfo.appendWholeListCustomIndex(ITEM_INDEX_LIST_HEADER);
            }

            @Override
            protected void onGenerateCustomIndexAfterSectionList(IndexGenerationInfo generationInfo, List<QMUISection<SectionHeader, SectionItem>> list) {
                generationInfo.appendWholeListCustomIndex(ITEM_INDEX_LIST_FOOTER);
            }

            @Override
            protected void onGenerateCustomIndexBeforeItemList(IndexGenerationInfo generationInfo,
                                                               QMUISection<SectionHeader, SectionItem> section,
                                                               int sectionIndex) {
                if (!section.isExistBeforeDataToLoad()) {
                    generationInfo.appendCustomIndex(sectionIndex, ITEM_INDEX_SECTION_TIP_START);
                }
            }

            @Override
            protected void onGenerateCustomIndexAfterItemList(IndexGenerationInfo generationInfo,
                                                              QMUISection<SectionHeader, SectionItem> section,
                                                              int sectionIndex) {
                if (!section.isExistAfterDataToLoad()) {
                    generationInfo.appendCustomIndex(sectionIndex, ITEM_INDEX_SECTION_TIP_END);
                }
            }

            @Override
            protected boolean areCustomContentsTheSame(QMUISection<SectionHeader, SectionItem> oldSection, int oldItemIndex, QMUISection<SectionHeader, SectionItem> newSection, int newItemIndex) {
                return true;
            }
        };
    }
}
