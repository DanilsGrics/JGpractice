package lv.danilsgrics.sixthLab;

import java.util.Random;
import java.util.Scanner;

public class ShowArrayValuesInBounds {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        Scanner scan = new Scanner(System.in);

        float[] array = new float[10];

        System.out.print("Stock array: ");

        for (int i = 0; i < array.length; i++) {

            array[i] = randomGenerator.nextInt(101);

            System.out.print(array[i] + "; ");
        }

        System.out.print("\nType left bound, please: ");
        float leftBound = scan.nextFloat();

        System.out.print("Type right bound, please: ");
        float rightBound = scan.nextFloat();

        float[] tempArray = new float[array.length];

        System.out.print("Array with figures in bounds: ");

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= leftBound && array[i] <= rightBound) {

                tempArray[j] = array[i];

                System.out.print(tempArray[j] + "; ");
                j++;
            }
        }
    }
}
