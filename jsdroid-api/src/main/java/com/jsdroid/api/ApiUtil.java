package com.jsdroid.api;

import com.jsdroid.api.annotations.FieldName;
import com.jsdroid.api.annotations.MethodDoc;
import com.jsdroid.api.entity.GlobalField;
import com.jsdroid.api.entity.GlobalMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiUtil {
    public static GlobalMethod[] getMethods(Class aClass) {
        Method[] methods = aClass.getMethods();
        List<GlobalMethod> result = new ArrayList<>();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getDeclaringClass().equals(Object.class)) {
                continue;
            }
            GlobalMethod m = new GlobalMethod();
            MethodDoc doc = methods[i].getAnnotation(MethodDoc.class);
            if (doc != null) {
                m.methodDoc = doc.value();
                m.methodClassify = doc.classify();
            }
            m.methodName = methods[i].getName();
            Class<?>[] parameterTypes = methods[i].getParameterTypes();
            if (parameterTypes != null) {
                m.paramTypes = new String[parameterTypes.length];
                for (int j = 0; j < parameterTypes.length; j++) {
                    m.paramTypes[j] = parameterTypes[j].getCanonicalName();
                }
            }
            Annotation[][] parameterAnnotations = methods[i].getParameterAnnotations();
            if (parameterAnnotations != null) {
                m.paramNames = new String[parameterAnnotations.length];
                for (int j = 0; j < parameterAnnotations.length; j++) {
                    m.paramNames[j] = "arg" + j;
                    Annotation[] parameterAnnotation = parameterAnnotations[j];

                    if (parameterAnnotation != null) {
                        if (parameterAnnotation.length > 0) {
                            if (parameterAnnotation[0].annotationType().getName().equals(FieldName.class.getName())) {
                                FieldName annotation = (FieldName) parameterAnnotation[0];
                                m.paramNames[j] = annotation.value();
                            }
                        }
                    }
                }
            }

            m.returnType = methods[i].getReturnType().getCanonicalName();
            result.add(m);
        }

        return result.toArray(new GlobalMethod[0]);
    }

    public static GlobalField[] getFields(Class aClass) {
        Field[] fields = aClass.getFields();
        List<GlobalField> result = new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getDeclaringClass().equals(Object.class)) {
                continue;
            }
            GlobalField f = new GlobalField();
            f.type = fields[i].getType().getCanonicalName();
            f.fieldName = fields[i].getName();
            result.add(f);

        }
        return result.toArray(new GlobalField[0]);
    }

    public static void main(String[] args) {
        System.out.println(String[].class.getCanonicalName());

    }
}
