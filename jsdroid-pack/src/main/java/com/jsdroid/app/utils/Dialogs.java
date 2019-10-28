package com.jsdroid.app.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;

import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

public class Dialogs {
    public interface DialogListener {
        void onAction(int pos);

        void onCancel();
    }

    public interface InputListener extends DialogListener {
        void onInput(String content);
    }

    public static EditText input(Context context, String title, String placeholder, Integer inputType, final InputListener inputListener) {
        final QMUIDialog.EditTextDialogBuilder builder = new QMUIDialog.EditTextDialogBuilder(context);
        builder.addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        inputListener.onCancel();
                    }
                }
        );
        builder.addAction("确定", new QMUIDialogAction.ActionListener() {
            @Override
            public void onClick(QMUIDialog dialog, int index) {
                dialog.dismiss();
                String edit = builder.getEditText().getText().toString();
                if (inputListener != null) {
                    inputListener.onInput(edit);
                }
            }
        });
        if (inputType != null) {
            builder.setInputType(inputType);
        }
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setPlaceholder(placeholder);
        builder.create().show();
        return builder.getEditText();
    }


    public static QMUIDialog showDialog(final Context context, String title, String content, QMUIDialogAction... actions) {
        QMUIDialog.MessageDialogBuilder builder = new QMUIDialog.MessageDialogBuilder(context);
        builder.setTitle(title);
        builder.setMessage(content);
        if (actions != null) {
            for (QMUIDialogAction action : actions) {
                builder.addAction(action);
            }
        }
        QMUIDialog dialog = builder.create();
        dialog.show();
        return dialog;
    }

    public static QMUIDialogAction newAction(Context context, String action, QMUIDialogAction.ActionListener actionListener) {
        return new QMUIDialogAction(context, action, actionListener);
    }

    public static QMUIDialogAction cancelAction(Context context) {
        return cancelAction(context, "取消");
    }

    public static QMUIDialogAction cancelAction(Context context, String text) {
        return newAction(context, text, new QMUIDialogAction.ActionListener() {
            @Override
            public void onClick(QMUIDialog dialog, int index) {
                dialog.dismiss();
            }
        });
    }

    private static QMUITipDialog showTip(Context context, int type, String content) {
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

    public static QMUIDialog showMenu(View view, String title, DialogInterface.OnClickListener listener, String... items) {
        QMUIDialog.MenuDialogBuilder dialogBuilder = new QMUIDialog.MenuDialogBuilder(view.getContext());
        dialogBuilder.addItems(items, listener);
        dialogBuilder.setTitle(title);
        QMUIDialog dialog = dialogBuilder.create();
        dialog.show();
        return dialog;
    }
}
