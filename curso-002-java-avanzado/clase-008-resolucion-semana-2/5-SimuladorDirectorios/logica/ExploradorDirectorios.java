package com.pruebajpa.simuladordirectorios.logica;

public class ExploradorDirectorios {
    
     public void explorarDirectorio(Directorio directorio, int nivel) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("  "); // Espacio para mostrar la jerarquía
        }
        System.out.println(espacio + directorio.getNombre() + "/");

        for (String archivo : directorio.getArchivos()) {
            System.out.println(espacio + "|-" + archivo);
        }

        //el caso base de la recursividad está implícito, no hay una condición if explícita que
        // detenga la recursión. El caso base se da cuando un directorio no tiene subdirectorios.

        for (Directorio subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorio(subdirectorio, nivel + 1);
        }
    }   
    
}
