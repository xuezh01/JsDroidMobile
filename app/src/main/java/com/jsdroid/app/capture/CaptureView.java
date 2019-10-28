package com.jsdroid.app.capture;

import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.capture.image.CaptureImageView;
import com.jsdroid.app.capture.node.Node;
import com.jsdroid.app.capture.node.NodeHelper;
import com.jsdroid.app.capture.node.NodeInfoViewBinder;
import com.jsdroid.app.capture.tree.TreeNode;
import com.jsdroid.app.capture.tree.TreeViewAdapter;
import com.jsdroid.app.view.BasePropView;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.jsdroid.mvp.view.BaseView;
import com.qmuiteam.qmui.alpha.QMUIAlphaImageButton;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.widget.QMUITopBar;

import java.util.Arrays;

import butterknife.BindView;

public class CaptureView extends BaseView<CaptureView, CapturePresenter> {
    @BindView(R.id.topBar)
    QMUITopBar topBar;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @BindView(R.id.nodeView)
    LinearLayout nodeView;
    @BindView(R.id.treeView)
    RecyclerView treeView;
    TreeViewAdapter treeViewAdapter;
    @BindView(R.id.edit_search)
    EditText editSearch;
    @BindView(R.id.btnSearch)
    View btnSearch;
    @BindView(R.id.captureView)
    CaptureImageView captureImageView;
    @BindView(R.id.n_click)
    BasePropView nClick;
    @BindView(R.id.n_find)
    BasePropView nFind;
    @BindView(R.id.n_pos)
    BasePropView nPos;
    @BindView(R.id.n_index)
    BasePropView nIndex;
    @BindView(R.id.n_depth)
    BasePropView nDepth;
    @BindView(R.id.n_res)
    BasePropView nRes;
    @BindView(R.id.n_text)
    BasePropView nText;
    @BindView(R.id.n_pkg)
    BasePropView nPkg;
    @BindView(R.id.n_clazz)
    BasePropView nClazz;
    @BindView(R.id.n_rect)
    BasePropView nRect;
    @BindView(R.id.nodeInfoView)
    LinearLayout nodeInfoView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_capture;
    }

    public CaptureView(Context context) {
        super(context);
    }


    @Override
    protected CapturePresenter createPresenter() {
        return new CapturePresenter();
    }

    @Override
    protected void initViews() {
        super.initViews();
        initTopBar();
    }
    public void setCaptureId(Long captureId){
        getPresenter().setCaptureId(captureId);
    }

    protected void initTopBar() {
        topBar.setTitle("截图");
        topBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        QMUIAlphaImageButton btnSearch = topBar.addRightImageButton(R.drawable.ic_capture_search, 33);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    drawerLayout.openDrawer(Gravity.RIGHT);
                } else {
                    drawerLayout.closeDrawers();
                }
            }
        });
        QMUIAlphaImageButton btnNext = topBar.addRightImageButton(R.drawable.ic_capture_next, 22);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getPresenter().next();

            }
        });
        QMUIAlphaImageButton btnLast = topBar.addRightImageButton(R.drawable.ic_capture_last, 11);
        btnLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getPresenter().last();

            }
        });
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
        treeViewAdapter = new TreeViewAdapter(Arrays.asList(new NodeInfoViewBinder()));

        treeView.setLayoutManager(new LinearLayoutManager(getContext()));
        treeView.setAdapter(treeViewAdapter);
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().search(editSearch.getText().toString());
            }
        });
        editSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    getPresenter().search(editSearch.getText().toString());
                }
                return true;
            }
        });
        captureImageView.setSelectListener(new CaptureImageView.SelectListener() {
            @Override
            public void onSelectNode(Node node) {
                treeViewAdapter.refresh();
                getPresenter().selectNode(node);
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });
        treeViewAdapter.setOnTreeNodeListener(new TreeViewAdapter.OnTreeNodeListener() {
            @Override
            public boolean onClick(int position, TreeNode node, RecyclerView.ViewHolder holder) {
                NodeInfoViewBinder.TreeItem item = (NodeInfoViewBinder.TreeItem) node;
                try {
                    if (!item.isSelected()) {
                        getPresenter().selectNode(item);
                        return true;
                    }
                    return false;
                } finally {
                    treeViewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public boolean onLongClick(int position, TreeNode node, RecyclerView.ViewHolder holder) {
                return false;
            }

            @Override
            public void onToggle(boolean isExpand, RecyclerView.ViewHolder holder) {

            }

        });
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
                //关闭输入法
                InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(drawerView.getWindowToken()
                        , InputMethodManager.HIDE_NOT_ALWAYS);

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    public void showTreeSelect(NodeInfoViewBinder.TreeItem node) {
        //展开
        node.setExpand(true);
        node.getRoot().unSelectAll();
        node.setSelected(true);
        treeViewAdapter.refresh();

        int position = treeViewAdapter.getDisplayNodes().indexOf(node);
        if (position != -1) {
            treeView.scrollToPosition(position);
        }
    }

    public void hideBackBtn() {
        topBar.removeAllLeftViews();
    }

    public void showNodeInfo(Node node) {
        try {
            Node root = node.getRoot();
            nClick.setProperty(node.getClickCode());
            nFind.setProperty(node.getFindNodeCode());
            nPos.setProperty(NodeHelper.getFindFunction(root, node, null));
            nIndex.setProperty(node.index + "");
            nDepth.setProperty(node.depth + "");
            nRes.setProperty(node.res);
            nText.setProperty(node.text);
            nPkg.setProperty(node.pkg);
            nClazz.setProperty(node.clazz);
            nRect.setProperty(node.rect.toShortString());
        } catch (Exception e) {
        }
    }

    public void showTitle(String name) {
        topBar.setTitle(name);
    }

    private boolean fullMode;

    public void setFullMode() {
        fullMode = true;
        updateRightViewWidth();
    }

    void updateRightViewWidth() {
        int widthPixels = getResources().getDisplayMetrics().widthPixels;
        int dp64 = QMUIDisplayHelper.dp2px(getContext(), 64);
        ViewGroup.LayoutParams layoutParams = nodeInfoView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = widthPixels - dp64;
            nodeInfoView.setLayoutParams(layoutParams);
        }
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (fullMode) {
            updateRightViewWidth();
        }
    }

    public void setTopBarColor(int color) {
        topBar.setBackgroundColor(color);
    }

    @Override
    protected void onCreate() {
        super.onCreate();
    }

}
