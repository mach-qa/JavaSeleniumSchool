package HomeWork.CarHomework;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Collection of countries
        Country korea = new Country("Korea",'K');
        Country germany = new Country("Germany", 'G');
        Country france = new Country("France", 'F');
        Country poland = new Country("Poland", 'P');
        Country sweden = new Country("Sweden", 'S');

        //Adding countries into List
        //List<Country> eu = List.as (poland);


        //Collection of Markets
        //Market market1 = new Market("EU", (List<Country>) poland);


        //Collection of Dimensions
        Dimension dimension1 = new Dimension (145, 120, 60);
        Dimension dimension2 = new Dimension (320, 160, 350);
        Dimension dimension3 = new Dimension (220, 145, 85);
        Dimension dimension4 = new Dimension (312, 185, 366);
        Dimension dimension5 = new Dimension (120, 115, 44);
        Dimension dimension6 = new Dimension (129, 136, 55);
        Dimension dimension7 = new Dimension (156, 168, 289);
        Dimension dimension8 = new Dimension (189, 200, 299);
        Dimension dimension9 = new Dimension (199, 120, 124);
        Dimension dimension10 = new Dimension (200, 99, 255);

        //Collection of Producents
        Producent producent1 = new Producent ("Kia", "Stinger");
        Producent producent2 = new Producent ("Kia", "XCeed");
        Producent producent3 = new Producent ("Opel", "Astra");
        Producent producent4 = new Producent ("Opel", "Insignia");
        Producent producent5 = new Producent ("Peugeot", "308");
        Producent producent6 = new Producent ("Peugeot", "4007");
        Producent producent7 = new Producent ("DAF", "XF");
        Producent producent8 = new Producent ("DAF", "CF");
        Producent producent9 = new Producent ("Volvo", "S60");
        Producent producent10 = new Producent ("Volvo", "XC90");

        //Collection of Cars
        //Car car1 = new Car (producent1, true, , standard, 1);

        System.out.println();

    }
}
