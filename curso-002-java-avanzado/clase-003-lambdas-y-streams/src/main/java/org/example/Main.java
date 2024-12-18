package org.example;

import org.example.codigo_001_lambdas.Lambdas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 22,22,22);

        // Crear una instancia de LambdasClaseEjemplo,
        Lambdas misLambdas = new Lambdas(listaNumeros);

      // misLambdas.imprimirElementos();        // Imprime todos los elementos

      //  misLambdas.filtrarPares();             // Filtra los números pares

      //  misLambdas.elevarAlCuadrado();         // Eleva los números al cuadrado

       //  misLambdas.sumarElementos();            // Suma todos los elementos

      //  misLambdas.encontrarMaximo();           // Encuentra el número máximo

      //  misLambdas.encontrarMinimo();           // Encuentra el número mínimo

      //  misLambdas.contarMayoresQueCinco();     // Cuenta los números mayores que 5

      //  misLambdas.ordenarDescendente();        // Ordena la lista en orden descendente

        misLambdas.eliminarDuplicados();        // Elimina los números duplicados

        misLambdas.saltarPrimerosCinco();       // Salta los primeros 5 elementos*/

    }
}
