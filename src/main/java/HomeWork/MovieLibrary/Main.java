package HomeWork.MovieLibrary;

import HomeWork.MovieLibrary.Helpers.Json;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static HomeWork.MovieLibrary.Helpers.Json.getDefaultObjectMapper;
import static HomeWork.MovieLibrary.Helpers.Printer.printMenu;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

//        File jsonFile = new File("src/main/resources/movies.json");
//        ObjectMapper mapper = getDefaultObjectMapper();
//        List<MovieLibrary> listOfMovies = mapper.readValue(jsonFile, new TypeReference<>() {});

        ArrayList<Movie> movieList = new ArrayList<>();

        Actor actor1 = new Actor ("Jim", "Carrey");
        Actor actor2 = new Actor ("Tom", "Hanks");
        Actor actor3 = new Actor ("Natascha", "McElhone");
        Actor actor4 = new Actor ("Ed", "Haris");
        Actor actor5 = new Actor ("Gary", "Sinise");
        Actor actor6 = new Actor ("Michael", "Duncan");
        Actor actor7 = new Actor ("Bruce", "Willis");
        Actor actor8 = new Actor ("Mickey", "Rourke");

        ArrayList<Actor> actorsOfTrumanShow = new ArrayList<>(Arrays.asList(actor1, actor3, actor4));
        ArrayList<Actor> actorsOfApollo13 = new ArrayList<>(Arrays.asList(actor2,actor4, actor5));
        ArrayList<Actor> actorsOfTheGreenMile = new ArrayList<>(Arrays.asList(actor2,actor5, actor6));
        ArrayList<Actor> actorsOfSinCity = new ArrayList<>(Arrays.asList(actor6,actor7,actor8));
        ArrayList<Actor> actorsOfTheExpendables = new ArrayList<>(Arrays.asList(actor8, actor7,actor5));

        movieList.add(new Movie("Sin City", 2005, "Criminal", new Director ("Robert", "Rodriguez"), actorsOfSinCity));
        movieList.add(new Movie("Apollo 13", 1994, "Comedy", new Director ("Tom", "Shadyac"), actorsOfApollo13));
        movieList.add(new Movie("Truman Show", 1998, "Drama", new Director("Peter", "Weir"), actorsOfTrumanShow));
        movieList.add(new Movie("The Green Mile", 2000, "Sci-fi", new Director("Frank", "Darabont"),actorsOfTheGreenMile));
        movieList.add(new Movie("The Expendables", 2010, "Action", new Director("Sylvester", "Stallone"),actorsOfTheExpendables));


        printMenu();
        int option = scanner.nextInt();

        switch(option) {
            case 1: {
                System.out.println("Please provide first year");
                int firstYear = scanner.nextInt();
                System.out.println("Please provide second year");
                int secondYear = scanner.nextInt();

                for ( Movie movie : movieList ) {
                    if (firstYear <= movie.getDateOfDistribution() && movie.getDateOfDistribution() <= secondYear); {
                        System.out.println(movie.getMovieTitle());
                    }
                }
            }
            case 2: {
                Random random = new Random();
                System.out.println(movieList.get(random.nextInt(movieList.size())));
            }
            case 3: {


            }

        }


    }

    //ArrayList<Movie> movieList = new ArrayList<>();

    //movieList.add(new Movie("Matrix", "07-02-2000", "action", new Director ("Wachowski", "John"), new ArrayList<>() ));
}
