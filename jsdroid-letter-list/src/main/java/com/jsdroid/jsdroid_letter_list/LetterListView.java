package com.jsdroid.jsdroid_letter_list;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class LetterListView extends LinearLayout {

    ListView listView;
    EditText etSearch;
    ImageView ivClearText;

    private SideBar sideBar;
    private TextView dialog;

    private List<? extends LetterModel> letterModels;
    private LetterListAdapter adapter;
    View layoutSearch;
    /**
     * 根据拼音来排列ListView里面的数据类
     */
    private LetterComparator letterComparator;

    public LetterListView(Context context) {
        super(context);
        init();
    }

    public LetterListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.letter_list_view, this);
        initView();
        initListener();
    }

    private void initListener() {

        /**清除输入字符**/
        ivClearText.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                etSearch.setText("");
            }
        });
        etSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {

            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable e) {
                String content = etSearch.getText().toString();
                if ("".equals(content)) {
                    ivClearText.setVisibility(View.INVISIBLE);
                } else {
                    ivClearText.setVisibility(View.VISIBLE);
                }
                if (content.length() > 0) {
                    adapter.updateListView(search(content));
                } else {
                    adapter.updateListView(letterModels);
                }
                listView.setSelection(0);

            }

        });

        //设置右侧[A-Z]快速导航栏触摸监听
        sideBar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() {

            @Override
            public void onTouchingLetterChanged(String s) {
                //该字母首次出现的位置
                int position = adapter.getPositionForSection(s.charAt(0));
                if (position != -1) {
                    listView.setSelection(position);
                }
            }
        });

    }

    public ListView getListView() {
        return listView;
    }


    private void initView() {
        sideBar = (SideBar) findViewById(R.id.sideBar);
        dialog = (TextView) findViewById(R.id.dialog);
        sideBar.setTextView(dialog);
        ivClearText = (ImageView) findViewById(R.id.ivClearText);
        etSearch = (EditText) findViewById(R.id.et_search);
        listView = (ListView) findViewById(R.id.lv_contacts);
        layoutSearch = findViewById(R.id.layoutSearch);
        /** 给ListView设置adapter **/
        letterComparator = new LetterComparator();
        adapter = new LetterListAdapter(getContext());
        listView.setAdapter(adapter);
    }


    /**
     * 模糊查询
     *
     * @param str
     * @return
     */
    private List<LetterModel> search(String str) {
        if (letterModels == null) {
            return null;
        }
        List<LetterModel> filterList = new ArrayList<LetterModel>();// 过滤后的list
        for (LetterModel letterModel : letterModels) {
            if (letterModel.name != null) {
                //姓名全匹配,姓名首字母简拼匹配,姓名全字母匹配
                boolean isNameContains = letterModel.name.toLowerCase(Locale.CHINESE)
                        .contains(str.toLowerCase(Locale.CHINESE));

                boolean isSimpleSpellContains = letterModel.simpleSpell.toLowerCase(Locale.CHINESE)
                        .contains(str.toLowerCase(Locale.CHINESE));

                boolean isWholeSpellContains = letterModel.wholeSpell.toLowerCase(Locale.CHINESE)
                        .contains(str.toLowerCase(Locale.CHINESE));

                if (isNameContains || isSimpleSpellContains || isWholeSpellContains) {
                    if (!filterList.contains(letterModel)) {
                        filterList.add(letterModel);
                    }
                }
            }
        }
        return filterList;
    }

    public void setModels(List<? extends LetterModel> letterModels) {
        this.letterModels = letterModels;
        Collections.sort(this.letterModels, letterComparator);// 根据a-z进行排序源数据

        String content = etSearch.getText().toString();
        if (content.length() > 0) {
            adapter.updateListView(search(content));
        } else {
            adapter.updateListView(this.letterModels);
        }
    }

    /**
     * 设置渲染器
     *
     * @param letterItemRender
     */
    public void setLetterItemRender(LetterItemRender letterItemRender) {
        adapter.setLetterItemRender(letterItemRender);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        //隐藏输入法
        if ((ev.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN) {
            if (ev.getY() > layoutSearch.getHeight()) {
                hideSoftInput();
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    //如果输入法在窗口上已经显示，则隐藏，反之则显示
    public void hideSoftInput() {
        InputMethodManager imm = (InputMethodManager) getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        IBinder windowToken = getWindowToken();
        imm.hideSoftInputFromWindow(windowToken, InputMethodManager.HIDE_NOT_ALWAYS);
    }

    //关闭滑动提示
    public void closeSidebarTip() {
        sideBar.closeSidebarTip();
    }
}