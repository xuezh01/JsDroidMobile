package com.jsdroid.app.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.log.LogActivity;
import com.jsdroid.app.main.home.HomePage;
import com.jsdroid.app.main.list.ListPage;
import com.jsdroid.app.main.task.TaskPage;
import com.jsdroid.app.pager.BasePagerAdapter;
import com.jsdroid.app.utils.DrawableHelper;
import com.jsdroid.app.utils.ViewHelper;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdUser;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.widget.QMUIRadiusImageView;
import com.qmuiteam.qmui.widget.QMUITabSegment;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.QMUIViewPager;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;
import com.squareup.picasso.Picasso;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.runtime.Permission;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainActivity, MainActivityPresenter> {
    private static final String TAG = MainActivity.class.getName();
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    LinearLayout btnLogo;
    QMUIRadiusImageView logoImage;

    @BindView(R.id.btnOption)
    LinearLayout btnOption;

    @BindView(R.id.btnQuit)
    LinearLayout btnQuit;
    @BindView(R.id.viewPager)
    QMUIViewPager viewPager;
    @BindView(R.id.tab)
    QMUITabSegment tab;
    @BindView(R.id.textWelcome)
    TextView textWelcome;
    @BindView(R.id.optionListView)
    QMUIGroupListView optionListView;

    @BindView(R.id.imgLogo)
    QMUIRadiusImageView imgLogo;
    @BindView(R.id.textName)
    TextView textName;
    BasePagerAdapter pagerAdapter;

    @BindView(R.id.contentView)
    LinearLayout contentView;

    public static void open(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected MainActivityPresenter createPresenter() {
        return new MainActivityPresenter();
    }

    @Override
    protected MainActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        super.initViews();
        initOptionMenu();
    }

    HomePage homePage;
    ListPage listPage;
    TaskPage taskPage;

    @Override
    protected void initAdapters() {
        initViewPager();
    }

    private void initViewPager() {
        pagerAdapter = new BasePagerAdapter();

        homePage = new HomePage(this);
        listPage = new ListPage(this);
        taskPage = new TaskPage(this);

        pagerAdapter.addPage(0, homePage);
        pagerAdapter.addPage(1, listPage);
        pagerAdapter.addPage(2, taskPage);

        viewPager.setAdapter(pagerAdapter);

        Drawable home = DrawableHelper.createBitmapDrawable(this, R.drawable.home, 20, 20);
        Drawable home_sel = DrawableHelper.createBitmapDrawable(this, R.drawable.home, 20, 20, getResources().getColor(R.color.colorPrimary));
        this.tab.addTab(new QMUITabSegment.Tab(home, home_sel, "主页", false));

        Drawable list = DrawableHelper.createBitmapDrawable(this, R.drawable.list, 20, 20);
        Drawable list_sel = DrawableHelper.createBitmapDrawable(this, R.drawable.list, 20, 20, getResources().getColor(R.color.colorPrimary));
        this.tab.addTab(new QMUITabSegment.Tab(list, list_sel, "列表", false));

        Drawable task = DrawableHelper.createBitmapDrawable(this, R.drawable.task, 20, 20);
        Drawable task_sel = DrawableHelper.createBitmapDrawable(this, R.drawable.task, 20, 20, getResources().getColor(R.color.colorPrimary));
        this.tab.addTab(new QMUITabSegment.Tab(task, task_sel, "任务", false));

        this.tab.setDefaultSelectedColor(getResources().getColor(R.color.colorPrimary));
        this.tab.setupWithViewPager(viewPager, false, false);
        viewPager.setSwipeable(false);
    }

    @Override
    protected void bindEvents() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                homePage.onScroll();
                listPage.onScroll();
                taskPage.onScroll();
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        topBar.setTitle("主页");
                        break;
                    case 1:
                        topBar.setTitle("列表");
                        break;
                    case 2:
                        topBar.setTitle("任务");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().quit();
            }
        });
        btnOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().openOptionView();
            }
        });
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().login();

            }
        });
        textName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().login();
            }
        });

    }

    protected void initTopBar() {
        topBar.setTitle("主页");
        initBtnLogo();
        initBtnMenu();
        initMenuLog();

    }

    QMUIAlphaImageButton menuLog;

    private void initMenuLog() {
        menuLog = topBar.addRightImageButton(R.drawable.ic_log, 464);
        menuLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogActivity.openLog(MainActivity.this);
            }
        });
    }


    /**
     * 创建logo图标按钮
     */
    private void initBtnLogo() {

        btnLogo = new LinearLayout(this);

        logoImage = ViewHelper.createCircleImageView(this, R.drawable.default_user_icon, 40, 40);
        logoImage.setBorderColor(Color.WHITE);
        btnLogo.addView(logoImage);

        int padding = QMUIDisplayHelper.dp2px(this, 5);
        btnLogo.setPadding(padding, padding, padding, padding);

        int width = QMUIDisplayHelper.dp2px(this, 50);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width, width);
        params.addRule(RelativeLayout.CENTER_VERTICAL);
        btnLogo.setLayoutParams(params);

        topBar.addLeftView(btnLogo, 1, params);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

    }

    QMUIAlphaImageButton btnMenu;

    /**
     * 创建菜单
     */
    private void initBtnMenu() {
        btnMenu = topBar.addRightImageButton(R.drawable.ic_add, 2);
        btnMenu.setColorFilter(Color.WHITE);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(v.getContext(), v);
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_create_task: {
                                //创建任务
                                getPresenter().createTask();
                                break;
                            }
                            case R.id.menu_create_project: {
                                //创建工程
                                getPresenter().createProject();
                                break;
                            }
                            case R.id.menu_import_project: {
                                //导入工程
                                getPresenter().importProject();
                                break;
                            }
                            case R.id.menu_import_script: {
                                //导入脚本
                                getPresenter().importTool();
                                break;
                            }
                        }
                        return false;
                    }
                });
                MenuBuilder menuBuilder = (MenuBuilder) popupMenu.getMenu();
                //对齐右边
                popupMenu.setGravity(Gravity.RIGHT);
                popupMenu.show();
            }
        });

    }

    QMUICommonListItemView showFloatItem,
            rebootLaunchItem,
            volumeDownControlItem,
            keepScreenItem,
            permissionPageItem,
            ideaItem,
            studyItem,
            clearItem, noRootItem, activeHelpItem;

    private Drawable createMenuDrawable(int resId) {
        return DrawableHelper.createBitmapDrawable(this,
                resId, 25, 25, Color.GRAY);
    }

    /**
     * 按钮
     */
    public void initOptionMenu() {
        showFloatItem = optionListView.createItemView("悬浮窗");
        rebootLaunchItem = optionListView.createItemView("开机启动");

        volumeDownControlItem = optionListView.createItemView("音量键控制");
        keepScreenItem = optionListView.createItemView("屏幕常亮");
        noRootItem = optionListView.createItemView("免ROOT");
        activeHelpItem = optionListView.createItemView("激活测试");
        permissionPageItem = optionListView.createItemView("权限设置");

        ideaItem = optionListView.createItemView("电脑开发");
        studyItem = optionListView.createItemView("学习文档");
        clearItem = optionListView.createItemView("清理文件");

        showFloatItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_SWITCH);
        showFloatItem.setImageDrawable(createMenuDrawable(R.drawable.icon_show_float_view));

        rebootLaunchItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_SWITCH);
        rebootLaunchItem.setImageDrawable(createMenuDrawable(R.drawable.icon_reboot));
        volumeDownControlItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_SWITCH);
        volumeDownControlItem.setImageDrawable(createMenuDrawable(R.drawable.volume));

        keepScreenItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_SWITCH);
        keepScreenItem.setImageDrawable(createMenuDrawable(R.drawable.icon_keep_screen));


        noRootItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        noRootItem.setImageDrawable(createMenuDrawable(R.drawable.icon_hashtag));

        activeHelpItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        activeHelpItem.setImageDrawable(createMenuDrawable(R.drawable.icon_active));

        permissionPageItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        permissionPageItem.setImageDrawable(createMenuDrawable(R.drawable.icon_options));

        ideaItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        ideaItem.setImageDrawable(createMenuDrawable(R.drawable.demo));

        studyItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        studyItem.setImageDrawable(createMenuDrawable(R.drawable.icon_study));

        clearItem.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        clearItem.setImageDrawable(createMenuDrawable(R.drawable.icon_clear));

        QMUIGroupListView.newSection(this)
                .setUseTitleViewForSectionSpace(false)
                .addItemView(showFloatItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                })
                .addItemView(rebootLaunchItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                })
                .addItemView(volumeDownControlItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .addItemView(keepScreenItem, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                            }
                        }
                )
                .addItemView(noRootItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().showNoRootTips();
                    }
                })
                .addItemView(activeHelpItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().showActiveHelp();
                    }
                })
                .addItemView(permissionPageItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().openPermissionPage();
                    }
                })
                .addItemView(ideaItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().openDownloadUrl();
                    }
                })
                .addItemView(studyItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().openStudyDoc();
                    }
                })
                .addItemView(clearItem, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getPresenter().clearFile();
                    }
                })
                .addTo(optionListView);

    }

    @Override
    protected void fetchData() {
        super.fetchData();
        getPresenter().bindJsdOption();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().unbindJsdOption();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //申请sdcard读写权限
        AndPermission.with(this).runtime().permission(Permission.Group.STORAGE).start();
    }

    public void showUserInfo() {
        JsdUser localUser = JsdApi.getInstance().getLocalUser();
        if (localUser != null) {
            textName.setText(localUser.getUserName());
            //2019/06/17/8515bd88939bbf8e3f0cbebb989650f8.png
            //http://localhost/profile/avatar/2019/06/17/8515bd88939bbf8e3f0cbebb989650f8.png
            Picasso.with(this)
                    .load(JsdApi.getAvatarUrl(localUser.getAvatar()))
                    .placeholder(R.drawable.default_user_icon)
                    .into(imgLogo);
            Picasso.with(this)
                    .load(JsdApi.getAvatarUrl(localUser.getAvatar()))
                    .placeholder(R.drawable.default_user_icon)
                    .into(logoImage);
        } else {
            textName.setText("点击登录");
        }

    }
}
