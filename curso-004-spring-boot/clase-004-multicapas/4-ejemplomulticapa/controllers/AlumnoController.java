package com.ejemplomulticapa.controllers;
import com.ejemplomulticapa.models.Alumno;
import com.ejemplomulticapa.services.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    AlumnoService alumnosService = new AlumnoService();
    @GetMapping({"/", ""}) //si el usuario escribe al final de persona la / o no
    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnosService.obtenerTodosLosAlumnos();
    }
    
}

