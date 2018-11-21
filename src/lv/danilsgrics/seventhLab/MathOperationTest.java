package lv.danilsgrics.seventhLab;

public class MathOperationTest {

    public static void main(String[] args) {

        MathOperations allOperations = new MathOperations();

        MathOperation[] mathOperations = {new AdditionOperation(), new SubtractionOperation(),
                new MultiplicationOperation(), new DivisionOperation()};

        double arg1 = 23.6;
        double arg2 = 34.565;

        allOperations.executeAll(mathOperations, arg1, arg2);
    }
}
