package lv.danilsgrics.sixthLab;

public class ArrayService {

    public int[] createArrayOfNInt(int countOfElements) {
        return new int[countOfElements];
    }

    public void arrayFilling(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[array.length - 1 - i] = i + 1;
        }
    }

    public void printArray(int[] array) {

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }

        System.out.println();
    }

    public int sumOfArrayElements(int[] array) {

        int sumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfElements += array[i];
        }

        return sumOfElements;
    }

    public void arraySortingAscending(int[] array) {

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public void arraySortingBoundToBound(int[] array) {

        int temp;
        int halfOfArray;

        if (array.length % 2 == 0) {

            halfOfArray = array.length / 2;

            for (int i = 0; i < halfOfArray; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }

        if (array.length % 2 == 1) {

            halfOfArray = (array.length - 1) / 2;

            for (int i = 0; i < halfOfArray; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }
}
