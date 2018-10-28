package lv.danilsgrics.thirdLab;

public class PhraseAnalyserTest {

    public static void main(String[] args) {

        PhraseAnalyser analyser = new PhraseAnalyser();
        String phrase = "Hello, guys";

        System.out.println(phrase + ": " + analyser.analyse(phrase));

        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.itStandsNoChanceTest();

        PhraseAnalyserTest testRunner2 = new PhraseAnalyserTest();
        testRunner2.itCouldBeWorseTest();

        PhraseAnalyserTest testRunner3 = new PhraseAnalyserTest();
        testRunner3.itIsFineReallyTest();
    }

    public void itStandsNoChanceTest() {
        PhraseAnalyser victim = new PhraseAnalyser();

        String testItStandsNoChance = "Make Latvia great again";

        String expectedResult = "It stands no chance..";
        String actualResult = victim.analyse(testItStandsNoChance);

        check(actualResult, expectedResult, "itStandsNoChanceTest");
    }

    public void itCouldBeWorseTest() {
        PhraseAnalyser victim = new PhraseAnalyser();

        String testItCouldBeWorseTest = "Make Latvia the best";

        String expectedResult = "It could be worse";
        String actualResult = victim.analyse(testItCouldBeWorseTest);

        check(actualResult, expectedResult, "itCouldBeWorseTest");
    }

    public void itIsFineReallyTest() {
        PhraseAnalyser victim = new PhraseAnalyser();

        String testItIsFineReallyTest = "Well done!";

        String expectedResult = "It is fine, really";
        String actualResult = victim.analyse(testItIsFineReallyTest);

        check(actualResult, expectedResult, "itIsFineReallyTest");
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



