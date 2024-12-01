package org.example;

import org.example.entity.Movie;
import org.example.service.MovieService;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Servicio CRUD
        MovieService service = new MovieService();

        //Create
        Movie newMovie = new Movie();
        newMovie.setTitle("Bambi");
        newMovie.setAwards(7);
        newMovie.setRating(2.5);
        newMovie.setRelease_date(LocalDateTime.of(2000,1,1,0,0));
        newMovie.setLength(120);

        service.create(newMovie);

        // READ: Find all
       /* List<Movie> movies = service.findAll();
        System.out.println("All Products:");
        movies.forEach( movie -> System.out.println(movie.toString()));*/
    }
}