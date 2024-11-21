package operadores;

public class Comparacion {

    public static void main(String[] args) {
        // Declaración de variables
        int a = 10;
        int b = 5;

        System.out.println("¿a es igual a b? " + (a == b));             // false

        System.out.println("¿a es distinto de b? " + (a != b));         // true

        System.out.println("¿a es mayor que b? " + (a > b));            // true

        System.out.println("¿a es menor que b? " + (a < b));            // false

        System.out.println("¿a es mayor o igual que b? " + (a >= b));   // true

        System.out.println("¿a es menor o igual que b? " + (a <= b));   // false
    }
}
