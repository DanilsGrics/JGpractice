package lv.danilsgrics.eighthLab;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    private Map<String, Integer> strings = new HashMap<>();

    public void addWord(String string) {

        if (!string.isEmpty()) {

            if (!strings.containsKey(string)) strings.put(string, 1);
            else strings.put(string, (strings.get(string) + 1));
        }
    }

    public String getMostPopularEntries() {

        String mostFrequent = "";
        int highestFrequency = 0;

        for (String count : strings.keySet()) {

            if (strings.get(count) > highestFrequency) highestFrequency = strings.get(count);
        }

        for (String currentString : strings.keySet()) {

            if (strings.get(currentString) == highestFrequency) mostFrequent = currentString;
        }

        return mostFrequent;
    }

    public void printToConsole() {
        System.out.println(strings);
    }
}
