package com.jsdroid.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.api.mannager.ConfigManager;

import groovy.lang.Closure;

public class Edit extends JsdView {
    private TextWatcher textWatcher;

    public Edit(JsdContext jsdContext) {
        super(jsdContext);
    }

    @Override
    protected View createView(Context context) {
        EditText editText = new EditText(context);
        if (name != null) {
            if (ConfigManager.getInstance().contains(name + ".text")) {
                text = ConfigManager.getInstance().readString(name + ".text");
                editText.setText(text);
            }

        }
        editText.setHint(hint);
        if (textColor != 0) {
            editText.setTextColor(textColor);
        }
        if (hintColor != 0) {
            editText.setHintTextColor(hintColor);
        }
        if (textSize != 0) {
            editText.setTextSize(textSize);
        }
        if (lines != 0) {
            editText.setLines(lines);
        }
        if (inputType != null) {
            if (inputType.startsWith("num")) {//number
                editText.setInputType(InputType.TYPE_CLASS_NUMBER);
            } else if (inputType.startsWith("pass") || inputType.startsWith("pwd")) {//password
                editText.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                editText.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
            }
        }
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (name != null) {
                    text = s.toString();
                    ConfigManager.getInstance().saveString(name + ".text", text);
                }
                if (textWatcher != null) {
                    textWatcher.onTextChanged(s, start, before, count);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return editText;
    }

    public void onText(final Closure closure) {
        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                closure.call(Edit.this, s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

    }

    public void setText(String text) {
        this.text = text;
        TextView textView = (TextView) view;
        textView.setText(text);
    }

    @Override
    public String getDesc() {
        return "编辑框";
    }
}
