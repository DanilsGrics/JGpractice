package lv.danilsgrics.thirdLab;

public class CreditCard {
    private String cardID;
    private String pinCode;
    private float debitBalance;
    private float creditLimit;
    private float creditUsed;

    CreditCard (String cardID, String pinCode, float debitBalance,
                float creditLimit, float creditUsed) {
        setCardID(cardID);
        setPinCode(pinCode);
        setDebitBalance(debitBalance);
        setCreditLimit(creditLimit);
        setCreditUsed(creditUsed);
    }

    public String getCardID() {
        return cardID;
    }

    public String getPinCode() {
        return pinCode;
    }

    public float getDebitBalance() {
        return debitBalance;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public float getCreditUsed() {
        return creditUsed;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setDebitBalance(float debitBalance) {
        this.debitBalance = debitBalance;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditUsed(float creditUsed) {
        this.creditUsed = creditUsed;
    }

    public boolean withdraw (float amount, String pinCode) {

        if (pinCode.equals(getPinCode())) {

            if (amount <= getDebitBalance()) {
                setDebitBalance(getDebitBalance() - amount);
                System.out.println("Money have successfully been withdrawn!");
                printAccountData();
                return true;
            }

            float temp = amount - getDebitBalance(); //variable keeps information about amount of money
            // which is not enough on debit balance

            if ((getCreditLimit() - getCreditUsed()) >= temp) {
                setDebitBalance(0);
                setCreditUsed(getCreditUsed() + temp);
                System.out.println("Money have successfully been withdrawn!");
                printAccountData();
                return true;
            }

            else {
                System.out.println("Not enough money on debit and/or credit balances!");
                printAccountData();
            }
        }

        else {
            System.out.println("Wrong PIN!\n");
        }

        return false;
    }

    public boolean topup (float amount, String pinCode) {
        if (pinCode.equals(getPinCode())) {

            if (getCreditUsed() >= amount) {
                setCreditUsed(getCreditUsed() - amount);
            }
            else {
                float temp = amount - getCreditUsed();
                setCreditUsed(0);
                setDebitBalance(getDebitBalance() + temp);//variable keeps information about amount of money
                // which will be stored on debit balance
            }

            System.out.println("Money have successfully been topped up!");
            printAccountData();
            return true;
        }

        else {
            System.out.println("Wrong PIN!\n");
        }

        return false;
    }

    public void printAccountData () {
        System.out.println("Debit balance: " + getDebitBalance() +
                "\nCredit limit: " + getCreditLimit() +
                "\nCredit used: " + getCreditUsed() + "\n");
    }
}
