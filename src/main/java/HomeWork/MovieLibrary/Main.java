package HomeWork.MovieLibrary;

import HomeWork.MovieLibrary.Models.MovieLibrary;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static HomeWork.MovieLibrary.Helpers.Printer.printMenu;
import static HomeWork.MovieLibrary.Models.MovieLibrary.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/movies.json");

        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<MovieLibrary> listOfMovies = mapper.readValue(jsonFile, new TypeReference<>() {
        });

        printMenu();
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> findAFilmsInDateRange();
            case 2 -> randomMovie();
            case 3 -> findActorMovies();
            case 4 -> {
                System.out.println("Thank you ! Have a nice day !");
                System.exit(0);
            }
        }
    }
}
