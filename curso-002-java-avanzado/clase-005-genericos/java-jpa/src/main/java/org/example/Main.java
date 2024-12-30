package org.example;

import org.example.controllers.ActorController;
import org.example.controllers.MovieController;
import org.example.entities.Actor;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();
        ActorController actorController = new ActorController();

        // TODO: 21/12/2024 bien

        Actor nuevoActor = new Actor(null, "Brian", "Gomez", LocalDate.of(1930,3,12));

        /*Crear una Pelicula*/
      /*  actorController.create(nuevoActor);*/


        // TODO: 21/12/2024 Bien
        /*Buscar pelicula*/
        Integer idBuscado = 3;
        Optional<Actor> actor = actorController.findOne(idBuscado);
        System.out.println(actor);


        // TODO: 21/12/2024 Bien
        // Buscar todas las peliculas
        List<Actor> listadoFindAll =  actorController.findAll();

        for (Actor elemento: listadoFindAll) {
            System.err.println(elemento);
        }


        // TODO: 21/12/2024 bien
        //Actualizar la pelicula 6
        Optional<Actor> actualizarElemento = actorController.findOne(7);
       /* actualizarElemento.ifPresent(elem -> elem.setFirstName("Axcel"));*/

        /*actorController.update(actualizarElemento.get());*/

        Integer idEliminar = 6;
       /* actorController.delete(idEliminar);*/
    }
}