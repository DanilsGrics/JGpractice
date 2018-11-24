package lv.danilsgrics.eighthLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    Map<String, String> strings = new HashMap<>();

    public void addWord(String key, String string) {

        if (!string.isEmpty()) {

            strings.put(key, string);
        }
    }

    public ArrayList getMostPopularEntry() {

        ArrayList mostFrequent = new ArrayList();

        int counter = 0;
        for (String key : strings.keySet()) {
            if (Collections.frequency(strings.values(), strings.get(key)) > counter) {
                counter = Collections.frequency(strings.values(), strings.get(key));
            }
        }

        for (String key : strings.keySet()) {
            if (Collections.frequency(strings.values(), strings.get(key)) == counter) {
                if (!mostFrequent.contains(strings.get(key))) mostFrequent.add(strings.get(key));
            }
        }

        System.out.println("The most popular are: " + mostFrequent);

        return mostFrequent;
    }

    public void printToConsole() {
        System.out.println(strings);
    }
}
