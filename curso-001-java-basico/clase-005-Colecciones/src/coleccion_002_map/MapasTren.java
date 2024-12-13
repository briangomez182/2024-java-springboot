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
    }
}
