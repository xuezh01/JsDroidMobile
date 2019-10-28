package com.jsdroid.app.jsd;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsdroid.app.App;
import com.jsdroid.app.dao.ProjectDao;
import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Project;
import com.jsdroid.app.project.dev.CodeActivity;
import com.jsdroid.commons.FileUtil;

import net.lingala.zip4j.core.ZipFile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class JsdProject {


    public Project readProjectInfo(File projectFile) throws IOException {
        Project project = new Project();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(projectFile));
        try {
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (nextEntry.getName().equals("config.json") || nextEntry.getName().equals("/config.json")) {
                    String read = IOUtils.toString(zipInputStream);
                    JSONObject jsonObject = JSON.parseObject(read);
                    //获取版本，包名，脚本名
                    if (jsonObject.containsKey("name")) {
                        project.setName(jsonObject.getString("name"));
                    }
                    if (jsonObject.containsKey("ver")) {
                        project.setVersion(jsonObject.getString("ver"));
                    }
                    if (jsonObject.containsKey("version")) {
                        project.setVersion(jsonObject.getString("version"));
                    }
                    if (jsonObject.containsKey("pkg")) {
                        project.setPkg(jsonObject.getString("pkg"));
                    }
                    if (jsonObject.containsKey("note")) {
                        project.setNote(jsonObject.getString("note"));
                    }
                }
            }

        } finally {
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        }
        return project;
    }

    public interface ProjectListener {
        void onProjectChanged() throws Exception;

        void onOpenProject(Project project) throws Exception;
    }

    private final List<ProjectListener> projectListeners;

    private JsdProject() {
        projectListeners = new ArrayList<>();
    }

    public void addProjectListener(ProjectListener projectListener) {
        if (projectListener == null) {
            return;
        }
        synchronized (projectListeners) {
            projectListeners.add(projectListener);
        }
    }

    public void removeProjectListener(ProjectListener projectListener) {
        synchronized (projectListeners) {
            projectListeners.remove(projectListener);
        }
    }


    private static JsdProject instance = new JsdProject();

    public static JsdProject getInstance() {
        return instance;
    }

    public void deleteProject(final Project project) {
        try {
            try {
                FileUtils.deleteDirectory(getProjectDir(project.pkg));
            } catch (IOException e) {
            }
            Db.getInstance().getDaoSession().getProjectDao().delete(project);
        } finally {
            fireProjectChanged();
        }
    }

    /**
     * 导入项目
     *
     * @param project
     * @param projectFile
     * @throws Exception
     */
    public void importProject(Project project, File projectFile) throws Exception {
        try {
            File projectDir = getProjectDir(project.pkg);
            //将项目解压出
            ZipFile zipFile = new ZipFile(projectFile);
            zipFile.extractAll(projectDir.getPath());
            project.file = projectDir.getPath();
            project.createTime = project.updateTime = new Date();
            //保存
            Db.getInstance().getDaoSession().getProjectDao().save(project);
            //将config.json再次写进去
            FileUtil.write(new File(projectDir, "config.json"), JSON.toJSONString(project));
        } catch (Exception e) {
            throw new Exception("导入工程失败！");
        } finally {
            fireProjectChanged();
        }
    }

    public Project importDemoProject(String pkg, File projectFile) throws Exception {
        Project project = JsdProject.getInstance().readProjectInfo(projectFile);
        project.setPkg(pkg);
        importProject(project, projectFile);
        return project;
    }

    public File getProjectDir(String pkg) {
        return new File(App.getInstance().getFilesDir(), pkg);
    }

    public void createProject(Project project) throws Exception {
        try {

            if (project.name.length() == 0) {
                throw new Exception("工程名称为空！");
            }
            if (project.pkg.length() == 0) {
                throw new Exception("工程包名为空！");
            }
            File projectDir = getProjectDir(project.pkg);

            project.file = projectDir.getPath();
            project.version = "1.0";
            project.createTime = project.updateTime = new Date();
            if (projectDir.exists()) {
                throw new Exception("工程已经存在！");
            }
            if (!projectDir.mkdir()) {
                throw new Exception("创建工程文件失败！");
            }
            //创建icon.png
            try {
                FileUtils.copyFile(new File(project.icon), new File(projectDir, "icon.png"));
                project.icon = new File(projectDir, "icon.png").getPath();
            } catch (IOException e) {
            }

            //创建config.json
            String config = JSON.toJSONString(project);
            FileUtil.write(new File(projectDir, "config.json"), config);
            //创建view
            File viewFold = new File(projectDir, "view");
            viewFold.mkdir();
            FileUtil.write(new File(viewFold, "MainView.groovy"), "showView \"main.xml\"");

            //创建script
            File scriptFold = new File(projectDir, "script");
            scriptFold.mkdir();
            FileUtil.write(new File(scriptFold, "MainScript.groovy"), "print \"hello world!\"");

            //创建res
            File resFold = new File(projectDir, "res");
            resFold.mkdir();
            FileUtil.write(new File(resFold, "main.xml"), "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                    "<Layout><Text text=\"hello world!\"/></Layout>");

            //创建out
            File outFold = new File(projectDir, "out");
            outFold.mkdir();
            //创建class

            File classFold = new File(projectDir, "class");
            classFold.mkdir();

            try {
                Db.getInstance().getDaoSession().getProjectDao().save(project);
            } catch (Exception e) {
                throw new Exception("创建工程失败！");
            }

        } finally {
            fireProjectChanged();
        }


    }

    public void update(Project project) {
        try {
            Db.getInstance().getDaoSession().getProjectDao().update(project);
        } catch (Exception e) {
        } finally {
            fireProjectChanged();
        }

    }

    private void fireProjectChanged() {
        Handler handler = new Handler(Looper.getMainLooper());
        synchronized (projectListeners) {
            for (final ProjectListener projectListener : projectListeners) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            projectListener.onProjectChanged();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    private void fireOpenProject(Project project) {
        Handler handler = new Handler(Looper.getMainLooper());
        synchronized (projectListeners) {
            for (ProjectListener projectListener : projectListeners) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            projectListener.onOpenProject(project);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    public Project getProject(long projectId) {
        return Db.getInstance().getDaoSession().getProjectDao().loadByRowId(projectId);
    }

    public void openProject(Context context, Project project) {
        fireOpenProject(project);
        Intent intent = new Intent(context, CodeActivity.class);
        intent.putExtra("projectId", project.id);
        context.startActivity(intent);
    }

    public Project findProject(String pkg) {
        ProjectDao projectDao = Db.getInstance().getDaoSession().getProjectDao();
        return projectDao.queryBuilder().where(ProjectDao.Properties.Pkg.eq(pkg)).unique();
    }
}
