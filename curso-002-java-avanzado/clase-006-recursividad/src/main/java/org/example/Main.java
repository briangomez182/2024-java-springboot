package org.example;


import org.example.entitities.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de películas
        List<Movie> listadoMovies = new ArrayList<>();
        listadoMovies.add(new Movie(1, "Inception", 8.8, 5, 148));
        listadoMovies.add(new Movie(2, "Interstellar", 8.6, 7, 169));
        listadoMovies.add(new Movie(3, "The Dark Knight", 9.0, 8, 152));
        listadoMovies.add(new Movie(4, "Dunkirk", 7.9, 3, 106));

        // Calcular promedio de rating
        double promedio = Movie.calcularPromedioRating(listadoMovies, 0, 0);
        System.out.println("Promedio de ratings: " + promedio);

        // Buscar película por título
        String tituloBuscado = "Interstellar";
        Movie peliculaEncontrada = Movie.buscarPeliculaPorTitulo(listadoMovies, 0, tituloBuscado);

        String respuestas = peliculaEncontrada != null ? "Película encontrada: " + peliculaEncontrada : "Película no encontrada.";

        System.out.println(respuestas);

        //Buscar película por título FOR
        Movie peliculaEncontradaFor = Movie.buscarPeliculaPorTituloFor(listadoMovies, tituloBuscado);
        respuestas = peliculaEncontradaFor != null ? "Película encontrada: " + peliculaEncontradaFor : "Película no encontrada.";

        System.out.println(respuestas);

        //Buscar película por título Stream
        Movie peliculaEncontradaStream = Movie.buscarPeliculaPorTituloStream(listadoMovies, "Inception");
        respuestas = peliculaEncontradaStream != null ? "Película encontrada: " + peliculaEncontradaStream : "Película no encontrada.";

        System.out.println(respuestas);







    }
}