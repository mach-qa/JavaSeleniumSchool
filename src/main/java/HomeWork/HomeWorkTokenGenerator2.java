package HomeWork;

import java.util.*;

public class HomeWorkTokenGenerator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide length of Token:");
        int tokenLength = scanner.nextInt();
/*            List<String> givenList = new ArrayList<String>();

            givenList.add("A");
            givenList.add("B");
            givenList.add("C");
            givenList.add("D");
            givenList.add("E");
            givenList.add("F");
            givenList.add("G");
            givenList.add("H");
            givenList.add("I");
            givenList.add("J");

            for (int i = 0; i < 10; i++) {
                    random = givenList.get(randomizer.nextInt(givenList.size()));
                    System.out.print(random);
*/

        String lowerCases = "abcdefghijklmnopqrstuvwxyz";
        String upperCases = lowerCases.toUpperCase();
        String numbers = "1234567890";
        String specialCharacters = "!@#$%^&*()";

        String tokenValues = lowerCases + upperCases + numbers + specialCharacters;

        Random randomizer = new Random();
        String random;


        for (int i = 0; i < tokenLength; i++) {
            random = String.valueOf(tokenValues.charAt(randomizer.nextInt(tokenValues.length())));
            break;

        }
        ;


        //           if (tokenLength == 5) {
//                System.out.print("Your token is : " + random);
//            } else if (tokenLength == 10) {
//                System.out.print("Your token is : " + random);
//            } else if (tokenLength == 15) {
//                System.out.print("Your token is : " + random);
//            } else {
//                System.out.print("Yout token need have value");
//            }
//        }
    }
}


