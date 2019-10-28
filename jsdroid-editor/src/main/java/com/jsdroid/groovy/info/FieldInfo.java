package com.jsdroid.groovy.info;

import java.io.Serializable;
import java.lang.reflect.Field;

public class FieldInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    public boolean STATIC;
    //类型
    private ClassInfo fieldType;
    //名字
    private String fieldName;
    private Field field;

    public FieldInfo() {

    }

    public FieldInfo(Field field) {
        this.field = field;
        fieldType = new ClassInfo(field.getType());
        fieldName = field.getName();
    }

    public void setFieldType(ClassInfo fieldType) {
        this.fieldType = fieldType;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public ClassInfo getFieldType() {
        return fieldType;
    }

    public Field getField() {
        return field;
    }

    public String getFieldName() {
        return fieldName;
    }
    @Override
    public String toString() {
        return STATIC + " " + fieldType + " " + fieldName;
    }
}
