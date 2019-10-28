package com.jsdroid.app.project.demo;

import android.util.Log;

import com.jsdroid.app.entity.Project;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.project.ProjectListActivity;
import com.jsdroid.app.project.dev.CodeActivity;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.api.JsdDemoApi;
import com.jsdroid.server.bean.JsdDemoProject;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.FileDownloadLargeFileListener;
import com.liulishuo.filedownloader.FileDownloader;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;
import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class DemoProjectPresenter extends BasePresenter<DemoProjectActivity> {
    private static final String TAG = DemoProjectPresenter.class.getName();

    @Override
    protected void onCreate() {
        super.onCreate();
        refresh();
    }

    private int page;

    public void refresh() {
        page = 0;
        loadDemos(page++, true);
    }

    public void loadMore() {
        loadDemos(page++, false);
    }

    private void loadDemos(int page, boolean clear) {
        JsdApi.getInstance().getJsdDemoApi().list(page, 20).enqueue(new Callback<List<JsdDemoProject>>() {
            @Override
            public void onResponse(Call<List<JsdDemoProject>> call, Response<List<JsdDemoProject>> response) {
                postCheckView(new Check<DemoProjectActivity>() {
                    @Override
                    public void ok(DemoProjectActivity view) {
                        if (response.body() != null) {
                            view.showDemos(response.body(), clear);
                        }
                        view.finishRefresh();
                    }
                });
            }

            @Override
            public void onFailure(Call<List<JsdDemoProject>> call, Throwable t) {
                postCheckView(new Check<DemoProjectActivity>() {
                    @Override
                    public void ok(DemoProjectActivity view) {
                        view.finishRefresh();
                    }
                });
            }
        });
    }

    public void createProject(JsdDemoProject demoProject) {
        //下载
        checkView(new Check<DemoProjectActivity>() {
            @Override
            public void ok(DemoProjectActivity view) {
                QMUITipDialog loading = view.showLoading("正在下载...");
                String path = demoProject.getPath();
                File dir = view.getDir("download", 0);
                //下载工具初始化
                FileDownloader.setup(getView());
                File downloadFile = new File(dir, path);
                FileDownloader.getImpl().create(JsdApi.getOssUrl(demoProject.getPath())).setPath(downloadFile.getPath()).setListener(new FileDownloadLargeFileListener() {
                    @Override
                    protected void pending(BaseDownloadTask task, long soFarBytes, long totalBytes) {

                    }

                    @Override
                    protected void progress(BaseDownloadTask task, long soFarBytes, long totalBytes) {

                    }

                    @Override
                    protected void paused(BaseDownloadTask task, long soFarBytes, long totalBytes) {

                    }

                    @Override
                    protected void completed(BaseDownloadTask task) {
                        loading.dismiss();
                        createProject(downloadFile);
                    }

                    @Override
                    protected void error(BaseDownloadTask task, Throwable e) {
                        loading.dismiss();
                        postCheckView(new Check<DemoProjectActivity>() {
                            @Override
                            public void ok(DemoProjectActivity view) {
                                view.showError("下载失败！");
                            }
                        });
                    }

                    @Override
                    protected void warn(BaseDownloadTask task) {
                        loading.dismiss();
                    }
                }).start();
            }
        });

    }

    private void createProject(File downloadFile) {
        postCheckView(new Check<DemoProjectActivity>() {
            @Override
            public void ok(DemoProjectActivity view) {
                Dialogs.input(view, "创建工程", "请输入包名", null, new Dialogs.InputListener() {
                    @Override
                    public void onInput(String content) {
                        createProject(content, downloadFile);
                    }

                    @Override
                    public void onAction(int pos) {

                    }

                    @Override
                    public void onCancel() {

                    }
                }).setText("com.example.tool" + System.currentTimeMillis());
            }
        });
    }

    private void createProject(String pkg, File downloadFile) {
        postCheckView(new Check<DemoProjectActivity>() {
            @Override
            public void ok(DemoProjectActivity view) {
                QMUITipDialog loading = view.showLoading("正在创建工程...");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //修改包名
                        try {
                            JsdProject.getInstance().importDemoProject(pkg, downloadFile);
                            //打开
                            postCheckView(new Check<DemoProjectActivity>() {
                                @Override
                                public void ok(DemoProjectActivity view) {
                                    openProject(pkg);
                                }
                            });
                        } catch (Exception e) {
                            postCheckView(new Check<DemoProjectActivity>() {
                                @Override
                                public void ok(DemoProjectActivity view) {
                                    view.showError("创建失败！");
                                }
                            });
                            Log.e(TAG, "创建工程: ", e);
                        } finally {
                            loading.dismiss();
                        }
                    }
                }).start();


            }
        });
    }

    private void openProject(String pkg) {
        checkView(new Check<DemoProjectActivity>() {
            @Override
            public void ok(DemoProjectActivity view) {
                Dialogs.showDialog(view, "提示", "工程创建完毕，是否现在打开？",
                        Dialogs.cancelAction(view),
                        Dialogs.newAction(view, "确定", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                                CodeActivity.open(view, pkg);
                                view.finish();
                            }
                        }));
            }
        });
    }

}
