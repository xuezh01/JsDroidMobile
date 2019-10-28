package com.jsdroid.ui.closure;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

import com.jsdroid.api.context.JsdContext;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

public class XmlDialog extends XmlView {

    private Dialog dialog;

    public XmlDialog(Context context) {
        super(context);
        init();
    }

    public XmlDialog(Context context, JsdContext jsdContext, String xmlFile) throws ParserConfigurationException, SAXException, IOException {
        super(context, jsdContext, xmlFile);
        init();
    }

    public XmlDialog(Context context, Map map) {
        super(context, map);
        init();
    }

    private void init() {
        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    protected void updateView() {
        if (dialog != null) {
            dialog.setContentView(getView());
        }
    }


    public XmlDialog showDialog() {
        dialog.setContentView(getView());
        dialog.show();
        return this;
    }

    public XmlDialog dismiss() {
        if (dialog != null) {
            dialog.dismiss();
        }
        return this;
    }

    public XmlDialog close() {
        if (dialog != null) {
            dialog.dismiss();
        }
        return this;
    }
}
