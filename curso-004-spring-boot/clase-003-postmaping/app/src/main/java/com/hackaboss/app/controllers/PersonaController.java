package com.hackaboss.app.controllers;

import com.hackaboss.app.entities.Persona;
import com.hackaboss.app.responses.RespuestaPersona;
import com.hackaboss.app.utilities.UtilsPersona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas") //toda ruta que empiece con "/persona" lo manejara este controlador
public class PersonaController {

    UtilsPersona utilsPersona = new UtilsPersona();

    @GetMapping({"/", ""}) //si el usuario escribe al final de persona la / o no
    public List<Persona> obtenerTodasLasPersonas() {
        return utilsPersona.findAll();
    }

    @GetMapping("/nuevo")
    public Persona obtenerPersona() {
        return utilsPersona.newPerson();
    }

    @GetMapping("/{idBuscado}")
    public Persona obtenerPersonaPorID(@PathVariable Long idBuscado) {
        return utilsPersona.findOne(idBuscado);
    }

    @PostMapping({"/", ""})
    public RespuestaPersona crearPersona(@RequestBody Persona persona) {
        return utilsPersona.create(persona);
    }

    @PostMapping("/new")
    public ResponseEntity crearPersona2(@RequestBody Persona persona) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "ValorPersonalizado");

        return ResponseEntity.status(HttpStatus.ACCEPTED)
                             .headers(headers)
                             .body("Este es un mensaje con headers personalizados.");
    }



}
