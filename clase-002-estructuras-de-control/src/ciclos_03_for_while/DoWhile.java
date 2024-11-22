package ciclos_03_for_while;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        // TODO: 21/11/2024 - (System.in) que obtenga la entrada desde el teclado.
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        do {
            System.out.print("Ingresa un número mayor que 0: ");
            numeroIngresado = scanner.nextInt();
        } while (numeroIngresado >= 0);

        System.out.println("Has ingresado un número negativo: " + numeroIngresado );
    }

}

