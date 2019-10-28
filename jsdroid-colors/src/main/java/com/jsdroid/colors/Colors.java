package com.jsdroid.colors;

import android.graphics.Bitmap;
import android.graphics.Point;

import com.googlecode.leptonica.android.Pix;
import com.googlecode.leptonica.android.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class Colors {
    static {
        try {
            System.loadLibrary("colors");
        } catch (Exception e) {
        }
    }
    public static void loadLibrary(){
        try {
            System.loadLibrary("colors");
        } catch (Exception e) {
        }
    }

    //扫描颜色
    static native void native_scan_color(Bitmap bitmap, int color, int offset);

    //找图
    static native int[] native_find_pic(Bitmap big, Bitmap small, int offset, float sim);

    //返回多个找图结果
    static native int[] native_find_all_pic(Bitmap big, Bitmap small, int offset, float sim);

    //多点找色[x,y,color,x,y,color...]
    static native int[] native_find_multi_color(Bitmap bitmap, int[] color, int offset, float sim);

    //多点找色[color,x,y,color,x,y]
    static native int[] native_find_all_multi_color(Bitmap bitmap, int[] color, int offset, float sim);

    /**
     * 找图
     *
     * @param big    大图
     * @param small  小图
     * @param offset 色差
     * @param sim    相似度
     * @return
     */
    public static Point findPic(Bitmap big, Bitmap small, int offset, float sim) {
        int[] ints = native_find_pic(big, small, offset, sim);
        if (ints[0] == -1 || ints[1] == -1) {
            return null;
        }
        return new Point(ints[0], ints[1]);
    }

    /**
     * 找图返回多个结果
     *
     * @param big    大图
     * @param small  小图
     * @param offset 色差
     * @param sim    相似度
     * @return
     */
    public static List<Point> findPics(Bitmap big, Bitmap small, int offset, float sim) {
        int[] ints = native_find_all_pic(big, small, offset, sim);
        List<Point> ret = new ArrayList<>();
        for (int i = 0; i < ints.length; i += 2) {
            if (ints[i] == -1 || ints[i + 1] == -1) {
                continue;
            }
            ret.add(new Point(ints[i], ints[i + 1]));
        }
        return ret;
    }

    /**
     * 多点找色
     *
     * @param bitmap 图片
     * @param colors 颜色 argb|x|y|argb|x|y
     * @param offset 色差
     * @param sim    相似度
     * @return
     */
    public static Point findMultiColor(Bitmap bitmap, String colors, int offset, float sim) {
        String[] split = colors.split("\\|");
        if (split.length % 3 != 0) {
            return null;
        }
        int[] color = new int[split.length];
        try {
            for (int i = 0; i < split.length; i += 3) {
                color[i] = Integer.parseInt(split[i], 16);
                color[i + 1] = Integer.parseInt(split[i + 1]);
                color[i + 2] = Integer.parseInt(split[i + 2]);
            }
        } catch (NumberFormatException e) {
            return null;
        }
        int[] ints = native_find_multi_color(bitmap, color, offset, sim);
        if (ints[0] == -1 || ints[1] == -1) {
            return null;
        }
        return new Point(ints[0], ints[1]);
    }

    /**
     * 提取图片指定颜色，支持色差，用于文字识别，或者用于二维码识别
     *
     * @param bitmap
     * @param color
     * @param offset
     * @return
     */
    public static void scanColor(Bitmap bitmap, int color, int offset) {
        native_scan_color(bitmap, color, offset);
    }

    public static Pix getPix(Bitmap bitmap) {
        Pix pix = ReadFile.readBitmap(bitmap);
        return pix;
    }

//    public static class ColorMap {
//        int[][] colors;
//        public int width;
//        public int height;
//
//        private ColorMap(Bitmap bitmap) {
//            width = bitmap.getWidth();
//            height = bitmap.getHeight();
//            for (int i = 0; i < height; i++) {
//                int[] pixels = new int[width];
//                colors[i] = pixels;
//                bitmap.getPixels(pixels, 0, width, 0, i, width, 1);
//            }
//        }
//
//        public int getColor(int x, int y) {
//            return colors[y][x];
//        }
//
//    }
//
//    public static ColorMap getColorMap(Bitmap bitmap) {
//        return new ColorMap(bitmap);
//    }
}
