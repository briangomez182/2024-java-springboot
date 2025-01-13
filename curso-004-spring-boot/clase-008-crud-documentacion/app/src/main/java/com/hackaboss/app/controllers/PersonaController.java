package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.models.Persona;
import com.hackaboss.app.services.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/personas")
public class PersonaController {

    //iniciar con @Autowired y luego cuando todo este Ok cambiar con los otros metodos de Inyeccion de dependencia
    @Autowired
    private PersonaServicio service;

    //Inyectamos la clase UsuarioService en este controlador
    @GetMapping({"/", ""}) //si el usuario escribe al final de persona la / o no
    public List<PersonaDTO> obtenerTodosLasPersonas() {
        return  service.buscarTodos();
    }

    @GetMapping("/{id}") //si el usuario escribe al final de persona la / o no
    public PersonaDTO obtenerPersonaPorId(@PathVariable Long id) {
        return  service.buscarPorId(id);
    }

    @PostMapping({"/", ""})
    public PersonaDTO crearPersona(@RequestBody PersonaDTO personaDTO) {
        return service.crear(personaDTO);
    }

    // Actualizar persona
    @PutMapping("/{id}")
    public PersonaDTO actualizarPersona(@PathVariable Long id, @RequestBody PersonaDTO personaDTO) {
        return service.actualizar(id, personaDTO);
    }

    // Eliminar persona
    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id) {
        service.eliminar(id);
    }


}
