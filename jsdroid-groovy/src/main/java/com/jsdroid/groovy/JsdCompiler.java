package com.jsdroid.groovy;

import org.apache.commons.io.IOUtils;
import org.codehaus.groovy.control.CompilerConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class JsdCompiler {
    public static void compile(String sourceDir, String scriptBaseClass, String dexOutputFile) throws IOException {
        compile(null, sourceDir, scriptBaseClass, dexOutputFile);
    }

    public static void compile(ClassLoader classLoader, String sourceDir, String scriptBaseClass, String dexOutputFile) throws IOException {
        compile(classLoader, new String[]{sourceDir}, new String[]{scriptBaseClass}, dexOutputFile);
    }

    public static void compile(String[] sourceDirs, String[] scriptBaseClass, String dexOutputFile) throws IOException {
        compile(null, sourceDirs, scriptBaseClass, dexOutputFile);
    }

    public static void compile(ClassLoader classLoader, String[] sourceDirs, String[] scriptBaseClass, String dexOutputFile) throws IOException {
        CompilerConfiguration configuration = new CompilerConfiguration();
        if (classLoader == null) {
            classLoader = JsdCompiler.class.getClassLoader();
        }
        JsdDexProcessor dexProcessor = new JsdDexProcessor(classLoader);
        configuration.setBytecodePostprocessor(dexProcessor);
        JsdClassLoader jsdClassLoader = new JsdClassLoader(classLoader, configuration);
        for (int i = 0; i < sourceDirs.length; i++) {
            jsdClassLoader.setSourceDirs(new String[]{sourceDirs[i]});
            configuration.setScriptBaseClass(scriptBaseClass[i]);
            jsdClassLoader.parseClass("");
        }
        dexProcessor.writeDexToFile(new FileOutputStream(dexOutputFile));
    }

    public static void packJsd(File projectDir, File dexFile, String outName) throws Exception {
        File outDir = new File(projectDir, "out");
        outDir.mkdir();
        File jsdFile = new File(outDir, outName);
        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(jsdFile));
            File resDir = new File(projectDir, "res");
            zipNotCreateDir(resDir, new File("assets"), zipOutputStream);
            File config = new File(projectDir, "config.json");
            if (config.exists()) {
                zipOutputStream.putNextEntry(new ZipEntry("config.json"));
                IOUtils.copy(new FileInputStream(config), zipOutputStream);
            }
            File icon = new File(projectDir, "icon.png");
            if (icon.exists()) {
                zipOutputStream.putNextEntry(new ZipEntry("icon.png"));
                IOUtils.copy(new FileInputStream(icon), zipOutputStream);
            }
            if (dexFile.exists()) {
                zipOutputStream.putNextEntry(new ZipEntry("classes.dex"));
                IOUtils.copy(new FileInputStream(dexFile), zipOutputStream);
            }

//            File lib = new File(projectDir, "lib");
//            if (lib.exists()) {
//                zipNotCreateDir(lib, new File("lib"), zipOutputStream, new DefaultZipFilter() {
//                    @Override
//                    public boolean zip(String filename) {
//                        return filename.endsWith(".so");
//                    }
//                });
//            }
        } finally {
            zipOutputStream.close();
        }
    }

    public static void zipNotCreateDir(File fileOrDir, File startName, ZipOutputStream zipOutputStream) throws Exception {
        zipNotCreateDir(fileOrDir, startName, zipOutputStream, null);
    }

    public static void zipNotCreateDir(File fileOrDir, File startName, ZipOutputStream zipOutputStream, ZipFilter zipFilter) throws Exception {
        if (fileOrDir.isFile()) {
            zip(fileOrDir, startName, zipOutputStream, zipFilter);
        } else {
            File[] files = fileOrDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    zip(file, startName, zipOutputStream, zipFilter);
                }
            }
        }
    }

    public static void zip(File fileOrDir, ZipOutputStream zipOutputStream) throws Exception {
        zip(fileOrDir, new File(""), zipOutputStream, null);
    }

    public static void zip(File fileOrDir, File startName, ZipOutputStream zipOutputStream) throws Exception {
        zip(fileOrDir, startName, zipOutputStream, null);
    }


    public static void zip(File fileOrDir, File startName, ZipOutputStream zipOutputStream, ZipFilter zipFilter) throws Exception {

        if (fileOrDir.isFile()) {
            if (zipFilter != null) {
                if (zipFilter.unzip(fileOrDir.getPath())) {
                    return;
                }
                if (!zipFilter.zip(fileOrDir.getPath())) {
                    return;
                }
            }
            ZipEntry entry = new ZipEntry(new File(startName, fileOrDir.getName()).getPath());
            zipOutputStream.putNextEntry(entry);
            FileInputStream fileInputStream = new FileInputStream(fileOrDir);
            try {
                IOUtils.copy(fileInputStream, zipOutputStream);
            } finally {
                fileInputStream.close();
            }
        } else {
            File[] files = fileOrDir.listFiles();
            if (files != null) {
                File s = new File(startName, fileOrDir.getName());
                for (File child : files) {
                    zip(child, s, zipOutputStream, zipFilter);
                }

            }
        }
    }

    public interface ZipFilter {
        boolean unzip(String path);

        boolean zip(String path);
    }

    public static class DefaultZipFilter implements ZipFilter {
        @Override
        public boolean unzip(String path) {
            return false;
        }

        @Override
        public boolean zip(String path) {
            return true;
        }
    }


}
