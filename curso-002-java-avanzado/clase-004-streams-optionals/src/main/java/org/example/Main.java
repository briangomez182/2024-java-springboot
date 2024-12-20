package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "John", "Jake");

        // filter: Filtra elementos que cumplen una condición
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J")) // Filtra nombres que comienzan con 'J'
                .collect(Collectors.toList());
        System.out.println("filter: " + filteredNames);

        // map: Transforma cada elemento en otro
        List<Integer> nameLengths = names.stream()
                .map(String::length) // Transforma cada nombre en su longitud
                .collect(Collectors.toList());
        System.out.println("map: " + nameLengths);

        // flatMap: Descompone estructuras complejas (varias listas dentro de una lista) en un único Stream
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(List::stream) // Combina listas internas en un único Stream
                .collect(Collectors.toList());
        System.err.println("flatMap: " + flatList);

        // distinct: Elimina duplicados
        List<String> distinctNames = names.stream()
                .distinct() // Elimina nombres duplicados
                .collect(Collectors.toList());
        System.out.println("distinct: " + distinctNames);

        // sorted: Ordena los elementos
        List<String> sortedNames = names.stream()
                .sorted() // Ordena alfabéticamente
                .collect(Collectors.toList());
        System.out.println("sorted: " + sortedNames);
    }
}