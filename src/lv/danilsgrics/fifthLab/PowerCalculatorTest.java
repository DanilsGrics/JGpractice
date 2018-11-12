package lv.danilsgrics.fifthLab;

public class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest testRunner = new PowerCalculatorTest();

        testRunner.powTestExpected256();
        testRunner.powTestExpected1073741824();
    }

    public void powTestExpected256() {

        PowerCalculator victim = new PowerCalculator();

        long expectedResult = 256;
        long actualResult = victim.pow(4, 4);

        check(actualResult, expectedResult, "powTestExpected256");
    }

    public void powTestExpected1073741824() {

        PowerCalculator victim = new PowerCalculator();

        long expectedResult = 1073741824;
        long actualResult = victim.pow(64, 5);

        check(actualResult, expectedResult, "powTestExpected1073741824");
    }


    public void check(long actualResult, long expectedResult, String testName) {

        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
