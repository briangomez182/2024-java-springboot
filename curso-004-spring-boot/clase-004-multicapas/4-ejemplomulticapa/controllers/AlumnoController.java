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

    AlumnoServiceInterfaz alumnoServiceInterfaz;

    public AlumnoController(AlumnoServiceInterfaz alumnoServiceInterfaz) {
        this.alumnoServiceInterfaz = alumnoServiceInterfaz;
    }

    @GetMapping({"/",""})
    public ResponseEntity obtenerTodosLosAlumnos(){
        List<Alumno> listado = alumnoServiceInterfaz.obtenerTodosLosAlumnos();
        return ResponseEntity.status(200).body(listado);
    }

    @PostMapping("/agregar")
    public ResponseEntity agreagarAlumnos(@RequestBody Alumno alumno){
        alumnoServiceInterfaz.crearAlumno(alumno);
        return ResponseEntity.status(200).body("Guardado con exito");
    }
    
}

