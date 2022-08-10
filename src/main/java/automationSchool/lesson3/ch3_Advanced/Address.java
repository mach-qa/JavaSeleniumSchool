package automationSchool.lesson3.ch3_Advanced;

public class Address {
    String zipCode;
    String street;

    public Address(String zipCode, String street) {
        this.zipCode = zipCode;
        this.street = street;
    }

    public void printAllInfo(){
        System.out.println("address: " + zipCode + " " + street);
    }
}
