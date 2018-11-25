package lv.danilsgrics.eighthLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordCounter {

    private Map<String, Integer> strings = new HashMap<>();

    public void addWord(String string) {

        if (!string.isEmpty()) {

            if(!strings.containsKey(string)) strings.put(string, 1);
            else strings.put(string, (strings.get(string) + 1));
        }
    }

    public List<String> getMostPopularEntries() {

        List<String> mostFrequent = new ArrayList();
        int highestFrequency = 0;

        for (String count : strings.keySet()) {

            if(strings.get(count) > highestFrequency) highestFrequency++;
        }

        for (String count : strings.keySet()) {

            if(strings.get(count) == highestFrequency) mostFrequent.add(count);
        }

        return mostFrequent;
    }

    public void printToConsole() {
        System.out.println(strings);
    }
}
