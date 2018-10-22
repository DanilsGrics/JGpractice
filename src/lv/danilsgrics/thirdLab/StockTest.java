package lv.danilsgrics.thirdLab;

public class StockTest {

    public static void main(String[] args) {

        Stock ibm = new Stock("IBM", 146.54);

        ibm.printInfo();
        ibm.updatePrice(0);
        ibm.updatePrice(146.56);
        ibm.updatePrice(146.53);

        Stock google = new Stock("Google", 180.96);
        google.printInfo();
        google.updatePrice(180.97);
        google.updatePrice(-2.1);

        google.printInfo();
        ibm.printInfo();
    }
}
