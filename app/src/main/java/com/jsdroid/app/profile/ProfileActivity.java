package com.jsdroid.app.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.jsdroid.app.R;
import com.jsdroid.app.login.LoginActivity;
import com.jsdroid.app.option.Options;
import com.jsdroid.app.project.create.TakePhoto;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.mvp.view.BaseActivity;
import com.jsdroid.server.api.JsdApi;
import com.jsdroid.server.bean.JsdUser;
import com.qmuiteam.qmui.widget.QMUIRadiusImageView;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;
import com.qmuiteam.qmui.widget.pullRefreshLayout.QMUIPullRefreshLayout;
import com.squareup.picasso.Picasso;

import butterknife.BindView;

public class ProfileActivity extends BaseActivity<ProfileActivity, ProfilePresenter> {

    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.groupListView)
    QMUIGroupListView groupListView;
    @BindView(R.id.userIcon)
    QMUIRadiusImageView userIcon;
    @BindView(R.id.refreshLayout)
    QMUIPullRefreshLayout refreshLayout;
    @BindView(R.id.textSwapPhoto)
    View textSwapPhoto;

    @Override
    protected ProfilePresenter createPresenter() {
        return new ProfilePresenter();
    }

    @Override
    protected ProfileActivity createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    protected void initTopBar() {
        super.initTopBar();
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        topBar.setTitle("我的资料");

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().refresh();
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        View.OnClickListener swapUserIconCallback = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //修改图片
                TakePhoto.take(ProfileActivity.this, "photo.png", new TakePhoto.TakeListener() {
                    @Override
                    public void onSelected(String path) {
                        getPresenter().updateAvatar(path);
                    }
                });
            }
        };
        textSwapPhoto.setOnClickListener(swapUserIconCallback);
        userIcon.setOnClickListener(swapUserIconCallback);

        refreshLayout.setOnPullListener(new QMUIPullRefreshLayout.OnPullListener() {
            @Override
            public void onMoveTarget(int offset) {

            }

            @Override
            public void onMoveRefreshView(int offset) {

            }

            @Override
            public void onRefresh() {
                getPresenter().refresh();
            }
        });
    }

    /**
     * 按钮
     */
    public void initProfiles() {
        JsdUser localUser = JsdApi.getInstance().getLocalUser();
        if (localUser == null) {
            //打开登录界面
            LoginActivity.open(this);
            finish();
            return;
        }
        groupListView.removeAllViews();

        //加载头像
        Picasso.with(this).load(JsdApi.getAvatarUrl(localUser.getAvatar())).placeholder(R.drawable.default_user_icon).into(userIcon);
        Options.addOptions(groupListView, null, false,
                Options.OptionItem.create()
                        .title("ID")
                        .desc(localUser.getUserId() + "")
                        .horizontal()
                        .iconRes(R.drawable.id)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_NONE)
                ,
                Options.OptionItem.create()
                        .title("账号")
                        .desc(localUser.getLoginName())
                        .horizontal()
                        .iconRes(R.drawable.username)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_NONE)
                ,
                Options.OptionItem.create()
                        .title("用户名")
                        .desc(localUser.getUserName())
                        .horizontal()
                        .iconRes(R.drawable.username)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_NONE)
                ,
                Options.OptionItem.create()
                        .title("邮箱")
                        .desc(localUser.getEmail())
                        .horizontal()
                        .iconRes(R.drawable.icon_email)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_NONE)
                ,
                Options.OptionItem.create()
                        .title("手机号")
                        .desc(localUser.getPhonenumber())
                        .horizontal()
                        .iconRes(R.drawable.phone)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_NONE)

        );
        Options.addOptions(groupListView, null, false,
                Options.OptionItem.create()
                        .title("退出登录")
                        .horizontal()
                        .iconRes(R.drawable.logout)
                        .optionType(Options.OptionType.ACCESSORY_TYPE_CHEVRON)
                        .listen(new Options.OptionItemListener() {
                            @Override
                            public void onCreate(Options.OptionItem optionItem) {

                            }

                            @Override
                            public void onClick(Options.OptionItem optionItem) {

                                logout();
                            }
                        }));

    }

    private void logout() {
        Dialogs.showDialog(this, "提示", "确定退出登录？",
                Dialogs.newAction(this, "取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                }),
                Dialogs.newAction(this, "确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        JsdApi.getInstance().removeLocalUser();
                        finish();
                    }
                })
        );
    }

    public static void open(Context context) {
        context.startActivity(new Intent(context, ProfileActivity.class));
    }

    public void finishRefresh() {
        refreshLayout.finishRefresh();
    }
}
