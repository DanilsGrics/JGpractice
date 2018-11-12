package lv.danilsgrics.sixthLab;

public class LookupArrayService {

    public int findMax(int[] array) {

        int maximalValue = 0;

        if (array.length > 0) {

            maximalValue = array[0];

            for (int i = 0; i < array.length; i++) {
                if (maximalValue < array[i]) {
                    maximalValue = array[i];
                }
            }
        }
        return maximalValue;
    }

    public int findMin(int[] array) {

        int minimalValue = 0;

        if (array.length > 0) {

            minimalValue = array[0];

            for (int i = 0; i < array.length; i++) {
                if (minimalValue > array[i]) {
                    minimalValue = array[i];
                }
            }
        }
        return minimalValue;
    }

    public int indexOfMax(int[] array) {

        int indexOfMaxValue = -1;

        if (array.length > 0) {

            indexOfMaxValue = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[indexOfMaxValue] <= array[i]) {
                    indexOfMaxValue = i;
                }
            }
        }
        return indexOfMaxValue;
    }

    public int indexOfMin(int[] array) {

        int indexOfMinValue = -1;

        if (array.length > 0) {

            indexOfMinValue = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[indexOfMinValue] >= array[i]) {
                    indexOfMinValue = i;
                }
            }
        }
        return indexOfMinValue;
    }

    public int indexOf(int[] array, int value) {

        int indexOfValue = -1;

        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    indexOfValue = i;
                    break;
                }
            }
        }
        return indexOfValue;
    }


}
