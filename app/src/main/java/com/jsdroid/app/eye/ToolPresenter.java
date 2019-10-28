package com.jsdroid.app.eye;

import android.util.Log;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.ui.ViewScript;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;

public class ToolPresenter extends BasePresenter<ToolActivity> {
    private ViewScript viewScript;

    public ViewScript getViewScript() {
        return viewScript;
    }

    public void installJsd(File file) {
        QMUITipDialog loading = getView().showLoading("正在安装。。。");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Tool install = JsdTool.getInstance().install(file.getPath());
                    loadScript(install.pkg);
                } catch (Exception e) {
                } finally {
                    loading.dismiss();
                }

            }
        }).start();

    }

    public void loadScript(String pkg) {
        //设置当前脚本
        JsdCore.getInstance().setCurrentScript(pkg);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Class<?> mainView = JsdTool.getInstance().getClassLoader(pkg).loadClass("MainView");
                    viewScript = (ViewScript) mainView.newInstance();
                    viewScript.activity = getView();
                    viewScript.pkg = pkg;
                    viewScript.jsdContext = JsdContext.getInstance(pkg);
                    viewScript.jsdContext.addDirectory(JsdTool.getInstance().getSourceDir(pkg));
                    viewScript.dir = JsdTool.getInstance().getInstallDir(pkg);

                    viewScript.app = new ViewScript.IApp() {
                        @Override
                        public void showFloatMenu() {
                            JsdOption.getInstance().setShowFloatMenu(true);
                        }

                        @Override
                        public void hideFloatMenu() {
                            JsdOption.getInstance().setShowFloatMenu(false);
                        }

                    };
                    JsDroidApp.getInstance().addViewScript(viewScript);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            viewScript.run();
                            viewScript.fireCreate();
                        }
                    });
                } catch (Throwable e) {
                    getView().showError("异常！", JsdCore.getInstance().printError(e));
                }
            }
        }).start();

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

    public void showXml(String xml) {
        postCheckView(new Check<ToolActivity>() {
            @Override
            public void ok(ToolActivity view) {
                if (viewScript != null) {
                    try {
                        viewScript.showView(new StringBuilder(xml));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
