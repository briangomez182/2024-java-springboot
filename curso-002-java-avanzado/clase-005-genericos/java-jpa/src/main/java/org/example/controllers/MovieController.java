package org.example.controllers;

import org.example.entities.Movie;
import org.example.persistence.MovieJPA;

import java.util.List;

public class MovieController {

    MovieJPA movieJPA = new MovieJPA();
    public void create(Movie nuevaPelicula) {
        movieJPA.create(nuevaPelicula);
    }

    public Movie findOne(Integer idBuscado) {
       return movieJPA.findOne(idBuscado);
    }

    public List<Movie> findAll() {
        return movieJPA.findAll();
    }

    public void update(Movie actualizarPelicula) {
        movieJPA.update(actualizarPelicula);
    }

    public void delete(Integer idEliminar) {
        movieJPA.delete(idEliminar);
    }
}
