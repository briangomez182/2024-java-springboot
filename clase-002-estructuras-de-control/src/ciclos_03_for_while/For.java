package ciclos_03_for_while;

public class For {
    public static void main(String[] args) {

        // TODO: 21/11/2024 FOR CON LIMITES

        for (int i = 0; i <5; i++) {
            System.out.println("Estoy en la vuelta Nº " + i);
        }


        // TODO: 21/11/2024 Que pasa si no sabemos la cantidad de elementos que debemos iterar?
        String[] peliculas = {"El Padrino", "Matrix", "Interstellar", "Pulp Fiction"};

        // Recorremos el array utilizando un ciclo for"El Señor de los Anillos"
        //      inicio;     condición;      modificador
       /* for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i]);
        }*/

        // TODO: 26/11/2024 Y un foreach itera cada elemento con un nombre de variable dado y cual es el array a iterar
        for (String pelicula: peliculas) {
            System.out.println(pelicula);
        }
    }
}
