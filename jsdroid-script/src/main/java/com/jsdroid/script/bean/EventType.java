package com.jsdroid.script.bean;

public enum  EventType {
    TYPE_RUN, // 运行脚本
    TYPE_RUN_RESULT, // 运行结果
    TYPE_STOP_SCRIPT,  // 停止
    TYPE_CAPTURE, // 截图
    TYPE_TOAST, // 消息
    TYPE_LOG,   // 输出
    TYPE_EXIT, // 退出
    TYPE_VOLUME_UP, // 音量-键按下
    TYPE_VOLUME_DOWN, // 音量+键按下
}
