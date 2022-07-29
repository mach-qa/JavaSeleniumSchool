package HomeWork;

import java.util.*;

public class HomeWorkTokenGenerator2 {

    public static int getNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide length of Token:");

        return scanner.nextInt();
    }


    public static String numberGenerator(int number) {


        String lowerCases = "abcdefghijklmnopqrstuvwxyz";
        String upperCases = lowerCases.toUpperCase();
        String numbers = "1234567890";
        String specialCharacters = "!@#$%^&*()";

        String tokenValues = lowerCases + upperCases + numbers + specialCharacters;

        Random random = new Random();
        String token = null;

        for (int i = 0; i < number; i++) {
            token = String.valueOf(tokenValues.charAt(random.nextInt(tokenValues.length())));
            System.out.print(token);

        }

        return token;
    }

    public static void main(String[] args) {

        int number = getNumberFromUser();

        switch (number) {
            case 5, 10, 15 -> {
                System.out.println("Your Token:");
                numberGenerator(number);
            }
            default -> System.out.println("You can choose only between 5, 10 and 15 characters");
        }
    }
}
