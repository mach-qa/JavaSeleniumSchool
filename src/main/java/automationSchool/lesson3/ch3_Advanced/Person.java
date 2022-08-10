package automationSchool.lesson3.ch3_Advanced;

public class Person {
    String firstName;
    String lastName;
    Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public void printAllInfo(){
        System.out.println("first name: " + firstName + " " + "last name: " + lastName);
        address.printAllInfo();
    }
}
