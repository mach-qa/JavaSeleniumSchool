package automationSchool.lesson3.ch3_Advanced;

public class Main {

    public static void main(String[] args) {
        Address senderAddress = new Address("20-800", "1 Maja");
        Address recipientAddress = new Address("10-230", "krucza");

        Person recipient = new Person("Jan", "Kowalski", recipientAddress);
        Person sender = new Person("Adam", "Nowak", senderAddress);


        Letter letter = new Letter(sender, recipient, "Lorem impsum....");

        letter.printAllInfo();
    }
}
