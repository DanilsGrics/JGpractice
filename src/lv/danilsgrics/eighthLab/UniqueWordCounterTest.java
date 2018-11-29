package lv.danilsgrics.eighthLab;

public class UniqueWordCounterTest {

    public static void main(String[] args) {

        UniqueWordCounterTest testRunner = new UniqueWordCounterTest();


        testRunner.uniqueElementAppleExpectedTest();
    }

    public void uniqueElementAppleExpectedTest() {

        UniqueWordCounter victim = new UniqueWordCounter();

        victim.addWord("apple");
        victim.addWord("apple");
        victim.addWord("mango");
        victim.printToConsole();

        String expectedResult = "apple";
        String actualResult = victim.getMostPopularEntries();

        check(actualResult, expectedResult, "uniqueElementAppleExpectedTest");
    }

    public void check(String actualResult, String expectedResult, String testName) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
