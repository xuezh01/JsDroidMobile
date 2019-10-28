# 安装

- 电脑启动
    1.发送app到/data/local/tmp/app
    2.发送shell.apk到/data/local/tmp/shell.apk
    3.修改app权限：chmod 777 /data/local/tmp/app
    4.运行：/data/local/tmp/app /data/local/tmp/shell.apk com.jsdroid.shell.Shell

    5.运行服务：

- 手机启动
    1.释放文件app和shell.apk
    2.复制app到/data/local/tmp/app
    3.复制shell.apk到/data/local/tmp/shell.apk
    4.修改app权限：chmod 777 /data/local/tmp/app
    5.运行: /data/local/tmp/app /data/local/tmp/shell.apk com.jsdroid.shell.Shell

## 运行

- 运行shell

```
su 
/data/local/tmp/app /data/local/tmp/shell.apk com.jsdroid.shell.Shell &
```

- shell循环运行服务

```
su 
/data/local/tmp/app /data/local/tmp/shell.apk com.jsdroid.server.Main
```

