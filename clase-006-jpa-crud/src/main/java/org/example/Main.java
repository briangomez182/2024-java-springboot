package org.example;

import org.example.controllers.MovieController;
import org.example.entities.Movie;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();

        //HACER UN CRUD
        //CREAR UNA PELICULA
        Movie nuevaPelicula = new Movie(null, "Alberto", 6.5, 7, LocalDateTime.of(1990,2,5,0,0), 110);
        movieController.create(nuevaPelicula);

        //BUSCAR UNA PELICULA
        Integer idBuscado = 5;
        movieController.findOne(idBuscado);

        //BUSCAR TODAS LAS PELICULAS
        movieController.findAll();

        //ACTUALIZAR UNA PELICULAS
        Movie actualizarPelicula = movieController.findOne(5);
        actualizarPelicula.setTitle("Nuevo titulo");
        movieController.update(actualizarPelicula);

        //ELIMINAR UNA PELICULAS
        Integer idEliminar = 5;
        movieController.delete(idEliminar);
    }
}