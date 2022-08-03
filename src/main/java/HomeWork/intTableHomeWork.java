package HomeWork;

import java.util.Scanner;

public class intTableHomeWork {

    public static int requestedNumber() {

        Scanner scanner = new Scanner(System.in);

        int tableSize = scanner.nextInt();

        return tableSize;
    }

    public static void main(String[] args) {

        System.out.println("How big the table should be?");
        int tableSize = requestedNumber();

        int[] numbers = new int[tableSize];



    }
}
