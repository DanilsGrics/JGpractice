package lv.danilsgrics.fourthLab;

import java.util.Objects;

public class Employee {

    private String contractNumber;
    private double salary;
    private Department department;

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee that = (Employee) o;

        return Objects.equals(contractNumber, that.contractNumber) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(department, that.department);
    }

    @Override
    public String toString() {

        return "\nEmployee " + contractNumber + ":" +
                "\nsalary: " + salary + "\n" +
                "department: " + department + "\n";
    }
}
