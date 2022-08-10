package automationSchool.lesson3.ch1_OopIntro;

public class Car {
    public static int number = 1;
    public String color= "blue";
    public int powerInHP = 300;

    public void drive(){
        System.out.println("I'm driving....");
    }

    public void update(){
        number = 4;
    }

    public int getNumber(){
        return number;
    }
}
