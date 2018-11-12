package lv.danilsgrics.sixthLab;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.createArrayOfNInt(6);
        arrayService.printArray(array);
        arrayService.arrayFilling(array);
        arrayService.printArray(array);
        arrayService.sumOfArrayElements(array);
        System.out.println("Sum of elements is " + arrayService.sumOfArrayElements(array));

        arrayService.arraySortingAscending(array);
        arrayService.printArray(array);

        int[] array2 = {1, 5, 7, 2, 4, 0, 8};

        arrayService.arraySortingBoundToBound(array2);
        arrayService.printArray(array2);

        int[] array3 = {1, 5, 7, 2, 4, 0, 8, 7};

        arrayService.arraySortingBoundToBound(array3);
        arrayService.printArray(array3);


    }
}
