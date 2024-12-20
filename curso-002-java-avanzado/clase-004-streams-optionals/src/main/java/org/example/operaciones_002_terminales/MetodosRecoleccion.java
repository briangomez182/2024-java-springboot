package org.example.operaciones_002_terminales;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MetodosRecoleccion {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Alicia", "Brian", "carlos", "David", "Alicia", "Ever");

        // collect: Recolecta los elementos en una estructura mutable (como lista o mapa)
        List<String> distintos = nombres.stream()
                .distinct() // Elimina duplicados
                .collect(Collectors.toList()); // Recolecta en una lista
        System.out.println("Listado: " + distintos);



        //Map: Agrupa por la longitud de las cadenas, palabras de 4 caractes con los de 4, las de 5 con los de 5
        Map<Integer, List<String>> agrupados = nombres.stream()
                .collect(Collectors.groupingBy(String::length)); // Aqui le asigna la longitd a la clave
        System.out.println("Agrupados por la longitud: " + agrupados);



        // toArray: Convierte los elementos del Stream en un arreglo
        String[] namesArray = nombres.stream()
                .toArray(String[]::new); // Convierte a un arreglo de String
        System.out.println(  Arrays.toString(namesArray) );



        // reduce: Combina todos los nombres usando una función acumuladora y guardandolo en un string
        String concatenatedNames = nombres.stream()
                .reduce("Valor Inicial ", (valorPrevio, valorPosterior) -> valorPrevio + valorPosterior + "--> "); // Acumula los nombres en una sola cadena


        System.err.println("Reduccion de nombres: " + concatenatedNames);

        // Elimina la última coma y espacio
       /*if (!concatenatedNames.isEmpty()) {
            concatenatedNames = concatenatedNames.substring(0, concatenatedNames.length() - 4);
        }

        System.err.println("Reduccion de nombres: " + concatenatedNames);*/
    }
}
