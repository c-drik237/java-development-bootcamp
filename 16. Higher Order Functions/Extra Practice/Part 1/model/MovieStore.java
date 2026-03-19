package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {

    private List<Movie> movies;

    public MovieStore() {
    this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<Movie> filterByGenre(String genre){
        movies.stream()
            .filter(movie -> movie.getGenre(genre))
            .toList();
    }

    public List<Movie> sortByReleaseYear (){
        movies.stream()
            .sorted((x, y) -> x.compareTo(y))
            .toList();
    }
}
