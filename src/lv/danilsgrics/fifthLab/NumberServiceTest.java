package lv.danilsgrics.fifthLab;

public class NumberServiceTest {

    public static void main(String[] args) {

        NumberService testNumbers = new NumberService();

        testNumbers.calculateSumInRange(12, 14);
        testNumbers.calculateSumInRange(14, 12);
        testNumbers.calculateSumInRange(12, 12);
        testNumbers.calculateSumInRange(12213, 1423);

        testNumbers.calculateEvenNumberCount(12, 56);
        testNumbers.calculateEvenNumberCount(34, 23);
        testNumbers.calculateEvenNumberCount(55, 55);
        testNumbers.calculateEvenNumberCount(12213, 1423);
    }
}
