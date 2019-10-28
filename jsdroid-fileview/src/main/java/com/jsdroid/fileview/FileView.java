package com.jsdroid.fileview;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 文件浏览界面
 * <p>
 * home cut copy paste delete add selectAll
 */
public class FileView extends LinearLayout implements View.OnClickListener {
    private Map<String, String> descMap;
    private LinearLayout mBtnHome;
    private LinearLayout mBtnCut;
    private LinearLayout mBtnCopy;
    private LinearLayout mBtnPaste;
    private LinearLayout mBtnCancel;
    private LinearLayout mBtnDelete;
    private LinearLayout mBtnAdd;
    private RelativeLayout mLayoutPaste;
    private CheckBox mCheckAll;
    private TextView mTvPath;
    private TextView mTvPaste;
    private ListView mFileList;
    AppCompatSpinner mSpinnerFileRoot;
    private int btnOkColor = 0xff00aa00;
    private int btnCancelColor = 0xffaa0000;
    private File projectFile;
    private File sdcardFile;
    private File openProjectFile;//当前打开的项目文件夹
    private File openSdcardFile;//当前打开的sdcard文件夹

    public void putDesc(File file, String desc) {
        putDesc(file.getPath(), desc);
    }

    public void putDesc(String file, String desc) {
        descMap.put(file, desc);
    }

    public void setBtnCancelColor(int btnCancelColor) {
        this.btnCancelColor = btnCancelColor;
    }

    public void setBtnOkColor(int btnOkColor) {
        this.btnOkColor = btnOkColor;
    }

    File rootFile;
    File openFile;
    DataAdapter dataAdapter;
    boolean copy;
    List<File> copies;
    FileListener fileListener;

    public void setFileListener(FileListener fileListener) {
        this.fileListener = fileListener;
    }

    public void refreshFile() {
        post(new Runnable() {
            @Override
            public void run() {
                openDir(openFile);
            }
        });

    }

    public interface FileListener {
        void onDelete(File file);

        void onAdd(File file);

        void onRename(File oldFile, File newFile);

        void onCut(File oldFile, File newFile);

        void onOpen(File file);
    }

    public static class FileItem {
        //是否为父文件夹
        public boolean parent;
        //文件或文件夹
        public File file;
        //是否选中
        public boolean select;

    }

    public FileView(Context context) {
        this(context, null);
    }

