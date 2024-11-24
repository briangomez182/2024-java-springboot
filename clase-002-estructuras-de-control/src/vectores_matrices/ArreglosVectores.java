package vectores_matrices;

public class ArreglosVectores {

    public static void main(String[] args) {
        // Declaración e inicialización de un vector de números enteros
        int[] numeros = new int[5];

        // Asignación de valores a elementos individuales del vector
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Mostrar los valores del vector
        System.out.println("Valores en el vector:");

        //      inicio;     condicion;      modificador
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }

}
