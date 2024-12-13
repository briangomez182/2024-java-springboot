package org.example.tryCatchFinally;

import java.util.Scanner;

public class DivisionConExcepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        try {
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException exception) {
            System.out.println("Error: No se puede dividir por cero.");
            System.out.println(exception);
        } finally {
            scanner.close();
        }
    }
}