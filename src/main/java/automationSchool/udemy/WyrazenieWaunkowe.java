package automationSchool.udemy;

public class WyrazenieWaunkowe {

    public static void main(String[] args) {
        /*
            wyrażenie ? tu piszemy co ma sie stac jesli wyrazenie to true : co ma sie stac jesli wyrazenie jest false;
            
        */
        
        int x = 5;
//        
//        if (x % 2 == 0)
//            System.out.println("parzysta");
//        else
//            System.out.println("nieparzysta");
//        
        
        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        
        System.out.println(czyParzysta);
            
    }
    
}
