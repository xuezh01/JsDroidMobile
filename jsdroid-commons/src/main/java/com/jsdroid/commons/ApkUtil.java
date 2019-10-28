package com.jsdroid.commons;

import android.os.Build;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ApkUtil {

    /**
     * 释放lib
     *
     * @param libOutDir 输出路径
     * @param tempDir   临时路径
     * @param deleteOld 删除旧的
     * @param tryLoad   尝试加载
     */
    public static void releaseApkLib(final File libOutDir, final File tempDir, final boolean deleteOld, final boolean tryLoad) {
        //释放so
        try {
            //获取apk路径
            ApkUtil.scanClassPath(new ApkUtil.ScanCallback() {
                @Override
                public void onFile(String file) {
                    try {
                        //尝试加载lib
                        ApkUtil.unzipApkLib(new File(file),
                                libOutDir,
                                tempDir,
                                deleteOld,
                                tryLoad);
                    } catch (Exception e) {
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    /**
     * 解压到指定路径outDir
     * fileName --》  outDir/fileName
     *
     * @param zipFile
     * @param fileName
     * @param outDir
     * @throws IOException
     */
    public static void unzipFileToDir(File zipFile, String fileName, File outDir) throws IOException {
        outDir.mkdirs();
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            for (; ; ) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (!name.startsWith(fileName)) {
                    continue;
                }
                if (nextEntry.isDirectory()) {
                    new File(outDir, name).mkdirs();
                    continue;
                }
                FileOutputStream fileOutputStream = null;
                try {
                    new File(outDir, name).getParentFile().mkdirs();
                    fileOutputStream = new FileOutputStream(new File(outDir, name));
                    IOUtils.copy(zipInputStream, fileOutputStream);
                } finally {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            }
        } finally {
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        }
    }

    public static void unzipApkAssets(File apkFile, File outDir, File tempDir) throws IOException {
        outDir.mkdirs();
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(apkFile));
            for (; ; ) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (nextEntry.isDirectory()) {
                    new File(tempDir, nextEntry.getName()).mkdirs();
                    continue;
                }
                if (nextEntry.getName().startsWith("assets")) {
                    FileOutputStream fileOutputStream = null;
                    try {
                        new File(tempDir, nextEntry.getName()).getParentFile().mkdirs();
                        fileOutputStream = new FileOutputStream(new File(tempDir, nextEntry.getName()));
                        IOUtils.copy(zipInputStream, fileOutputStream);
                    } finally {
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                }

            }

            File assets = new File(tempDir, "assets");
            if (assets.exists()) {
                FileUtils.copyDirectory(assets, outDir);
            }
        } finally {
            if (zipInputStream != null) {
                zipInputStream.close();
            }
            tempDir.delete();
        }
    }

    public static void unzipApkLib(File apkFile, File outDir, File tempDir, boolean deleteOld, boolean tryLoad) throws IOException {
        if (deleteOld) {
            outDir.delete();
            outDir.mkdirs();
        }
        //创建文件夹
        tempDir.mkdirs();
        //解压lib
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(apkFile));
            for (; ; ) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (nextEntry.isDirectory()) {
                    new File(tempDir, nextEntry.getName()).mkdirs();
                    continue;
                }
                if (nextEntry.getName().startsWith("lib")) {
                    FileOutputStream fileOutputStream = null;
                    try {
                        File outputFile = new File(tempDir, nextEntry.getName());
                        File parentFile = outputFile.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        if (outputFile.exists()) {
                            outputFile.delete();
                        }
                        fileOutputStream = new FileOutputStream(outputFile);
                        IOUtils.copy(zipInputStream, fileOutputStream);
                    } catch (Exception e) {
                    } finally {
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }

                    }

                }

            }
            copySupportedLib(new File(tempDir, "lib"), outDir, tryLoad);
        } finally {
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        }
    }

    public static void copySupportedLib(File libDir, File toDir, boolean tryLoad) throws IOException {
        //扫描支持的so
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            for (String supportedAbi : Build.SUPPORTED_ABIS) {
                File tLibDir = new File(libDir, supportedAbi);
                copyLib(tLibDir, toDir, tryLoad);
            }
        } else {
            copyLib(new File(libDir, Build.CPU_ABI), toDir, tryLoad);
            copyLib(new File(libDir, Build.CPU_ABI2), toDir, tryLoad);
        }
    }

    private static void copyLib(File libDir, File outDir, boolean tryLoad) throws IOException {
        File[] files = libDir.listFiles();
        if (files != null) {
            for (File file : files) {
                File outFile = new File(outDir, file.getName());
                if (outFile.exists()) {
                    continue;
                }
                FileUtil.cpyStream(new FileInputStream(file), new FileOutputStream(outFile));
                outFile.setWritable(true);
                outFile.setExecutable(true);
                outFile.setReadable(true);
                if (tryLoad) {
                    try {
                        System.load(outFile.getPath());
                    } catch (Throwable ignore) {
                    }
                }
            }
        }
    }

    public static void scanClassPath(ScanCallback scanCallback) {
        String classPath = System.getProperty("java.class.path");
        String[] paths = classPath.split(":");
        for (String path : paths) {
            if (path.endsWith(".apk") || path.endsWith(".zip") || path.endsWith(".jsd")
                    || path.endsWith(".jar")) {
                scanCallback.onFile(path);
            }
        }
    }

    public interface ScanCallback {
        void onFile(String file);
    }

}
