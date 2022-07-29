package HomeWork;

import java.util.*;
import java.util.stream.IntStream;

public class HomeWorkTokenGenerator {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        int leftLimit = 33; //
        int rightLimit = 122; //

        System.out.println("Provide length of Token:");
        int targetStringLength = scanner.nextInt();

        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();



        if (targetStringLength == 5) {
            System.out.println("Your token is: " + generatedString);
        } else if (targetStringLength == 10) {
            System.out.println("Your Token is: " + generatedString);
        } else if (targetStringLength == 15) {
            System.out.println("Your Token is: " + generatedString);
        } else {
              System.out.println("Your Token Length is incorrect, please try again");
        }


    }
}
