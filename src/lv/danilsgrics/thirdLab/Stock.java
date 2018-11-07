package lv.danilsgrics.thirdLab;

public class Stock {

    String company;
    double currentValue;
    double max;
    double min;

    Stock(String newCompany, double newCurrentValue) {
        company = newCompany;
        currentValue = newCurrentValue;
        max = newCurrentValue;
        min = newCurrentValue;
    }


    public void updatePrice(double currentValue) {
        if (currentValue > 0) {

            this.currentValue = currentValue;
            if (currentValue > max) {
                max = currentValue;
            }

            if (currentValue < min) {
                min = currentValue;
            }

            System.out.println("Current price of " + company + " stock is updated successfully!");
            printInfo();
        } else {
            System.out.println("Error, new value of " + company + " stock cannot be negative or be equivalent to zero!\n");
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void printInfo() {
        System.out.println("Information about " + company + " stock\n" +
                "Current value: " + getCurrentValue() + "\nMaximal value: " + getMax() +
                "\nMinimal value: " + getMin() + "\n");
    }
}
