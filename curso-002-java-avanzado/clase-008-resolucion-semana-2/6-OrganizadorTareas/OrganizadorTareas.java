package com.pruebajpa.organizadortareas;

import com.pruebajpa.organizadortareas.logica.Tarea;

public class OrganizadorTareas {

    public static void main(String[] args) {

        Tarea proyecto = new Tarea("Desarrollo de Software");
        agregarTareas(proyecto, 0);
        proyecto.mostrarTareas(0);
    }

    public static void agregarTareas(Tarea tarea, int nivel) {
        if (nivel > 2) { // Condición de parada para el ejemplo
            return;
        }
        for (int i = 1; i <= 2; i++) {
            Tarea nuevaTarea = new Tarea("Tarea " + nivel + "." + i);
            tarea.agregarSubtarea(nuevaTarea);
            agregarTareas(nuevaTarea, nivel + 1);
        }

        /*
        Este ejemplo crea una estructura jerárquica de tareas utilizando recursividad. 
        La función agregarTareas agrega tareas recursivamente a cada nivel, deteniéndose 
        cuando se alcanza el nivel deseado (en este caso, cuando el nivel es mayor que 2). 
        Luego, la función mostrarTareas muestra la estructura completa de tareas de manera 
        jerárquica.
         */
    }
}
