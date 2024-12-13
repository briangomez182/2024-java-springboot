package tiposDeDatosReferencia;

import tiposDeDatosReferencia.persona.Persona;

import java.util.ArrayList;
import java.util.List;

public class Referencia {
    public static void main(String[] args) {
        // String
        String nombre = "Juan Pérez";
        System.out.println("Mi nombre es: " + nombre);

        // Clase personalizada
        // 1. Crea un nuevo paquete llamado "persona"
        Persona persona = new Persona("Ana", 30);
        System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad);

        // Colecciones
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        System.out.println("Frutas: " + frutas);

        // Interfaz = este tipo de dato lo vamos a ver mas adelante bien detallado.

        // Enum
        DiaSemana dia = DiaSemana.SABADO;
        System.out.println("Hoy es: " + dia);
    }

}