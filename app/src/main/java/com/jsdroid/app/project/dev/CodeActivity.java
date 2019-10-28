package com.jsdroid.app.project.dev;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsdroid.api.context.JsdContext;
import com.jsdroid.app.R;
import com.jsdroid.app.capture.CaptureView;
import com.jsdroid.app.design.UiDesignTreeView;
import com.jsdroid.app.design.prop.PropListView;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.jsd.JsdProject;
import com.jsdroid.app.view.BasePropView;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.editor.activity.EditActivity;
import com.jsdroid.editor.parser.Colors;
import com.jsdroid.editor.widget.FileTabView;
import com.jsdroid.fileview.FileView;
import com.jsdroid.ui.parser.ViewMap;
import com.jsdroid.ui.view.JsdView;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;

import java.io.File;

public class CodeActivity extends EditActivity {
    CodePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initCaptureTool();
        initUiDesignTreeView();
        initPresenter();
        initFileTypes();
        presenter.openProject();

    }

    public static void open(Context context, String pkg) {
        Project project = JsdProject.getInstance().findProject(pkg);
        if (project == null) {
            return;
        }
        open(context, project.id);
    }

    public static void open(Context context, long projectId) {
        Intent starter = new Intent(context, CodeActivity.class);
        starter.putExtra("projectId", projectId);
        context.startActivity(starter);
    }

    @Override
    public void setProjectDir(File file) {
        super.setProjectDir(file);
        //设置res文件夹
        uiDesignTreeView.setJsdContext(new JsdContext(new File(file, "res")));
    }

    private void initPresenter() {
        presenter = new CodePresenter();
        presenter.attachView(this);
    }

    public FileView getFileView() {
        return fileView;
    }

    class XmlTab extends CustomerTab {

        LinearLayout designView = new LinearLayout(CodeActivity.this);

        public XmlTab(File file) {
            super(file);
        }

        @Override
        public View getContentView() {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            designView.setLayoutParams(params);
            designView.setBackgroundColor(Color.WHITE);
            return designView;
        }
    }

    class XmlFileType implements FileType {

        @Override
        public boolean forFile(File file) {

            return file.getName().endsWith(".xml");
        }

        @Override
        public FileTabView.FileTab open(File file) {
            return new XmlTab(file);
        }
    }

    class ImageTab extends CustomerTab {
        ImageView imageView;
        LinearLayout contentView;

        public ImageTab(File file) {
            super(file);
            contentView = new LinearLayout(CodeActivity.this);
            contentView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

            imageView = new ImageView(CodeActivity.this);
            contentView.addView(imageView);
            contentView.setGravity(Gravity.CENTER);

        }

        @Override
        public View getContentView() {
            imageView.setImageBitmap(BitmapFactory.decodeFile(getFile().getPath()));
            contentView.setBackgroundColor(Colors.tabSelectColor);
            return contentView;
        }
    }

    class ImageFileType implements FileType {

        @Override
        public boolean forFile(File file) {
            String path = file.getPath();
            if (path.endsWith(".jpg")) {
                return true;
            }
            if (path.endsWith(".webp")) {
                return true;
            }
            if (path.endsWith(".png")) {
                return true;
            }
            return false;
        }

        @Override
        public FileTabView.FileTab open(File file) {
            return new ImageTab(file);
        }
    }


    class ConfigTab extends CustomerTab implements PropListView.OnPropChangedListener {
        PropListView propListView;
        LinearLayout contentView;
        ImageView logoView;
        JSONObject jsonObject;

        @Override
        public String getText() {
            return "项目属性";
        }

        public ConfigTab(File file) {
            super(file);
            jsonObject = JSON.parseObject(FileUtil.read(file));
            contentView = new LinearLayout(CodeActivity.this);
            contentView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            propListView = new PropListView(CodeActivity.this);
            propListView.addPropView("pkg", "包名", jsonObject.getString("pkg"), BasePropView.class);
            propListView.addPropView("name", "名称", jsonObject.getString("name"));
            propListView.addPropView("note", "介绍", jsonObject.getString("note"));
            propListView.addPropView("version", "版本", jsonObject.getString("version"));
            propListView.setOnPropChangedListener(this);
            contentView.setOrientation(LinearLayout.VERTICAL);
            contentView.setGravity(Gravity.CENTER_HORIZONTAL);
            logoView = new ImageView(CodeActivity.this);
            int logoWidth = QMUIDisplayHelper.dp2px(CodeActivity.this, 150);
            int logoMargin = QMUIDisplayHelper.dp2px(CodeActivity.this, 10);
            LinearLayoutCompat.LayoutParams logoParams = new LinearLayoutCompat.LayoutParams(logoWidth, logoWidth);
            logoParams.setMargins(logoMargin, logoMargin, logoMargin, 0);
            logoView.setLayoutParams(logoParams);
            contentView.addView(logoView);
            contentView.addView(propListView);
        }

        @Override
        public void save() {
            super.save();
            FileUtil.write(getFile(), jsonObject.toJSONString());

        }

        @Override
        public View getContentView() {
            propListView.setProp("name", jsonObject.getString("name"), false);
            propListView.setProp("note", jsonObject.getString("note"), false);
            propListView.setProp("version", jsonObject.getString("version"), false);
            File logoFile = new File(getFile().getParent(), "icon.png");
            if (logoFile.exists()) {
                logoView.setImageBitmap(BitmapFactory.decodeFile(logoFile.getPath()));
            } else {
                logoView.setImageResource(R.drawable.logo_blue_dark);
            }
            contentView.setBackgroundColor(Colors.tabSelectColor);
            return contentView;
        }

        @Override
        public void onPropChanged(String name, String property, BasePropView propView) {
            jsonObject.put(name, property);
            save();
            updateProject();
        }

        private void updateProject() {
            presenter.updateProject(jsonObject.getString("name"),
                    jsonObject.getString("note"),
                    jsonObject.getString("version"));
        }
    }

    class ConfigType implements FileType {
        @Override
        public boolean forFile(File file) {
            return file.getPath().endsWith("config.json");
        }

        @Override
        public FileTabView.FileTab open(File file) {

            return new ConfigTab(file);
        }
    }

    private void initFileTypes() {
        addFileType(new XmlFileType());
        addFileType(new ImageFileType());
        addFileType(new ConfigType());
    }

    CaptureView captureView;
    UiDesignTreeView uiDesignTreeView;

    private void initCaptureTool() {
        //加载截图界面
        captureView = new CaptureView(this);
        captureView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        captureView.hideBackBtn();
        captureView.setFullMode();
        captureView.setTopBarColor(Colors.captureTitleBarColor);
        captureView.setCaptureId(null);
    }

    private void initUiDesignTreeView() {
        uiDesignTreeView = new UiDesignTreeView(this);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        tvTitle.setText(title);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    protected void run() {
        save();
        presenter.runProject();
    }

    @Override
    protected void eye() {
        save();
        presenter.eye();
    }

    @Override
    protected void openProject() {

    }

    @Override
    protected void showMenu() {
        PopupMenu popupMenu = new PopupMenu(this, imgBtnMenu);
        popupMenu.inflate(R.menu.menu_code);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_open_capture: {
                        presenter.openCapture();
                        break;
                    }
                    case R.id.menu_open_log: {
                        presenter.openLog();
                        break;
                    }
                    case R.id.menu_export_jsd: {
                        presenter.exportJsd();
                        break;
                    }
                    case R.id.menu_export_project: {
                        presenter.exportProject();
                        break;
                    }
                    case R.id.menu_close: {
                        finish();
                        break;
                    }
//                    case R.id.menu_publish: {
//                        presenter.publishJsd();
//                        break;
//                    }
                    default: {
                        popupMenu.dismiss();
                        break;
                    }
                }
                return false;
            }
        });
        //对齐右边
        popupMenu.setGravity(Gravity.RIGHT);
        popupMenu.show();
    }

    public void refreshFile() {
        fileView.refreshFile();
    }

    @Override
    public void onSelectTab(FileTabView.FileTab fileTab) {
        super.onSelectTab(fileTab);
        if (fileTab.file.getName().endsWith(".xml")) {
            setRightView(uiDesignTreeView);
            //绑定界面渲染器
            uiDesignTreeView.setDesignRender(new UiDesignTreeView.DesignRender() {
                @Override
                public void render(ViewMap viewMap) {
                    JsdView view = viewMap.initView();
                    View contentView = ((CustomerTab) fileTab).getContentView();
                    if (contentView instanceof ViewGroup) {
                        ((ViewGroup) contentView).removeAllViews();
                        view.initView(contentView.getContext());
                        ((ViewGroup) contentView).addView(view.view);
                    }
                }
            });
            uiDesignTreeView.setFile(fileTab.file);

            //渲染
            uiDesignTreeView.renderDesignView();

        } else {
            setRightView(captureView);
        }
    }
}
