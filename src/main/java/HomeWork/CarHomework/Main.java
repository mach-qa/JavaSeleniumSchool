package HomeWork.CarHomework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Collection of countries
        Country korea = new Country("Korea", 'K');
        Country germany = new Country("Germany", 'G');
        Country france = new Country("France", 'F');
        Country poland = new Country("Poland", 'P');
        Country sweden = new Country("Sweden", 'S');

        //Created list of countries
        List<Country> asiaCountries = List.of(korea, sweden);
        List<Country> westEuropeCountries = List.of(france, germany);
        List<Country> middleEuropeCountries = List.of(poland, sweden);
        List<Country> europeCountries = List.of(poland, sweden, germany, france);
        List<Country> allCountries = List.of(poland, sweden, germany, france, korea);

        //Created list of Markets
        Market truckMarket = new Market("truck", asiaCountries);
        Market customerMarket = new Market("customer", europeCountries);
        Market westEuropeMarket = new Market("West Europe", westEuropeCountries);
        Market middleEuropeMarket = new Market("Middle Europe", middleEuropeCountries);
        Market worldMarket = new Market("Car", allCountries);

        //Collection of Dimensions
        Dimension dimension1 = new Dimension(145, 120, 60);
        Dimension dimension2 = new Dimension(320, 160, 350);
        Dimension dimension3 = new Dimension(220, 145, 85);
        Dimension dimension4 = new Dimension(312, 185, 366);
        Dimension dimension5 = new Dimension(120, 115, 44);
        Dimension dimension6 = new Dimension(129, 136, 55);
        Dimension dimension7 = new Dimension(156, 168, 289);
        Dimension dimension8 = new Dimension(189, 200, 299);
        Dimension dimension9 = new Dimension(199, 120, 124);
        Dimension dimension10 = new Dimension(200, 99, 255);

        //List of Dimensions
        ArrayList<Dimension> smallCars = new ArrayList<>(Arrays.asList(dimension5, dimension6));
        ArrayList<Dimension> sedanCars = new ArrayList<>(Arrays.asList(dimension1, dimension7));
        ArrayList<Dimension> combiCars = new ArrayList<>(Arrays.asList(dimension8, dimension9));
        ArrayList<Dimension> suvCars = new ArrayList<>(Arrays.asList(dimension3, dimension10));
        ArrayList<Dimension> truckCars = new ArrayList<>(Arrays.asList(dimension2, dimension4));

        //Collection of Producers
        Producent producer1 = new Producent("Kia", "Stinger");
        Producent producer2 = new Producent("Kia", "XCeed");
        Producent producer3 = new Producent("Opel", "Astra");
        Producent producer4 = new Producent("Opel", "Insignia");
        Producent producer5 = new Producent("Peugeot", "308");
        Producent producer6 = new Producent("Peugeot", "4007");
        Producent producer7 = new Producent("BMW", "X7");
        Producent producer8 = new Producent("BMW", "M3");
        Producent producer9 = new Producent("Volvo", "S60");
        Producent producer10 = new Producent("Volvo", "XC90");

        //Collection of Cars
        ArrayList<Car> allCars = new ArrayList<>();
        allCars.add(new Car(producer1, true, truckMarket, "premium", sedanCars));
        allCars.add(new Car(producer2, false, middleEuropeMarket, "standard", combiCars));
        allCars.add(new Car(producer2, true, customerMarket, "standard", sedanCars));
        allCars.add(new Car(producer3, false, worldMarket, "medium", smallCars));
        allCars.add(new Car(producer3, false, westEuropeMarket, "premium", truckCars));
        allCars.add(new Car(producer7, true, worldMarket, "premium", truckCars));
        allCars.add(new Car(producer8, true, truckMarket, "medium", suvCars));
        allCars.add(new Car(producer6, false, westEuropeMarket, "standard", smallCars));
        allCars.add(new Car(producer10, false, middleEuropeMarket, "standard", combiCars));
        allCars.add(new Car(producer4, true, customerMarket, "medium", suvCars));
        allCars.add(new Car(producer4, true, westEuropeMarket, "premium", suvCars));
        allCars.add(new Car(producer9, true, middleEuropeMarket, "standard", truckCars));
        allCars.add(new Car(producer5, false, worldMarket, "premium", combiCars));
        allCars.add(new Car(producer6, false, customerMarket, "medium", sedanCars));
        allCars.add(new Car(producer7, true, worldMarket, "medium", suvCars));


        for (Car filteredCar : allCars) {
            if (filteredCar.getProducer().getModel().equals("BMW")
                    && filteredCar.isAutomaticGear() == true
                    && filteredCar.getDimension().get(1).getTrunkCapacity() > 300) {
                for (int i = 0; i < filteredCar.getMarket().getCountries().size(); i++) {
                    Country marketCountry = filteredCar.getMarket().getCountries().get(i);
                    System.out.println("Country: " + marketCountry.getCountryName() + "-" + marketCountry.getCountrySign());
                }

//                ArrayList<Car> newList = new ArrayList<>();
//                for (Car element : allCars) {
//                    if (!newList.contains(element)) {
//                        newList.add(element);
//                    }
//                }

                //for (int i = 0; i < 3; i++){
                //Country marketCountry = filteredCar.market.getCountries().get(i);
                //System.out.println("Country from the market: " + myCar.market.getName());
                //myCar.market.printCountry(marketCountry);
            }
        }
    }
}




        /*
        private static void ArrayList (ArrayList <String> arrayList) {}

        list.stream().filter(p -> p.getName()endsWith("o"))
                     .collect(Collectors.toList();
        */



        //cars. add(new Car(xxx,xxx,xxx));

        /*
        int counter = 0;
        for (Car c:cars) {
        if c.getProducent().equals("Toyota)) {
        if c.getYear() < 2015 {
        if (c.getColor().equals("Red") {
        }
        }
        }
         */

        //System.out.println(Workshop.allCars.get(2));


