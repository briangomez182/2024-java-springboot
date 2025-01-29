package com.hackaboss.app.controllers;

import com.hackaboss.app.entities.Evento;
import com.hackaboss.app.utilities.EventosUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RootController {



    // GET /eventos
    @GetMapping("/eventos")
    public List<Evento> obtenerEventos() {
        return EventosUtils.findAll();
    }

    // GET /evento/{id}
    @GetMapping("/evento/{id}")
    public Evento obtenerEventoPorId(@PathVariable Long id) {
        Evento evento = EventosUtils.findById(id);
        return evento == null? new Evento(): evento;
    }

    // POST /evento
    @PostMapping("/evento")
    public Evento crearEvento(@RequestBody Evento evento) {
        return EventosUtils.save(evento);
    }
}
