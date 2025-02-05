package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.services.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<PersonaDTO>> obtenerTodosLasPersonas() {
        List<PersonaDTO> listado = service.buscarTodos();
        return  ResponseEntity.status(200).body(listado);
    }

    @GetMapping("/{id}") //si el usuario escribe al final de persona la / o no
    public ResponseEntity<PersonaDTO>  obtenerPersonaPorId(@PathVariable Long id) {
        PersonaDTO personaEncontrada = service.buscarPorId(id);
        return  ResponseEntity.status(200).body(personaEncontrada);
    }

    @PostMapping({"/", ""})
    public ResponseEntity<PersonaDTO> crearPersona(@RequestBody PersonaDTO personaDTO) {
        PersonaDTO personaCreada = service.crear(personaDTO);
        return ResponseEntity.status(201).body(personaCreada);
    }

    // Actualizar persona Completamente
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO> actualizarPersona(@PathVariable Long id, @RequestBody PersonaDTO personaDTO) {
        PersonaDTO personaActualizada = service.actualizar(id, personaDTO);
        return ResponseEntity.ok(personaActualizada);
    }

    // Eliminar persona
    @DeleteMapping("/{id}")
    public ResponseEntity<List<PersonaDTO>> eliminarPersona(@PathVariable Long id) {
        List<PersonaDTO> listado = service.eliminar(id);
         return ResponseEntity.ok(listado);
         // codigo 204 es para decir que no hay contenido por que fue eliminado
    }


}
