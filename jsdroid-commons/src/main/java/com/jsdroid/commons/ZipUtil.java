package com.jsdroid.commons;

import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipUtil {

    public static byte[] gzip(byte[] data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream zip = new GZIPOutputStream(out);
        zip.write(data);
        zip.close();
        out.close();
        byte[] result = out.toByteArray();
        return result;
    }

    public static byte[] unGzip(byte[] data) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPInputStream ungzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = ungzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        in.close();
        ungzip.close();
        return out.toByteArray();
    }

    public static void unzipFile(String zipFile, String outDir) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(zipFile);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        for (; ; ) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            if (nextEntry.isDirectory()) {
                File file = new File(outDir, nextEntry.getName());
                file.mkdirs();
            } else {
                String name = nextEntry.getName();
                if (name.contains("/")) {
                    int i = name.lastIndexOf("/");
                    String dir = name.substring(0, i);
                    new File(outDir, dir).mkdirs();
                }
                File file = new File(outDir, nextEntry.getName());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                IOUtils.copy(zipInputStream, fileOutputStream);
                fileOutputStream.close();
            }
        }
        zipInputStream.close();
        fileInputStream.close();
    }

    public static boolean unzipFileToFile(String zipFile, String fileName, String outputFile) {
        FileInputStream fileInputStream = null;
        ZipInputStream zipInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(zipFile);
            zipInputStream = new ZipInputStream(fileInputStream);
            for (; ; ) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (name.equals(fileName)) {
                    fileOutputStream = new FileOutputStream(outputFile);
                    IOUtils.copy(zipInputStream, fileOutputStream);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                fileOutputStream.close();
            } catch (Exception e) {
            }
            try {
                zipInputStream.close();
            } catch (Exception e) {
            }
            try {
                fileInputStream.close();
            } catch (Exception e) {
            }
        }


    }


    public static void zipFile(java.io.File file, ZipOutputStream zipOutputStream) throws IOException {
        zipFile(file, zipOutputStream, "");
    }

    public static void zipFile(java.io.File file, ZipOutputStream zipOutputStream, String entryName) throws IOException {

        if (file.isFile()) {
            zipOutputStream.putNextEntry(new ZipEntry(entryName + "/" + file.getName()));
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                byte[] buff = new byte[1024];
                int len;
                while ((len = fileInputStream.read(buff)) != -1) {
                    zipOutputStream.write(buff, 0, len);
                }
            } finally {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        } else {
            java.io.File[] files = file.listFiles();
            if (files != null) {
                for (java.io.File child : files) {
                    if (child.isFile()) {
                        zipFile(child, zipOutputStream, entryName);
                    } else {
                        zipFile(child, zipOutputStream, entryName + "/" + child.getName());
                    }

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("temp.zip"));
        zipFile(new File("uses-lib"), zipOutputStream);
        zipOutputStream.close();
    }
}
