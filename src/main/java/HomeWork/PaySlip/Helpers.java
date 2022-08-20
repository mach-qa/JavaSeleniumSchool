package HomeWork.PaySlip;

import java.util.Scanner;

public class Helpers {

    public static void printMenu() {
        System.out.println("What would you like to do ?");
        System.out.println("1 – Print sum of all employees salary");
        System.out.println("2 – Display all employees data");
        System.out.println("3 – Add new employee");
        System.out.println("4 – Update Worker's data");
        System.out.println("4 – Update Worker's data");
        System.out.println("5 – End program");
    }

    public static void printWorkerEditor() {
        System.out.println("Please select which parameter you want to change");
        System.out.println("1. First name");
        System.out.println("2. Last name");
        System.out.println("3. Salary");
        System.out.println("4. Finish the editing process");
    }

    public static String scannerForString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int scannerForInteger() {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Remember, the number must be positive");
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a number. Please try again:");
                scanner.next();
            }
            a = scanner.nextInt();
        } while (a <= 0);

        return a;
    }
}
