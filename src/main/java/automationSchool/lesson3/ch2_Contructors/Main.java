package automationSchool.lesson3.ch2_Contructors;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("blue", 300);


        bmw.name = "xx";
        bmw.printAllInfo();
        System.out.println(bmw);

        bmw = new Car("yellow", 1000);
        bmw.printAllInfo();
        System.out.println(bmw);



//        System.out.println("bmw");
//        bmw.printAllInfo();
//
//        System.out.println("audi");
//        audi.printAllInfo();
//
//        audi.color = "RED!!!";
//
//        System.out.println("bmw");
//        bmw.printAllInfo();
//
//        System.out.println("audi");
//        audi.printAllInfo();
//
//        bmw.updateCar("yellow");
//
//        System.out.println("bmw");
//        bmw.printAllInfo();
//
//        System.out.println("audi");
//        audi.printAllInfo();
    }

}
