package automationSchool.lesson3.ch3_Advanced;

public class Letter {
    Person sender;
    Person recipient;
    String content;

    public Letter(Person sender, Person recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public void printAllInfo(){
        System.out.println("sender:");
        sender.printAllInfo();

        System.out.println("recipient:");
        recipient.printAllInfo();
        System.out.println("Content: " + content);;
    }
}
