package org.example.codigo_002_metodoReferencia;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Referencia {

    private List<Integer> numeros;

    // Constructor que recibe una lista de números
    public Referencia(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void imprimirElementos() {
        numeros.forEach(System.out::println);
    }

    public void sumarElementos() {
        //0, que es el valor con el que se comenzará la suma.
        //segundo parametro la operacion
        int valor = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma total: " + valor);
    }

    public void encontrarMaximo() {
        int valor = numeros.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Valor Max: " + valor);
    }

    public void encontrarMinimo() {
        int valor = numeros.stream()
                    .min(Integer::compare)
                    .orElse(0);
        System.out.println("Valor Min: " + valor);
    }

}