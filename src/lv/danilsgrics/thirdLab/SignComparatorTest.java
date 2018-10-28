package lv.danilsgrics.thirdLab;

public class SignComparatorTest {


            public static void main(String[] args) {

                SignComparator comparator = new SignComparator();
                int figure = 123;

                System.out.println(figure + ": " + comparator.compare(figure));

                SignComparatorTest testRunner = new SignComparatorTest();
                testRunner.isFigureNegativeTest();
            }

    public void isFigureNegativeTest() {
            SignComparator victim = new SignComparator();

            int testNegativeFigure = -21;

            String expectedResult = "Number is negative!";
            String actualResult = victim.compare(testNegativeFigure);

            check(actualResult, expectedResult, "isFigureNegative");
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

