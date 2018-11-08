package lv.danilsgrics.fifthLab;

public class PowerCalculator {

    public long pow(long number, long power) {

        long result = number;

        for (int i = 1; i < power; i++) {

            result = result * number;
        }
        return result;
    }

    public void printResult(long number, long power) {

        System.out.println("\nPower " + power + " of " + number + " is " + pow(number, power));
    }
}
