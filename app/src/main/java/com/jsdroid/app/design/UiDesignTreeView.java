package com.jsdroid.app.design;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.app.R;
import com.jsdroid.app.capture.tree.TreeNode;
import com.jsdroid.app.capture.tree.TreeViewAdapter;
import com.jsdroid.app.design.prop.BoolPropView;
import com.jsdroid.app.design.prop.ColorPropView;
import com.jsdroid.app.design.prop.GravityPropView;
import com.jsdroid.app.design.prop.InputTypePropView;
import com.jsdroid.app.design.prop.NumberPropView;
import com.jsdroid.app.design.prop.OrientationPropView;
import com.jsdroid.app.design.prop.PropListView;
import com.jsdroid.app.design.prop.WidthPropView;
import com.jsdroid.app.design.tree.DesignItem;
import com.jsdroid.app.design.tree.DesignMenuAdapter;
import com.jsdroid.app.design.tree.DesignTreeNode;
import com.jsdroid.app.design.tree.DesignTreeViewBinder;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.ui.parser.ViewMap;
import com.jsdroid.app.view.BasePropView;
import com.jsdroid.mvp.view.BaseView;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.popup.QMUIListPopup;
import com.qmuiteam.qmui.widget.popup.QMUIPopup;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;

/**
 * 展现xml树
 * 获取xml
 * 添加控件 完成
 * 删除控件 完成
 * 控件上移 完成
 * 控件下移 完成
 * 设置控件属性
 */
public class UiDesignTreeView extends BaseView<UiDesignTreeView, UiDesignTreePresenter> implements PropListView.OnPropChangedListener {
    private File file;
    JsdContext jsdContext;

    public void setJsdContext(JsdContext jsdContext) {
        this.jsdContext = jsdContext;
    }

    public void setFile(File file) {
        this.file = file;
        ViewMap viewMap = null;

        try {
            viewMap = ViewMap.parseXml(jsdContext, FileUtil.read(file));
        } catch (Exception e) {
        }
        if (viewMap == null) {
            viewMap = new ViewMap(jsdContext, "Layout");
            viewMap.put("width", "match");
            viewMap.put("height", "match");
        }
        setViewMap(viewMap);
    }

    public interface DesignRender {
        void render(ViewMap viewMap);
    }

    public UiDesignTreeView(Context context) {
        super(context);
    }

    public final static String[] TREE_MENU = new String[]{
            "添加子控件",
            "上移",
            "下移",
            "删除"
    };

    public final static int TREE_MENU_ADD = 0;
    public final static int TREE_MENU_UP = 1;
    public final static int TREE_MENU_DOWN = 2;
    public final static int TREE_MENU_DELETE = 3;
    public final static String[] VIEW_TYPE_MENU = new String[]{
            "Layout(线性布局)",
            "Text(文字)",
            "Button(按钮)",
            "Edit(输入框)",
            "Process(圈圈)",
            "Check(单选框)",
            "Spinner(下拉框)",
            "Item(下拉框项)"
    };
    public final static int VIEW_TYPE_MENU_LAYOUT = 0;
    public final static int VIEW_TYPE_MENU_TEXT = 1;
    public final static int VIEW_TYPE_MENU_BUTTON = 2;
    public final static int VIEW_TYPE_MENU_EDIT = 3;
    public final static int VIEW_TYPE_MENU_PROCESS = 4;
    public final static int VIEW_TYPE_MENU_CHECK = 5;
    public final static int VIEW_TYPE_MENU_SPINNER = 6;
    public final static int VIEW_TYPE_MENU_ITEM = 7;


    @BindView(R.id.treeView)
    RecyclerView treeView;
    @BindView(R.id.topBar)
    QMUITopBar topBar;

    @BindView(R.id.propListView)
    PropListView propListView;

    @Override
    protected int getLayoutId() {
        return R.layout.view_ui_design_tree;
    }