    public FileView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        descMap = new HashMap<>();
        LayoutInflater.from(getContext()).inflate(R.layout.fm_file_view, this);
        initView();
        initAdapter();
        bindEvent();
        projectFile = getContext().getFilesDir();
        sdcardFile = Environment.getExternalStorageDirectory();
        setRootFile(projectFile, null);
    }

    public void setProjectFile(File projectFile) {
        this.projectFile = projectFile;
        setRootFile(projectFile, null);
    }

    private void bindEvent() {
        mCheckAll.setOnCheckChangedListener(new CheckBox.OnCheckChangedListener() {
            @Override
            public void onCheckChanged(CheckBox checkBox, boolean checked) {
                selectAll(checked);
            }
        });
        mSpinnerFileRoot.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        setRootFile(projectFile, openProjectFile);
                        break;
                    case 1:
                        setRootFile(sdcardFile, openSdcardFile);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initAdapter() {
        dataAdapter = new DataAdapter(getContext());
        dataAdapter.addDataHandler(new DataAdapter.DataHandler() {
            @Override
            public int getLayoutId() {
                return R.layout.fm_list_item_parent;
            }

            @Override
            public boolean canFillData(Object data) {
                if (data instanceof FileItem) {
                    FileItem item = (FileItem) data;
                    return item.parent;
                }
                return false;
            }

            @Override
            public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
                DataAdapter.ViewTool viewTool = viewHolder.createViewTool();
                ImageView image = viewTool.getView(R.id.image);
                image.setBackgroundResource(R.drawable.fm_ic_folder);
            }
        });
        dataAdapter.addDataHandler(new DataAdapter.DataHandler() {


            @Override
            public int getLayoutId() {
                return R.layout.fm_list_item_file;
            }

            @Override
            public boolean canFillData(Object data) {
                if (data instanceof FileItem) {
                    FileItem item = (FileItem) data;
                    return item.parent == false;
                }
                return false;
            }

            @Override
            public void fillData(int pos, final Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
                final FileItem item = (FileItem) data;
                DataAdapter.ViewTool viewTool = viewHolder.createViewTool();
                CheckBox check = viewTool.getView(R.id.check);
                check.setChecked(item.select);
                viewTool.setText(R.id.fileName, item.file.getName());

                viewTool.setText(R.id.fileDesc, descMap.get(item.file.getPath()));
                if (item.file.isFile()) {
                    ImageView image = viewTool.getView(R.id.image);
                    image.setBackgroundResource(R.drawable.fm_ic_file);
                } else {
                    ImageView image = viewTool.getView(R.id.image);
                    image.setBackgroundResource(R.drawable.fm_ic_folder);
                }
                //选择变化
                check.setOnCheckChangedListener(new CheckBox.OnCheckChangedListener() {
                    @Override
                    public void onCheckChanged(CheckBox checkBox, boolean checked) {
                        item.select = checked;
                        onSelectChanged();
                    }
                });
                viewTool.getView(R.id.btn_delete).setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        delete(item);
                    }
                });
                viewTool.getView(R.id.btn_rename).setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rename(item);
                    }
                });
            }

            //重命名单个文件
            void rename(final FileItem fileItem) {
                final EditText editText = new EditText(getContext());
                editText.setHint(fileItem.file.getName());
                editText.setText(fileItem.file.getName());
                AlertDialog show = new AlertDialog.Builder(getContext()).setTitle("重命名").setView(editText).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //检测文件名是否合法
                        String filename = editText.getText().toString();
                        if (!filename.matches("[^\\s\\\\/:\\*\\?\\\"<>\\|](\\x20|[^\\s\\\\/:\\*\\?\\\"<>\\|])*[^\\s\\\\/:\\*\\?\\\"<>\\|\\.]$")) {
                            Toast.makeText(getContext(), "文件名不合法", Toast.LENGTH_SHORT).show();
                            editText.setText(fileItem.file.getName());
                            return;
                        }

                        //重命名文件
                        File oldFile = fileItem.file;
                        File newFile = new File(fileItem.file.getParent(), filename);
                        boolean hasMove = false;
                        if (oldFile.isDirectory()) {
                            try {
                                FileUtils.moveDirectory(oldFile, newFile);
                                hasMove = true;
                            } catch (IOException e) {
                            }
                        } else {
                            try {
                                FileUtils.moveFile(oldFile, newFile);
                                hasMove = true;
                            } catch (IOException e) {
                            }
                        }
                        if (hasMove) {
                            closeInput(editText);
                            dialog.dismiss();
                            if (fileListener != null) {
                                fileListener.onRename(oldFile, newFile);
                            }
                            fileItem.file = newFile;
                            dataAdapter.notifyDataSetInvalidated();

                        } else {
                            Toast.makeText(getContext(), "已存在该文件！", Toast.LENGTH_SHORT).show();
                        }

                    }
                }).setCancelable(false).show();
            }

            //删除当个文件
            void delete(final FileItem fileItem) {
                new AlertDialog.Builder(getContext()).setTitle("删除文件").setMessage("确定删除文件" + fileItem.file.getPath() + "?").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("删除", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        List<File> files = new ArrayList<>();
                        files.add(fileItem.file);
                        FileView.this.delete(files, new Runnable() {
                            @Override
                            public void run() {
                                dataAdapter.delete(fileItem);
                                dataAdapter.notifyDataSetChanged();
                            }
                        });

                    }
                }).create().show();
            }
        });
        mFileList.setAdapter(dataAdapter);
        mFileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FileItem data = dataAdapter.getData(position);
                if (data.file.isDirectory()) {
                    openDir(data.file);
                } else {
                    if (fileListener != null) {
                        fileListener.onOpen(data.file);
                    }
                }
            }
        });
    }


    private void initView() {
        mBtnHome = (LinearLayout) findViewById(R.id.btn_home);
        mBtnHome.setOnClickListener(this);
        mBtnCut = (LinearLayout) findViewById(R.id.btn_cut);
        mBtnCut.setOnClickListener(this);
        mBtnCopy = (LinearLayout) findViewById(R.id.btn_copy);
        mBtnCopy.setOnClickListener(this);
        mBtnPaste = (LinearLayout) findViewById(R.id.btn_paste);
        mBtnPaste.setOnClickListener(this);
        mBtnCancel = (LinearLayout) findViewById(R.id.btn_cancel);
        mBtnCancel.setOnClickListener(this);
        mBtnDelete = (LinearLayout) findViewById(R.id.btn_delete);
        mBtnDelete.setOnClickListener(this);
        mBtnAdd = (LinearLayout) findViewById(R.id.btn_add);
        mBtnAdd.setOnClickListener(this);
        mCheckAll = (CheckBox) findViewById(R.id.check_all);
        mFileList = (ListView) findViewById(R.id.file_list);
        mTvPath = findViewById(R.id.tv_path);
        mTvPaste = findViewById(R.id.tv_paste);
        mLayoutPaste = findViewById(R.id.layout_paste);
        mSpinnerFileRoot = findViewById(R.id.spinner_file_root);

    }

    public void setTvPathBgColor(int color) {
        mTvPath.setBackgroundColor(color);
    }

    public void setTvPathColor(int color) {
        mTvPath.setTextColor(color);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_home) {
            home();
        } else if (i == R.id.btn_cut) {
            cut();
        } else if (i == R.id.btn_copy) {
            copy();
        } else if (i == R.id.btn_paste) {

            new AlertDialog.Builder(getContext()).setTitle(copy ? "粘贴" : "移动").setMessage(copy ? "确定粘贴文件到此处？" : "确定移动文件到此处？").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).setPositiveButton(copy ? "粘贴" : "移动", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    paste();
                }
            }).create().show();

        } else if (i == R.id.btn_cancel) {
            cancel();
        } else if (i == R.id.btn_delete) {
            new AlertDialog.Builder(getContext()).setTitle("删除文件").setMessage("确定删除所选文件？").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).setPositiveButton("删除", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    delete();
                }
            }).create().show();
        } else if (i == R.id.btn_add) {
            add();
        } else {
        }
    }

    public void setRootFile(File rootFile, File openFile) {
        this.rootFile = rootFile;
        if (openFile == null) {
            openDir(rootFile);
        } else {
            openDir(openFile);
        }
    }

    public void openDir(File dir) {
        if (dir == null) {
            return;
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }
        openFile = dir;
        if (rootFile.equals(sdcardFile)) {
            openSdcardFile = dir;
        } else {
            openProjectFile = dir;
        }
        mTvPath.setText(dir.getPath() + "/");
        List<FileItem> fileItems = new ArrayList<>();
        if (!dir.equals(rootFile)) {
            //父节点
            File parent = dir.getParentFile();
            if (parent != null) {
                //如果是不是根节点，则显示父节点
                FileItem item = new FileItem();
                item.parent = true;
                item.file = parent;
                item.select = false;
                fileItems.add(item);
            }
        }

        File[] files = dir.listFiles();

        List<File> fileList = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                fileList.add(file);
            }
        }

        Collections.sort(fileList, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (o1.isDirectory() && o2.isFile())
                    return -1;
                if (o1.isFile() && o2.isDirectory())
                    return 1;
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (File file : fileList) {
            FileItem item = new FileItem();
            item.parent = false;
            item.file = file;
            item.select = false;
            fileItems.add(item);
        }
        dataAdapter.setDatas(fileItems);
        dataAdapter.notifyDataSetChanged();
        onSelectChanged();
    }

    private void home() {
        if (rootFile != null) {
            openDir(rootFile);
        }
    }

    private void cut() {
        copy();
        copy = false;
        mTvPaste.setText("移动到此");
    }

    private void copy() {
        copy = true;
        List<File> files = new ArrayList<>();
        //获取选择项
        for (int i = 0; i < dataAdapter.getCount(); i++) {
            FileItem data = dataAdapter.getData(i);
            if (data.select && (data.parent == false)) {
                files.add(data.file);

            }
        }
        copies = files;
        mTvPaste.setText("粘贴到此");
        mLayoutPaste.setVisibility(VISIBLE);
    }

    private void paste() {
        final android.app.AlertDialog dialog = new ProgressDialog.Builder(getContext()).setTitle(copy ? "正在粘贴..." : "正在移动...").show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (copies != null) {
                    for (File file : copies) {
                        File moveToFile = new File(openFile, file.getName());
                        if (file.equals(moveToFile)) {
                            if (!copy) {
                                continue;
                            }
                            for (int i = 1; ; i++) {
                                int pos = file.getName().lastIndexOf('.');
                                String start = "";
                                String end = "";
                                if (pos == -1) {
                                    start = file.getName() + "-" + (i);
                                } else {
                                    start = file.getName().substring(0, pos) + "-" + (i);
                                    end = file.getName().substring(pos);
                                }
                                moveToFile = new File(openFile, start + end);
                                if (!file.equals(moveToFile)) {
                                    break;
                                }
                            }
                        }
                        if (file.isDirectory()) {
                            try {
                                FileUtils.copyDirectory(file, moveToFile);
                            } catch (IOException e) {
                                post(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getContext(), "操作失败!", Toast.LENGTH_SHORT).show();
                                    }
                                });
                                continue;
                            }
                        } else {
                            try {
                                FileUtils.copyFile(file, moveToFile);
                            } catch (IOException e) {
                                post(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getContext(), "操作失败!", Toast.LENGTH_SHORT).show();
                                    }
                                });
                                break;
                            }
                        }
                        if (copy == false) {
                            deleteFile(file);
                            if (fileListener != null) {
                                fileListener.onCut(file, moveToFile);
                            }
                        }

                    }

                }
                post(new Runnable() {
                    @Override
                    public void run() {
                        dialog.dismiss();
                        mLayoutPaste.setVisibility(GONE);
                        openDir(openFile);
                    }
                });
            }
        }).start();


    }

    private void cancel() {
        mLayoutPaste.setVisibility(GONE);
        copies = null;
    }

    private void deleteFile(File file) {
        if (file.isDirectory()) {
            try {
                FileUtils.deleteDirectory(file);
            } catch (IOException e) {
            }
        } else {
            file.delete();
        }
    }

    private void delete(final List<File> files, final Runnable end) {
        final android.app.AlertDialog dialog = new ProgressDialog.Builder(getContext()).setTitle("正在删除...").show();
        Runnable runnable = new Runnable() {
            public void run() {
                Iterator iterator = files.iterator();
                while (iterator.hasNext()) {
                    File file = (File) iterator.next();
                    deleteFile(file);
                    if (fileListener != null) {
                        fileListener.onDelete(file);
                    }
                }
                post(new Runnable() {
                    @Override
                    public void run() {
                        dialog.dismiss();
                        end.run();
                    }
                });
            }
        };
        new Thread(runnable).start();
    }

    private void delete() {
        final android.app.AlertDialog dialog = new ProgressDialog.Builder(getContext()).setTitle("正在删除...").show();
        List<File> files = new ArrayList<>();
        Iterator iterator = dataAdapter.getDatas().iterator();
        while (iterator.hasNext()) {
            FileItem item = (FileItem) iterator.next();
            if (item.select && (item.parent == false)) {
                File file = item.file;
                files.add(file);
            }
        }
        delete(files, new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
                openDir(openFile);
            }
        });
    }

    private void add() {
        //添加文件 or 添加文件夹
        PopupMenu popupMenu = new PopupMenu(getContext(), mBtnAdd);
        popupMenu.getMenu().add("添加文件");
        popupMenu.getMenu().add("添加文件夹");
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = item.getTitle().toString();
                boolean addFile = false;
                if ("添加文件".equals(title)) {
                    addFile = true;
                } else if ("添加文件夹".equals(title)) {
                    addFile = false;
                }
                add(addFile);
                return false;
            }
        });
        popupMenu.show();
    }

    private void add(final boolean file) {
        final EditText editText = new EditText(getContext());
        editText.setHint("请输入文件名");
        new AlertDialog.Builder(getContext()).setTitle(file ? "添加文件" : "添加文件夹").setView(editText).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                closeInput(editText);
            }
        }).setPositiveButton("添加", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //检测文件名是否合法
                String filename = editText.getText().toString();
                if (!filename.matches("[^\\s\\\\/:\\*\\?\\\"<>\\|](\\x20|[^\\s\\\\/:\\*\\?\\\"<>\\|])*[^\\s\\\\/:\\*\\?\\\"<>\\|\\.]$")) {
                    Toast.makeText(getContext(), "文件名不合法", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                    return;
                }
                closeInput(editText);
                dialog.dismiss();
                if (file) {
                    addFile(filename);
                } else {
                    addDir(filename);
                }
                if (fileListener != null) {
                    fileListener.onAdd(new File(openFile, filename));
                }
            }
        }).setCancelable(false).show();
        editText.requestFocus();
    }


    private void refreshAndGotoFile(String file) {
        openDir(openFile);
        int pos = 0;
        for (int i = 0; i < dataAdapter.getCount(); i++) {
            FileItem item = dataAdapter.getData(i);
            if (item.file != null)
                if (item.file.getName().equals(file)) {
                    pos = i;
                    break;
                }
        }
        mFileList.smoothScrollToPosition(pos);
    }

    private void addFile(final String file) {
        final android.app.AlertDialog dialog = new ProgressDialog.Builder(getContext()).setTitle("正在创建文件:" + file).create();
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(openFile, file));
                    fileOutputStream.close();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            refreshAndGotoFile(file);
                        }
                    });
                } catch (Exception e) {
                } finally {
                    post(new Runnable() {
                        @Override
                        public void run() {
                            dialog.dismiss();
                        }
                    });
                }
            }
        }).start();
    }

    private void addDir(final String file) {
        final android.app.AlertDialog dialog = new ProgressDialog.Builder(getContext()).setTitle("正在创建文件夹:" + file).create();
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new File(openFile, file).mkdir();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            refreshAndGotoFile(file);
                        }
                    });
                } catch (Exception e) {
                } finally {
                    post(new Runnable() {
                        @Override
                        public void run() {
                            dialog.dismiss();
                        }
                    });
                }
            }
        }).start();
    }

    private void selectAll(boolean checked) {
        for (int i = 0; i < dataAdapter.getCount(); i++) {
            FileItem item = dataAdapter.getData(i);
            if (!item.parent) {
                item.select = checked;
            }
        }
        dataAdapter.notifyDataSetInvalidated();
        onSelectChanged();
    }

    private void onSelectChanged() {
        boolean select = false;
        for (int i = 0; i < dataAdapter.getCount(); i++) {
            FileItem item = dataAdapter.getData(i);
            if (!item.parent) {
                if (item.select) {
                    select = true;
                    break;
                }
            }
        }
        if (select) {
            mBtnCut.setVisibility(VISIBLE);
            mBtnDelete.setVisibility(VISIBLE);
            mBtnCopy.setVisibility(VISIBLE);
        } else {
            mBtnCut.setVisibility(GONE);
            mBtnDelete.setVisibility(GONE);
            mBtnCopy.setVisibility(GONE);
        }
    }

    private void closeInput(View view) {
        //关闭输入法
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken()
                , InputMethodManager.HIDE_NOT_ALWAYS);

    }
}
