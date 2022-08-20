package HomeWork.PaySlip;

import java.util.Scanner;

import static HomeWork.PaySlip.Helpers.scannerForInteger;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + this.firstName + " " + this.lastName + " is " + Integer.toString(this.salary));
    }

    public static Employee addNewEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a First name");
        String firstName = scanner.nextLine();

        System.out.println("Please provide a Last name");
        String lastName = scanner.nextLine();

        System.out.println("Please provide a salary");
        int salary = scannerForInteger();

        return new Employee (firstName, lastName, salary);
    }

    public static void removeEmployee(Company list) {
        System.out.println("Enter the index number of the worker you want to remove from the database");
        int index = scannerForInteger() - 1;
        list.getWorkerIndex().remove(index);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
