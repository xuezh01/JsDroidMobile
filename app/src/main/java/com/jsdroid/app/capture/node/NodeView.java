package com.jsdroid.app.capture.node;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.mvp.view.BaseView;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;

import butterknife.BindView;

public class NodeView extends BaseView<NodeView, BasePresenter<NodeView>> {
    @BindView(R.id.img_arrow)
    ImageView imgArrow;
    @BindView(R.id.text_info)
    TextView textInfo;
    @BindView(R.id.content)
    View content;

    public NodeView(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.tree_item_simple;
    }

    @Override
    protected void initViews() {
        super.initViews();
        imgArrow.setColorFilter(Color.WHITE);
    }

    public void setImgArrow(boolean open) {
        if (open) {
            imgArrow.setImageResource(R.drawable.ic_arrow_open);
        } else {
            imgArrow.setImageResource(R.drawable.ic_arrow_close);
        }
    }

    public void showImgArrow(boolean show) {
        if (show) {
            imgArrow.setVisibility(VISIBLE);
        } else {
            imgArrow.setVisibility(GONE);
        }
    }

    public void setTextInfo(String textInfo) {
        this.textInfo.setText(textInfo);
    }

    public void setDepth(int depth) {
        int p = QMUIDisplayHelper.dp2px(getContext(), 10);
        content.setPadding(depth * 4 * p + p,
                p, p, p);
    }

    public View searchParent(int id) {
        ViewParent parent = getParent();
        while (true) {
            if (parent instanceof View) {
                if (((View) parent).getId() == id) {
                    return (View) parent;
                }
            }
            parent = parent.getParent();
            if (parent == null) {
                return null;
            }
        }
    }

    public <T> T searchParent(Class<T> clazz) {
        ViewParent parent = getParent();
        while (true) {
            if (parent.getClass().isAssignableFrom(clazz)) {
                return (T) parent;
            }
            parent = parent.getParent();
            if (parent == null) {
                return null;
            }
        }
    }
}
