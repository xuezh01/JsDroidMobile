package com.jsdroid.app.main;

import android.content.Intent;
import android.net.Uri;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.jsdroid.app.install.ClearActivity;
import com.jsdroid.app.install.ImportProjectActivity;
import com.jsdroid.app.install.ImportToolActivity;
import com.jsdroid.app.login.LoginActivity;
import com.jsdroid.app.main.task.AddTaskActivity;
import com.jsdroid.app.option.JsdOption;
import com.jsdroid.app.option.OptionActivity;
import com.jsdroid.app.profile.ProfileActivity;
import com.jsdroid.app.project.create.CreateProjectActivity;
import com.jsdroid.app.service.ShellService;
import com.jsdroid.app.utils.ClipboardUtil;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.check.JsdCheckActivity;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.AjaxResult;
import com.jsdroid.shell.JsDroidApp;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.yanzhenjie.permission.AndPermission;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class MainActivityPresenter extends BasePresenter<MainActivity> implements JsdOption.OptionListener {


    public void bindJsdOption() {
        getView().showFloatItem.getSwitch().setChecked(JsdOption.getInstance().isShowFloatMenu());
        getView().showFloatItem.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                JsdOption.getInstance().setShowFloatMenu(isChecked);
            }
        });
        getView().rebootLaunchItem.getSwitch().setChecked(JsdOption.getInstance().isRebootLaunch());
        getView().rebootLaunchItem.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                JsdOption.getInstance().setRebootRun(isChecked);
            }
        });
        getView().volumeDownControlItem.getSwitch().setChecked(JsdOption.getInstance().isVolumeDownControl());
        getView().volumeDownControlItem.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                JsdOption.getInstance().setVolumeDownControl(isChecked);
            }
        });
        getView().keepScreenItem.getSwitch().setChecked(JsdOption.getInstance().isKeepScreen());
        getView().keepScreenItem.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                JsdOption.getInstance().setKeepScreen(isChecked);
            }
        });

        JsdOption.getInstance().addOptionListener(this);

    }

    public void unbindJsdOption() {
        JsdOption.getInstance().removeOptionListener(this);
    }


    @Override
    public void onOptionChanged(JsdOption.Key key, Object value) {
        MainActivity view = getView();
        if (view == null) {
            return;
        }
        switch (key) {
            case SHOW_FLOAT_MENU:
                view.showFloatItem.getSwitch().setChecked((Boolean) value);
                break;
            case REBOOT_RUN:
                view.rebootLaunchItem.getSwitch().setChecked((Boolean) value);
                break;
            case KEEP_SCREEN:
                view.keepScreenItem.getSwitch().setChecked((Boolean) value);
                break;
            case VOLUME_DOWN_CONTROL:
                view.volumeDownControlItem.getSwitch().setChecked((Boolean) value);
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        //界面打开就加载用户资料信息
        postCheckView(new Check<MainActivity>() {
            @Override
            public void ok(MainActivity view) {
                view.showUserInfo();
            }
        });
    }

    public void quit() {
        QMUIDialogAction quitAction = new QMUIDialogAction(getView(), "确定", new QMUIDialogAction.ActionListener() {
            @Override
            public void onClick(QMUIDialog dialog, int index) {
                JsDroidApp.getInstance().exit();
            }
        });
        new QMUIDialog.MessageDialogBuilder(getView()).setTitle("退出程序")

                .setMessage("确定退出JsDroid?")

                .addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                }).addAction(quitAction).create().show();
    }

    public void openPermissionPage() {
        AndPermission.with(getView()).runtime().setting().start(0);
    }

    /**
     * 打开设置界面
     */
    public void openOptionView() {
        OptionActivity.open(getView());
    }

    /**
     * 打开学校界面
     */
    public void openStudyDoc() {
//        DocActivity.open(getView());
        Intent intent = new Intent(Intent.ACTION_VIEW); //Intent.ACTION_VIEW固定写法
        intent.setData(Uri.parse("http://study.jsdroid.com")); //url是你要跳转的网页地址
        getView().startActivity(intent);
    }

    /**
     * 创建任务
     */
    public void createTask() {
        AddTaskActivity.open(getView());
    }

    /**
     * 创建项目
     */
    public void createProject() {
        CreateProjectActivity.open(getView());
    }

    /**
     * 导入工程
     */
    public void importProject() {
        ImportProjectActivity.open(getView());
    }

    /**
     * 导入工具
     */
    public void importTool() {
        ImportToolActivity.open(getView());

    }

    @Override
    protected void onCreate() {
        super.onCreate();

        //启动脚本服务
        ShellService.start(getView());
        showVersionText();

        getView().showUserInfo();
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
    }

    private void showVersionText() {
        if (!JsdOption.getInstance().readBoolean(JsdOption.Key.SHOW_HELP)) {
//            Dialogs.showDialog(getView(), "免root激活方式", "【免root说明】\n\t软件支持免root启动脚本啦，免root需要开启wifi调试。\n" +
//                            "【开启wifi调试方法】\n\t1.手机打开开发者模式;\n\t2.手机开启usb调试模式;\n\t3.usb连接电脑;\n\t4.打开电脑JsDroid激活工具;\n\t5.手机选择同意授权adb调试\n" +
//                            "【注意事项】\n\t" +
//                            "1.如果不会开启，请加JsDroid官方群获取帮助！\n\t" +
//                            "2.如果没有弹出usb调试授权提示并且启动脚本失败，请到usb调试设置界面撤销所有授权后重启软件。",
//                    Dialogs.newAction(getView(), "不再提示", new QMUIDialogAction.ActionListener() {
//                        @Override
//                        public void onClick(QMUIDialog dialog, int index) {
//                            dialog.dismiss();
//                            JsdOption.getInstance().putBoolean(JsdOption.Key.SHOW_HELP, true);
//                        }
//                    })
//            ).setCancelable(false);
        }
    }

    public void clearFile() {
        ClearActivity.open(getView());
    }

    public void login() {
        if (true) {
            getView().showError("普通版不支持登录！");
            return;
        }
        JsdApi.getInstance().getJsdUserApi().check().enqueue(new Callback<AjaxResult>() {
            @Override
            public void onResponse(Call<AjaxResult> call, Response<AjaxResult> response) {
                final AjaxResult ajaxResult = response.body();
                if (ajaxResult == null) {

                    return;
                }
                postCheckView(new Check<MainActivity>() {
                    @Override
                    public void ok(MainActivity view) {
                        //判断是否登录
                        if (ajaxResult.getCode() == AjaxResult.Type.SUCCESS.value()) {
                            ProfileActivity.open(view);
                        } else {
                            LoginActivity.open(view);

                        }
                    }
                });

            }

            @Override
            public void onFailure(Call<AjaxResult> call, Throwable t) {
                postCheckView(new Check<MainActivity>() {
                    @Override
                    public void ok(MainActivity view) {
                        view.showError("网络连接失败！");
                    }
                });
            }
        });


    }

    /**
     * 打开网盘链接下载
     */
    public void openDownloadUrl() {
        checkView(new Check<MainActivity>() {
            @Override
            public void ok(MainActivity view) {
                Dialogs.showDialog(view, "提示",
                        "电脑工具下载链接：https://pan.baidu.com/s/1st5fyLoM6uIyNpn35fsDsQ",

                        Dialogs.newAction(view, "关闭", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                            }
                        }),
                        Dialogs.newAction(view, "复制", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                                ClipboardUtil.copy(view, "https://pan.baidu.com/s/1st5fyLoM6uIyNpn35fsDsQ");
                                Toast.makeText(view, "复制成功！", Toast.LENGTH_SHORT).show();
                            }
                        }),
                        Dialogs.newAction(view, "打开", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.VIEW");
                                Uri content_url = Uri.parse("https://pan.baidu.com/s/1st5fyLoM6uIyNpn35fsDsQ");
                                intent.setData(content_url);
                                view.startActivity(intent);
                            }
                        }));

            }
        });
    }

    public void showNoRootTips() {
        Dialogs.showDialog(getView(), "免root激活方式", "【免root说明】\n\t软件支持免root啦，免root需要连接一次电脑或者JsDroid魔盒。\n" +
                        "【激活方法】\n\t1.手机打开开发者模式(如果设置中找不到开发者模式，请到关于手机里面点击5次版本号即可);\n\t2.手机开启usb调试模式;\n\t3.手机通过usb连接电脑;\n\t4.打开电脑JsDroid激活工具;\n\t5.手机选择同意授权adb调试\n" +
                        "【注意事项】\n\t" +
                        "1.如果不会开启调试模式，请加JsDroid官方群获取帮助！\n\t" +
                        "2.如果没有弹出usb调试授权提示并且启动脚本失败，请到usb调试设置界面撤销所有授权后重启软件。",
                Dialogs.newAction(getView(), "知道了", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                })
        ).setCancelable(false);
    }

    public void showActiveHelp() {
        checkView(new Check<MainActivity>() {
            @Override
            public void ok(MainActivity view) {
                view.startActivity(new Intent(view, JsdCheckActivity.class));
            }
        });
    }
}
