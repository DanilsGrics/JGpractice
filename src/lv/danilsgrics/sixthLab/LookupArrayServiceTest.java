package lv.danilsgrics.sixthLab;

public class LookupArrayServiceTest {

    int array[] = {1, 2, 44, 5, 6, 78, 9, 90, 23};

    public static void main(String[] args) {

        LookupArrayServiceTest testRunner = new LookupArrayServiceTest();
        testRunner.findMaxTest();
        testRunner.findMinTest();
        testRunner.indexOfMaxTest();
        testRunner.indexOfMinTest();
        testRunner.indexOfTest();

    }

    public void findMaxTest() {

        LookupArrayService victim = new LookupArrayService();

        int expectedResult = 90;
        int actualResult = victim.findMax(array);

        check(actualResult, expectedResult, "findMaxTest");
    }

    public void findMinTest() {

        LookupArrayService victim = new LookupArrayService();

        int expectedResult = 1;
        int actualResult = victim.findMin(array);

        check(actualResult, expectedResult, "findMinTest");
    }

    public void indexOfMaxTest() {

        LookupArrayService victim = new LookupArrayService();

        int expectedResult = 7;
        int actualResult = victim.indexOfMax(array);

        check(actualResult, expectedResult, "indexOfMaxTest");
    }

    public void indexOfMinTest() {

        LookupArrayService victim = new LookupArrayService();

        int expectedResult = 0;
        int actualResult = victim.indexOfMin(array);

        check(actualResult, expectedResult, "indexOfMinTest");
    }

    public void indexOfTest() {

        LookupArrayService victim = new LookupArrayService();

        int expectedResult = 6;
        int actualResult = victim.indexOf(array, 9);

        check(actualResult, expectedResult, "indexOfTest");
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
