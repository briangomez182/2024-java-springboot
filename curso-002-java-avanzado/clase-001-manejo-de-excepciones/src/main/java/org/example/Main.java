package org.example;

import org.example.excepciones.BibliotecaExcepcion;
import org.example.excepciones.MiExcepcionPersonalizada;

public class Main {
    // TODO: 13/12/2024 OJO DEBES AGREGAR UN THROWS MiExcepcionPersonalizada 
    public static void main(String[] args) throws MiExcepcionPersonalizada, BibliotecaExcepcion {

        // NullPointerException: Intentar acceder a un objeto nulo
        /*String texto = null;
        System.out.println(texto.length());*/

        // ArrayIndexOutOfBoundsException: Acceso a un índice fuera de los límites de un arreglo
        /*int[] arreglo = new int[3];
        System.out.println(arreglo[5]);*/

        if (5 < 0) {
            throw new MiExcepcionPersonalizada("Valor negativo no permitido");
        }else {
            System.out.println("Es un Numero Positivo");
        }



        /*Biblioteca DEMO- pido la info de un formulario al usuario*/

        String titulo = "";
        String autor = "";
        Integer annio = 2020;

        if (titulo == null || titulo.isEmpty() || autor == null || autor.isEmpty() || annio < 0) {
            throw new BibliotecaExcepcion("Los datos del libro son inválidos.");
        }else{
            System.out.println("Libro guardado en la DB");
        }

    }
}