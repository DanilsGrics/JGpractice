package lv.danilsgrics.fourthLab;

import java.util.Objects;

public class Department {

    String nameOfDepartment;
    Company company;

    public Company getCompany() {
        return company;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        return Objects.equals(nameOfDepartment, that.nameOfDepartment) &&
                Objects.equals(company, that.company);
    }

    @Override
    public String toString() {

        return nameOfDepartment +
                "\ncompany: " + company + "\n";
    }
}
