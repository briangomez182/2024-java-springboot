package org.example.entitities;

import java.util.List;
import java.util.Optional;

public class Movie {
    private int idMovie;
    private String title;
    private double rating;
    private int awards;
    private int length; // Duración en minutos

    // Constructor
    public Movie(int idMovie, String title, double rating, int awards, int length) {
        this.idMovie = idMovie;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    // Método recursivo para calcular el promedio de rating
    public static double calcularPromedioRating(List<Movie> listaMovies, int indice, double suma) {
        if (indice == listaMovies.size()) { // Caso base: hemos recorrido toda la lista
            return suma / listaMovies.size();
        }
        // Llamada recursiva: sumar el rating actual y avanzar al siguiente índice
        return calcularPromedioRating(listaMovies, indice + 1, suma + listaMovies.get(indice).getRating());
    }






    // Método recursivo para buscar una película por título
    public static Movie buscarPeliculaPorTitulo(List<Movie> listaMovies, int index, String tituloBuscado) {
        if (index == listaMovies.size()) { // Caso base: no encontramos la película
            return null;
        }
        if (listaMovies.get(index).getTitle().equalsIgnoreCase(tituloBuscado)) { // Película encontrada
            return listaMovies.get(index);
        }
        // Llamada recursiva: buscar en el siguiente índice
        return buscarPeliculaPorTitulo(listaMovies, index + 1, tituloBuscado);
    }





    

    public static Movie buscarPeliculaPorTituloFor(List<Movie> listaMovie, String tituloBuscado) {
        for (Movie movie: listaMovie) 
            if (movie.getTitle().equalsIgnoreCase(tituloBuscado)) 
                return movie;
        return null;
    }

    public static Movie buscarPeliculaPorTituloStream(List<Movie> listaMovie, String tituloBuscado) {
        Optional<Movie> peliculaEncontrada = listaMovie.stream().filter(movie -> movie.getTitle().equalsIgnoreCase(tituloBuscado)).findFirst();
        if (peliculaEncontrada.isPresent()) 
            return peliculaEncontrada.get();
        return null;

    }

    @Override
    public String toString() {
        return "Movie{idMovie=" + idMovie + ", title='" + title + "', rating=" + rating +
                ", awards=" + awards + ", length=" + length + "}";
    }
}