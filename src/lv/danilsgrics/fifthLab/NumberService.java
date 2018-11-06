package lv.danilsgrics.fifthLab;

public class NumberService {

    public int sumInRange(int firstInteger, int secondInteger) {

        int sumOfNumbersInRange = 0;

        if (firstInteger < secondInteger) {

            for (int i = firstInteger; i <= secondInteger; i++) {
                sumOfNumbersInRange += i;
            }
        }

        if (firstInteger >= secondInteger) {

            for (int i = secondInteger; i <= firstInteger; i++) {
                sumOfNumbersInRange += i;
            }
        }

        return sumOfNumbersInRange;
    }

    public int getEvenNumberCount(int firstInteger, int secondInteger) {

        int countOfEvenNumbers = 0;

        if (firstInteger < secondInteger) {

            for (int i = firstInteger; i <= secondInteger; i++) {
                if (i % 2 == 0) countOfEvenNumbers++;
            }
        }

        if (firstInteger >= secondInteger) {

            for (int i = secondInteger; i <= firstInteger; i++) {
                if (i % 2 == 0) countOfEvenNumbers++;
            }
        }

        return countOfEvenNumbers;
    }

    public void calculateSumInRange(int firstInteger, int secondInteger) {

        System.out.println("The sum of integers between " +
                firstInteger + " and " + secondInteger + " is " + sumInRange(firstInteger, secondInteger));
    }

    public void calculateEvenNumberCount(int firstInteger, int secondInteger) {

        System.out.println("The count of even numbers between " +
                firstInteger + " and " + secondInteger + " is " + getEvenNumberCount(firstInteger, secondInteger));
    }

}

