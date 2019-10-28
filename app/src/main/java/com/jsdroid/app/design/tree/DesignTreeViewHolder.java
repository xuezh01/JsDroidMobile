package com.jsdroid.app.design.tree;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;

public class DesignTreeViewHolder extends RecyclerView.ViewHolder {
    public TextView textInfo;
    public ImageView imgArrow;
    public View content;

    public DesignTreeViewHolder(View itemView) {
        super(itemView);
        textInfo = itemView.findViewById(R.id.text_info);
        textInfo.setTextColor(Color.WHITE);
        imgArrow = itemView.findViewById(R.id.img_arrow);
        imgArrow.setColorFilter(Color.WHITE);
        content = itemView.findViewById(R.id.content);
        imgArrow.setColorFilter(Color.WHITE);
        //菜单按钮点击事件与选项长按事件同时呼出菜单
        itemView.findViewById(R.id.btn_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemView.performLongClick();
            }
        });
    }

    public void setArrow(boolean open) {
        if (open) {
            imgArrow.setImageResource(R.drawable.ic_arrow_open);
        } else {
            imgArrow.setImageResource(R.drawable.ic_arrow_close);
        }
        imgArrow.setColorFilter(Color.WHITE);
    }

    public void showArrow(boolean show) {
        if (show) {
            imgArrow.setVisibility(View.VISIBLE);
        } else {
            imgArrow.setVisibility(View.INVISIBLE);
        }
    }

    public void setTextInfo(String textInfo) {
        this.textInfo.setText(textInfo);
    }

    public void setSelected(boolean selected) {
        if (selected) {
            int color = content.getResources().getColor(R.color.colorPrimary);
            color = color << 8 >> 8;
            color = 0xaa << 24 | color;
            content.setBackgroundColor(color);
        } else {
            content.setBackground(null);
        }
    }

}