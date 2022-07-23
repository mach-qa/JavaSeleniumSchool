package automationSchool.lesson1.ch02_operators;

public class Ex4_StringWithInt {
    public static void main(String[] args) {
        int i = 5;
        int j = 7;
        System.out.println("ASdasd " + i + j); // ASdasd 57
        System.out.println("ASdasd " + (i + j)); // ASdasd 12

        String text1 = "qwe " + i + j;
        String text2 = "qwe " + (i + j);

        System.out.println(text1); // qwe 57
        System.out.println(text2); // qwe 12
    }
}
