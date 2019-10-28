package com.jsdroid.app.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.mvp.view.BaseView;
import com.qmuiteam.qmui.util.QMUIDrawableHelper;

import butterknife.BindView;

public class SectionHeaderView extends BaseView<SectionHeaderView, SectionHeaderPresenter> {
    public SectionHeaderView(Context context) {
        super(context);
    }

    @BindView(R.id.img_arrow)
    ImageView imgArrow;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected SectionHeaderPresenter createPresenter() {
        return new SectionHeaderPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.section_header;
    }

    public void setText(String text) {
        this.tvText.setText(text);
    }

    public void setArrowOpen(boolean arrowOpen) {
        imgArrow.setVisibility(VISIBLE);
        if (arrowOpen) {
            imgArrow.setImageResource(R.drawable.ic_arrow_open);
        } else {
            imgArrow.setImageResource(R.drawable.ic_arrow_close);
        }
    }
    public void setShowArrow(boolean show){
        if (show){
            imgArrow.setVisibility(VISIBLE);
        }else{
            imgArrow.setVisibility(GONE);
        }
    }

    public void setImg(int resId) {
        imgArrow.setVisibility(VISIBLE);
        imgArrow.setImageResource(resId);
    }

    public void setMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {

        }
    }

    public void setTextColor(int color) {
        tvText.setTextColor(color);
    }

    public void setImgColor(int color) {
        QMUIDrawableHelper.setDrawableTintColor(imgArrow.getDrawable(), color);
    }
}
