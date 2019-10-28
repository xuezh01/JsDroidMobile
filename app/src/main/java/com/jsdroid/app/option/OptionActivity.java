package com.jsdroid.app.option;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.jsdroid.app.R;
import com.jsdroid.app.utils.ClipboardUtil;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.app.utils.DrawableHelper;
import com.jsdroid.editor.ContextUtil;
import com.jsdroid.mvp.view.BaseActivity;
import com.qmuiteam.qmui.util.QMUIPackageHelper;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

import butterknife.BindView;

public class OptionActivity extends BaseActivity<OptionActivity, OptionPresenter> {
    @BindView(R.id.groupListView)
    QMUIGroupListView groupListView;
    @BindView(R.id.topBar)
    QMUITopBar topBar;

    @Override
    protected OptionPresenter createPresenter() {
        return new OptionPresenter();
    }

    @Override
    protected OptionActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_option;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.setTitle("设置");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void initViews() {
        super.initViews();
        initOptionMenu();

    }


    public String getVersion() {
        PackageManager manager = getPackageManager();
        String appVersionName = null;
        try {
            android.content.pm.PackageInfo info = manager.getPackageInfo(getPackageName(), 0);
            appVersionName = info.versionName + "." + info.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appVersionName;
    }

    /**
     * 按钮
     */
    public void initOptionMenu() {

        Options.addOptions(groupListView, "系统", false,
                Options.OptionItem.create()
                        .title("版本")
                        .desc(getVersion())
                        .horizontal()
                        .iconRes(R.drawable.icon_version)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_NONE)
                ,
                Options.OptionItem.create()
                        .title("悬浮窗")
                        .desc("开启全局悬浮窗，任意界面运行")
                        .iconRes(R.drawable.icon_show_float_view)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_SWITCH)
                        .bind(JsdOption.Key.SHOW_FLOAT_MENU),
                Options.OptionItem.create()
                        .title("开机启动")
                        .desc("开机启动，永不停止~")
                        .iconRes(R.drawable.icon_reboot)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_SWITCH)
                        .bind(JsdOption.Key.REBOOT_RUN),

                Options.OptionItem.create()
                        .title("音量键控制")
                        .desc("通过音量-键控制脚本启动与停止")
                        .iconRes(R.drawable.icon_volume)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_SWITCH)
                        .bind(JsdOption.Key.VOLUME_DOWN_CONTROL),
                Options.OptionItem.create()
                        .title("屏幕常亮")
                        .desc("屏幕永不息屏~")
                        .iconRes(R.drawable.icon_keep_screen)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_SWITCH)
                        .bind(JsdOption.Key.KEEP_SCREEN)


        );
        Options.addOptions(groupListView, "关于", false,
                Options.OptionItem.create()
                        .title("邮箱")
                        .desc("980008027@qq.com")
                        .horizontal()
                        .iconRes(R.drawable.icon_email)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_CHEVRON)
                        .listen(new Options.OptionItemListener() {
                            @Override
                            public void onCreate(Options.OptionItem optionItem) {

                            }

                            @Override
                            public void onClick(Options.OptionItem optionItem) {
                                ClipboardUtil.copy(OptionActivity.this, "980008027@qq.com");
                                showInfo("复制成功~");
                            }
                        }),
                Options.OptionItem.create()
                        .title("网站")
                        .desc("www.jsdroid.com")
                        .horizontal()
                        .iconRes(R.drawable.icon_www)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_CHEVRON)
                        .listen(new Options.OptionItemListener() {
                            @Override
                            public void onCreate(Options.OptionItem optionItem) {

                            }

                            @Override
                            public void onClick(Options.OptionItem optionItem) {
                                ClipboardUtil.copy(OptionActivity.this, "http://www.jsdroid.com");
                                showInfo("复制成功~");
                            }
                        })

        );
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, OptionActivity.class));
    }
}
