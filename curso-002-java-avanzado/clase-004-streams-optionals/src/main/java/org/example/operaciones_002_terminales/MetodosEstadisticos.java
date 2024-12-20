package org.example.operaciones_002_terminales;

import java.util.Arrays;
import java.util.List;

public class MetodosEstadisticos {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Alicia", "Brian", "carlos", "David", "Alicia", "Ever");

        // count: Cuenta el número de elementos en el Stream
        long count = nombres.stream().count(); // Cuenta el total de elementos
        System.out.println("Cantidad: " + count);

        // average: Calcula el promedio de la longitud de los nombres
        double promedioLongitud = nombres.stream()
                .mapToInt(String::length) // Convierte a IntStream con la longitud de cada nombre
                .average() // Calcula el promedio
                .orElse(0.0); // Maneja el caso de Stream vacío
        System.out.println("Average length: " + promedioLongitud);

        // sum: Suma la longitud de todos los nombres
        int sumaLongitud = nombres.stream()
                .mapToInt(String::length) // Convierte a IntStream con la longitud de cada nombre
                .sum(); // Suma todas las longitudes
        System.out.println("Total length: " + sumaLongitud);

        // forEach: Realiza una acción en cada elemento del Stream

        nombres.stream().forEach(name -> System.out.print(name + " ")); // Imprime cada nombre
    }
}
