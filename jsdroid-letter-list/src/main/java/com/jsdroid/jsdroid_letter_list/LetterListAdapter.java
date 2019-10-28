package com.jsdroid.jsdroid_letter_list;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class LetterListAdapter extends BaseAdapter implements SectionIndexer {
    private List<? extends LetterModel> mList;
    private Context mContext;
    private LetterItemRender letterItemRender;

    public LetterListAdapter(Context context) {
        this.mContext = context;
        letterItemRender = new LetterItemRender();
    }

    /**
     * 当ListView数据发生变化时,调用此方法来更新ListView
     *
     * @param list
     */
    public void updateListView(List<? extends LetterModel> list) {
        if (list == null) {
            this.mList = new ArrayList<LetterModel>();
        } else {
            this.mList = list;
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    public Object getItem(int position) {
        return mList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup viewGroup) {
        if (letterItemRender == null) {
            return new View(viewGroup.getContext());
        }
        final LetterModel letterModel = mList.get(position);
        //根据position获取分类的首字母的Char ascii值
        int section = getSectionForPosition(position);
        ViewGroup childGroup;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.letter_list_item, viewGroup, false);
        }
        TextView tv_letter = view.findViewById(R.id.tv_letter);
        if (position == getPositionForSection(section)) {
            tv_letter.setVisibility(View.VISIBLE);
        } else {
            tv_letter.setVisibility(View.GONE);
        }
        tv_letter.setText(letterModel.firstLetter);
        childGroup = view.findViewById(R.id.letter_list_item_content);
        View child = (View) view.getTag();
        child = letterItemRender.renderModel(childGroup, child, letterModel);
        view.setTag(child);
        childGroup.removeAllViews();
        childGroup.addView(child);
        return view;
    }


    /**
     * 根据ListView的当前位置获取分类的首字母的Char ascii值
     */
    public int getSectionForPosition(int position) {
        return mList.get(position).firstLetter.charAt(0);
    }

    /**
     * 根据分类的首字母的Char ascii值获取其第一次出现该首字母的位置
     */
    public int getPositionForSection(int section) {
        for (int i = 0; i < getCount(); i++) {
            String sortStr = mList.get(i).firstLetter;
            char firstChar = sortStr.toUpperCase(Locale.CHINESE).charAt(0);
            if (firstChar == section) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public Object[] getSections() {
        return null;
    }

    public void setLetterItemRender(LetterItemRender letterItemRender) {
        this.letterItemRender = letterItemRender;
        notifyDataSetChanged();
    }
}