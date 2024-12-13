package org.example;

import org.example.controllers.MovieController;
import org.example.entities.Movie;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();

        //HACER UN CRUD
        //CREAR UNA PELICULA
        /*Movie nuevaPelicula = new Movie(null, "Nueva Pelicula", 6.5, 7, LocalDateTime.of(1990,2,5,0,0), 110, 5);
        movieController.create(nuevaPelicula);*/

        //BUSCAR UNA PELICULA
       /* Integer idBuscado = 4;
        Movie movieEncontrada = movieController.findOne(idBuscado);
        System.out.println(movieEncontrada);*/


        //BUSCAR TODAS LAS PELICULAS
        /*List<Movie> todasLasPeliculas = movieController.findAll();
        for (Movie movie: todasLasPeliculas) {
            System.out.println(movie.toString());
        }*/

        //ACTUALIZAR UNA la PELICULA 5 y ACTUALIZARLA A "VOLVER AL FUTURO"
       /* Movie actualizarPelicula = movieController.findById(5);
        actualizarPelicula.setTitle("Volver al Futuro 2");
        movieController.update(actualizarPelicula);*/

        //ELIMINAR UNA PELICULAS
        Integer idEliminar = 6;
        movieController.delete(idEliminar);
    }
}