package com.jsdroid.app.design.prop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jsdroid.app.view.BasePropView;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * Prop形式：文字、单选文字、数字、颜色16进制、多个数字
 */
public class PropListView extends LinearLayout implements BasePropView.OnPropChangedListener {

    public interface OnPropChangedListener {

        void onPropChanged(String name, String property, BasePropView propView);
    }

    private int padding;
    private OnPropChangedListener onPropChangedListener;

    public void setOnPropChangedListener(OnPropChangedListener onPropChangedListener) {
        this.onPropChangedListener = onPropChangedListener;
    }

    public PropListView(Context context) {
        this(context, null);
    }

    public PropListView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
        padding = QMUIDisplayHelper.dp2px(getContext(), 10);
        //底部为0
        setPadding(padding, padding, padding, 0);
    }

    @Override
    public void onChanged(BasePropView propView) {
        if (onPropChangedListener != null) {
            onPropChangedListener.onPropChanged(propView.getPropName(), propView.getProperty(), propView);
        }
    }

    private Map<String, BasePropView> propViewMap = new HashMap<>();

    public void addPropView(String propName, String hint, String propValue) {
        addPropView(propName, hint, propValue, TextPropView.class);
    }


    public void addPropView(String propName, String hint, String propValue, Class<? extends BasePropView> propType) {
        if (propViewMap.containsKey(propName)) {
            return;
        }
        BasePropView propView;
        if (propType != null) {
            try {
                propView = propType.getConstructor(Context.class).newInstance(getContext());
            } catch (Exception e) {
                return;
            }
        } else {
            propView = new BasePropView(getContext());
        }
        propView.setOnPropChangedListener(this);
        propViewMap.put(propName, propView);
        propView.setHint(hint + ": ");
        propView.setPropName(propName);
        propView.setProperty(propValue, false);
        addView(propView);
        propView.setPadding(padding, padding, padding, padding);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 0, 0, padding);
        propView.setLayoutParams(params);

    }

    public void removePropView(String propName) {
        if (propViewMap.containsKey(propName)) {
            BasePropView remove = propViewMap.remove(propName);
            removeView(remove);
        }
    }

    public void showPropView(String propName) {
        if (propViewMap.containsKey(propName)) {
            BasePropView basePropView = propViewMap.get(propName);
            basePropView.setVisibility(VISIBLE);
        }
    }

    public void hidePropView(String propName) {
        if (propViewMap.containsKey(propName)) {
            BasePropView basePropView = propViewMap.get(propName);
            basePropView.setVisibility(GONE);
        }
    }

    public void setProp(String propName, String propValue, boolean fireChanged) {
        if (propViewMap.containsKey(propName)) {
            BasePropView basePropView = propViewMap.get(propName);
            basePropView.setProperty(propValue, fireChanged);
        }
    }

    public void setProp(String propName, String propValue) {
        setProp(propName, propValue, true);
    }

    public String getProp(String propName) {
        if (propViewMap.containsKey(propName)) {
            BasePropView basePropView = propViewMap.get(propName);
            return basePropView.getProperty();
        }
        return null;
    }

    public void resetAll() {
        for (BasePropView basePropView : propViewMap.values()) {
            basePropView.setProperty(null, false);
        }
    }


}
