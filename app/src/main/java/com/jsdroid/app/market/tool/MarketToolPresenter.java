package com.jsdroid.app.market.tool;

import android.util.Log;

import com.jsdroid.app.eye.ToolActivity;
import com.jsdroid.app.login.LoginActivity;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.app.utils.Emojis;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.bean.JsdTool;
import com.jsdroid.server.bean.JsdToolComment;
import com.jsdroid.server.bean.JsdToolZan;
import com.jsdroid.server.bean.JsdUser;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.FileDownloadLargeFileListener;
import com.liulishuo.filedownloader.FileDownloader;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.io.File;
import java.util.List;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class MarketToolPresenter extends BasePresenter<MarketToolActivity> {
    private static final String TAG = MarketToolPresenter.class.getName();
    /**
     * 当前工具
     */
    private JsdTool tool;
    /**
     * 当前评论页码
     */
    private int commentPageNum;

    @Override
    protected void onCreate() {
        super.onCreate();
        loadTool();
    }

    /**
     * 加载工具
     */
    private void loadTool() {
        checkView(new Check<MarketToolActivity>() {
            @Override
            public void ok(MarketToolActivity view) {
                int toolId = view.getIntent().getIntExtra("toolId", 0);
                loadTool(toolId);
            }
        });
    }

    /**
     * 加载工具信息
     *
     * @param toolId
     */
    private void loadTool(int toolId) {
        JsdApi.getInstance().getJsdToolApi().getById(toolId).enqueue(new Callback<JsdTool>() {
            @Override
            public void onResponse(Call<JsdTool> call, Response<JsdTool> response) {
                JsdTool jsdTool = response.body();
                if (jsdTool != null) {
                    tool = jsdTool;
                    showToolInfo();
                }
            }

            @Override
            public void onFailure(Call<JsdTool> call, Throwable t) {
                getView().showError("加载工具信息失败！");
            }
        });
    }

    private void reLoadTool() {
        if (tool == null) {
            return;
        }
        loadTool(tool.getId());
    }

    /**
     * 显示工具信息
     */
    private void showToolInfo() {
        postCheckView(new Check<MarketToolActivity>() {
            @Override
            public void ok(MarketToolActivity view) {
                if (tool != null) {
                    view.showTool(tool);
                    loadToolDevUser();
                    loadToolZanInfo();
                    refreshComments();
                }
            }
        });
    }

    /**
     * 加载开发者信息
     */
    private void loadToolDevUser() {
        if (tool == null) {
            return;
        }
        JsdApi.getInstance().getJsdUserApi().profile(tool.getUserId()).enqueue(new Callback<JsdUser>() {
            @Override
            public void onResponse(Call<JsdUser> call, Response<JsdUser> response) {
                postCheckView(new Check<MarketToolActivity>() {
                    @Override
                    public void ok(MarketToolActivity view) {
                        view.showDevUser(response.body());
                    }
                });

            }

            @Override
            public void onFailure(Call<JsdUser> call, Throwable t) {

            }
        });
    }

    /**
     * 加载点赞信息
     */
    private void loadToolZanInfo() {
        if (tool == null) {
            return;
        }
        JsdApi.getInstance().getJsdToolZanApi().list(tool.getId()).enqueue(new Callback<List<JsdToolZan>>() {
            @Override
            public void onResponse(Call<List<JsdToolZan>> call, Response<List<JsdToolZan>> response) {
                postCheckView(new Check<MarketToolActivity>() {
                    @Override
                    public void ok(MarketToolActivity view) {
                        view.showZan(response.body() != null && response.body().size() > 0);
                    }
                });
            }

            @Override
            public void onFailure(Call<List<JsdToolZan>> call, Throwable t) {

            }
        });

    }

    /**
     * 刷新评论
     */
    private void refreshComments() {
        commentPageNum = 0;
        loadMoreComments(true);
    }

    /**
     * 加载更多评论
     */
    public void loadMoreComments() {
        loadMoreComments(false);
    }

    public boolean hasInstall() {
        return com.jsdroid.app.jsd.JsdTool.getInstance().hasInstall(tool.getPkg(), tool.getVersion());
    }

    /**
     * 安装此工具
     */
    public void installOrOpen() {
        Log.d(TAG, "installOrOpen: 正在安装工具");
        if (tool == null) {
            return;
        }
        if (!hasInstall()) {
            QMUITipDialog loading = Dialogs.showLoading(getView(), "正在获取工具信息");
            JsdApi.getInstance().getJsdToolDownApi().add(tool.getId()).enqueue(new Callback<AjaxResult>() {
                @Override
                public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                    loading.dismiss();
                    download(JsdApi.getOssUrl(tool.getUploadPath()));
                }

                @Override
                public void onFailure(Call<AjaxResult> call, Throwable t) {
                    loading.dismiss();
                    postCheckView(new Check<MarketToolActivity>() {
                        @Override
                        public void ok(MarketToolActivity view) {
                            view.showError("加载工具信息失败！");
                        }
                    });
                }
            });
        } else {
            //打开此工具
            checkView(new Check<MarketToolActivity>() {
                @Override
                public void ok(MarketToolActivity view) {
                    ToolActivity.openTool(view, tool.getPkg());
                }
            });

        }
    }

    /**
     * 加载评论
     *
     * @param clear
     */
    private void loadMoreComments(boolean clear) {
        if (tool == null) {
            return;
        }
        JsdApi.getInstance().getJsdToolCommentApi().list(tool.getId(), ++commentPageNum, 20).enqueue(new Callback<List<JsdToolComment>>() {
            @Override
            public void onResponse(Call<List<JsdToolComment>> call, Response<List<JsdToolComment>> response) {
                postCheckView(new Check<MarketToolActivity>() {
                    @Override
                    public void ok(MarketToolActivity view) {
                        view.addComments(response.body(), clear);
                        view.finishRefresh();
                    }
                });
            }

            @Override
            public void onFailure(Call<List<JsdToolComment>> call, Throwable t) {
                postCheckView(new Check<MarketToolActivity>() {
                    @Override
                    public void ok(MarketToolActivity view) {
                        view.finishRefresh();
                    }
                });
            }
        });
    }

    private void download(String url) {

        postCheckView(new Check<MarketToolActivity>() {
            @Override
            public void ok(MarketToolActivity view) {
                final QMUITipDialog loading = view.showLoading("下载中...");
                final File file = new File(getView().getFilesDir(), UUID.randomUUID().toString() + ".jsd");
                FileDownloader.setup(getView());
                FileDownloader.getImpl().create(url).setPath(file.getPath()).setListener(new FileDownloadLargeFileListener() {
                    @Override
                    protected void pending(BaseDownloadTask task, long soFarBytes, long totalBytes) {
                    }

                    @Override
                    protected void progress(BaseDownloadTask task, long soFarBytes, long totalBytes) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                loading.setTitle("进度：" + soFarBytes + "/" + totalBytes);
                            }
                        });
                    }

                    @Override
                    protected void paused(BaseDownloadTask task, long soFarBytes, long totalBytes) {
                        loading.dismiss();
                    }

                    @Override
                    protected void completed(BaseDownloadTask task) {
                        install(file.getPath());
                        loading.dismiss();
                    }

                    @Override
                    protected void error(BaseDownloadTask task, Throwable e) {
                        loading.dismiss();

                    }

                    @Override
                    protected void warn(BaseDownloadTask task) {
                    }
                }).start();
            }
        });
    }

    private void install(String file) {
        postCheckView(new Check<MarketToolActivity>() {
            @Override
            public void ok(MarketToolActivity view) {
                QMUITipDialog loading = view.showLoading("正在安装...");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            com.jsdroid.app.jsd.JsdTool.getInstance().install(file);
                            reLoadTool();
                        } catch (Exception e) {
                        } finally {
                            loading.dismiss();
                        }
                    }
                }).start();
            }
        });

    }

    /**
     * 发表评论
     *
     * @param content
     */
    public void pushComment(String content) {
        if (tool == null) {
            return;
        }
        MarketToolActivity view = getView();
        if (view == null) {
            return;
        }
        JsdUser localUser = JsdApi.getInstance().getLocalUser();
        if (localUser == null) {
            //登陆
            LoginActivity.open(view);
            return;
        }
        content = Emojis.emojiConvert(content);
        //添加评论
        JsdApi.getInstance().getJsdToolCommentApi().add(tool.getId(), content).enqueue(new Callback<AjaxResult>() {
            @Override
            public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                if (response.body().hasSuccess()) {
                    //添加评论成功，刷新数据
                    reLoadTool();
                } else {
                    postCheckView(new Check<MarketToolActivity>() {
                        @Override
                        public void ok(MarketToolActivity view) {
                            view.showError(response.body().getMsg());
                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<AjaxResult> call, Throwable t) {

            }
        });
    }

    public void addZan() {
        JsdApi.getInstance().getJsdToolZanApi().add(tool.getId()).enqueue(new Callback<AjaxResult>() {
            @Override
            public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                //点赞后重新显示点赞信息
                reLoadTool();
            }

            @Override
            public void onFailure(Call<AjaxResult> call, Throwable t) {

            }
        });
    }

    public void refresh() {
        reLoadTool();
    }
}
