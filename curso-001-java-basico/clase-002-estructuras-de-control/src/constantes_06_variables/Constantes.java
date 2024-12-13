package constantes_06_variables;

public class Constantes {

    public static final double PI = 3.14159;
    public static final String NOMBRE_APP = "Mi Aplicación";

    public static void main(String[] args) {
        // El valor de PI no puede ser cambiado
        System.out.println("El valor de PI es: " + PI);

        // El valor de NOMBRE_APP tampoco puede ser cambiado
        System.out.println("Nombre de la aplicación: " + NOMBRE_APP);
    }




   /*  
        public static final double PI = 3.14159;:
        public: La constante es accesible desde cualquier parte del programa.
        static: La constante pertenece a la clase, no a un objeto de la clase.
        final: Indica que el valor de la constante no puede ser modificado.
        double: El tipo de dato de la constante es un número de punto flotante de doble precisión.
        PI: El nombre de la constante (en mayúsculas).

    */

    /*
     * 
     * 
            if (cadena1.equals(cadena2)) {
                    System.out.println("Son iguales (con equals())"); // Esto se imprimirá
}
     */



     /*
      * 

        String cadena1 = "Hola";
        String cadena2 = "hOla";

        //  si no te importa si las letras son mayúsculas o minúsculas y solo quieres saber si las palabras son las mismas, ahí es donde entra en juego equalsIgnoreCase()
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales, ignorando mayúsculas y minúsculas");
        } else {
            System.out.println("Las cadenas son diferentes");
}
      */
}