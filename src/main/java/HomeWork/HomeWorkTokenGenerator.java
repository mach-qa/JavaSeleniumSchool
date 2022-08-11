package HomeWork;

import java.util.*;
import java.util.stream.IntStream;

public class HomeWorkTokenGenerator {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        int leftLimit = 33; // letter 'a'
        int rightLimit = 122; // letter 'z'

        System.out.println("Provide length of Token:");
        int tokenLength = scanner.nextInt();

        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit)
                .limit(tokenLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        if (tokenLength == 5) {
            System.out.println("Your token is: " + generatedString);
        } else if (tokenLength == 10) {
            System.out.println("Your Token is: " + generatedString);
        } else if (tokenLength == 15) {
            System.out.println("Your Token is: " + generatedString);
        } else {
              System.out.println("Your Token Length is incorrect, please try again");
        };



    }
}
