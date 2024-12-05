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

        // TODO: 01/12/2024         Create
        Movie newMovie = new Movie(null, "Alberto", 6.5, 7, LocalDateTime.of(1990,2,5,0,0), 110);
       /* newMovie.setTitle("Juan");
        newMovie.setRating(6.5);
        newMovie.setAwards(6);
        newMovie.setRelease_date(LocalDateTime.of(1990,1,1,0,0));
        newMovie.setLength(120);*/

        service.create(newMovie);

        // TODO: 01/12/2024         FindByPK
      /*  Movie findMovie = service.findById(10);
        System.out.println("Found Product: " + findMovie.toString());*/

        // TODO: 01/12/2024         Find all
      /*  List<Movie> movies = service.findAll();
        for (Movie pelicula: movies ) {
            System.out.println(pelicula.toString());
        }*/

        // TODO: 01/12/2024         Update
      /*  Movie findMovieUpdate = service.findById(26);
        findMovieUpdate.setTitle("Nuevo titulo");
        service.update(findMovieUpdate);*/

        // TODO: 01/12/2024         Delete
        service.delete(25);

    }
}