package com.jsdroid.ui.closure;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.ui.parser.ViewParser;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import groovy.lang.Binding;
import groovy.lang.Closure;

public abstract class XmlView extends Closure {
    private ViewParser.ViewContainer viewContainer;
    private Context context;
    private JsdContext jsdContext;

    public XmlView(Context context) {
        super(new Binding());
        this.context = context;
    }

    public XmlView(Context context, JsdContext jsdContext, String xmlFile) throws ParserConfigurationException, SAXException, IOException {
        super(new Binding());
        this.context = context;
        this.jsdContext = jsdContext;
        setView(xmlFile);
    }


    public XmlView(Context context, Map map) {
        super(new Binding());
        this.context = context;
        setView(map);
    }

    public XmlView(Context context, JsdContext jsdContext, StringBuilder xmlSource) throws ParserConfigurationException, SAXException, IOException {
        super(new Binding());
        this.context = context;
        this.jsdContext = jsdContext;
        setView(xmlSource);
    }

    private XmlView setView(StringBuilder xmlSource) throws IOException, SAXException, ParserConfigurationException {
        this.viewContainer = ViewParser.parseXml(jsdContext, xmlSource.toString());
        initView();
        return this;
    }

    public XmlView setView(Map map) {
        this.viewContainer = ViewParser.parseMap(jsdContext, map);
        initView();
        return this;
    }

    public XmlView setView(String xmlFile) throws IOException, SAXException, ParserConfigurationException {
        this.viewContainer = ViewParser.parseXml(jsdContext, jsdContext.read(xmlFile));
        initView();
        return this;
    }


    protected abstract void updateView();

    protected void initView() {
        if (viewContainer != null) {
            viewContainer.initView(context);
            for (String name : viewContainer.viewMap.keySet()) {
                setProperty(name,
                        viewContainer.viewMap.get(name));
            }
        }
    }

    public View getView() {
        if (viewContainer == null) {
            try {
                setView("loading.xml");
            } catch (Exception e) {
                Log.e("testShow", "view is null");
                return null;
            }
        }
        return viewContainer.getView();
    }

    public Context getContext() {
        return context;
    }

    public ViewParser.ViewContainer getContainer() {
        return viewContainer;
    }
}
