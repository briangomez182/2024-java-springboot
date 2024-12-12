package tiposDeDatosPrimitivos;

public class Primitivos {

    public static void main(String[] args) {
        // Tipos de datos enteros
        byte numeroByte = 127;                      // Máximo valor para un byte
        short numeroShort = 32767;                  // Máximo valor para un short
        int numeroInt = 2147483647;                 // Máximo valor para un int
        long numeroLong = 9223372036854775807L;     // Máximo valor para un long

        // Tipos de datos de punto flotante
        float numeroFloat = 3.14f;                  // Número de punto flotante de precisión simple
        double numeroDouble = 3.141592653589793;    // Número de punto flotante de doble precisión

        // Tipo de dato carácter
        char caracter = 'A';                        // Un solo carácter Unicode

        // Tipo de dato booleano
        boolean verdadero = true;
        boolean falso = false;

        // Imprimiendo los valores
        System.out.println("Número byte: " + numeroByte);
    }
}
