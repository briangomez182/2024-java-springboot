package operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;

        System.out.println("¿Puede conducir? " + (esMayorDeEdad && tieneLicencia)); // false

        System.out.println("¿Accede al evento? " + (esMayorDeEdad || tieneLicencia)); // true

        System.out.println("¿No tiene licencia? " + (tieneLicencia == false)); // Remplazar

        System.out.println("¿No tiene licencia? " + (!tieneLicencia)); // true

        // TODO: 21/11/2024
        //  Si tu lógica está enfocada en situaciones donde algo
        //  no es verdadero (como permisos, errores o estados negativos).
        //  O Invertir el valor de una variable booleana.

    }
}
