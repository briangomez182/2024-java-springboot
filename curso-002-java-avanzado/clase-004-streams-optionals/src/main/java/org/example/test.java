package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 15,24,null,null);

        numeros.stream()
                .filter(num -> num >= 25) // Evita null y filtra mayores a 25
                .forEach(num -> System.out.println("Número mayor a 25: " + num));


    }
}
