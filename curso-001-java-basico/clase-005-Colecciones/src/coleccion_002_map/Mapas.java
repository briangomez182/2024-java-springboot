package coleccion_002_map;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        // Crear un Map que relaciona nombres con edades
        Map<String, Integer> edades = new HashMap<>();

        // Agregar valores al Map
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 22);

        // Obtener el valor asociado a una clave
        int edadJuan = edades.get("Juan"); // Devolverá 25

        // Verificar si una clave existe en el Map
        boolean existeAna = edades.containsKey("Ana"); // Devolverá false
    }
}