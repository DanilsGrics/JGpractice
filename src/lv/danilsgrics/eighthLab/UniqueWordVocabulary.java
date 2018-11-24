package lv.danilsgrics.eighthLab;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    Set<String> strings = new HashSet<>();

    public void addWord(String string) {

        if (!string.isEmpty()) {

            strings.add(string);
        }
    }

    public int getUniqueWords() {

        return strings.size();
    }

    public void printToConsole() {
        System.out.println(strings);
    }
}
