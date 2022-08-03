package automationSchool.udemy;

public class InstrukcjeWarunkowe {


    public static void main(String[] args) {
        /* 
          true false
          INSTRUKCJE WARUNKOWE
            
            if (WYRAŻENIE)
                instrukcja;
            else
                instrukcja;
        */
        int a = 2,
            b = 5;
        
       if (a > b)
            System.out.println("a > b");
       else if (a < b)
       {
            System.out.println("a < b");  
            System.out.println("tak to działa");
       }
       else
       {
            System.out.println("a == b");
            System.out.println("lala");
       }
      
      
       
    }
    
}
