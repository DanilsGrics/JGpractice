package lv.danilsgrics.seventhLab;

public class MathOperations {

    public void executeAll(MathOperation[] mathOperations, double arg1, double arg2) {

        for (MathOperation mathOperation : mathOperations) {
            double result = mathOperation.execute(arg1, arg2);
            System.out.println("result is " + result);
        }
    }
}
