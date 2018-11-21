package lv.danilsgrics.seventhLab;

public class AdditionOperation implements MathOperation {

    @Override
    public double execute(double arg1, double arg2) {

        System.out.print("Executing addition operation and ");

        return arg1 + arg2;
    }
}
