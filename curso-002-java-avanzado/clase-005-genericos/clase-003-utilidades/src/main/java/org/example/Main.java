package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // Arrays.sort
            int[] numeros = {5, 2, 8, 1, 6};
            Arrays.sort(numeros);
            System.out.println("Array ordenado: " + Arrays.toString(numeros));



            // Arrays.binarySearch
            int indice = Arrays.binarySearch(numeros, 6);
            System.out.println("Índice de 6: " + indice);



            // Collections.sort
            List<String> nombres = new ArrayList<>(Arrays.asList("Juan", "Ana", "Carlos", "Luis"));
            Collections.sort(nombres);
            System.out.println("Lista ordenada: " + nombres);



            // Collections.reverse
            Collections.reverse(nombres);
            System.out.println("Lista invertida: " + nombres);



            // tokenizer.hasMoreTokens
            String texto = "Hola, ¿cómo estás?";
            StringTokenizer tokenizer = new StringTokenizer(texto);
            while (tokenizer.hasMoreTokens()) {
                System.out.println("Token: " + tokenizer.nextToken());
            }

            

        // Pattern y Matcher
        //esta línea crea un patrón que busca una o más apariciones de dígitos (números del 0 al 9).
        Pattern patron = Pattern.compile("[0-9]+");
        //esta línea crea un objeto que intentará encontrar el patrón dentro de la cadena "456".
        Matcher matcher = patron.matcher("456");
        //esta linea busca en el objeto macher si hay coincidencias con el valor ingresado, devuelve un booleano
        boolean esNumero = matcher.matches();
        System.out.println("Es un número: " + esNumero);
    }
}
