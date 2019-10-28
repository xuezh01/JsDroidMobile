package com.jsdroid.active.step;

import com.jsdroid.active.JsdShell;

/**
 * 安装shell
 * 等待wifi模式
 * 启动10666端口
 * 启动server
 */
public interface Step {
    void init(JsdShell jsdShell);
    boolean skip();
    void run();
}
