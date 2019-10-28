package com.jsdroid.groovy.tip;

import android.util.Log;

import com.jsdroid.editor.R;
import com.jsdroid.editor.tip.Tip;
import com.jsdroid.editor.widget.CodeEditText;
import com.jsdroid.groovy.info.FieldInfo;
import com.jsdroid.groovy.info.ParameterInfo;
import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.MethodInfo;
import com.jsdroid.groovy.info.VariableInfo;
import com.jsdroid.groovy.node.RootNode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TipModel implements Tip {
    @Override
    public String getShow() {
        return showText;
    }

    @Override
    public String getDesc() {
        return descText;
    }

    @Override
    public String getReplace() {
        return replaceText;
    }

    public enum Type {
        CLASS_TIP,//root、block、implements、extends、{}、()、[]、<>、@、new、
        METHOD_TIP,
        FIELD_TIP,
        LOCAL_VARIABLE_TIP,
        KEYWORD_TIP,
        TEMPLATE_TIP
    }

    public String showText;
    public String descText;
    public String replaceText;
    public int a = -1;//作用域开头
    public int b = -1;//作用域结尾

    public static class ClassTipModel extends TipModel {
        public ClassInfo classInfo;

        @Override
        public int getIcon() {
            return R.drawable.icon_groovy_class;
        }

        public ClassTipModel(ClassInfo classInfo) {
            this.classInfo = classInfo;
            String pkg = classInfo.pkg == null ? "default" : classInfo.pkg;
            descText = "(" + pkg + ")";
            showText = classInfo.simpleName;
            replaceText = classInfo.simpleName;
        }

        @Override
        public boolean compare(String inputText) {
            if (showText == null) {
                return false;
            }
            String[] split = showText.split("\\.");
            String s = split[split.length - 1];
            if (s.startsWith(inputText)) {
                return true;
            }
            return false;
        }

        String getPkg(CharSequence code) {
            Pattern compile = Pattern.compile("package (.*)[\n;]");
            Matcher matcher = compile.matcher(code);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return "";
        }

        int getPkgEnd(CharSequence code) {
            Pattern compile = Pattern.compile("package .*[\n;]");
            Matcher matcher = compile.matcher(code);
            if (matcher.find()) {
                return matcher.end();
            }
            return 0;
        }

        int getImportEnd(CharSequence code) {
            Pattern compile = Pattern.compile("import .*[\n;]");
            Matcher matcher = compile.matcher(code);
            int pos = 0;
            while (matcher.find()) {
                pos = matcher.end();
            }
            return pos;
        }

        @Override
        public void replace(CodeEditText codeEditText) {
            super.replace(codeEditText);
            String pkg = getPkg(codeEditText.getText());

            if ((pkg.equals(classInfo.pkg)) || classInfo.pkg == null) {
                return;
            }
            String importText = "import " + classInfo.getName() + "\n";
            if (!codeEditText.getText().toString().contains(importText)) {
                int pkgEnd = getPkgEnd(codeEditText.getText());
                int importEnd = getImportEnd(codeEditText.getText());
                codeEditText.getText().insert(Math.max(pkgEnd, importEnd), importText);
            }
        }
    }

    public static class VariableTipModel extends TipModel {

        public VariableTipModel(VariableInfo variable) {
            showText = variable.name;
            replaceText = variable.name;
            descText = variable.type.getSimpleName();
        }

        @Override
        public int getIcon() {
            return R.drawable.icon_groovy_variable;
        }
    }

    public static class MethodTipModel extends TipModel {
        public MethodTipModel(Method method) {
            replaceText = method.getName() + "()";
            descText = method.getReturnType().getSimpleName();
            showText = getMethodShowText(method);
        }

        @Override
        public int getIcon() {
            return R.drawable.icon_groovy_method;
        }

        public MethodTipModel(MethodInfo methodInfo) {
            replaceText = methodInfo.methodName + "()";
            descText = methodInfo.returnType.getSimpleName();
            showText = getMethodShowText(methodInfo);
        }

        @Override
        public void replace(CodeEditText codeEditText) {
            super.replace(codeEditText);
            if (!showText.endsWith("()")) {
                codeEditText.setSelection(codeEditText.getSelectionStart() - 1);
            }
        }

        private String getMethodShowText(Method method) {
            StringBuilder result = new StringBuilder();
            String name = method.getName();
            result.append(name);
            result.append("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes != null) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    result.append(parameterTypes[i].getSimpleName());
                    result.append(" arg" + i);
                    if (i != parameterTypes.length - 1) {
                        result.append(",");
                    }
                }
            }
            result.append(")");
            return result.toString();
        }

        private String getMethodShowText(MethodInfo method) {
            StringBuilder result = new StringBuilder();
            String name = method.methodName;
            result.append(name);
            result.append("(");
            List<ParameterInfo> parameterTypes = method.parameters;
            if (parameterTypes != null) {
                for (int i = 0; i < parameterTypes.size(); i++) {
                    result.append(parameterTypes.get(i).parameterType.getSimpleName());
                    result.append(" ");
                    result.append(parameterTypes.get(i).parameterName);
                    if (i != parameterTypes.size() - 1) {
                        result.append(",");
                    }
                }
            }
            result.append(")");
            return result.toString();
        }


    }

    public static class FieldTipModel extends TipModel {
        @Override
        public int getIcon() {
            return R.drawable.icon_groovy_field;
        }

        public FieldTipModel(Field field) {
            showText = field.getName();
            descText = field.getType().getSimpleName();
            replaceText = showText;
        }

        public FieldTipModel(FieldInfo fieldInfo) {
            descText = fieldInfo.getFieldType().getSimpleName();
            showText = fieldInfo.getFieldName();
            replaceText = showText;
        }
    }
}
