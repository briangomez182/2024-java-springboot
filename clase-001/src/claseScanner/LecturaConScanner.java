package claseScanner;

import java.util.Scanner;

public class LecturaConScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        System.out.print("Dame tu nombre completoo: ");
        String nombre = scanner.nextLine(); // Leemos una línea de texto
        System.out.println("Hola, " + nombre);

        System.out.print("Ahora su edad: ");
        int edad = scanner.nextInt(); // Leemos un número entero
        System.out.println("Tienes " + edad + " años.");


    }

}
