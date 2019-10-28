package com.jsdroid.app.utils;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;

import java.io.File;

public class Shares {
    // 調用系統方法分享文件
    public static void shareFile(Context context, File file) {
        if (null != file && file.exists()) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            Uri uriForFile;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) { //7.0以上版本，需要配置权限才能安装未知来源的程序:本代码的处理是使用FileProvider读取Uri资源
                //参数1-上下文, 参数2-Provider地址(与AndroidManifest.xml文件中保持一致)   参数3-apk文件
                uriForFile = FileProvider.getUriForFile(context, "com.jsdroid.app.provider", file);
                //添加这一句表示对目标应用临时授权该Uri所代表的文件
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            } else {
                uriForFile = Uri.fromFile(file);
            }
            intent.putExtra(Intent.EXTRA_STREAM, uriForFile);
            intent.setType(getMimeType(file.getAbsolutePath()));//此处可发送多种文件
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            context.startActivity(Intent.createChooser(intent, "分享文件"));
        }
    }

    // 根据文件后缀名获得对应的MIME类型。
    private static String getMimeType(String filePath) {
        MediaMetadataRetriever mmr = new MediaMetadataRetriever();
        String mime = "*/*";
        if (filePath != null) {
            try {
                mmr.setDataSource(filePath);
                mime = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_MIMETYPE);
            } catch (IllegalStateException e) {
                return mime;
            } catch (IllegalArgumentException e) {
                return mime;
            } catch (RuntimeException e) {
                return mime;
            }
        }
        return mime;
    }
}
