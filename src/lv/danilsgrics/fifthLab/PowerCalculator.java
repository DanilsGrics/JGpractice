package lv.danilsgrics.fifthLab;

public class PowerCalculator {

    public long pow(long number, long power) {

        long result = number;

        for (int i = 1; i < power; i++) {

            result = result * number;
        }
        return result;
    }
}
