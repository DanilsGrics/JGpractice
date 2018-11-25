package lv.danilsgrics.eighthLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueWordCounterTest {

    public static void main(String[] args) {

        UniqueWordCounterTest testRunner = new UniqueWordCounterTest();


        testRunner.uniqueElementsAppleAndMangoExpected();
    }

    public void uniqueElementsAppleAndMangoExpected() {

        UniqueWordCounter victim = new UniqueWordCounter();

        victim.addWord("apple");
        victim.addWord("apple");
        victim.addWord("mango");
        victim.addWord("mango");
        victim.addWord("lemon");

        List<String> expectedResult = new ArrayList(Arrays.asList("apple", "mango"));
        List<String> actualResult = victim.getMostPopularEntries();

        check(actualResult, expectedResult, "uniqueElementsAppleAndMangoExpected");
    }

    public void check(List actualResult, List expectedResult, String testName) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
