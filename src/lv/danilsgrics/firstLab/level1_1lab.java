package lv.danilsgrics.firstLab;

import java.util.Scanner;

public class level1_1lab {

    public static void main(String[] args) {

        float firstNumber;
        float secondNumber;
        float result;
        String action;
        Scanner scan = new Scanner(System.in);

        System.out.print("Type first number, please: ");
        firstNumber = scan.nextFloat();

        System.out.print("Type second number, please: ");
        secondNumber = scan.nextFloat();

        for (; ; ) {

            System.out.print("Type command you need (sum, sub, div, mul), please: ");
            action = scan.next();

            if (action.equals("sum")) {
                result = firstNumber + secondNumber;
                break;
            }

            if (action.equals("sub")) {
                result = firstNumber - secondNumber;
                break;
            }

            if (action.equals("div")) {
                result = firstNumber / secondNumber;
                break;
            }

            if (action.equals("mul")) {
                result = firstNumber * secondNumber;
                break;
            } else {
                System.out.println("Unknown command, try again, please!");
            }
        }

        System.out.println("Result is: " + result);
    }
}
