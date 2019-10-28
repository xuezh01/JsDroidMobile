package com.jsdroid.app.activity;

import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.ui.ViewScript;
import com.jsdroid.ui.closure.XmlActivity;
import com.jsdroid.ui.parser.ViewParser;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;

public class ToolPresenter extends BasePresenter<ToolActivity> {
    private ViewScript viewScript;

    public ViewScript getViewScript() {
        return viewScript;
    }

    public void setViewScript(ViewScript viewScript) {
        this.viewScript = viewScript;
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (viewScript != null) {
            viewScript.onResume();
        }
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        if (viewScript != null) {
            viewScript.fireDestroyed();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (viewScript != null) {
            viewScript.firePause();
        }
    }

}
