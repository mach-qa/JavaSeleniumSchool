package automationSchool.lesson1.ch02_operators;

import java.util.Scanner;

public class Ex3_GetInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String msg = "Podaj imie";

        System.out.println(msg);
        String name = scanner.nextLine();
        System.out.println("other.Hello " + name);

        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        System.out.println("Masz " + age + " lat");

    }
}
