package com.jsdroid.jsdroid_letter_list;

import java.util.Comparator;

public class LetterComparator implements Comparator<LetterModel> {

    public int compare(LetterModel o1, LetterModel o2) {
        if (o1.firstLetter.equals("@") || o2.firstLetter.equals("#")) {
            return -1;
        } else if (o1.firstLetter.equals("#") || o2.firstLetter.equals("@")) {
            return 1;
        } else {
            return o1.wholeSpell.compareTo(o2.wholeSpell);
        }
    }

}
