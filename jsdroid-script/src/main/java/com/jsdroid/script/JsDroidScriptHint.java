package com.jsdroid.script;

import com.alibaba.fastjson.JSON;
import com.jsdroid.api.ApiUtil;
import com.jsdroid.api.entity.GlobalField;
import com.jsdroid.api.entity.GlobalMethod;
import com.jsdroid.commons.FileUtil;

import java.util.Arrays;
import java.util.Comparator;

public class JsDroidScriptHint {
    public static void main(String[] args) {
        GlobalField[] fields = ApiUtil.getFields(JsDroidScript.class);
        GlobalMethod[] methods = ApiUtil.getMethods(JsDroidScript.class);
        FileUtil.write("hint/script-fields.json", JSON.toJSONString(fields));
        FileUtil.write("hint/script-methods.json", JSON.toJSONString(methods));
        Arrays.sort(methods, new Comparator<GlobalMethod>() {
            @Override
            public int compare(GlobalMethod o1, GlobalMethod o2) {
                return o1.methodName.compareTo(o2.methodName);
            }
        });
        StringBuilder m = new StringBuilder();
        for (int i = 0; i < methods.length; i++) {
            GlobalMethod method = methods[i];
            if (method.methodDoc == null) {
                continue;
            }
            m.append(String.format("## %s\n", method.methodDoc.trim()));
            m.append("> " + method.methodName + "(");
            if (method.paramNames != null && method.paramNames.length > 0) {
                String param = "";
                for (int j = 0; j < method.paramNames.length; j++) {
                    String fieldName = method.paramNames[j];
                    String filedType = method.paramTypes[j];
                    param += (String.format(",%s %s", filedType, fieldName));
                }
                if (param.length() > 0) {
                    param = param.substring(1);
                }
                m.append(param);
            }
            m.append(")\n\n");


            if (method.paramNames != null && method.paramNames.length > 0) {
                m.append("\n|参数名|参数类型|\n" +
                        "|:---|:---|\n");
                for (int j = 0; j < method.paramNames.length; j++) {
                    String fieldName = method.paramNames[j];
                    String filedType = method.paramTypes[j];
                    m.append(String.format("|%s|%s|\n", fieldName, filedType));
                }

            }
            if (method.returnType != null) {
                m.append(String.format("\n|返回类型|\n" +
                        "|:---|\n" +
                        "|%s|", method.returnType));
            }
            m.append("\n");
            m.append("\n");

        }
        FileUtil.write("hint/script-methods.md", m.toString());
    }
}
