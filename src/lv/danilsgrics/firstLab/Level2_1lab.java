package lv.danilsgrics.firstLab;

import java.util.Random;

public class Level2_1lab {

    public static void main(String[] args) {

        Random randomGenerator = new Random(); //Creating random generator
        int[] randomNumbers = new int[3]; //Array where random numbers will be stored
        int sumOfRandomNumbers = 0; //Variable which will store sum of random numbers

        System.out.print("Random numbers are: ");

        //Do looping from 1st element to 3th
        for (int currentNumber = 0; currentNumber < randomNumbers.length; currentNumber++) {

            //Assign random number to every element of array
            randomNumbers[currentNumber] = randomGenerator.nextInt(100 + 1);

            //Sum of random numbers
            sumOfRandomNumbers += randomNumbers[currentNumber];

            System.out.print(randomNumbers[currentNumber]);

            //Some punctuation for visually enjoyable print
            if ((currentNumber + 1) != randomNumbers.length) {
                System.out.print(", ");
            } else {
                System.out.println("\nSum of random numbers is: " + sumOfRandomNumbers);
            }
        }
    }
}

