package HomeWork.MovieLibrary;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    private ArrayList<Movie> movies;

    public MovieLibrary(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
}
