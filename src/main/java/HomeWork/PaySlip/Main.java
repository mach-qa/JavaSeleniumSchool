package HomeWork.PaySlip;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private void userScanner () {


    }

    private void addNewEmployee (){


        System.out.println("Please provide a first name");
        String firstName = scanner.nextLine();

        System.out.println("Please provide a Last Name name");
        String lastName = scanner.nextLine();

        System.out.println("Please provide a Last Name name");
        int salary = scanner.nextInt();
        while (!scanner.hasNextLine()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextInt();
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        private void addNewEmployee (){
            System.out.println("Please provide a first name");
            String firstName = scanner.nextLine();

            System.out.println("Please provide a Last Name name");
            String lastName = scanner.nextLine();

            System.out.println("Please provide a Last Name name");
            int salary = scanner.nextInt();
            while (!scanner.hasNextLine()) {
                System.out.println("This is not a number! Please try again:");
                scanner.nextInt();
            }

        }

        System.out.println("Please provide a first name");
        String firstName = scanner.nextLine();

        System.out.println("Please provide a Last Name name");
        String lastName = scanner.nextLine();

        System.out.println("Please provide a Last Name name");
        int salary = scanner.nextInt();
        while (!scanner.hasNextLine()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextInt();
        }

        ArrayList<Employee> employeeIndex = new ArrayList<>();

        employeeIndex.add(new Employee(firstName, lastName, salary));
        employeeIndex.add(new Employee(firstName, lastName, salary));
        employeeIndex.add(new Employee(firstName, lastName, salary));
        employeeIndex.add(new Employee(firstName, lastName, salary));
        employeeIndex.add(new Employee(firstName, lastName, salary));

        Company employeesList = new Company(employeeIndex);

        int option = scanner.nextInt();

        System.out.println("1 - Print sum of all employees salary");
        System.out.println("2 - Display all employees data");
        System.out.println("3 - Add new employee");
        System.out.println("4 - End program");

        switch (option){
            case 1: {
                int sum = 0;
                for (int i = 0; i < employeeIndex.size(); i++) {
                    sum += employeesList.getWorkerIndex().get(i).getSalary();
                }
                System.out.println("The sum of all employees salary is" + sum);
            }
            case 2: {
                for (int i = 0; i < employeeIndex.size(); i++) {
                    System.out.println(
                            employeesList.getWorkerIndex().get(i).getFirstname() + ", "
                                    + employeesList.getWorkerIndex().get(i).getLastName()
                    );
                }
            }
            case 3: {

            }
                System.out.println("3 - Add new employee");
            case 4:
                System.out.println("4 - End program");
                break;
            default:
        }
    }
}
