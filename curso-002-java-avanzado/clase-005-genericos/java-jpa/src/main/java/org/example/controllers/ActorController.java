package org.example.controllers;

import org.example.entities.Actor;
import org.example.persistence.GenericoJPA;

import java.util.List;
import java.util.Optional;

public class ActorController {

    GenericoJPA<Actor> genericoJPA = new GenericoJPA<>(Actor.class);

    public void create(Actor nuevoElemento) {
        genericoJPA.createGenerico(nuevoElemento);
    }

    public Optional<Actor> findOne(Integer idBuscado) {
        return genericoJPA.findOneGenerico(idBuscado);
    }

    public List<Actor> findAll(){
        return genericoJPA.findAllGenerico();
    }

    public void update(Actor actualizarElemento) {
        genericoJPA.updateGenerico(actualizarElemento);
    }

    public void delete(Integer idEliminar) {
        genericoJPA.deleteGenerico(idEliminar);
    }
}
