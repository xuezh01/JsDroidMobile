package com.jsdroid.app.market.tool.info;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.mvp.view.BaseView;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdTool;
import com.jsdroid.server.bean.JsdUser;
import com.jsdroid.server.utils.Integers;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import com.squareup.picasso.Picasso;

import butterknife.BindView;

public class ToolInfoView extends BaseView<ToolInfoView, TooInfoPresenter> {
    DataAdapter.ViewTool viewTool;
    @BindView(R.id.imgZan)
    ImageView imgZan;

    @BindView(R.id.btnZan)
    View btnZan;
    @BindView(R.id.btnInstallTool)
    QMUIRoundButton btnInstallTool;

    public ToolInfoView(Context context) {
        super(context);
        viewTool = new DataAdapter.ViewTool(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.market_tool_info_view;
    }

    @Override
    protected TooInfoPresenter createPresenter() {
        return new TooInfoPresenter();
    }

    public void showDevUser(JsdUser user) {
        //加载开发者资料
        viewTool.setText(R.id.devName, user.getUserName());
        //重置头像
        Picasso.with(getContext()).load(JsdApi.getAvatarUrl(user.getAvatar()))
                .placeholder(R.drawable.default_user_icon)
                .into((ImageView) viewTool.findView(R.id.devUserIcon));

    }

    public void showZan(boolean zan) {
        if (zan) {
            imgZan.setImageResource(R.drawable.favorite_fill);
            imgZan.setColorFilter(Color.RED);
        } else {
            imgZan.setImageResource(R.drawable.favorite_outline);
            imgZan.setColorFilter(0xffaaaaaa);
        }
    }

    public void showTool(JsdTool tool) {
        //应用图标
        ImageView logo = viewTool.findView(R.id.imgLogo);
        Picasso.with(logo.getContext()).load(JsdApi.getOssUrl(tool.getIcon())).placeholder(R.drawable.logo_blue_dark).into(logo);
        //应用名称
        viewTool.setText(R.id.textName, tool.getName());
        //版本号
        viewTool.setText(R.id.textVersion, "版本:" + tool.getVersion());

        //介绍文字
        viewTool.setText(R.id.textNote, "介绍：" + (tool.getNote() == null ? "无" : tool.getNote()));
        //评论数量
        viewTool.setText(R.id.textCommentCount, Integers.toString(tool.getCommentCount()));
        //点赞数量
        viewTool.setText(R.id.textZanCount, Integers.toString(tool.getZanCount()));
        //下载数量
        viewTool.setText(R.id.textDownCount, Integers.toString(tool.getDownloadCount()));

    }

    public void setZanOnClickListener(OnClickListener clickListener) {
        btnZan.setOnClickListener(clickListener);
    }

    public void setInstallOnClickListener(OnClickListener clickListener) {
        btnInstallTool.setOnClickListener(clickListener);

    }

    public void setInstallText(String text) {
        btnInstallTool.setText(text);
    }
}
