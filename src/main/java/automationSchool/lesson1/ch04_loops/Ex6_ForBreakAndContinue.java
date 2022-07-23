package automationSchool.lesson1.ch04_loops;

public class Ex6_ForBreakAndContinue {

    public static void main(String[] args) {
        System.out.println("break");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; // kończymy całkowicie wykonywanie pętli
            }
            System.out.println(i);
        }

        System.out.println("continue");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // kończymy aktulane powt pętli i idziemy
                          // do kolejnego powtorzenia
                          // powtorzenie = iteracja
            }
            System.out.println(i);
        }
    }
}
