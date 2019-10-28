package com.jsdroid.ui.closure;

import android.app.Activity;

import com.jsdroid.api.context.JsdContext;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

public class XmlActivity extends XmlView {
    private Activity activity;

    public XmlActivity(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    public XmlActivity(Activity activity, JsdContext jsdContext, String xmlFile) throws ParserConfigurationException, SAXException, IOException {
        super(activity, jsdContext, xmlFile);
        this.activity = activity;
    }

    public XmlActivity(Activity activity, JsdContext jsdContext, StringBuilder xmlSource) throws IOException, SAXException, ParserConfigurationException {
        super(activity, jsdContext, xmlSource);
        this.activity = activity;
    }

    public XmlActivity(Activity activity, Map map) {
        super(activity, map);
        this.activity = activity;
    }


    public XmlActivity showView() {
        activity.setContentView(getView());
        return this;
    }

    public void finish() {
        if (activity != null) {
            activity.finish();
        }
    }

    public Activity getActivity() {
        return activity;
    }

    @Override
    protected void updateView() {
        if (activity != null) {
            activity.setContentView(getView());
        }
    }
}
