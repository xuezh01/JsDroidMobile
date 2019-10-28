package com.jsdroid.app.pager;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import com.jsdroid.mvp.view.BaseView;

public class BasePagerAdapter extends PagerAdapter {
    SparseArray<BaseView> pages;

    @Override
    public int getCount() {
        return pages == null ? 0 : pages.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        BaseView page = pages.get(position);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        container.addView(page, params);
        return page;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return pages.indexOfValue((BaseView) object);
    }

    public void setPages(SparseArray<BaseView> pages) {
        this.pages = pages;
        notifyDataSetChanged();
    }

    public void addPage(int pos, BaseView page) {
        if (pages == null) {
            pages = new SparseArray<>();
        }
        pages.append(pos, page);
        notifyDataSetChanged();
    }

    public SparseArray<BaseView> getPages() {
        return pages;
    }
}
