package HomeWork.MovieLibrary;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        File jsonFile = new File("./src/main/resources/movies.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        MovieLibrary listOfMovies = mapper.readValue(jsonFile, MovieLibrary.class);

        System.out.println(listOfMovies);

//        File jsonFile = new File ("src/main/resources/movies.json");

//        MovieLibrary movieLibrary = mapper.readValue(jsonFile, MovieLibrary.class);

//        System.out.println(mapper.writerWithDefaultPrettyPrinter());
    }

    //ArrayList<Movie> movieList = new ArrayList<>();

    //movieList.add(new Movie("Matrix", "07-02-2000", "action", new Director ("Wachowski", "John"), new ArrayList<>() ));
}
