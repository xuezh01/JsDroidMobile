package com.jsdroid.ipc.call;

import java.lang.reflect.Method;

public class ReflectHelper {
    public static Class getTyp(String type) throws ClassNotFoundException {
        if (type.length() > 7) {
            return Class.forName(type);
        }
        if ("int".equals(type)) {
            return int.class;
        } else if ("String".equals(type)) {
            return String.class;
        } else if ("long".equals(type)) {
            return long.class;
        } else if ("double".equals(type)) {
            return double.class;
        } else if ("float".equals(type)) {
            return float.class;
        } else if ("byte".equals(type)) {
            return byte.class;
        } else if ("short".equals(type)) {
            return short.class;
        } else if ("char".equals(type)) {
            return char.class;
        } else if ("boolean".equals(type)) {
            return boolean.class;
        }
        try {
            return ReflectHelper.class.getClassLoader().loadClass(type);
        } catch (ClassNotFoundException e) {
            return Class.forName(type);
        }
    }

    public static Class[] getTypes(String[] paramTypes) throws ClassNotFoundException {
        Class params[] = new Class[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
            params[i] = getTyp(paramTypes[i]);
        }
        return params;
    }

    public static Method getDeclaredMethod(Class clazz, String methodName) {
        try {
            return clazz.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
        }
        return getDeclaredMethod(clazz.getSuperclass(), methodName);
    }

    public static Method getDeclaredMethod(Class clazz, String methodName, Class types[]) {
        try {
            return clazz.getDeclaredMethod(methodName, types);
        } catch (NoSuchMethodException e) {
        }
        return getDeclaredMethod(clazz.getSuperclass(), methodName, types);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("boolean");
        ClassLoader.getSystemClassLoader().loadClass("boolean");
    }
}
