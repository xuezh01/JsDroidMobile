package com.jsdroid.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.ui.drawable.RoundBitmapDrawable;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import groovy.lang.Closure;

public abstract class JsdView {
    public JsdContext jsdContext;

    public JsdView(JsdContext jsdContext) {
        this.jsdContext = jsdContext;
    }

    //region View属性
    public float weight;
    public String name;
    public int width;//需要缩放
    public int height;//需要缩放
    public int backgroundColor;
    public int pressedColor;
    public String backgroundImage;
    public String pressedImage;
    public int padding;
    public int paddingLeft;
    public int paddingTop;
    public int paddingRight;
    public int paddingBottom;
    public int margin;
    public int marginLeft;
    public int marginTop;
    public int marginRight;
    public int marginBottom;
    public int borderColor;
    public int pressedBorderColor;
    public int borderSize;
    public int radius;
    //endregion

    //region Check属性
    public boolean checked;
    //endregion

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", hint='" + hint + '\'' +
                ", text='" + text + '\'' +
                ", select=" + select +
                ", childCount=" + (children != null ? children.size() : 0) +
                '}';
    }

    //region Edit属性
    public String hint;
    public String inputType;
    //endregion

    //region Text属性
    public String text;
    public int textColor = Color.BLACK;
    public int textSize;
    public String gravity;
    public int lines;
    public int hintColor;
    //endregion

    //region 层次关系
    public JsdView root;
    public JsdView parent;
    public List<JsdView> children;
    //endregion

    //region Layout属性
    public String orientation;
    //endregion

    //region Spinner属性
    public int select;
    //endregion
    public View view;

    protected abstract View createView(Context context);

    public void measureMarginAndPadding() {

        if (width != 0 && width != LinearLayout.LayoutParams.MATCH_PARENT && width != LinearLayout.LayoutParams.WRAP_CONTENT) {
            if (width == 0) {
                width = 1;
            }
        }
        if (height != 0 && height != LinearLayout.LayoutParams.MATCH_PARENT && height != LinearLayout.LayoutParams.WRAP_CONTENT) {
            if (height == 0) {
                height = 1;
            }
        }
        if (paddingLeft == 0) {
            paddingLeft = padding;
        }
        if (paddingTop == 0) {
            paddingTop = padding;
        }
        if (paddingRight == 0) {
            paddingRight = padding;
        }
        if (paddingBottom == 0) {
            paddingBottom = padding;
        }
        if (marginLeft == 0) {
            marginLeft = margin;
        }
        if (marginTop == 0) {
            marginTop = margin;
        }
        if (marginRight == 0) {
            marginRight = margin;
        }
        if (marginBottom == 0) {
            marginBottom = margin;
        }

    }

    static int dp2px(Context context, int dp) {
        if (dp == ViewGroup.LayoutParams.MATCH_PARENT ||
                dp == ViewGroup.LayoutParams.WRAP_CONTENT) {
            return dp;
        }
        return (int) (getDensity(context) * dp + 0.5);
    }

    static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public LinearLayout.LayoutParams createParams(View view) {

        view.setPadding(
                dp2px(view.getContext(), paddingLeft),
                dp2px(view.getContext(), paddingTop),
                dp2px(view.getContext(), paddingRight),
                dp2px(view.getContext(), paddingBottom)
        );
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.leftMargin = dp2px(view.getContext(), marginLeft);
        params.topMargin = dp2px(view.getContext(), marginTop);
        params.rightMargin = dp2px(view.getContext(), marginRight);
        params.bottomMargin = dp2px(view.getContext(), marginBottom);
        params.weight = weight;
        if (width != 0) {
            params.width = dp2px(view.getContext(), width);
        }
        if (height != 0) {
            params.height = dp2px(view.getContext(), height);
        }
        int _gravity = 0;
        if (gravity != null) {
            gravity = gravity.toLowerCase();

            if (gravity.equals("center")) {
                _gravity = Gravity.CENTER;
            }
            if (gravity.contains("horizontal")) {
                _gravity = Gravity.CENTER_HORIZONTAL;
            }
            if (gravity.contains("vertical")) {
                _gravity |= Gravity.CENTER_VERTICAL;
            }
            if (gravity.contains("left")) {
                _gravity = Gravity.LEFT;
            }
            if (gravity.contains("top")) {
                _gravity |= Gravity.TOP;
            }
            if (gravity.contains("bottom")) {
                _gravity |= Gravity.BOTTOM;
            }
            if (gravity.contains("right")) {
                _gravity |= Gravity.RIGHT;
            }
            if (gravity.contains("start")) {
                _gravity = Gravity.START;
            }
            if (gravity.contains("stop")) {
                _gravity = Gravity.END;
            }
        } else {
            _gravity = Gravity.START;

        }
        setGravity(view, _gravity);
        return params;
    }

    protected void setDrawable(Drawable drawable) {
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackground(drawable);
            } else {
                view.setBackgroundDrawable(drawable);
            }
        }

    }

    private void setGravity(Object obj, int gravity) {
        if (obj instanceof LinearLayout) {
            ((LinearLayout) obj).setGravity(gravity);
        }
        if (obj instanceof Spinner) {
            ((Spinner) obj).setGravity(gravity);
        }
        if (obj instanceof TextView) {
            ((TextView) obj).setGravity(gravity);
        }
    }

    protected Drawable createDrawAble(Context context) {
        StateListDrawable selector = new StateListDrawable();

        //focus,pressed
        RoundBitmapDrawable pressedDrawable = new RoundBitmapDrawable(jsdContext);
        pressedDrawable.setCornerRadius(dp2px(context, radius));
        if (pressedColor != 0) {
            pressedDrawable.setColor(pressedColor);
        }
        if (pressedImage != null) {
            pressedDrawable.setBackgroundBitmap(pressedImage);
        }
        if (pressedBorderColor != 0 && borderSize != 0) {
            pressedDrawable.setStroke(borderSize, pressedBorderColor);
        }
        selector.addState(new int[]{android.R.attr.state_focused}, pressedDrawable);
        selector.addState(new int[]{android.R.attr.state_pressed}, pressedDrawable);

        //default
        RoundBitmapDrawable defaultDrawable = new RoundBitmapDrawable(jsdContext);
        defaultDrawable.setCornerRadius(dp2px(context, radius));
        if (backgroundColor != 0) {
            defaultDrawable.setColor(backgroundColor);
        }
        if (backgroundImage != null) {
            defaultDrawable.setBackgroundBitmap(backgroundImage);
        }
        if (borderColor != 0 && borderSize != 0) {
            defaultDrawable.setStroke(borderSize, borderColor);
        }

        selector.addState(new int[]{}, defaultDrawable);

        return selector;
    }

    public void onClick(final Closure closure) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closure.call(JsdView.this);
            }
        });
    }

    public void hide() {
        view.setVisibility(View.GONE);
    }

    public void show() {
        view.setVisibility(View.VISIBLE);
    }

    protected void setParams(LinearLayout.LayoutParams params) {
        view.setLayoutParams(params);
    }

    public void initView(Context context) {
        measureMarginAndPadding();
        if (children != null) {
            for (JsdView child : children) {
                child.initView(context);
            }
        }
        view = this.createView(context);
        if (view != null) {
            setParams(createParams(view));
            setDrawable(createDrawAble(context));
        }
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public boolean isLeaf() {
        return true;
    }

    //控件介绍
    public String getDesc() {
        return null;
    }

    public void setProp(Map propMap, String key) throws NoSuchFieldException {
        if (!propMap.containsKey(key)) {
            return;
        }
        Field field = getClass().getField(key);
        Object data = propMap.get(field.getName());
        if (data == null) {
            return;
        }
        if (field.getType().equals(int.class)) {
            setInt(field, data);
        } else if (field.getType().equals(String.class)) {
            setString(field, data);
        } else if (field.getType().equals(boolean.class)) {
            setBoolean(field, data);
        } else if (field.getType().equals(long.class)) {
            setLong(field, data);
        } else if (field.getType().equals(float.class)) {
            setFloat(field, data);
        } else if (field.getType().equals(double.class)) {
            setDouble(field, data);
        }
    }

    //将属性表解析为属性
    public void setProps(Map propMap) {
        for (Field field : getClass().getFields()) {
            if (!propMap.containsKey(field.getName())) {
                continue;
            }
            Object data = propMap.get(field.getName());
            if (data == null) {
                continue;
            }
            if (field.getType().equals(int.class)) {
                setInt(field, data);
            } else if (field.getType().equals(String.class)) {
                setString(field, data);
            } else if (field.getType().equals(boolean.class)) {
                setBoolean(field, data);
            } else if (field.getType().equals(long.class)) {
                setLong(field, data);
            } else if (field.getType().equals(float.class)) {
                setFloat(field, data);
            } else if (field.getType().equals(double.class)) {
                setDouble(field, data);
            }
        }
    }

    private void setString(Field field, Object value) {
        try {
            field.set(this, value);
        } catch (Exception e) {

        }
    }

    private void setInt(Field field, Object value) {
        if (value instanceof Integer) {
            try {
                field.set(this, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            String data = value.toString();
            //解析颜色
            if (data.startsWith("#")) {
                try {
                    field.set(this, Color.parseColor(data));
                } catch (Exception e1) {
                }
            } else {
                try {
                    //解析match
                    if (data.equals("match")) {
                        field.set(this, LinearLayout.LayoutParams.MATCH_PARENT);
                    } else if (data.equals("wrap")) {
                        field.set(this, LinearLayout.LayoutParams.WRAP_CONTENT);
                    }
                } catch (Exception e) {
                }
                //解析为数字
                try {
                    field.set(this, Integer.parseInt(data));
                } catch (Exception e) {

                }
            }
        }

    }

    private void setLong(Field field, Object value) {
        if (value instanceof Long) {
            try {
                field.set(this, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            String data = value.toString();
            try {
                field.set(this, Long.parseLong(data));
            } catch (Exception e) {
            }
        }
    }

    private void setFloat(Field field, Object value) {
        if (value instanceof Float) {
            try {
                field.set(this, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            String data = value.toString();
            try {
                field.set(this, Float.parseFloat(data));
            } catch (Exception e) {
            }
        }
    }

    private void setDouble(Field field, Object value) {
        if (value instanceof Double) {
            try {
                field.set(this, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            try {
                String data = value.toString();
                field.set(this, Double.parseDouble(data));
            } catch (Exception e) {
            }
        }
    }

    private void setBoolean(Field field, Object value) {
        if (value instanceof Boolean) {
            try {
                field.set(this, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            try {
                String data = value.toString();
                field.set(this, Boolean.parseBoolean(data));
            } catch (Exception e) {
            }
        }
    }
}
