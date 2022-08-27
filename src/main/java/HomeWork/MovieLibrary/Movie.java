package HomeWork.MovieLibrary;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String movieTitle;
    private int dateOfDistribution;
    private String genre;
    private Director director;
    private ArrayList<Actor> listOfMovieActors;

    public void addActorToMovie (Actor actor) {
        this.listOfMovieActors.add(actor);

    }

    public Movie(String movieTitle, int dateOfDistribution, String genre, Director director, ArrayList<Actor> listOfMovieActors) {
        this.movieTitle = movieTitle;
        this.dateOfDistribution = dateOfDistribution;
        this.genre = genre;
        this.director = director;
        this.listOfMovieActors = listOfMovieActors;
    }

    public Movie(){

    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", dateOfDistribution='" + dateOfDistribution + '\'' +
                ", genre='" + genre + '\'' +
                ", director=" + director +
                ", listOfMovieActors=" + listOfMovieActors +
                '}';
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getDateOfDistribution() {
        return dateOfDistribution;
    }

    public void setDateOfDistribution(int dateOfDistribution) {
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


