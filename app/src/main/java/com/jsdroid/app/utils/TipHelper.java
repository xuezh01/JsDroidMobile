package com.jsdroid.app.utils;

import android.content.Context;

import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

public class TipHelper {
    public static QMUITipDialog showTip(Context context, int type, String content) {

        QMUITipDialog.Builder builder = new QMUITipDialog.Builder(context);
        builder.setTipWord(content);
        builder.setIconType(type);
        QMUITipDialog qmuiTipDialog = builder.create();
        if (type == QMUITipDialog.Builder.ICON_TYPE_LOADING) {
            qmuiTipDialog.setCancelable(false);
        } else {
            qmuiTipDialog.setCancelable(true);
        }
        qmuiTipDialog.setCanceledOnTouchOutside(true);
        qmuiTipDialog.show();
        return qmuiTipDialog;
    }

    public static QMUITipDialog showError(Context context, String error) {
        return showTip(context, QMUITipDialog.Builder.ICON_TYPE_FAIL, error);
    }

    public static QMUITipDialog showInfo(Context context, String info) {
        return showTip(context, QMUITipDialog.Builder.ICON_TYPE_INFO, info);
    }

    public static QMUITipDialog showLoading(Context context, String loading) {
        return showTip(context, QMUITipDialog.Builder.ICON_TYPE_LOADING, loading);
    }

    public static QMUITipDialog showSuccess(Context context, String success) {
        return showTip(context, QMUITipDialog.Builder.ICON_TYPE_SUCCESS, success);
    }
}
