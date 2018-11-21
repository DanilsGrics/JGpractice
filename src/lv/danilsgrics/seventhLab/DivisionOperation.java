package lv.danilsgrics.seventhLab;

public class DivisionOperation implements MathOperation {

    @Override
    public double execute(double arg1, double arg2) {

        System.out.print("Executing division operation and ");

        return arg1 / arg2;
    }
}
