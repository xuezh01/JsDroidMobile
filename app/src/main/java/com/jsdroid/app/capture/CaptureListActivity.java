package com.jsdroid.app.capture;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.ditclear.swipelayout.SwipeDragLayout;
import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.doc.DocActivity;
import com.jsdroid.app.entity.Capture;
import com.jsdroid.app.jsd.JsdCapture;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;

import butterknife.BindView;

public class CaptureListActivity extends BaseActivity<CaptureListActivity, CaptureListPresenter> {

    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.listView)
    ListView listView;
    DataAdapter dataAdapter;

    @Override
    protected CaptureListPresenter createPresenter() {
        return new CaptureListPresenter();
    }

    @Override
    protected CaptureListActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_capture_list;
    }


    @Override
    protected void initViews() {
        super.initViews();
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("截屏列表");
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
        dataAdapter.addDataRender(new DataAdapter.DataRender() {
            @Override
            public int getLayoutId() {
                return R.layout.list_item_capture;
            }

            @Override
            public boolean canFillData(Object data) {
                return data instanceof Capture;
            }

            @Override
            public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
                Capture capture = (Capture) data;
                TextView textView = viewHolder.getView(R.id.text);
                textView.setText(capture.getName());
                //打开
                viewHolder.getView(R.id.content).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SwipeDragLayout swipe = viewHolder.getView(R.id.swipe);
                        swipe.close();
                        getPresenter().open(capture);
                    }
                });
                //删除
                viewHolder.getView(R.id.delete).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SwipeDragLayout swipe = viewHolder.getView(R.id.swipe);
                        swipe.close();
                        getPresenter().delete(capture);
                    }
                });
                //重命名
                viewHolder.getView(R.id.rename).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SwipeDragLayout swipe = viewHolder.getView(R.id.swipe);
                        swipe.close();
                        getPresenter().rename(capture);
                    }
                });

            }
        });
        listView.setAdapter(dataAdapter);
    }
    public static void open(Context context) {
        context.startActivity(new Intent(context, CaptureListActivity.class));
    }
}
