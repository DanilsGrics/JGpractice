package lv.danilsgrics.firstLab;

public class MathOperations {

    public static void main(String[] args) {

        long longNumber = 2124314;
        int intNumber = 343213;
        long longResult = longNumber + intNumber;

        System.out.println("Sum of long and int = " + longResult);
        //Using long cause it uses more space (long > int)

        int firstSubstractNumber = 10;
        float secondSubstractNumber = 5.25123f;
        //...f is important
        float subtractResult = firstSubstractNumber - secondSubstractNumber;

        System.out.printf("Subtraction result: %.3f \n", subtractResult);//%.3f format till 3 chars after dot

        short firstMultiplier = 1999;
        short secondMultiplier = 2;
        short multiplicationResult = (short) (firstMultiplier * secondMultiplier); //we need "(short)" to make operation real
        System.out.println("Multiplication result: " + multiplicationResult);

        int firstValue = 50;
        int secondValue = 5;
        int divisionResult = firstValue / secondValue;

        System.out.println("Division result: " + divisionResult);
    }
}
