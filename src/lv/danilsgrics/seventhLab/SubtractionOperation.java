package lv.danilsgrics.seventhLab;

public class SubtractionOperation implements MathOperation {

    @Override
    public double execute(double arg1, double arg2) {

        System.out.print("Executing subtraction operation and ");

        return arg1 - arg2;
    }
}
