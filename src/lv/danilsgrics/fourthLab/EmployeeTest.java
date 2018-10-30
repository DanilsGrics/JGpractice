package lv.danilsgrics.fourthLab;

public class EmployeeTest {

    public static void main(String[] args) {

        Company company = new Company();
        company.setNameOfCompany("Apple");
        company.setRegistrationNumber("AFK1B2");

        Department department = new Department();
        department.setCompany(company);
        department.setNameOfDepartment("marketing");

        Department department2 = new Department();
        department2.setCompany(company);
        department2.setNameOfDepartment("engineering");

        Employee person = new Employee();
        person.setContractNumber("11B341");
        person.setSalary(3100);
        person.setDepartment(department);

        System.out.println(person);

        Employee person2 = new Employee();
        person2.setContractNumber("11B346");
        person2.setSalary(4000);
        person2.setDepartment(department);

        System.out.println(person2);

        System.out.println("Is person equals to person2: " + person.equals(person2));
        System.out.println("Is department equals to department2: " + department.equals(department2));
    }
}
