package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

import com.jsdroid.app.design.tree.DesignMenuAdapter;
import com.jsdroid.app.view.BasePropView;

public class SpinnerPropView extends BasePropView {
    private String props[];
    private AdapterView.OnItemClickListener onItemClickListener;

    public SpinnerPropView(Context context) {
        this(context, null);
    }

    public SpinnerPropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showSpinner();
            }
        });
    }

    private void showSpinner() {
        showSpinner(props, onItemClickListener);
    }

    public void showSpinner(final String[] spinners, final AdapterView.OnItemClickListener onItemClickListener) {
        if (spinners == null) {
            return;
        }
        ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
        listPopupWindow.setAdapter(new DesignMenuAdapter(getContext(), spinners));
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listPopupWindow.dismiss();
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(parent, view, position, id);
                }
            }
        });
        listPopupWindow.setModal(true);
        listPopupWindow.show();
    }

    public void setProps(String[] props, AdapterView.OnItemClickListener onItemClickListener) {
        this.props = props;
        this.onItemClickListener = onItemClickListener;
    }

}
