# 版本更新说明

## 1.0

创建版本

## 1.1
修复了部分机型不能运行jsd文件的bug，如果脚本文件后缀为.jsd则会拷贝到.jsd.apk，然后运行



# 解决兼容性问题

## 如何启动shell?
//注意如果有app_process32就使用app_process32,因为只提供32位的so库
CLASSPATH=/data/local/tmp/shell.apk /system/bin/app_process[32] /system/bin com.jsdroid.server

## 如何加载so？
1.解压so到指定路径后，进行System.load("xxx.so)
2.指定dexclassloader的libsearch路径
**注意：so的加载，在多个classloader中，只能加载一次相同路径的so！**


## 如何将运行方式提取出来？

1.将启动方式做成groovy脚本，放服务器。
2.将启动用到的shell.apk放服务器。

## 电脑软件运行shell，启动服务
