package automationSchool.lesson3.ch1_OopIntro;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();

        System.out.println("bmw number: " +bmw.getNumber());
        System.out.println("bmw color: " +bmw.color);
        System.out.println("bmw hp: " +bmw.powerInHP);
        System.out.println();

        System.out.println("audi number: " +audi.getNumber());
        System.out.println("audi color: " +audi.color);
        System.out.println("audi hp: " +audi.powerInHP);

        audi.color = "Red";
        System.out.println();
        System.out.println("changing audi color...");

        System.out.println("bmw number: " +bmw.getNumber());
        System.out.println("bmw color: " +bmw.color);
        System.out.println("bmw hp: " +bmw.powerInHP);

        System.out.println();
        System.out.println("audi number: " +audi.getNumber());
        System.out.println("audi color: " +audi.color);
        System.out.println("audi hp: " +audi.powerInHP);


        bmw.update();
        System.out.println();
        System.out.println("changing bmw number to 4");


        System.out.println("bmw number: " +bmw.getNumber());
        System.out.println("bmw color: " +bmw.color);
        System.out.println("bmw hp: " +bmw.powerInHP);

        System.out.println();
        System.out.println("audi number: " +audi.getNumber());
        System.out.println("audi color: " +audi.color);
        System.out.println("audi hp: " +audi.powerInHP);

    }

}
