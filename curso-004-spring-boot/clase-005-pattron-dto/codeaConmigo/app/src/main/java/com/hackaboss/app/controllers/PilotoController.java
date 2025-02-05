package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.PilotoDTO;
import com.hackaboss.app.entitites.Equipo;
import com.hackaboss.app.services.EquipoServiceInterfaz;
import com.hackaboss.app.services.PilotoServiceInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pilotos")
public class PilotoController {

    @Autowired
    PilotoServiceInterfaz pilotoServiceInterfaz;



    @GetMapping("/traer") //si el usuario escribe al final de persona la / o no
    public ResponseEntity obtenerTodosLosPilotos() {
        List<PilotoDTO> listado = pilotoServiceInterfaz.buscarPilotos();
        return ResponseEntity.status(200).body(listado);
    }

    @GetMapping("/traer/{nombreEquipo}")
    public ResponseEntity obtenerPilotosPorEquipo(@PathVariable String nombreEquipo) {
        List<PilotoDTO> listado = pilotoServiceInterfaz.buscarPilotosPorEquipo( nombreEquipo);
        return ResponseEntity.status(200).body(listado);
    }

}
