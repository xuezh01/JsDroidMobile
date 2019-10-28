package com.jsdroid.fileview;

public class FileModel {
    public String file;
    public static void main(String args[]){
        boolean hello = "合法.txt".matches("[^\\s\\\\/:\\*\\?\\\"<>\\|](\\x20|[^\\s\\\\/:\\*\\?\\\"<>\\|])*[^\\s\\\\/:\\*\\?\\\"<>\\|\\.]$");
        System.out.println("合法："+hello);
    }
}
