package lv.danilsgrics.sixthLab;

public class IsPalindromeTest {

    public static void main(String[] args) {

        IsPalindromeTest testRunner = new IsPalindromeTest();

        testRunner.isPalindromeEvenWordWithSpaceExpectedTrueTest();
        testRunner.isPalindromeEvenWordExpectedFalseTest();
        testRunner.isPalindromeOddWordExpectedTrueTest();
        testRunner.isPalindromeOddWordExpectedFalseTest();
        testRunner.isPalindromeOddWordWithSpacesExpectedTrueTest();

    }

    public void isPalindromeEvenWordWithSpaceExpectedTrueTest() {

        IsPalindrome victim = new IsPalindrome();

        Boolean expectedResult = true;
        Boolean actualResult = victim.isPalindrome("Ro pp or");

        check(actualResult, expectedResult, "isPalindromeEvenWordWithSpaceExpectedTrueTest");
    }

    public void isPalindromeEvenWordExpectedFalseTest() {

        IsPalindrome victim = new IsPalindrome();

        Boolean expectedResult = false;
        Boolean actualResult = victim.isPalindrome("lerkorel");

        check(actualResult, expectedResult, "isPalindromeEvenWordExpectedFalseTest");
    }

    public void isPalindromeOddWordExpectedTrueTest() {

        IsPalindrome victim = new IsPalindrome();

        Boolean expectedResult = true;
        Boolean actualResult = victim.isPalindrome("Level");

        check(actualResult, expectedResult, "isPalindromeOddWordExpectedTrueTest");
    }

    public void isPalindromeOddWordWithSpacesExpectedTrueTest() {

        IsPalindrome victim = new IsPalindrome();

        Boolean expectedResult = true;
        Boolean actualResult = victim.isPalindrome("L e v e l");

        check(actualResult, expectedResult, "isPalindromeOddWordWithSpacesExpectedTrueTest");
    }

    public void isPalindromeOddWordExpectedFalseTest() {

        IsPalindrome victim = new IsPalindrome();

        Boolean expectedResult = false;
        Boolean actualResult = victim.isPalindrome("Levyl");

        check(actualResult, expectedResult, "isPalindromeOddWordExpectedFalseTest");
    }


    public void check(Boolean actualResult, Boolean expectedResult, String testName) {

        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
