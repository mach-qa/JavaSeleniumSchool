package automationSchool.lesson2;

public class JavaLesson2 {
    public static void main(String[] args) {
        String name = "Piotr";
        int age = 33;
        boolean isManager = false;
        double salary = 10.500;
        long humanity = 7000000000L;
        Student Salma;
        String myBestFriend;
        myBestFriend = "";
        String browser = "Firefox";
        String driver;
        /*
        switch(browser){
            case "Chrome":
                driver ="Chrome.driver";
                System.out.println("Wybrałem Chrome drivera.");
                break;
            case "Firefox":
                driver ="Firefox.driver";
                System.out.println("Wybrałem Firefoxa");
                break;
            case "Edge":
                driver ="edge.driver";
                System.out.println("Wybrałem Edge drivera");
                break;
            default:
                System.out.println("Wybrałes przeglądarkę spoza listy");
        }
        */
        /*
        int liczbaMultiLotek[] = {38,1,2,3,4,5,6,7,8,9,10};
        int liczbyLotek[] = new int[6];
        liczbyLotek[0] = 1;
        liczbyLotek[1] = 2;
        liczbyLotek[2] = 3;
        liczbyLotek[3] = 4;
        liczbyLotek[4] = 5;
        liczbyLotek[5] = 6;
        System.out.println(liczbyLotek[5]);

        String rodzina[] = new String[4];
        rodzina[0] = "Janusz";
        rodzina[1] = "Grażynka";
        rodzina[2] = "Brajanek";
        rodzina[3] = "Halinka";
        System.out.println("Ilość członków rodziny: " + rodzina.length);



        for (String s : rodzina) {
            System.out.println(s + " Dolina Charlotty");
        */
        //-------------operator trójargumentowy
        int balance, interest;
        balance = 900;
        interest = (balance < 1000) ? 20 : 30;
        System.out.println("Balance = " + balance + " so Value of interest is : " + interest);

        interest = (balance > 1000) ? 20 : 30;
        System.out.println("Balance = " + balance + " so Value of interest is : " + interest);

//--------------------switch
//        var driver2 = Lekcja1JavaBasic.setDriver("Fsdf");
//
//
//        String driver = Lekcja1JavaBasic.setDriver("dddOperaDriver");
//        switch (driver) {
//
//            case "ChromeDriver":
//                //kod
//                System.out.println("chrome");
//                break;
//            case "OperaDriver":
//                //kod
//                System.out.println("opera");
//                break;
//            case "FirefoxDriver":
//                //kod
//                System.out.println("firefox");
//                break;
//
//            default:
//                //kod
//                System.out.println("domyslny - IE");

        //***********************************************  tablice  ***********
        int numbers[];
        numbers = new int[12]; // - alokuje miejsce w pamięci dla 12 liczb
        numbers[0] = 22;
        numbers[1] = 23;
        numbers[3] = 24;
        numbers[5] = 25;  // dodawnanie elementów
        System.out.println(numbers[5]);  // wypisanie wartosci
        String dni[] = {"poniedzialek", "wtorek", "sroda", "czwartek", "piątek"}; // deklaracja od razu z wartosciami
        Film films[] = new Film[2];
        films[0] = new Film();
        films[1] = new Film();      // tablica typu własnego - Film
        System.out.println("Rozmiar tablicy " + dni.length);

        System.out.println(dni);  //[Ljava.lang.String;@3498ed  miejsce w oamięci
        for (int i = 0; i < dni.length; i++) {
            System.out.println(dni[i]);       //iteracja po tablicy for
        }
        for (String dzien : dni) {
            System.out.println("W petli for each");
            System.out.println(dzien);                  //iteracja po tablicy for each
        }

        String szkolenie = "szkolenie z Seleniu + Java";   // typ łańcuchowy String jest przechowywany w tablicy
        System.out.println("długość stringa szkolenie: " + szkolenie.length());

        System.out.println("Znak na indeksie 1 to: " + szkolenie.charAt(2));   //k
/*
//zmienna typu char
        System.out.println(" ________________char____  https://ascii-code.net/   __________");
        char znak = '!';
        System.out.println(znak);
        char tablicaZnakow[] = {'a', 'g', '#', '*'};
        for (char c : tablicaZnakow) {
            System.out.println(c);
        }
        System.out.println("znak ASCI Y");
        char YznakASCI = 89;
        System.out.println(YznakASCI);

        System.out.println("znak ASCI @");
        char znakASCI_malpa = 64;
        System.out.println(znakASCI_malpa);

        System.out.println("znak ASCI %");
        char znakASCI_procent = 37;
        System.out.println(znakASCI_procent);


//3. **************************   kolekcje *****************
        List<Film> greatFilmsList = new ArrayList<>(); // Lista jest typem kolekcji. Trzeba Importowąc na górze pliku:
        //import java.util.*; Inne typy list: new LinkedList<>();
        greatFilmsList.add(new Film());  // dodawnaie elementu do listy. Zwraca true jesli udało się dodać obiekt do listy.
        List<Film> badFilmsList = new ArrayList<>();
        badFilmsList.add(new Film());
        badFilmsList.add(new Film());
        badFilmsList.add(new Film());           // druga kolekcja
        System.out.println("Rozmiar kolekcji greatFilsm: "+ greatFilmsList.size());  //1
        System.out.println("Rozmiar kolekcji badFils: "+ badFilmsList.size());  //3
        greatFilmsList.addAll(badFilmsList);
        System.out.println("Rozmiar kolekcji greatFilms po rozszerzeniu : "+ greatFilmsList.size());  //4
        badFilmsList.clear();  // usuwa wszystkie elementy z kolekcji
        System.out.println("Rozmiar kolekcji badFils po clear : "+ badFilmsList.size());

        System.out.println("Czy kolekcja jest pusta: " + badFilmsList.isEmpty());   // czy kolekcja jestpusta
        System.out.println("Czy kolekcja jest pusta: " + greatFilmsList.isEmpty());   // czy kolekcja jestpusta
        List<String> uczestnicy = new ArrayList<>();
        uczestnicy.add("Paulina");
        uczestnicy.add("Basia");
        uczestnicy.add("Sebastian");
        uczestnicy.add("Sebastian");                  //dodawanie bez indeksu
        uczestnicy.add(0, "Sebastian"); // dodawanie z indeksem
        System.out.println(uczestnicy.get(0));           // zwraca uczestnika z indeksem 0
        System.out.println("Indeks Pauliny: "+ uczestnicy.indexOf("Paulina"));  //zwraca indeks pierwszego wystąpienia, jełi nie ma obiektu to zwraca -1
        for (String uczestnik : uczestnicy) {
            System.out.println(uczestnik);            //iterowanie po kolekcji. Dopuszcza duplikaty.
        }
        System.out.println(uczestnicy.contains("Julita")); // czy w kolekcji jest Basia
        uczestnicy.remove("Basia"); //usuwa i zwraca true gdy zostanie usunięty
        String[] uczestnicyArray = uczestnicy.toArray(new String[10]); // zmiana kolekcji na Tablicę tego samego typu
        System.out.println(uczestnicyArray[0]); // paulina
        Set<String> uczestnicySet = new HashSet<>(); //set
        System.out.println(uczestnicySet.add("Paulina"));
        System.out.println(uczestnicySet.add("Sebastian"));
        System.out.println(uczestnicySet.add("Damdin"));
        System.out.println(uczestnicySet.add("Damdin")); //wstawia duplikat, false
        for (String u : uczestnicySet) {
            System.out.println("Zawartosc Set");
            System.out.println(u); //iterowanie po Set
        }
//Set<String> uczestnicy2Set = Set.of("Ajibola","Paulina", "Damdin", "Ajibola");
//System.out.println("Rozmiar drugiego seta" + uczestnicy2Set.size()); //Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: Ajibola
        Set<String> uczestnicy3Set = Set.of("Ajibola","Paulina", "Damdin", "Darek");
        System.out.println("Rozmiar drugiego seta: " + uczestnicy3Set.size()); //Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: Ajibola
// 4. ************ String
        String imie1 = "Darek";
        String imie2 = new String("Darek");
        String imie3 = "Darek";
        String imie4=imie3;
        System.out.println(imie3);
        imie3.toUpperCase();
        System.out.println(imie3); //String jest immutable. Trzeba przypisać do nowego stringa
        String imieToUpperCase = imie3.toUpperCase();
        System.out.println(imieToUpperCase);
        imie3.toLowerCase(); // małe litery
        imie3.length(); // długosc stringa
        imie3.charAt(3); // znak na 3 indeksie
        System.out.println(imie3.contains("qek")); // czy jest taki substring
        System.out.println(imie3.indexOf("a")); //indeks litery a. Od zera
        String para = imie3.concat(" i Angelina"); //konkatenacja, to samo co +
        System.out.println(para);
//porównie stringów
        System.out.println(imie1 == imie3); //true, porównaie obiektów w pamięci
        System.out.println(imie1.equals(imie3)); //true, porónie zawartości
//konkatenacja z innymi typami
        System.out.println(2 + 2); //4
        System.out.println("wynik 2+2 = " + 2 + 2); // całość to string jeśli na poczatu jest string. Wtedy nie ma dodawnaia tyko konkatenaca
//toString - na przykładzie samochodu
        Car car = new Car("Toyota", 6, false);
        System.out.println(car); //Car@21bcffb5 - gdy nie ma metody toString. Trzeba dopisać w klasie. gdy jest: Car{producent='Toyota', biegi=6, isElectric=false}
        }
    //5. Operacje matematyczne
    String strLiczba = "1983";
    //string na liczbe
    int intLiczba = Integer.parseInt(strLiczba);  //zamiana string na integer
System.out.println(intLiczba);

    double dblLiczba = Double.parseDouble(strLiczba);
System.out.println(dblLiczba);
    //liczba na string
    int intNumer = 1983;
    double dblNumer = 1983.00;

    String strNumerDBL = Double.toString(dblNumer);
System.out.println(strNumerDBL);
    String strNumerINT = Integer.toString(intNumer);
System.out.println(strNumerINT);


//sprawdzanie typu zmiennej
System.out.println(strLiczba.getClass().getSimpleName());   // sprawdzanie typu String
System.out.println(((Object)intLiczba).getClass().getSimpleName());   // sprawdzanie typu Integer, potrzebne castowanie na Object
    //instance of
    boolean b = strLiczba instanceof String? true: false;
System.out.println(b);    //true
    Integer integerLiczba = new Integer(1983);
    boolean c = integerLiczba instanceof Integer? true: false;
System.out.println(c);    //true
//Zadanie domowe - tokenGenerator
 */
    }
}