package com.jsdroid.app.project.dev;

import android.content.Intent;
import android.os.Environment;

import com.jsdroid.app.capture.CaptureActivity;
import com.jsdroid.app.core.JsdCore;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.eye.ToolActivity;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.log.LogActivity;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.app.utils.TipHelper;
import com.jsdroid.commons.ZipUtil;
import com.jsdroid.fileview.FileView;
import com.jsdroid.groovy.JsdCompiler;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.server.utils.PartFactory;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipOutputStream;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CodePresenter extends BasePresenter<CodeActivity> {
    Project project;

    /**
     * 打开项目
     */
    public void openProject() {
        long projectId = getView().getIntent().getLongExtra("projectId", -1);

        project = JsdProject.getInstance().getProject(projectId);
        if (project == null) {
            getView().finish();
            return;
        }
        getView().setTitle(project.name);
        getView().setProjectDir(new File(project.file));

        initFileDesc(new File(project.file));

        File scriptFile = new File(project.file, "script/MainScript.groovy");
        if (scriptFile.exists()) {
            try {
                getView().openFile(scriptFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            getView().showFileTree();
        }

    }

    public Project getProject() {
        return project;
    }

    private void initFileDesc(File projectDir) {
        FileView fileView = getView().getFileView();
        fileView.putDesc(new File(projectDir, "class"), "类文件");
        fileView.putDesc(new File(projectDir, "out"), "输出文件");
        fileView.putDesc(new File(projectDir, "res"), "打包文件");
        fileView.putDesc(new File(projectDir, "script"), "脚本代码");
        fileView.putDesc(new File(projectDir, "view"), "界面代码");
        fileView.putDesc(new File(projectDir, "config.json"), "项目属性");
        fileView.putDesc(new File(projectDir, "icon.png"), "项目图标");
    }

    /**
     * 编译项目
     *
     * @throws Exception
     */
    private void compile() throws Exception {
        if (project == null) {
            throw new Exception("项目不存在！");
        }
        File outDir = new File(project.file, "out");
        outDir.mkdir();
        File dexFile = new File(outDir, "out.dex");
        try {
            JsdCompiler.compile(new String[]{
                            new File(project.file, "class").getPath(),
                            new File(project.file, "view").getPath(),
                            new File(project.file, "script").getPath()
                    }
                    , new String[]{
                            null,
                            "com.jsdroid.ui.ViewScript",
                            "com.jsdroid.script.JsDroidScript"
                    }, dexFile.getPath());
            //打包jsd文件
            JsdCompiler.packJsd(new File(project.file), dexFile, "out.jsd");
            //安装
            JsdTool.getInstance().install(new File(outDir, "out.jsd").getPath());
        } finally {
            dexFile.delete();
            getView().refreshFile();
        }
    }

    public interface CompileCallback {
        void ok();

        void failed(Throwable e);

        void end();
    }

    public void compile(CompileCallback callback) {
        QMUITipDialog loading = TipHelper.showLoading(getView(), "正在编译...");
        loading.setCancelable(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    compile();
                    callback.ok();
                } catch (Throwable e) {
                    callback.failed(e);
                } finally {
                    callback.end();
                    loading.dismiss();
                }
            }
        }).start();
    }

    /**
     * 运行
     */
    public void runProject() {
        compile(new CompileCallback() {
            @Override
            public void ok() {
                postCheckView(new Check<CodeActivity>() {
                    @Override
                    public void ok(CodeActivity view) {
                        JsdCore.getInstance().runScript(project.pkg);
                    }
                });
            }

            @Override
            public void failed(Throwable e) {
                showDialog("编译错误", e.getMessage());
            }

            @Override
            public void end() {

            }
        });


    }

    public void showDialog(final String title, final String content) {
        showDialog(title, content, content);
    }

    public void showDialog(final String title, final String content, final String copy) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Dialogs.showCopyDialog(getView(), title, content, copy);
            }
        });
    }

    /**
     * 预览
     */
    public void eye() {
        compile(new CompileCallback() {
            @Override
            public void ok() {
                postCheckView(new Check<CodeActivity>() {
                    @Override
                    public void ok(CodeActivity view) {
                        ToolActivity.openTool(view, project.pkg);
                    }
                });
            }

            @Override
            public void failed(Throwable e) {
                showDialog("编译错误", e.getMessage());
            }

            @Override
            public void end() {

            }
        });

    }

    /**
     * 打开截屏界面
     */
    public void openCapture() {
        Intent intent = new Intent(getView(), CaptureActivity.class);
        getView().startActivity(intent);
    }

    /**
     * 更新项目属性到数据库
     *
     * @param name
     * @param note
     * @param version
     */
    public void updateProject(String name, String note, String version) {
        project.name = name;
        project.note = note;
        project.version = version;
        JsdProject.getInstance().update(project);
    }

    /**
     * 打开日志
     */
    public void openLog() {
        LogActivity.openLog(getView());
    }

    /**
     * 导出jsd文件
     */
    public void exportJsd() {
        if (project == null) {
            return;
        }
        File in = new File(project.getFile(), "out/out.jsd");
        if (!in.exists()) {
            showDialog("提示", "请先编译！", null);
            return;
        }
        File out = new File(Environment.getExternalStorageDirectory(), project.name + System.currentTimeMillis() + ".jsd");
        saveFile(in, out);
    }

    public void publishJsd() {
        compile(new CompileCallback() {
            @Override
            public void ok() {

                postCheckView(new Check<CodeActivity>() {
                    @Override
                    public void ok(CodeActivity view) {
                        File in = new File(project.getFile(), "out/out.jsd");
                        publishJsd(in);
                    }
                });

            }

            @Override
            public void failed(Throwable e) {

            }

            @Override
            public void end() {

            }
        });


    }

    private void publishJsd(File jsdFile) {
        QMUITipDialog loading = Dialogs.showLoading(getView(), "正在发布。。。");
        Map<String, RequestBody> params = new HashMap<>();
        params.put("classify", PartFactory.createParam("未分类"));
        params.put("shared", PartFactory.createParam("1"));
        JsdApi.getInstance().getJsdToolApi().upload(PartFactory.createPart("file", jsdFile), params).enqueue(new Callback<AjaxResult>() {
            @Override
            public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                loading.dismiss();
                AjaxResult body = response.body();
                if (body.hasSuccess()) {
                    postCheckView(new Check<CodeActivity>() {
                        @Override
                        public void ok(CodeActivity view) {
                            Dialogs.showSuccess(view, "发布成功！");
                        }
                    });
                } else {
                    postCheckView(new Check<CodeActivity>() {
                        @Override
                        public void ok(CodeActivity view) {
                            Dialogs.showError(view, "发布失败：" + body.getMsg());
                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<AjaxResult> call, Throwable t) {
                loading.dismiss();
                postCheckView(new Check<CodeActivity>() {
                    @Override
                    public void ok(CodeActivity view) {
                        Dialogs.showError(view, "连接服务器失败！");
                    }
                });
            }
        });
    }

    private void saveFile(File fromFile, File outFile) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FileUtils.copyFile(fromFile, outFile);
                } catch (IOException e) {
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Dialogs.showShareFileDialog(getView(), "提示", "导出成功！位置：" + outFile.getPath(), outFile.getPath());
                    }
                });

            }
        }).start();
    }

    /**
     * 导出项目
     */
    public void exportProject() {
        if (project == null) {
            return;
        }
        exportProject(new File(Environment.getExternalStorageDirectory(), project.name + System.currentTimeMillis() + ".jsdp"));
    }

    void exportProject(File out) {
        QMUITipDialog loading = Dialogs.showLoading(getView(), "正在导出...");
        //将项目压缩
        new Thread(new Runnable() {
            @Override
            public void run() {
                ZipOutputStream zipOutputStream = null;
                try {

                    zipOutputStream = new ZipOutputStream(new FileOutputStream(out));
                    ZipUtil.zipFile(JsdProject.getInstance().getProjectDir(project.pkg), zipOutputStream);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Dialogs.showShareFileDialog(getView(), "提示", "导出成功！位置：" + out.getPath(),
                                    out.getPath());
                        }
                    });

                } catch (Exception e) {
                } finally {
                    try {
                        zipOutputStream.close();
                    } catch (Exception e) {
                    }
                    loading.dismiss();
                }

            }
        }).start();
    }

}
