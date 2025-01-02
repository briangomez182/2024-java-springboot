package com.example.controllers;

import com.example.entities.Persona;
import com.example.persistence.GenericoJPA;

import java.util.List;

public class PersonaController {
    private final GenericoJPA<Persona, Long> personaJPA;

    public PersonaController() {
        this.personaJPA = new GenericoJPA<>(Persona.class);
    }

    // Método para crear una nueva persona
    public void create(String nombre, String apellido) {
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre(nombre);
        nuevaPersona.setApellido(apellido);
        personaJPA.create(nuevaPersona);
    }

    // Método para buscar una persona por ID
    public Persona findOne(Long id) {
        Persona persona = personaJPA.findOne(id);
        if (persona != null) {
            System.out.println("Persona encontrada: " + persona.getNombre() + " " + persona.getApellido());
            return persona;
        } else {
            System.out.println("Persona con ID " + id + " no encontrada.");
            return null;
        }


    }

    // Método para obtener todas las personas
    public  List<Persona> findAll() {
        List<Persona> personas = personaJPA.findAll();
        return  personas;
    }

    // Método para actualizar una persona
    public void update(Long id, String nuevoNombre, String nuevoApellido) {
        Persona persona = personaJPA.findOne(id);
        if (persona != null) {
            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            personaJPA.update(persona);
        } else {
            System.out.println("Persona con ID " + id + " no encontrada.");
        }
    }

    // Método para eliminar una persona
    public void delete(Long id) {
        personaJPA.delete(id);
        System.out.println("Persona con ID " + id + " eliminada.");
    }
}
