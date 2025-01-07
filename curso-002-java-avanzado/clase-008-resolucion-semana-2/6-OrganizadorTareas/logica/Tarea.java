package com.pruebajpa.organizadortareas.logica;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea(Tarea subtarea) {
        this.subtareas.add(subtarea);
    }

    public void mostrarTareas(int nivel) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("|--"); // Espacio para mostrar la jerarquía
        }
        System.out.println(espacio + " " + this.nombre);
        
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarTareas(nivel + 1);
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }
}
