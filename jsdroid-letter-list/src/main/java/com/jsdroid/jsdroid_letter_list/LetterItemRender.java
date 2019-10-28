package com.jsdroid.jsdroid_letter_list;

import android.view.View;
import android.view.ViewGroup;

public class LetterItemRender<T extends LetterModel> {

    /**
     * @param viewGroup   父视图，不为空
     * @param view        视图，可能为空
     * @param letterModel 当前项内容
     */
    protected View renderModel(ViewGroup viewGroup, View view, T letterModel) {
        if (view == null) {
            return new View(viewGroup.getContext());
        }
        return view;

    }
}
