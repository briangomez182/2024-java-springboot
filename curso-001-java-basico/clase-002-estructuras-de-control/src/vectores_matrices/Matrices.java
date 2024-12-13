package vectores_matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        // Declaración e inicialización de la matriz de edades
        int[][] edades = new int[4][4];

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // TODO: 24/11/2024 la matriz se rellenara de arriba abajo y de izquierda a derecha 
        System.out.println("Ingresa las edades para la matriz (4 filas x 4 columnas):");

        //carga de una matriz
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingresa la edad para la fila " + (fila + 1) + ", columna " + (columna + 1) + ": ");
                edades[fila][columna] = scanner.nextInt();
            }
        }

        // TODO: 24/11/2024 Es lo mismo que crear esto de manera manual
        int[][] edadesManuales = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 8, 7, 6},
                {5, 4, 3, 2}
        };

        // Recorrido/Muestra de una matriz
        System.out.println("Matriz de Edades:");
        System.out.println(edades);
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.println("Estoy en fila: " + fila + " columna: " + columna + " y se encuentra el valor: " + edades[fila][columna]);
            }

        }
    }

}
