package com.jsdroid.ui;

import com.alibaba.fastjson.JSON;
import com.jsdroid.api.ApiUtil;
import com.jsdroid.api.entity.GlobalField;
import com.jsdroid.api.entity.GlobalMethod;
import com.jsdroid.commons.FileUtil;

import groovy.lang.Script;

public abstract class ViewScriptHint extends Script {

    public static void main(String[] args) {
        GlobalMethod[] methods = ApiUtil.getMethods(ViewScript.class);
        FileUtil.write("hint/view-methods.json", JSON.toJSONString(methods));
        GlobalField[] fields = ApiUtil.getFields(ViewScript.class);
        FileUtil.write("hint/view-fields.json", JSON.toJSONString(fields));
    }
}
