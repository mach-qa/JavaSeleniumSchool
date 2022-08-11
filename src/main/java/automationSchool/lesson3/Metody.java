package automationSchool.lesson3;

public class Metody {
    public static void printHelloWorld (){
        System.out.println("I'm inside method!");
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        System.out.println("program start");
        printHelloWorld();
        printHelloWorld();
        System.out.println("program end");

    }
    public static int getNumber() {
        return 5;
    }

}
