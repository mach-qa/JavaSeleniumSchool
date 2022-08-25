package HomeWork.MovieLibrary;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String movieTitle;
    private String dateOfDistribution;
    private String genre;
    private Director director;
    private ArrayList<Actor> listOfMovieActors;

    public void addActorToMovie (Actor actor) {
        this.listOfMovieActors.add(actor);

    }

    public Movie(String movieTitle, String dateOfDistribution, String genre, Director director, ArrayList<Actor> listOfMovieActors) {
        this.movieTitle = movieTitle;
        this.dateOfDistribution = dateOfDistribution;
        this.genre = genre;
        this.director = director;
        this.listOfMovieActors = listOfMovieActors;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDateOfDistribution() {
        return dateOfDistribution;
    }

    public void setDateOfDistribution(String dateOfDistribution) {
        this.dateOfDistribution = dateOfDistribution;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfMovieActors() {
        return listOfMovieActors;
    }

    public void setListOfMovieActors(ArrayList<Actor> listOfMovieActors) {
        this.listOfMovieActors = listOfMovieActors;
    }
}


