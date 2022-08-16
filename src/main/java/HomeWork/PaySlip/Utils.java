package HomeWork.PaySlip;

import java.util.Scanner;

public class Utils {

    public static String getValueFromUser() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public void printMenu () {
        System.out.println("Choose one option!");
        System.out.println("1 – Print sum of all employees salary");
        System.out.println("2 – Display all employees data");
        System.out.println("3 – Add new employee");
        System.out.println("4 – End program");
    }

}
