package movies;

import java.util.Scanner;
import util.Input;


public class MoviesApplication {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.getMoviesByCategories(MoviesArray.findAll());
    }
}
