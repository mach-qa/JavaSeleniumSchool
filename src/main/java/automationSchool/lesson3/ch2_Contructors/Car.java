package automationSchool.lesson3.ch2_Contructors;

public class Car {
    public String name;
    public String color;
    public int powerInHP;

    public Car() {
    }

    public void updateCar(String color){
        this.color = color;
        powerInHP+=80;
    }

    public Car(String color, int powerInHP) {
        this.color = color;
        this.powerInHP = powerInHP;
    }

    public void drive() {
        System.out.println("I'm driving, usign: " + powerInHP + " HP");
    }

    public void printAllInfo(){
        System.out.println("Color " + color + " power: " + powerInHP + " name: " + name);
    }

}
