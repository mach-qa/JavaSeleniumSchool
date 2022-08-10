package automationSchool.lesson3.ch3_Advanced;

public class Main2 {

    public static void main(String[] args) {
        Letter letter = new Letter(
                new Person(
                        "Adam",
                        "Nowak",
                        new Address("20-800", "1 Maja")),
                new Person(
                        "Jan",
                        "Kowalski",
                        new Address("10-230", "krucza")),
                "Lorem impsum....");

        letter.printAllInfo();
    }
}
