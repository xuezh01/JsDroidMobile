package com.jsdroid.app.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jsdroid.app.App;

public class InstallActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("正在安装JsDroid...");
        setContentView(textView);
        new Thread(new Runnable() {
            @Override
            public void run() {
                App.getInstance().installMultiDex();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        MainActivity.open(InstallActivity.this);
                        finish();
                    }
                });
            }
        }).start();
    }
}
