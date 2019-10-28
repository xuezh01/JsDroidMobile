package com.jsdroid.groovy.info;

//import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;

import com.jsdroid.groovy.node.ClassInfoMap;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    public static ClassInfo OBJECT = new ClassInfo(Object.class);
    /**
     * 例如：java.lang.Thread的pkg为java.lang
     */
    public String pkg;
    /**
     * 例如：java.lang.Thread的simpleName为Thread
     */
    public String simpleName;
    public List<MethodInfo> methods;
    public List<FieldInfo> fields;
    public ClassInfo extendsClass;
    public List<ClassInfo> implementsClasses;
    public Class innerClass;

    public List<FieldInfo> getFields() {
        if (isInnerClass()) {
            List<FieldInfo> fieldInfos = new ArrayList<>();
            Field[] fields = innerClass.getFields();
            for (Field field : fields) {
                fieldInfos.add(new FieldInfo(field));
            }
            return fieldInfos;
        }
        return fields;
    }

    public ClassInfo() {
    }

    public ClassInfo(Class clazz) {
        innerClass = clazz;
        Package aPackage = clazz.getPackage();
        if (aPackage != null) {
            pkg = aPackage.getName();
        }
        simpleName = clazz.getSimpleName();

    }

    public String getName() {
        if (pkg == null || pkg.equals("")) {
            return simpleName;
        }
        return pkg + "." + simpleName;
    }

    public String getSimpleName() {
        if (innerClass != null) {
            return innerClass.getSimpleName();
        }
        return simpleName;
    }

    public Class getInnerClass() {
        return innerClass;
    }

    public boolean isInnerClass() {
        return innerClass != null;
    }

    public List<MethodInfo> getMethods() {
        if (isInnerClass()) {
            List<MethodInfo> methodInfos = new ArrayList<>();
            Method[] methods = innerClass.getMethods();
            for (Method method : methods) {
                methodInfos.add(new MethodInfo(method));
            }
            return methodInfos;
        }
        return methods;
    }

    public static ClassInfo forName(String name) {
        ClassInfo classInfo = ClassInfoMap.getInstance().searchClassInfo(name);
        if (classInfo == null) {
            try {
                if (context != null) {

                    Class<?> aClass = context.getClassLoader().loadClass(name);
                    classInfo = new ClassInfo(aClass);
                } else {
                    Class<?> aClass = ClassInfo.class.getClassLoader().loadClass(name);
                    classInfo = new ClassInfo(aClass);
                }
            } catch (Throwable e) {
            }
        }
        return classInfo;
    }

    private static Context context;

    public static void setContext(Context context) {
        ClassInfo.context = context;
    }


    public ClassInfo searchMethodType(String methodName) {
        List<MethodInfo> methods = getMethods();
        for (MethodInfo method : methods) {
            if (method.methodName.equals(methodName)) {
                return method.returnType;
            }
        }
        return null;
    }

    public ClassInfo searchFieldType(String fieldName) {
        List<FieldInfo> fields = getFields();

        for (FieldInfo field : fields) {
            if (field.getFieldName().equals(fieldName)) {
                return field.getFieldType();
            }
        }
        return null;
    }
}
