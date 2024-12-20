package org.example.operaciones_002_terminales;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MetodosBusqueda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 3, 43, 5, 63, 73, 83, 93);

        // findFirst: Encuentra el primer elemento que cumple la condición
        Optional<Integer> numeroPar = numbers.stream()
                .filter(n -> n % 2 == 0) // Filtra números pares
                .findFirst();

        System.out.println("findFirst: " + numeroPar.orElse(-1));

        // findAny: Encuentra cualquier elemento que cumple la condición y pero no envies un -1 sino un mensaje de que no hay pares
        Optional<Integer> cualquierNumeroPar = numbers.stream()
                .filter(n -> n % 2 == 0) // Filtra números pares
                .findAny();
        System.err.println(cualquierNumeroPar.isPresent() ? "Par: " + cualquierNumeroPar : "No hay números pares");


        // allMatch: Verifica si todos los elementos cumplen la condición
        boolean positivos = numbers.stream()
                .allMatch(n -> n > 0); // Verifica si todos son positivos
        System.out.println("allMatch (all positive): " + positivos);

        // anyMatch: Verifica si al menos un elemento cumple la condición
        boolean existeMayoresQueCinco = numbers.stream()
                .anyMatch(n -> n > 5); // Verifica si alguno es mayor a 5
        System.out.println("anyMatch (any > 5): " + existeMayoresQueCinco);

        // noneMatch: Verifica si ningún elemento cumple la condición
        boolean existeNegativos = numbers.stream()
                .noneMatch(n -> n < 0); // Verifica si ninguno es negativo
        System.out.println("Hay elemento nagtivos: " + existeNegativos);
    }
}
