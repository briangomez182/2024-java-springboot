package com.hackaboss.app.utilities;

import com.hackaboss.app.entities.Persona;
import com.hackaboss.app.responses.RespuestaPersona;

import java.util.ArrayList;
import java.util.List;

public class UtilsPersona {

    private List<Persona> personas;

    public UtilsPersona() {
        this.personas = new ArrayList<>();
        personas.add(new Persona(1L, "Juan Perez", 30));
        personas.add(new Persona(2L, "Maria González", 25));
        personas.add(new Persona(3L, "Andrea Sánchez", 40));
        personas.add(new Persona(4L, "Ana Lopez", 28));
        personas.add(new Persona(5L, "Brian Gomez", 32));
    }

    public List<Persona> findAll() {

        return this.personas;
    }

    public Persona newPerson() {
        return new Persona(1L,"Juan", 30);
    }

    public Persona findOne(Long idBuscado) {
        return findAll().stream().filter(persona -> persona.getId().equals(idBuscado)).findFirst().get();
    }

    public RespuestaPersona create(Persona persona) {
        this.personas.add(persona);
        return new RespuestaPersona("Usuario Creado", 200, "GET - OK");
    }
}
