package ciclos_03_for_while;

import java.util.Scanner;

public class WhileCentinela {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        boolean bandera = false;

        System.out.println("Ingresa nombres. Escribe 'fin' para detener.");

        while (bandera!=true) {
            System.out.print("Ingresa un nombre: ");
            nombre = scanner.next();

            // TODO: 21/11/2024 CENTINELA esta cazando una condicion 
            if (nombre.equalsIgnoreCase("fin")) {
                bandera = true;
            }

            System.out.println("Hola, " + nombre + "!");
        }

        System.out.println("Fin del programa.");
    }

}
