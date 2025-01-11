package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.UsuarioDTO;
import com.hackaboss.app.services.UsuarioServicio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    //iniciar con @Autowired y luego cuando todo este Ok cambiar con los otros metodos de Inyeccion de dependencia
    @Autowired
    private UsuarioServicio service;

 /*   public UsuarioController(UsuarioServicio service) {
        this.service = service;
    }*/

/*    @Autowired
    public void setService(UsuarioServicio service) {
        this.service = service;
    }*/

    //Inyectamos la clase UsuarioService en este controlador
    @GetMapping({"/", ""}) //si el usuario escribe al final de persona la / o no
    public List<UsuarioDTO> obtenerTodosLosAlumnos() {
        return  service.buscarTodos();
    }

    @GetMapping("/{id}") //si el usuario escribe al final de persona la / o no
    public UsuarioDTO obtenerAlumnoPorId(@PathVariable Long id) {
        return  service.buscarPorId(id);
    }
}
