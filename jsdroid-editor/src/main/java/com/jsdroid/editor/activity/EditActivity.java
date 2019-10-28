package com.jsdroid.editor.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jsdroid.editor.ContextUtil;
import com.jsdroid.editor.R;
import com.jsdroid.editor.parser.Colors;
import com.jsdroid.editor.parser.ParserFactory;
import com.jsdroid.editor.widget.CodeEditPane;
import com.jsdroid.editor.widget.CodeEditText;
import com.jsdroid.editor.widget.EditToolView;
import com.jsdroid.editor.widget.FileTabView;
import com.jsdroid.fileview.FileView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class EditActivity extends AppCompatActivity implements View.OnClickListener, FileTabView.FileTabListener {



    public class CustomerTab extends FileTabView.FileTab {
        private File file;

        public CustomerTab(File file) {
            super(file);
            this.file = file;
        }

        public File getFile() {
            return file;
        }

        @Override
        public int getDefaultColor() {
            return Colors.tabDefaultColor;
        }

        @Override
        public int getSelectColor() {
            return Colors.tabSelectColor;
        }

        @Override
        public int getDefaultTextColor() {

            return Colors.tabDefaultTextColor;
        }

        @Override
        public int getSelectTextColor() {
            return Colors.tabSelectTextColor;
        }

        @Override
        public int getImage() {
            return R.drawable.ic_file;
        }

        @Override
        public String getText() {
            return file.getName();
        }

        @Override
        public void save() {

        }

        @Override
        public void onSelected(FileTabView fileTabView) {
            editorContentView.removeAllViews();
            editorContentView.addView(getContentView());
            editToolView.setVisibility(View.GONE);
        }

        @Override
        public void onClosed(FileTabView fileTabView) {
            editorContentView.removeView(getContentView());
            //检测是否没有打开文件
            checkNotOpen();
        }

        public View getContentView() {
            return new View(EditActivity.this);
        }
    }

    public class EditTab extends FileTabView.FileTab implements TextWatcher {
        CodeEditPane codeEditPane;
        boolean changed;


        public EditTab(File file) throws Exception {
            super(file);
            if (file.length() > 100_0000) {
                throw new Exception("文件太大！");
            }
            this.file = file;
            codeEditPane = new CodeEditPane(EditActivity.this);
            codeEditPane.setParser(ParserFactory.getParser(file));
            codeEditPane.openFile(file);
            codeEditPane.getCodeEditText().setTextWatcher(this);
        }

        @Override
        public int getDefaultColor() {
            return Colors.tabDefaultColor;
        }

        @Override
        public int getSelectColor() {
            return Colors.tabSelectColor;
        }

        @Override
        public int getDefaultTextColor() {

            return Colors.tabDefaultTextColor;
        }

        @Override
        public int getSelectTextColor() {
            return Colors.tabSelectTextColor;
        }

        @Override
        public int getImage() {
            return R.drawable.ic_file;
        }

        @Override
        public String getText() {
            return file.getName();
        }

        private void openFile() {
            //打开编辑界面
            codeEditPane.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            editorContentView.removeAllViews();
            editorContentView.addView(codeEditPane);
            codeEditText = codeEditPane.getCodeText();
            //绑定工具栏
            editToolView.setCodeEditText(codeEditText);
            editToolView.setVisibility(View.VISIBLE);
            codeEditText.requestFocus();
        }

        @Override
        public void onSelected(FileTabView fileTabView) {
            openFile();
        }

        @Override
        public void onClosed(FileTabView fileTabView) {
            closeInputMethod(codeEditPane.getCodeText());
            codeEditPane.getCodeText().closeTips();
            editorContentView.removeView(codeEditPane);
            //判断是否需要保存文件
            if (changed) {
                new AlertDialog.Builder(EditActivity.this).setTitle("提示").setMessage("是否保存文件" + file.getName() + "？").setNegativeButton("不保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        save();
                    }
                }).setCancelable(false).create().show();
            }
            //检测是否没有打开文件
            checkNotOpen();
        }

        @Override
        public void save() {
            if (changed) {
                changed = false;
                setTitle(file.getName());
                try {
                    FileUtils.writeStringToFile(file, codeEditPane.getCodeText().getText().toString(), "utf-8");
                } catch (IOException e) {
                }
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            changed = true;
            setTitle(file.getName() + "*");
        }
    }

    protected DrawerLayout drawerLayout;
    protected View imgBtnDir;
    /**
     * JsDroid
     */
    protected TextView tvTitle;
    protected View imgBtnPlay;
    protected View imgBtnEye;
    protected View imgBtnMenu;
    protected View imgBtnSave;
    protected FileTabView fileTabView;

    protected LinearLayout editorContentView;
    //下边的编辑导航工具
    protected EditToolView editToolView;
    protected CodeEditText codeEditText;
    protected FileView fileView;
    protected List<FileType> fileTypes;
    //右边的drawer view
    protected LinearLayout layoutRight;

    public interface FileType {
        boolean forFile(File file);

        FileTabView.FileTab open(File file);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.img_btn_dir) {
            //打开文件
            if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                drawerLayout.closeDrawers();
            } else {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        } else if (i == R.id.img_btn_run) {
            run();
        } else if (i == R.id.img_btn_eye) {
            eye();
        } else if (i == R.id.img_btn_menu) {
            showMenu();
        } else if (i == R.id.img_btn_save) {
            save();
        }
    }

    protected void save() {
        fileTabView.save();
    }

    protected abstract void run();

    protected abstract void eye();

    protected abstract void openProject();

    protected abstract void showMenu();

    public void addFileType(FileType fileType) {
        if (fileTypes == null) {
            fileTypes = new ArrayList<>();
        }
        if (!fileTypes.contains(fileType)) {
            fileTypes.add(fileType);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Colors.init(this);
        //设置状态栏颜色
        ContextUtil.setActionBarColor(this, 0xff333335);
        setContentView(R.layout.activity_edit);
        initView();
        //对View添加event
        initEvents();

    }

    /**
     * 对View添加event
     */
    private void initEvents() {

        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
                //关闭输入法
                try {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(drawerView.getWindowToken()
                            , InputMethodManager.HIDE_NOT_ALWAYS);
                } catch (Exception e) {
                }
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
                checkNotOpen();
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        fileView.setFileListener(new FileView.FileListener() {
            @Override
            public void onDelete(final File file) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //删除文件的时候，关闭tab
                        fileTabView.closeTab(file);
                    }
                });

            }

            @Override
            public void onAdd(File file) {

            }

            @Override
            public void onRename(final File oldFile, final File newFile) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //重命名文件的时候，更新tab标题
                        EditTab tab = (EditTab) fileTabView.findTab(oldFile);
                        if (tab != null) {
                            tab.file = newFile;
                            tab.setTitle(newFile.getName() + (tab.changed ? "*" : ""));
                        }
                    }
                });

            }

            @Override
            public void onCut(final File oldFile, final File newFile) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //剪切文件的时候，更新tab标题
                        EditTab tab = (EditTab) fileTabView.findTab(oldFile);
                        if (tab != null) {
                            tab.file = newFile;
                            tab.setTitle(newFile.getName() + (tab.changed ? "*" : ""));
                        }
                    }
                });
            }

            /**
             * 打开文件的时候，关闭列表
             * @param file
             */
            @Override
            public void onOpen(File file) {
                try {
                    openFile(file);
                } catch (Exception e) {
                    Toast.makeText(EditActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawers();
            }
        });
        fileTabView.setFileTabListener(this);
    }

    /**
     * 加载View
     */
    private void initView() {
        drawerLayout = findViewById(R.id.drawer_layout);
        imgBtnDir = findViewById(R.id.img_btn_dir);
        imgBtnDir.setOnClickListener(this);
        tvTitle = findViewById(R.id.tv_title);
        imgBtnPlay = findViewById(R.id.img_btn_run);
        imgBtnPlay.setOnClickListener(this);
        imgBtnEye = findViewById(R.id.img_btn_eye);
        imgBtnEye.setOnClickListener(this);
        imgBtnMenu = findViewById(R.id.img_btn_menu);
        imgBtnMenu.setOnClickListener(this);
        fileTabView = findViewById(R.id.file_tab);
        editorContentView = findViewById(R.id.layout_editor);
        editToolView = findViewById(R.id.tool_view);
        fileTabView.setOnClickListener(this);
        fileView = findViewById(R.id.layout_file);
        imgBtnSave = findViewById(R.id.img_btn_save);
        imgBtnSave.setOnClickListener(this);
        fileView.setBackgroundColor(Colors.fileViewBackgroundColor);
        layoutRight = (LinearLayout) findViewById(R.id.layout_right);

    }

    /**
     * 隐藏代码提示
     */
    public void hideTips() {
        if (codeEditText != null) {
            codeEditText.closeTips();
        }
    }


    /**
     * 打开文件，编辑文件
     *
     * @param file
     */
    public void openFile(File file) throws Exception {
        if (file == null || !file.exists()) {
            return;
        }
        if (fileTypes != null) {
            for (FileType fileType : fileTypes) {
                if (fileType.forFile(file)) {
                    FileTabView.FileTab open = fileType.open(file);
                    fileTabView.selectTab(fileTabView.addTab(open));
                    return;
                }
            }
        }
        fileTabView.selectTab(fileTabView.addTab(new EditTab(file)));
    }

    public void setProjectDir(File file) {
        fileView.setProjectFile(file);

    }

    /**
     * 拦截事件，隐藏提示
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        hideTips();
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 关闭输入法
     *
     * @param view
     */
    private void closeInputMethod(View view) {
        //关闭输入法
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken()
                , InputMethodManager.HIDE_NOT_ALWAYS);

    }

    /**
     * 退出时候，保存所有文件
     */
    @Override
    protected void onPause() {
        super.onPause();
        save();
    }

    /**
     * 检查是否打开文件，没有打开则显示文件列表
     */
    private void checkNotOpen() {
        if (fileTabView.getTabCount() == 0) {
            drawerLayout.openDrawer(Gravity.LEFT);
        }
    }

    @Override
    public void onCloseTab(FileTabView.FileTab fileTab) {

    }

    @Override
    public void onSelectTab(FileTabView.FileTab fileTab) {

    }

    @Override
    public void onOpenTab(FileTabView.FileTab fileTab) {

    }

    public void setRightView(View view) {
        layoutRight.removeAllViews();
        layoutRight.addView(view);
    }
    public void showFileTree() {
        drawerLayout.openDrawer(Gravity.LEFT);
    }

}