    @Override
    protected void initViews() {
        super.initViews();
        topBar.setTitle("界面设计");

        treeView.setMinimumWidth(getResources().getDisplayMetrics().widthPixels);

        propListView.addPropView("name", "ID", null);
        propListView.addPropView("width", "宽度", "wrap", WidthPropView.class);
        propListView.addPropView("height", "高度", "wrap", WidthPropView.class);
        propListView.addPropView("weight", "占空闲比例", null, NumberPropView.class);
        propListView.addPropView("padding", "内边距", null);
        propListView.addPropView("margin", "外边距", null);
        propListView.addPropView("gravity", "内容对齐方式", null, GravityPropView.class);
        propListView.addPropView("orientation", "布局排列方向", "vertical", OrientationPropView.class);
        propListView.addPropView("text", "文字", null);
        propListView.addPropView("hint", "hint", null);
        propListView.addPropView("textColor", "文字颜色", null, ColorPropView.class);
        propListView.addPropView("hintColor", "hint颜色", null, ColorPropView.class);
        propListView.addPropView("textSize", "文字大小", null, NumberPropView.class);
        propListView.addPropView("inputType", "输入类型", null, InputTypePropView.class);
        propListView.addPropView("backgroundImage", "背景图片", null);
        propListView.addPropView("pressedImage", "点击背景图片", null);
        propListView.addPropView("backgroundColor", "背景色", null, ColorPropView.class);
        propListView.addPropView("pressedColor", "点击背景色", null, ColorPropView.class);
        propListView.addPropView("borderColor", "边框色", null, ColorPropView.class);
        propListView.addPropView("pressedBorderColor", "点击边框色", null, ColorPropView.class);
        propListView.addPropView("borderSize", "边框大小", null, NumberPropView.class);
        propListView.addPropView("radius", "圆角", null, NumberPropView.class);
        propListView.addPropView("checked", "是否选中", null, BoolPropView.class);

    }


    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        treeView.setMinimumWidth(getResources().getDisplayMetrics().widthPixels);
    }

    @Override
    protected UiDesignTreePresenter createPresenter() {
        return new UiDesignTreePresenter();
    }

    TreeViewAdapter treeViewAdapter;

    @Override
    protected void initAdapters() {
        super.initAdapters();
        treeViewAdapter = new TreeViewAdapter(Arrays.asList(new DesignTreeViewBinder()));
        treeView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        treeView.setAdapter(treeViewAdapter);

    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        treeViewAdapter.setOnTreeNodeListener(new TreeViewAdapter.OnTreeNodeListener() {
            @Override
            public boolean onClick(int position, TreeNode node, RecyclerView.ViewHolder holder) {
                return selectNode(node);
            }

            boolean selectNode(TreeNode node) {
                DesignTreeNode item = (DesignTreeNode) node;
                try {
                    if (!item.isSelected()) {
                        getPresenter().selectNode(item);
                        if (item.isExpand()) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                    treeViewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public boolean onLongClick(int position, final TreeNode node, RecyclerView.ViewHolder holder) {
                QMUIListPopup mListPopup = new QMUIListPopup(getContext(), QMUIPopup.DIRECTION_NONE,
                        new DesignMenuAdapter(getContext(), TREE_MENU));
                mListPopup.create(QMUIDisplayHelper.dp2px(getContext(), 250), QMUIDisplayHelper.dp2px(getContext(), 200), new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        mListPopup.dismiss();
                        switch (position) {
                            case TREE_MENU_ADD: {
                                showAddView(holder.itemView, (DesignTreeNode) node);
                                break;
                            }
                            case TREE_MENU_UP: {
                                getPresenter().up((DesignTreeNode) node);
                                break;
                            }
                            case TREE_MENU_DOWN: {

                                getPresenter().down((DesignTreeNode) node);
                                break;
                            }
                            case TREE_MENU_DELETE: {

                                getPresenter().delete((DesignTreeNode) node);
                                break;
                            }
                        }
                    }
                });
                mListPopup.setAnimStyle(QMUIPopup.ANIM_GROW_FROM_CENTER);
                mListPopup.setPreferredDirection(QMUIPopup.DIRECTION_NONE);
                mListPopup.show(holder.itemView);
                return true;
            }

            @Override
            public void onToggle(boolean isExpand, RecyclerView.ViewHolder holder) {

            }

        });
        propListView.setOnPropChangedListener(this);
    }

    //添加子控件
    private void showAddView(View view, DesignTreeNode node) {
        QMUIListPopup mListPopup = new QMUIListPopup(getContext(), QMUIPopup.DIRECTION_NONE,
                new DesignMenuAdapter(getContext(), VIEW_TYPE_MENU));
        mListPopup.create(QMUIDisplayHelper.dp2px(getContext(), 250), QMUIDisplayHelper.dp2px(getContext(), 300), new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListPopup.dismiss();
                switch (position) {
                    case VIEW_TYPE_MENU_LAYOUT: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Layout"));
                        break;
                    }
                    case VIEW_TYPE_MENU_TEXT: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Text"));
                        break;
                    }
                    case VIEW_TYPE_MENU_BUTTON: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Button"));
                        break;
                    }
                    case VIEW_TYPE_MENU_EDIT: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Edit"));
                        break;
                    }
                    case VIEW_TYPE_MENU_PROCESS: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Process"));
                        break;
                    }
                    case VIEW_TYPE_MENU_CHECK: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Check"));
                        break;
                    }
                    case VIEW_TYPE_MENU_SPINNER: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Spinner"));
                        break;
                    }
                    case VIEW_TYPE_MENU_ITEM: {
                        getPresenter().add(node, new ViewMap(jsdContext, "Item"));
                        break;
                    }
                }
            }
        });
        mListPopup.setAnimStyle(QMUIPopup.ANIM_GROW_FROM_CENTER);
        mListPopup.setPreferredDirection(QMUIPopup.DIRECTION_NONE);
        mListPopup.show(view);
    }

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    DesignTreeNode selectNode;

    public void setViewMap(ViewMap viewMap) {
        DesignTreeNode node = new DesignTreeNode(new DesignItem(viewMap));
        treeViewAdapter.refresh(node);
        showSelectNode(node);
    }

    //显示选中的节点
    public void showSelectNode(DesignTreeNode selectNode) {
        this.selectNode = selectNode;
        //树选择
        selectNode.getRoot().unSelectAll();
        selectNode.setSelected(true);
        treeViewAdapter.refresh();

        //滑动到选择位置
        int position = treeViewAdapter.getDisplayNodes().indexOf(selectNode);
        if (position != -1) {
            treeView.scrollToPosition(position);
        }

        //重置属性表
        propListView.resetAll();
        //设置属性表
        if (selectNode != null) {
            ViewMap viewMap = selectNode.getContent().getViewMap();
            if (viewMap != null) {
                for (String key : viewMap.keySet()) {
                    Object o = viewMap.get(key);
                    if (o instanceof String) {
                        propListView.setProp(key, (String) viewMap.get(key), false);
                    }
                }
            }
        }

    }


    @Override
    public void onPropChanged(String name, String property, BasePropView propView) {
        if (selectNode != null) {
            ViewMap viewMap = selectNode.getContent().getViewMap();
            viewMap.put(name, property);

        }
        //渲染界面
        renderDesignView();
        if (file != null) {
            getPresenter().saveXml(file.getPath());
        }
    }


    private DesignRender designRender;

    public void setDesignRender(DesignRender designRender) {
        this.designRender = designRender;
    }

    /**
     * 渲染界面
     */
    public void renderDesignView() {
        if (designRender != null) {
            List<TreeNode> roots = treeViewAdapter.getRoots();
            if (roots.size() > 0) {
                DesignTreeNode treeNode = (DesignTreeNode) roots.get(0);
                ViewMap viewMap = treeNode.getContent().getViewMap();

                designRender.render(viewMap);
            }
        }
    }
}
