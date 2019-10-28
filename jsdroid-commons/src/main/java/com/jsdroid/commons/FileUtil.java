package com.jsdroid.commons;

import android.os.Environment;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class FileUtil {
    public static boolean canWriteLocal() {
        return canWrite("/data/local/testLocal.txt");
    }

    public static boolean canWriteLocalTmp() {
        return canWrite("/data/local/tmp/testLocal.txt");
    }

    public static boolean canWriteSdcard() {
        return canWrite("/sdcard/testLocal.txt");
    }

    public static boolean canWrite(String filename) {
        try {
            FileUtil.write(filename, "ok");
            String ret = FileUtil.read(filename);
            new File(filename).delete();
            if (ret != null && ret.contains("ok")) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static byte[] readBytes(String filename) {
        File file = new File(filename);
        return readBytes(file);
    }

    public static void writeBytes(String filename, byte[] data) {
        File file = new File(filename);
        writeBytes(file, data);
    }

    public static void writeBytes(File file, byte[] data) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            out.write(data);
        } catch (Exception e) {
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    public static byte[] readBytes(File file) {
        if (!file.exists()) {
            return null;
        }
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            out = new ByteArrayOutputStream();
            in = new FileInputStream(file);
            cpyStream(in, out);
        } catch (Exception e) {
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return out.toByteArray();

    }

    public static byte[] readBytes(InputStream in) {
        ByteArrayOutputStream out = null;
        try {
            out = new ByteArrayOutputStream();
            cpyStream(in, out);
        } catch (Exception e) {
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return out.toByteArray();

    }

    public static void append(String file, String content) {
        try {
            RandomAccessFile rf = new RandomAccessFile(file, "rw");
            rf.seek(rf.length());
            rf.write((content + "\r\n").getBytes("utf-8"));
            rf.close();
        } catch (Exception e) {
        }
    }

    public static void cpyStream(InputStream in, OutputStream out)
            throws IOException {
        try {
            byte buff[] = new byte[1024];
            int len;
            while ((len = in.read(buff)) != -1) {
                out.write(buff, 0, len);
            }
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }

    }

    public static void createDir(String filename) {
        File file = new File(filename).getAbsoluteFile();
        if (file.isDirectory()) {
            file.mkdirs();
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
    }

    public static String read(File file) {
        if (!file.exists()) {
            return null;
        }
        try {
            return read(new FileInputStream(file));
        } catch (Exception e) {
        }
        return null;
    }

    public static String read(InputStream in) {
        BufferedReader reader = null;
        StringBuffer result;
        try {
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
            String line = null;
            result = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
            return result.toString().trim();
        } catch (Exception e) {
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
            }
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return null;
    }

    public static String read(String filename) {
        return read(new File(filename));
    }

    public static void write(String filename, String content) {
        createDir(filename);
        write(new File(filename), content);

    }

    public static void write(File file, String content) {
        OutputStream out = null;
        try {
            out = new FileOutputStream(file);
            out.write(content.getBytes("utf-8"));
        } catch (Exception e) {
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }


    public interface FileSearch {
        boolean stop();

        ;

        boolean compare(File file);

        void onSearched(File file);
    }

    public static void searchFile(File file, FileSearch fileSearch) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            return;
        }
        if (fileSearch.stop()) {
            return;
        }
        if (fileSearch.compare(file)) {
            fileSearch.onSearched(file);
        }
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (int i = 0; i < files.length; i++) {
            searchFile(files[i], fileSearch);
        }
    }

    public static void searchSDCard(FileSearch fileSearch) {
        searchFile(Environment.getExternalStorageDirectory(), fileSearch);
    }

    public static void copyFile(File from, File to) {
        try {
            FileUtils.copyFile(from, to);
        } catch (IOException e) {
        }
    }

    public static File copyFileToSDCard(File file) throws Exception {
        File toFile = new File(getSDCardFile(), file.getName());
        FileUtil.copyFile(file, toFile);
        if (!toFile.exists()) {
            throw new Exception("复制文件失败:" + file + "->" + toFile);
        }
        return toFile;
    }


    public static File getSDCardFile() {
        if (new File("/sdcard/").exists()) {
            return new File("/sdcard/");
        }
        if (new File("/mnt/sdcard/").exists()) {
            return new File("/mnt/sdcard/");
        }
        return Environment.getExternalStorageDirectory();
    }
}
