package com.jsdroid.groovy.info;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class MethodInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    public String methodName;
    public ClassInfo returnType;
    public List<ParameterInfo> parameters;
    public Method method;

    public MethodInfo() {

    }

    public boolean isInnerMethod() {
        return method != null;
    }

    public MethodInfo(Method method) {
        this.method = method;
        methodName = method.getName();
        returnType = new ClassInfo(method.getReturnType());
        parameters = new ArrayList<>();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null) {
            int i = 0;
            for (Class<?> parameterType : parameterTypes) {
                ParameterInfo parameterInfo = new ParameterInfo();
                parameterInfo.parameterName = "arg" + i++;
                parameterInfo.parameterType = new ClassInfo(parameterType);
                parameters.add(parameterInfo);
            }
        }
    }

    @Override
    public String toString() {
        return returnType + " " + methodName + "(" + getParametersString() + ")" + "{}";
    }

    String getParametersString() {
        if (parameters != null) {
            return parameters.toString().replace("[", "").replace("]", "");
        }
        return "";
    }
}
