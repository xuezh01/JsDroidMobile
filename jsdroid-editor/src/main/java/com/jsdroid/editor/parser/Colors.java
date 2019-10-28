package com.jsdroid.editor.parser;

import android.content.Context;

import com.jsdroid.editor.R;

public class Colors {
    //变量颜色
    static public int variable;
    //修饰符颜色
    static public int modifier;
    //关键字颜色
    static public int keyword;
    //数字颜色
    static public int number;
    //字符串颜色
    static public int string;
    //符号颜色
    static public int symbol;
    //方法名颜色
    static public int method;
    //注释颜色
    static public int comment;
    static public int editBackgroundColor = 0xff222225;
    public static int white = 0xffffffff;
    public static int defaultTextColor = 0xffffffff;
    public static int lineNumberColor = 0x99ffffff;
    public static int selectLineStrokeColor = 0x99ffffff;
    public static int lineNumberSplitColor = 0x99ffffff;
    public static int cursorColor = 0xffffffff;
    public static int selectBackgroundColor = 0x33ffffff;
    public static int lineNumberSplitWidth = 1;
    public static int fileViewBackgroundColor = 0xff222225;
    public static int captureTitleBarColor = 0xff222225;
    public static int tabDefaultColor = 0xff333335;
    public static int tabSelectColor = 0xff222225;
    public static int tabDefaultTextColor = 0xffffffff;
    public static int tabSelectTextColor = 0xffffffff;

    public static void init(Context context) {
        variable = context.getResources().getColor(R.color.code_variable);
        modifier = context.getResources().getColor(R.color.code_modifier);
        keyword = context.getResources().getColor(R.color.code_keyword);
        number = context.getResources().getColor(R.color.code_number);
        string = context.getResources().getColor(R.color.code_string);
        symbol = context.getResources().getColor(R.color.code_symbol);
        method = context.getResources().getColor(R.color.code_method);
        comment = context.getResources().getColor(R.color.code_comment);
    }

}
