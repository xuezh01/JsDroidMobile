package com.jsdroid.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;

import com.jsdroid.app.R;

public class LoadListView extends ListView implements AbsListView.OnScrollListener {
    public interface OnLoadListener {
        void onLoad(LoadListView loadListView);
    }

    OnLoadListener onLoadListener;
    View footer;
    View loadView;
    TextView loadText;

    public void setOnLoadListener(OnLoadListener onLoadListener) {
        this.onLoadListener = onLoadListener;
    }

    public LoadListView(Context context) {
        super(context);
        initView(context);
    }

    public LoadListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    void initView(Context context) {
        footer = LayoutInflater.from(context).inflate(R.layout.layout_footer_load, null);
        loadView = footer.findViewById(R.id.loadView);
        loadText = footer.findViewById(R.id.loadText);
        addFooterView(footer);
        setOnScrollListener(this);
        loadMore();
        footer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                loadMore();
            }
        });

    }

    public void loadMore() {
        loadView.setVisibility(VISIBLE);
        loadText.setText("正在加载...");
        if (onLoadListener != null) {
            onLoadListener.onLoad(this);
        }
        load = false;
    }

    public void loadComplete() {
        loadView.setVisibility(GONE);
        loadText.setText("没有更多数据~");
    }

    private boolean load;

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        // OnScrollListener.SCROLL_STATE_FLING; //屏幕处于甩动状态
        // OnScrollListener.SCROLL_STATE_IDLE; //停止滑动状态
        // OnScrollListener.SCROLL_STATE_TOUCH_SCROLL;// 手指接触状态
        if (scrollState == SCROLL_STATE_IDLE) {
            if (load) {
                loadMore();
            }
        }
    }

    /**
     * @param view
     * @param firstVisibleItem 当前窗口中能看见的第一个列表项ID（从0开始）关于这个参数的详细理解可参考这里
     * @param visibleItemCount 当前窗口中能看见的列表项的个数（小半个也算）
     * @param totalItemCount   列表项的总数
     */

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        //如果最后的数量等于列表总数量，则加载更多的内容
        if (firstVisibleItem + visibleItemCount == totalItemCount) {
            load = true;
        }
    }
}

