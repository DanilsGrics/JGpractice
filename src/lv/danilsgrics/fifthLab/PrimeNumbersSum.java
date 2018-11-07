package lv.danilsgrics.fifthLab;

public class PrimeNumbersSum {

    public static void main(String[] args) {

        IsOdd revisor = new IsOdd();

        int knownPrimeNumbers[] = new int[100];
        int from = 1;
        int to = 500;
        int i;
        int primeNumberCounter = 0;
        int sumOfPrimeNumbers = 0;

        for (i = from; i <= to; i++) {

            if (i == 17 || i == 71) continue;

            if (revisor.revise(i, knownPrimeNumbers, primeNumberCounter)) {
                System.out.println(i);
                primeNumberCounter++;
                sumOfPrimeNumbers += i;
                knownPrimeNumbers[primeNumberCounter + 1] = i;
            }

            if (primeNumberCounter == 50) break;
        }

        System.out.println("Sum of prime numbers: " + sumOfPrimeNumbers);
        System.out.println("Count of prime numbers: " + primeNumberCounter);
    }
}

