package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

    public static int userNumber;

    public static int requestedNumber() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int generatedNumber = random.nextInt(99);

        System.out.println("Please guess a number:");
        userNumber = requestedNumber();

        int numberOfAttempts = 5;

        while (true) {
            if (numberOfAttempts != 1) {
                if (userNumber == generatedNumber) {
                    System.out.println("Congratulations! You guessed it!");
                    break;
                } else if (userNumber > generatedNumber) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                    numberOfAttempts--;
                    System.out.println("available attempts: " + numberOfAttempts + " . Please try again");
                    userNumber = requestedNumber();
                } else if (userNumber < generatedNumber) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                    numberOfAttempts--;
                    System.out.println("available attempts: " + numberOfAttempts + " . Please try again");
                    userNumber = requestedNumber();
                }
            } else {
                System.out.println("Sorry you didn't guess the number, the answer was: " + generatedNumber);
                break;
            }
        }
    }
}
