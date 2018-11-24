package lv.danilsgrics.eighthLab;

public class UniqueWordVocabularyTest {

    public static void main(String[] args) {

        UniqueWordVocabularyTest testRunner = new UniqueWordVocabularyTest();

        testRunner.countOfUniqueElements2Expected();
    }

    public void countOfUniqueElements2Expected() {

        UniqueWordVocabulary victim = new UniqueWordVocabulary();

        victim.addWord("Hello");
        victim.addWord("");
        victim.addWord("Hello");
        victim.addWord("World");
        victim.printToConsole();

        int expectedResult = 2;
        int actualResult = victim.getUniqueWords();

        check(actualResult, expectedResult, "countOfUniqueElements2Expected");
    }

    public void check(int actualResult, int expectedResult, String testName) {

        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
