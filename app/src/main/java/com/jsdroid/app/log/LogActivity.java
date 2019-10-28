package com.jsdroid.app.log;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.entity.Log;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.shell.JsDroidApp;
import com.qmuiteam.qmui.widget.QMUITopBar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;

public class LogActivity extends BaseActivity<LogActivity, LogPresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.listView)
    ListView listView;

    @Override
    protected LogPresenter createPresenter() {
        return new LogPresenter();
    }

    @Override
    protected LogActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_log;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("日志");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button btnClear = topBar.addRightTextButton("清空", 1);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().clearLog();
            }
        });
    }

    DataAdapter dataAdapter;

    @Override
    protected void initAdapters() {
        super.initAdapters();

        dataAdapter = new DataAdapter(this);
        dataAdapter.addDataRender(new LogRender());
        listView.setAdapter(dataAdapter);
    }

    public static void openLog(Context context) {
        context.startActivity(new Intent(context, LogActivity.class));
    }

    public void showLogs(List<Log> list) {
        dataAdapter.setDatas(list);
        dataAdapter.notifyDataSetChanged();
    }

    class LogRender extends DataAdapter.DataRender {

        @Override
        public int getLayoutId() {
            return R.layout.list_item_log;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof Log;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            final Log log = (Log) data;
            DataAdapter.ViewTool viewTool = viewHolder.createViewTool();
            String format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS").format(new Date(log.getTime()));
            if (log.getFilename() != null && log.getFilename().endsWith(".groovy")) {
                viewTool.setText(R.id.fileName, log.getFilename() + "#" + log.getLineNumber());
            } else {
                viewTool.setText(R.id.fileName, "系统日志");
            }
            viewTool.setText(R.id.time, format);
            viewTool.setText(R.id.content, log.getContent());
            TextView view = viewHolder.getView(R.id.type);
            if (log.getType() == Log.TYPE_BUG) {
                view.setText("BUG");
                view.setBackground(getResources().getDrawable(R.drawable.shape_bug));
            } else {
                view.setText("LOG");
                view.setBackground(getResources().getDrawable(R.drawable.shape_log));
            }
            viewHolder.getView(R.id.copy).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String content = log.getContent();
                    ClipboardManager clipboardManager = (ClipboardManager) v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                    //创建ClipData对象
                    ClipData clipData = ClipData.newPlainText("saveScriptLog", content);
                    //添加ClipData对象到剪切板中
                    clipboardManager.setPrimaryClip(clipData);

                }
            });
        }
    }
}
