package coleccion_002_map;

import java.util.HashMap;
import java.util.Map;

public class MapasTren {

    public static void main(String[] args) {
        Map<Integer, String> tren = new HashMap<>();

        // Agregamos los vagones con sus respectivas cajas fuertes
        tren.put(1, "Libro de aventuras");
        tren.put(3, "Juego de mesa");
        tren.put(7, "Peluche");

        // Imprimimos el contenido del vagón 3
        System.out.println("Contenido del vagón 3: " + tren.get(3));

        tren.values().stream()
            .forEach(valor -> System.out.println(valor));

        tren.values()
                .stream()
                .forEach(System.out::println);

        /* tren.values() obtiene una Collection con todos los valores del Map.
        .stream() convierte esa colección en un Stream.
        .forEach() recorre cada elemento del Stream y ejecuta la acción definida en la lambda valor -> System.out.println(valor). */
    }
}
