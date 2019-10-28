package com.jsdroid.app.main.list;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseView;

import butterknife.BindView;

public class SearchView extends BaseView<SearchView, SearchPresenter> {
    @BindView(R.id.edit)
    EditText edit;

    public SearchView(Context context) {
        super(context);
    }

    @Override
    protected SearchPresenter createPresenter() {
        return new SearchPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.section_header_search;
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        edit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                return false;
            }
        });
        edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
