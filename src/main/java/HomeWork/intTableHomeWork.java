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

        int[] tableWithNumbers = new int[tableSize];

        int lengthOfTable = tableWithNumbers.length;

        for (int y = 0; y != lengthOfTable; y++) {
            System.out.println("Define number for index " + y);
            tableWithNumbers[y] = requestedNumber();
        }

        int sum = 0;

        for (int s : tableWithNumbers) {
            sum += s;
        }

        System.out.println("The sum of numbers is: " + (sum/tableSize));

        int largest = 0;

        for (int i = 0; i < lengthOfTable; i++){
            if (largest < tableWithNumbers[i])
            { largest = tableWithNumbers[i];}
        }

        System.out.println("The largest number is: " + largest);


    }
}
