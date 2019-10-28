package com.jsdroid.app.nsd;

import android.net.nsd.NsdServiceInfo;
import android.widget.ListView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;

import butterknife.BindView;

public class NsdActivity extends BaseActivity<NsdActivity, NsdPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.listView)
    ListView listView;

    @Override
    protected NsdPresenter createPresenter() {
        return new NsdPresenter();
    }

    @Override
    protected NsdActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_nsd;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("附近设备");
    }

    DataAdapter dataAdapter;

    @Override
    protected void initAdapters() {
        super.initAdapters();
        dataAdapter = new DataAdapter(this);
        dataAdapter.addDataRender(new NsdRender());
        listView.setAdapter(dataAdapter);
    }

    public void add(NsdServiceInfo nsdServiceInfo) {
        dataAdapter.addData(nsdServiceInfo);
        dataAdapter.notifyDataSetChanged();
    }

    public void remove(NsdServiceInfo serviceInfo) {
        dataAdapter.delete(serviceInfo);
        dataAdapter.notifyDataSetChanged();
    }

    class NsdRender extends DataAdapter.DataRender {

        @Override
        public int getLayoutId() {
            return R.layout.list_item_nsd;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof NsdServiceInfo;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            NsdServiceInfo info = (NsdServiceInfo) data;
            viewHolder.createViewTool().setText(R.id.text, info.getServiceName() + "-" + info.getHost() + "-" + info.getPort());
        }
    }
}
