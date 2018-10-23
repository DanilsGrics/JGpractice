package lv.danilsgrics.fourthLab;

public class Counter {

    private int value = 0;
    private int step = 1;

    public int getValue() {
        return value;
    }

    public int getStep() {
        return step;
    }

    public void setValue(int value) {
        if (value > 0 && value <= 100) {
            this.value = value;
        }

        else {
            System.out.println("You should set value from [1 to 100]");
        }
    }

    public void setStep(int step) {
        if (step > 0 && value <= 10) {
            this.step = step;
        }

        else {
            System.out.println("You should set step from [1 to 10]");
        }
    }

    public void increment() {
        if ((getValue() + step) <= 100) {
            setValue(getValue() + step);
        }

        else {
            System.out.println("Current value is already maximal!");
        }
    }

    public void decrement() {
        if ((getValue() - step) > 0) {
            setValue(getValue() - step);
        }

        else {
            System.out.println("Current value is already 0!");
        }
    }

    public void clear() {
        this.value = 0; //Not the best idea!
    }

    protected void print () {
        System.out.println("Current value: " + getValue() +
                "\nCurrent defined step: " + getStep() + "\n");
    }
}
