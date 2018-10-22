package lv.danilsgrics.thirdLab;

public class CreditCardTest {

    public static void main(String[] args) {

        CreditCard testCard = new CreditCard ("3333222211110000", "3344",
                100, 150, 30);

        testCard.printAccountData();
        testCard.topup(20,"1111");
        testCard.topup(20,"3344");
        testCard.topup(100,"3344");
        testCard.withdraw(300, "2345");
        testCard.withdraw(300, "3344");
        testCard.withdraw(50, "3344");
    }
}
