package lv.danilsgrics.fourthLab;

import java.util.Objects;

public class Company {

    String nameOfCompany;
    String registrationNumber;

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Company that = (Company) o;

        return Objects.equals(nameOfCompany, that.nameOfCompany) &&
                Objects.equals(registrationNumber, that.registrationNumber);
    }

    @Override
    public String toString() {

        return nameOfCompany +
                "\nregistration number of company: " + registrationNumber + "\n";
    }
}
