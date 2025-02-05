package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.EquipoDTO;
import com.hackaboss.app.entitites.Equipo;
import com.hackaboss.app.services.EquipoServiceInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquiposController {

    @Autowired
    EquipoServiceInterfaz interfaz;

    @GetMapping("/traer")
    public ResponseEntity obtenerEquipos() {
        //servicio
        List<Equipo> equipos = interfaz.buscarEquiposInscritos();
        return ResponseEntity.status(200).body(equipos);
    }

    @GetMapping("/traer/{nombre}")
    public ResponseEntity obtenerEquipo(@PathVariable String nombre) {
        //servicio
        EquipoDTO equipo = interfaz.buscarEquipoPorNombre(nombre);
        return ResponseEntity.status(200).body(equipo);
    }

    @PostMapping("/equipos/agregar")
    public ResponseEntity agregarEquipo(@RequestBody Equipo equipo) {
        //servicio
        EquipoDTO equipoDTO = interfaz.agregarEquipo(equipo);
        return ResponseEntity.status(200).body(equipoDTO);
    }


}
