package lv.danilsgrics.thirdLab;

public class PhraseAnalyserTest {

    public static void main(String[] args) {

        PhraseAnalyser analyser = new PhraseAnalyser();
        String phrase = "Hello, guys";

        System.out.println(phrase + ": " + analyser.analyse(phrase));

        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.itStandsNoChanceTest();
    }

    public void itStandsNoChanceTest() {
        PhraseAnalyser victim = new PhraseAnalyser();

        String testItStandsNoChance = "Make Latvia great again";

        String expectedResult = "It stands no chance..";
        String actualResult = victim.analyse(testItStandsNoChance);

        check(actualResult, expectedResult, "itStandsNoChanceTest");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}



