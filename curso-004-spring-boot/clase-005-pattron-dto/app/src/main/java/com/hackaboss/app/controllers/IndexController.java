package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.PropiedadInquilinoDTO;
import com.hackaboss.app.services.PropiedadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class IndexController {

    //Inyectamos la clase PropiedadService en este controlador
    PropiedadService propiedadService = new PropiedadService();
    @GetMapping("/propiedad/{idPropiedad}") //si el usuario escribe al final de persona la / o no
    public PropiedadInquilinoDTO obtenerTodosLosAlumnos(@PathVariable("idPropiedad") Integer id) {
        return propiedadService.buscarInfoPropietario();
    }
}
