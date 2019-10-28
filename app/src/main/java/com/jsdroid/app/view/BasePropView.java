package com.jsdroid.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jsdroid.app.R;
import com.jsdroid.app.utils.ClipboardUtil;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

public class BasePropView extends TextView {
    private String propName;

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public interface OnPropChangedListener {
        void onChanged(BasePropView propView);
    }

    private OnPropChangedListener onPropChangedListener;

    public void setOnPropChangedListener(OnPropChangedListener onPropChangedListener) {
        this.onPropChangedListener = onPropChangedListener;
    }

    public BasePropView(Context context) {
        this(context, null);
    }

    public BasePropView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setTextColor(Color.WHITE);
        setHintTextColor(Color.LTGRAY);

        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.designView);
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int attrName = typedArray.getIndex(i);
                if (attrName == R.styleable.designView_propName) {
                    String string = typedArray.getString(attrName);
                    setPropName(string);
                }
                if (attrName == R.styleable.designView_propStyle) {
                    String propStyle = typedArray.getString(attrName);
                    if (propStyle.equals("2")) {
                        if (getBackground() == null) {
                            setBackgroundResource(R.drawable.selector_rect_gray);
                        }
                        setTextColor(Color.BLACK);
                        setHintTextColor(Color.DKGRAY);

                    }
                }
            }
        }
        if (getText().length() > 0) {
            setProperty(getText().toString());
        }
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String property = getProperty();
                if (property != null) {
                    ClipboardUtil.copy(getContext(), property);
                }
                Toast.makeText(getContext(), "复制成功~", Toast.LENGTH_SHORT).show();
            }
        });
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.selector_rect);

        }
    }


    public void setProperty(String property, boolean fireChanged) {
        if (property == null) {
            property = "";
        }
        int hintTextColor = getCurrentHintTextColor();
        CharSequence hint = getHint();
        SpannableStringBuilder text = new SpannableStringBuilder(hint + property);
        text.setSpan(new ForegroundColorSpan(hintTextColor), 0, hint.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(text);
        if (fireChanged && onPropChangedListener != null) {
            onPropChangedListener.onChanged(this);
        }
    }

    public void setProperty(String property) {
        setProperty(property, true);
    }

    public String getProperty() {
        CharSequence hint = getHint();
        if (getText().length() > hint.length()) {
            return getText().toString().substring(hint.length());
        }
        return null;
    }

    public void input(String placeholder) {
        input("请输入" + getHint().toString().replace(": ", ""), placeholder, null);
    }

    public void input(String placeholder, Integer inputType) {
        input("请输入" + getHint().toString().replace(": ", ""), placeholder, inputType);
    }

    public EditText input(String title, String placeholder, Integer inputType) {
        final QMUIDialog.EditTextDialogBuilder builder = new QMUIDialog.EditTextDialogBuilder(getContext());
        builder.addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                }
        );
        builder.addAction("确定", new QMUIDialogAction.ActionListener() {
            @Override
            public void onClick(QMUIDialog dialog, int index) {
                dialog.dismiss();
                String edit = builder.getEditText().getText().toString();
                setProperty(edit);

            }
        });
        if (inputType != null) {
            builder.setInputType(inputType);
        }
        builder.setTitle(title);
        builder.setPlaceholder(placeholder);
        builder.setDefaultText(getProperty());
        builder.create().show();
        return builder.getEditText();
    }

    public interface InputListener {
        void onInput(String text);
    }

    public EditText input(String title, String placeholder, Integer inputType, InputListener inputListener) {
        final QMUIDialog.EditTextDialogBuilder builder = new QMUIDialog.EditTextDialogBuilder(getContext());
        builder.addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                }
        );
        builder.addAction("确定", new QMUIDialogAction.ActionListener() {
            @Override
            public void onClick(QMUIDialog dialog, int index) {
                dialog.dismiss();
                if (inputListener != null) {
                    String edit = builder.getEditText().getText().toString();
                    inputListener.onInput(edit);
                }

            }
        });
        if (inputType != null) {
            builder.setInputType(inputType);
        }
        builder.setTitle(title);
        builder.setPlaceholder(placeholder);
        builder.create().show();
        return builder.getEditText();
    }
}
