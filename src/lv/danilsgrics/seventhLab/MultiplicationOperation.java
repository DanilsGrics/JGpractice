package lv.danilsgrics.seventhLab;

public class MultiplicationOperation implements MathOperation {

    @Override
    public double execute(double arg1, double arg2) {

        System.out.print("Executing multiplication operation and ");

        return arg1 * arg2;
    }
}
