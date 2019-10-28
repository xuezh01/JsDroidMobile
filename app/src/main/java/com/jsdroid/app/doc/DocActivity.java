package com.jsdroid.app.doc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.jsdroid.app.R;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

import butterknife.BindView;

public class DocActivity extends BaseActivity<DocActivity, DocPresenter> {
    @BindView(R.id.webView)
    WebView webView;
    @BindView(R.id.topBar)
    QMUITopBar topBar;

    @Override
    protected DocPresenter createPresenter() {
        return new DocPresenter();
    }

    @Override
    protected DocActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_doc;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("JsDroid文档");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void initViews() {
        super.initViews();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Nullable
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                return super.shouldInterceptRequest(view, request);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
            }

            QMUITipDialog loading;

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                loading = Dialogs.showLoading(DocActivity.this, "正在加载中。。。");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                loading.dismiss();
            }
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView.loadUrl("http://study.jsdroid.com");
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, DocActivity.class));
    }


}
