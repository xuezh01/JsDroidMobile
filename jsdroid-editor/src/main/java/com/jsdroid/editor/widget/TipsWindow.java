package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.jsdroid.editor.DpiUtils;
import com.jsdroid.editor.R;
import com.jsdroid.editor.adapter.DataAdapter;
import com.jsdroid.editor.adapter.DataHandler;
import com.jsdroid.editor.adapter.DataViewHolder;
import com.jsdroid.editor.parser.Parser;
import com.jsdroid.editor.tip.Tip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TipsWindow extends PopupWindow {
    public static int tabHeight = 0;
    public static int toolHeight = 0;

    Context context;
    ListView listView;
    DataAdapter adapter;
    CodeEditText codeEditText;

    public TipsWindow(CodeEditText codeEditText) {
        this.codeEditText = codeEditText;
        this.context = codeEditText.getContext();
        listView = new ListView(context);
        adapter = new DataAdapter(context);
        adapter.addDataHandler(new DataHandler() {
            @Override
            public int getLayoutId() {
                return R.layout.edit_list_item_tip;
            }

            @Override
            public boolean canFillData(Object data) {
                return data instanceof Tip;
            }

            @Override
            public void fillData(final int pos, Object data, DataViewHolder vh, DataAdapter dataAdapter) {
                ImageView icon = (ImageView) vh.getViewHelper().getView(R.id.icon);
                Tip tip = (Tip) data;
                if (tip.getIcon() == -1) {
                    icon.setImageResource(R.drawable.ic_tip_default);
                } else {
                    icon.setImageResource(tip.getIcon());
                }
                vh.getViewHelper().setText(R.id.desc, tip.getDesc());
                vh.getViewHelper().setText(R.id.text, tip.getShow());
                View view = vh.getView(R.id.content);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onClickItem(pos);
                    }
                });
            }
        });
        listView.setAdapter(adapter);
        setContentView(listView);
//        setBackgroundDrawable(new ColorDrawable(Color.WHITE));
//        setOutsideTouchable(true);
    }

    public interface OnItemClickListener {
        void onClickItem(int pos);
    }


    public void onClickItem(int position) {
        Tip tip = getItem(position);
        tip.replace(codeEditText);
        dismiss();
    }


    public void setTips(List tips) {
        if (atBottom) {
            adapter.setDatas(tips);
            adapter.notifyDataSetChanged();
            listView.setSelection(0);
        } else {
            Collections.reverse(tips);
            adapter.setDatas(tips);
            adapter.notifyDataSetChanged();
            listView.setSelection(tips.size() - 1);
        }
    }

    public Tip getItem(int x) {
        return (Tip) adapter.getItem(x);
    }

    public int getItemsHeight() {
        return adapter.getCount() * DpiUtils.dip2px(context, 40);
    }

    //显示提示
    public void showTips(Parser parser) {
        updateTips();
        String inputText = codeEditText.getCursorInputText();
        //parser
        if (inputText.length() == 0) {
            dismiss();
            return;
        }
        String cursorReplaceText = codeEditText.getCursorReplaceText();
        if (parser == null) {
            return;
        }
        List<Tip> tips = parser.searchTips(cursorReplaceText);
        setTips(tips);
        updateTips();
    }

    //更新提示
    public void updateTips() {
        int selectionStart = codeEditText.getSelectionStart();
        int selectionEnd = codeEditText.getSelectionEnd();
        if (selectionStart != selectionEnd) {
            dismiss();
            return;
        }
        Rect tipRect = getPopupWindowRect(selectionStart);
        if (tipRect == null) {
            return;
        }
        if (!tipRect.equals(lastTipRect)) {
            dismiss();
        }
        lastTipRect = tipRect;
        setWidth(tipRect.width());
        setHeight(tipRect.height());
        showAtLocation(codeEditText, Gravity.LEFT | Gravity.TOP, tipRect.left, tipRect.top);
    }

    Rect lastTipRect;
    boolean atBottom;

    public Rect getPopupWindowRect(int offset) {
        Layout layout = codeEditText.getLayout();
        if (layout == null) {
            return null;
        }
        int location[] = new int[2];
        codeEditText.getScrollView().getLocationInWindow(location);
        int x = location[0];
        int y = location[1] - tabHeight;
        int width = codeEditText.getScrollView().getWidth();
        int height = codeEditText.getScrollView().getHeight() + tabHeight + toolHeight;
        Rect rect = new Rect(x, y, x + width, y + height);
        int padding = DpiUtils.dip2px(context, 10);
        int leftOff = codeEditText.getPaddingLeft() - codeEditText.getViewScrollX();
        rect.left += leftOff > padding ? leftOff : padding;
        rect.top += padding;
        rect.right -= padding;
        rect.bottom -= padding;

        int line = layout.getLineForOffset(offset);
        int lineTop = layout.getLineTop(line) - codeEditText.getViewScrollY();
        int lineBottom = layout.getLineTop(line + 1) - codeEditText.getViewScrollY();
        int rheight = height - lineBottom;

        if (rheight > lineTop) {
            atBottom = true;
            rect.top = lineBottom + y + DpiUtils.dip2px(context, 8) + tabHeight;
        } else {
            atBottom = false;
            rect.bottom = lineTop + y - DpiUtils.dip2px(context, 8) + tabHeight;
        }
        //调节具体的高度
        int realHeight = getItemsHeight();
        if (rect.height() > realHeight) {
            int off = rect.height() - realHeight;
            if (atBottom) {
                rect.bottom -= off;
            } else {
                rect.top += off;
            }

        }
        return rect;
    }


    @Override
    public void dismiss() {
        super.dismiss();
    }
}
