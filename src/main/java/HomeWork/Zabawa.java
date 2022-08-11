package HomeWork;

import java.util.*;
import java.util.stream.IntStream;

public class Zabawa {


        public static void main(String[] args) {

/*                List<String> charList = new ArrayList<>();

                Scanner scanner = new Scanner(System.in);

                System.out.println("Provide length of Token:");
                int tokenLength = scanner.nextInt();
*//*            List<String> givenList = new ArrayList<String>();

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
*//*

                String lowerCases = "abcdefghijklmnopqrstuvwxyz";
                String upperCases = lowerCases.toUpperCase();
                String numbers = "1234567890";
                String specialCharacters = "!@#$%^&*()";

                String tokenValues = lowerCases + upperCases + numbers + specialCharacters;

                Random randomizer = new Random();
                String random = new String();


                switch (tokenLength) {
                        case 5:
                                for (int i = 0; i < 5; i++) {
                                        random = String.valueOf(tokenValues.charAt(randomizer.nextInt(tokenValues.length())));
                                        //random.chars();
                                }
                                System.out.println("Your Token: " + random);
                                break;
                        case 10:
                                for (int i = 0; i < 10; i++) {
                                        random = String.valueOf(tokenValues.charAt(randomizer.nextInt(tokenValues.length())));
                                        System.out.print("Your token is : " + random);
                                }
                                break;
                        case 15:
                                for (int i = 0; i < 15; i++) {
                                        random = String.valueOf(tokenValues.charAt(randomizer.nextInt(tokenValues.length())));
                                        System.out.print("Your token is : " + random);
                                }
                                break;
                        default:
                                System.out.println("You can choose only between 5, 10 and 15");


                }
        }
}
//                for (int i = 0; i < tokenLength; i++) {
//                        random = String.valueOf(tokenValues.charAt(randomizer.nextInt(tokenValues.length())));
//                        generatedToken.
//                }
//                        if (tokenLength == 5) {
//                                System.out.print("Your token is : " + charList);
//                        } else if (tokenLength == 10) {
//                                System.out.print("Your token is : " + charList);
//                        } else if (tokenLength == 15) {
//                                System.out.print("Your token is : " + charList);
//                        } else {
//                                System.out.print("Yout token need have value");
//                        }
//        }*/
                int tokenLength = 5;



                String lowerCases = "abcdefghijklmnopqrstuvwxyz";
                String upperCases = lowerCases.toUpperCase();
                String numbers = "1234567890";
                String specialCharacters = "!@#$%^&*()";

                String tokenValues = lowerCases + upperCases + numbers + specialCharacters;

                Random random = new Random();

                for (int i = 0; i < tokenLength; i++) {
                        char generatedToken = tokenValues.charAt(random.nextInt(Integer.parseInt(tokenValues)));

                        System.out.println(generatedToken);
                }
        }
}

