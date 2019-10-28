package com.jsdroid.ui.closure;

import android.content.Context;

import com.jsdroid.api.context.JsdContext;
import com.yhao.floatwindow.FloatRootView;
import com.yhao.floatwindow.FloatWindow;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

public class XmlFloat extends XmlView {
    private String tag = "ScriptFloatView";
    private FloatRootView floatRootView;

    public XmlFloat(Context context) {
        super(context.getApplicationContext());
    }

    public XmlFloat(Context context, JsdContext jsdContext, String xmlFile) throws ParserConfigurationException, SAXException, IOException {
        super(context.getApplicationContext(), jsdContext, xmlFile);
    }

    public XmlFloat(Context context, Map map) {
        super(context.getApplicationContext(), map);
    }

    public XmlFloat setTag(String tag) {
        if (tag != null) {
            this.tag = tag;
        }
        return this;
    }

    @Override
    protected void initView() {
        super.initView();

    }

    public XmlFloat show() {
        if (FloatWindow.get(tag) == null) {
            floatRootView = new FloatRootView(getContext());
            floatRootView.addView(getView());
            FloatWindow.with(getContext())
                    .setTag(tag)
                    .setView(floatRootView)
                    .setDesktopShow(true)
                    .build();
            floatRootView.setFloatWindow(FloatWindow.get(tag));
        } else {
            floatRootView = (FloatRootView) FloatWindow.get(tag).getView();
            updateView();
        }
        FloatWindow.get(tag).show();
        return this;
    }

    /**
     * 更新界面
     */
    public void updateView() {
        if (floatRootView != null) {
            floatRootView.removeAllViews();
            floatRootView.addView(getView());
        }
    }

    /**
     * 移动到边界，传说中的靠边
     */
    public XmlFloat toSide() {
        try {
            FloatWindow.get(tag).toSide();
        } catch (Exception e) {
        }
        return this;
    }

    /**
     * 自动靠边，手指释放后，自动往边界移动
     *
     * @param autoToSide
     * @return
     */
    public XmlFloat setAutoToSide(boolean autoToSide) {
        try {
            FloatWindow.get(tag).setAutoToSide(autoToSide);
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat toRight() {

        try {
            FloatWindow.get(tag).toRight();
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat toBottom() {
        try {
            FloatWindow.get(tag).toBottom();
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat toCenterX() {
        try {
            FloatWindow.get(tag).toCenterX();
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat toCenterY() {
        try {
            FloatWindow.get(tag).toCenterY();
        } catch (Exception e) {
        }
        return this;
    }

    public int width() {

        return FloatWindow.get(tag).getWidth();
    }

    public int height() {
        return FloatWindow.get(tag).getHeight();
    }

    public XmlFloat hide() {
        FloatWindow.get(tag).hide();
        return this;
    }

    public int x() {
        return FloatWindow.get(tag).getX();
    }

    public int y() {
        return FloatWindow.get(tag).getY();
    }

    public XmlFloat x(int x) {
        try {
            FloatWindow.get(tag).updateX(x);
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat y(int y) {
        try {
            FloatWindow.get(tag).updateY(y);
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat flags(int flags) {
        try {
            FloatWindow.get(tag).setFlags(flags);
        } catch (Exception e) {
        }
        return this;
    }

    public XmlFloat destroy() {
        try {
            FloatWindow.destroy(tag);
        } catch (Exception e) {
        }
        return this;
    }
}
