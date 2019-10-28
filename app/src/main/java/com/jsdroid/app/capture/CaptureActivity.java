package com.jsdroid.app.capture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jsdroid.app.R;

public class CaptureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CaptureView captureView = new CaptureView(this);
        setContentView(captureView);
        long captureId = getIntent().getLongExtra("capture", -1);
        captureView.setCaptureId(captureId);
    }
}
