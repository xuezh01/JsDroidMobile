package com.jsdroid.jsdroid_letter_list;

import java.util.Random;

public class LetterModel {

    //名字
    public String name;
    //简拼
    public String simpleSpell;
    //全拼
    public String wholeSpell;

    //首字母
    public String firstLetter;

    public LetterModel(String name) {
        this.name = name;
        parseSimpleSell();
        parseWholeSpell();
        parseFirstLetter();

    }

    private void parseSimpleSell() {
        char[] chars = name.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            String c = String.valueOf(chars[i]);
            String s = CharacterParser.getInstance().getSelling(c);
            result.append(s.charAt(0));
        }
        simpleSpell = result.toString();
    }

    private void parseWholeSpell() {
        wholeSpell = CharacterParser.getInstance().getSelling(name);

    }

    private void parseFirstLetter() {
        char c = wholeSpell.charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            firstLetter = String.valueOf(wholeSpell.charAt(0)).toUpperCase();
        } else {
            firstLetter = "#";
        }
    }

    @Override
    public String toString() {
        return "LetterModel{" +
                "name='" + name + '\'' +
                ", simpleSpell='" + simpleSpell + '\'' +
                ", wholeSpell='" + wholeSpell + '\'' +
                ", firstLetter='" + firstLetter + '\'' +
                '}';
    }

}
