package lv.danilsgrics.sixthLab;

import java.util.Random;
import java.util.Scanner;

public class ShowArrayValuesInBounds {

    public void runRangeProcessor() {

        Random randomGenerator = new Random();

        Scanner scan = new Scanner(System.in);

        float[] stockArray = new float[10];

        System.out.print("Stock array: ");

        for (int i = 0; i < stockArray.length; i++) {

            stockArray[i] = randomGenerator.nextInt(101);

            System.out.print(stockArray[i] + "; ");
        }

        System.out.print("\nType left bound, please: ");
        float leftBound = scan.nextFloat();

        System.out.print("Type right bound, please: ");
        float rightBound = scan.nextFloat();

        System.out.print("Array with figures in bounds: ");

        int sizeOfTempArray = 0;

        for (int i = 0; i < stockArray.length; i++) {

            if (stockArray[i] >= leftBound && stockArray[i] <= rightBound) {

                sizeOfTempArray++;

            }
        }

        float[] tempArray = new float[sizeOfTempArray];
        int j = 0;

        for (int i = 0; i < stockArray.length; i++) {

            if (stockArray[i] >= leftBound && stockArray[i] <= rightBound) {

                tempArray[j] = stockArray[i];

                System.out.print(tempArray[j] + "; ");
                j++;
            }
        }
    }
}
