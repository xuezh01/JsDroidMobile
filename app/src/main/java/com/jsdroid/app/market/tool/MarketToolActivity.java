package com.jsdroid.app.market.tool;

import android.content.Context;
import android.content.Intent;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.market.tool.info.ToolInfoView;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.app.utils.Emojis;
import com.jsdroid.app.view.LoadListView;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdTool;
import com.jsdroid.server.bean.JsdToolComment;
import com.jsdroid.server.bean.JsdUser;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.pullRefreshLayout.QMUIPullRefreshLayout;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;

public class MarketToolActivity extends BaseActivity<MarketToolActivity, MarketToolPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.listView)
    LoadListView listView;
    DataAdapter dataAdapter;
    @BindView(R.id.btnAddComment)
    View btnAddComment;
    private JsdTool tool;

    @BindView(R.id.refreshLayout)
    QMUIPullRefreshLayout refreshLayout;

    @Override
    protected MarketToolPresenter createPresenter() {
        return new MarketToolPresenter();
    }

    @Override
    protected MarketToolActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_market_tool;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
        dataAdapter = new DataAdapter(this);
        dataAdapter.addDataRender(new ToolCommentRender());
        listView.setAdapter(dataAdapter);
    }

    public void finishRefresh() {
        refreshLayout.finishRefresh();
        listView.loadComplete();
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnAddComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addComment();
            }
        });
        listView.setOnLoadListener(new LoadListView.OnLoadListener() {
            @Override
            public void onLoad(LoadListView loadListView) {
                getPresenter().loadMoreComments();
            }
        });
        refreshLayout.setOnPullListener(new QMUIPullRefreshLayout.OnPullListener() {
            @Override
            public void onMoveTarget(int offset) {

            }

            @Override
            public void onMoveRefreshView(int offset) {

            }

            @Override
            public void onRefresh() {
                getPresenter().refresh();
            }
        });
        toolInfoView.setZanOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().addZan();
            }
        });
        toolInfoView.setInstallOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().installOrOpen();
            }
        });
    }

    /**
     * 评论
     */
    private void addComment() {
        if (tool == null) {
            return;
        }
        Dialogs.input(this, "评论", "评论内容", InputType.TYPE_CLASS_TEXT, new Dialogs.InputListener() {
            @Override
            public void onInput(String content) {
                getPresenter().pushComment(content);
            }

            @Override
            public void onAction(int pos) {

            }

            @Override
            public void onCancel() {

            }
        });
    }


    public void addComments(List comments, boolean clear) {
        if (comments == null) {
            return;
        }
        if (clear) {
            dataAdapter.clear();
        }
        for (Object comment : comments) {
            dataAdapter.addData(comment);
        }
        dataAdapter.notifyDataSetChanged();
    }


    ToolInfoView toolInfoView;

    @Override
    protected void initViews() {
        super.initViews();
        toolInfoView = new ToolInfoView(this);
        toolInfoView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        listView.addHeaderView(toolInfoView);
    }

    public void showTool(JsdTool tool) {
        this.tool = tool;
        topBar.setTitle(tool.getName());
        toolInfoView.showTool(tool);
        toolInfoView.setInstallText(getPresenter().hasInstall() ? "打开" : "安装");
    }

    public void showDevUser(JsdUser jsdUser) {
        if (jsdUser == null) {
            return;
        }
        toolInfoView.showDevUser(jsdUser);
    }

    public static void open(Context context, int toolId) {
        Intent intent = new Intent(context, MarketToolActivity.class);
        intent.putExtra("toolId", toolId);
        context.startActivity(intent);
    }

    public void showZan(boolean zan) {
        toolInfoView.showZan(zan);
    }

    /**
     * 回复消息渲染
     */
    class ToolCommentRender extends DataAdapter.DataRender {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        @Override
        public int getLayoutId() {
            return R.layout.market_tool_comment_view;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof JsdToolComment;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            JsdToolComment comment = (JsdToolComment) data;
            DataAdapter.ViewTool viewTool = viewHolder.createViewTool();
            TextView textCommentContent = viewHolder.getView(R.id.textCommentContent);
            textCommentContent.setText(null);
            String content = comment.getContent();
            try {
                content = Emojis.emojiRecovery(content);
            } catch (Exception e) {
            }
            viewTool.setText(R.id.textCommentContent, content);
            viewTool.setText(R.id.userName, comment.getUserName());
            //评论时间
            Date createTime = comment.getCreateTime();
            if (createTime == null) {
                createTime = new Date();
            }
            viewTool.setText(R.id.textCommentTime, dateFormat.format(createTime));
            //加载头像
            Picasso.with(viewTool.getContext()).load(JsdApi.getAvatarUrl(comment.getAvatar()))
                    .placeholder(R.drawable.default_user_icon)
                    .into((ImageView) viewTool.findView(R.id.userIcon));
        }
    }
}
