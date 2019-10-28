package com.jsdroid.app.project.create;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.jph.takephoto.app.TakePhotoActivity;
import com.jph.takephoto.compress.CompressConfig;
import com.jph.takephoto.model.CropOptions;
import com.jph.takephoto.model.TResult;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TakePhoto extends TakePhotoActivity {
    public static final int FAIL = 0;
    public static final int SUCCESS = 1;
    public static final int CANCEL = 2;
    private String saveName;

    public interface TakeListener {
        void onSelected(String path);
    }

    private static List<TakeListener> takeListenerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveName = getIntent().getStringExtra("saveName");
        if (saveName == null) {
            saveName = "photo.png";
        }
        CompressConfig config = new CompressConfig.Builder()
                .create();
        getTakePhoto().onEnableCompress(config, true);

        Uri outUri = Uri.fromFile(new File(getFilesDir(), saveName));
        CropOptions cropOptions = new CropOptions.Builder()
                .setAspectX(1)
                .setAspectY(1)
                .setWithOwnCrop(true)
                .create();
        getTakePhoto().onPickFromGalleryWithCrop(outUri, cropOptions);
    }

    @Override
    public void takeSuccess(TResult result) {
        String path = new File(getFilesDir(), saveName).getPath();
        try {
            for (TakeListener takeListener : takeListenerList) {
                takeListener.onSelected(path);
            }
        } finally {
            takeListenerList.clear();
        }
        Intent intent = new Intent();
        intent.putExtra("image", path);
        setResult(SUCCESS, intent);
        finish();
    }


    @Override
    public void takeFail(TResult result, String msg) {
        setResult(FAIL);
        finish();
    }

    @Override
    public void takeCancel() {
        setResult(CANCEL);
        finish();
    }

    public static void take(Activity context, String saveName, TakeListener takeListener) {
        takeListenerList.add(takeListener);
        Intent intent = new Intent(context, TakePhoto.class);
        intent.putExtra("saveName", saveName);
        context.startActivityForResult(intent, 1);
    }
}
