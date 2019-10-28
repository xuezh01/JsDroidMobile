package com.jsdroid.groovy.tip;

//import android.app.ActivityThread;

import com.android.api.Apps;
import android.content.Context;

import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.PackageInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import dalvik.system.DexFile;

public class PackageMap implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, PackageInfo> packageInfoMap = new HashMap<>();

    public Map<String, PackageInfo> getPackageInfoMap() {
        return packageInfoMap;
    }

    private static Map<String, PackageMap> packageMapMap = new HashMap<>();
    private List<TipModel> tips;

    public static PackageMap getInstance(String file) {
        if (file == null) {
            file = "system";
        }
        if (packageMapMap.containsKey(file)) {
            return packageMapMap.get(file);
        }
        File source = new File(file);
        if (source.exists()) {
            PackageMap read = read(new File(file));
            if (read == null) {
                return new PackageMap();
            }
            packageMapMap.put(file, read);
            return read;
        } else {
            PackageMap read = null;
            try {
                read = read(openAssets(file));
            } catch (Exception e) {
            }
            if (read == null) {
                return new PackageMap();
            }
            packageMapMap.put(file, read);
            return read;
        }
    }

    private static InputStream openAssets(String filename) throws IOException {

        return Apps.getApp().getAssets().open(filename);
    }

    public int getClassCount() {
        int count = 0;
        for (PackageInfo packageInfo : packageInfoMap.values()) {
            for (ClassInfo classInfo : packageInfo.getClassInfoMap().values()) {
                count++;
            }
        }
        return count;
    }

    public PackageInfo getPackage(String pkg) {
        if (packageInfoMap.containsKey(pkg)) {
            return packageInfoMap.get(pkg);
        } else {
            PackageInfo packageInfo = new PackageInfo();
            packageInfo.pkg = pkg;
            packageInfoMap.put(pkg, packageInfo);
            return packageInfo;
        }
    }

    public List<ClassInfo> findClasses(String name) {
        List<ClassInfo> infoList = new ArrayList<>();
        Iterator<PackageInfo> iterator = packageInfoMap.values().iterator();
        if (iterator.hasNext()) {
            PackageInfo next = iterator.next();
            Collection<ClassInfo> values = next.getClassInfoMap().values();
            Iterator<ClassInfo> infoIterator = values.iterator();
            if (infoIterator.hasNext()) {
                ClassInfo info = infoIterator.next();
                if (info.simpleName.toLowerCase().contains(name)) {
                    infoList.add(info);
                }
            }
        }
        return infoList;
    }

    public static void readPackageInfo(PackageMap packageMap, File file) throws IOException {
        if (file.isFile()) {
            if (file.getPath().endsWith(".jar")) {
                readPackageInfo(packageMap, new ZipInputStream(new FileInputStream(file)));
            }
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    readPackageInfo(packageMap, child);
                }
            }
        }
    }

    public static void readPackageInfo(PackageMap packageMap, ZipInputStream zipInputStream) throws IOException {
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String name = nextEntry.getName();
            if (name.endsWith(".class")) {
                ClassInfo classInfo = new ClassInfo();
                String[] split = name.split("/");
                if (split.length > 1) {
                    //java/lang/Thread.class
                    classInfo.pkg = toPkg(split, 0, split.length - 1);
                    classInfo.simpleName = split[split.length - 1].split("\\.")[0].replace("$", ".");
                } else {
                    classInfo.simpleName = name.split("\\.")[0].replace("$", "");
                }
                packageMap.getPackage(classInfo.pkg).put(classInfo);
            }
        }
        zipInputStream.close();

    }

    private static String toPkg(String[] split, int pos, int len) {
        StringBuilder pkg = new StringBuilder();
        pkg.append(split[pos]);
        for (int i = pos + 1; i < pos + len; i++) {
            pkg.append(".");
            pkg.append(split[i]);
        }
        return pkg.toString();
    }

    public static PackageMap read(InputStream inputStream) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
            return (PackageMap) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (Exception e) {
            }
        }
        return null;
    }

    public static PackageMap read(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            return read(fileInputStream);
        } catch (Exception e) {
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
            }
        }
        return null;
    }


    public void write(OutputStream outputStream) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(outputStream);
            out.writeObject(this);
        } catch (Exception e) {
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }

    }

    public void write(String file) {
        write(new File(file));
    }

    public void write(File file) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            write(outputStream);
        } catch (FileNotFoundException e) {
        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
            }
        }
    }

    public List<TipModel> getTips() {
        if (tips == null) {
            initTips();
        }

        return tips;
    }

    private void initTips() {
        List<TipModel> tips = new ArrayList<>();
        Collection<PackageMap> values = packageMapMap.values();
        for (PackageMap value : values) {
            Collection<PackageInfo> packageInfos = value.packageInfoMap.values();
            for (PackageInfo packageInfo : packageInfos) {
                Map<String, ClassInfo> classInfoMap = packageInfo.getClassInfoMap();
                Collection<ClassInfo> classInfos = classInfoMap.values();
                for (ClassInfo classInfo : classInfos) {
                    if (classInfo != null) {
                        tips.add(new TipModel.ClassTipModel(classInfo));
                    }
                }
            }
        }
        Collections.sort(tips, new Comparator<TipModel>() {
            @Override
            public int compare(TipModel o1, TipModel o2) {
                return o1.showText.compareTo(o2.showText);
            }
        });
        this.tips = tips;
    }

    private boolean readContextFlag;

    public boolean isReadContext() {
        return readContextFlag;
    }

    public void readReadApi(Context context) throws IOException {
        if (readContextFlag) {
            return;
        }
        ClassInfo.setContext(context);
        readContextFlag = true;
        DexFile dexFile = new DexFile(context.getPackageCodePath());
        Enumeration<String> entries = dexFile.entries();
        while (entries.hasMoreElements()) {
            String className = entries.nextElement();
            className = className.replace("$", ".");
            ClassInfo classInfo = ClassInfo.forName(className);
            if (classInfo == null) {
                continue;
            }
            String pkg = classInfo.pkg;
            if (pkg == null) {
                pkg = "default";
            }
            getPackage(pkg).put(classInfo);
        }
    }

    public static void main(String[] args) throws IOException {
        PackageMap packageMap = new PackageMap();
        readPackageInfo(packageMap, new File("D:\\develop\\android\\sdk\\platforms\\android-28\\android.jar"));
        packageMap.write("android.api");
        PackageMap instance = PackageMap.getInstance("android.api");
        System.out.println(instance.getClassCount());


    }
}
