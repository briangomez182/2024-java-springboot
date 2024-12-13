package condicionales_03_codeaConmigo;

import java.util.Scanner;

public class ControlAccesoFiesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edadUsuario = scanner.nextInt();

        // Validación de la edad del usuario
        while (edadUsuario < 1 || edadUsuario > 100) {
            System.out.println("Edad inválida. Ingrese una edad entre 1 y 100 años:");
            edadUsuario = scanner.nextInt();
        }



        if (edadUsuario >= 18) {
            System.out.println("¡Puedes ingresar a la fiesta!");
        } else if (edadUsuario >= 16 && edadUsuario < 18) {
            System.out.println("¡Puedes ingresar a la fiesta con un acompañante!");
        } else {
            System.out.println("Lo sentimos, no puedes ingresar a la fiesta.");
        }

        scanner.close();
    }
}