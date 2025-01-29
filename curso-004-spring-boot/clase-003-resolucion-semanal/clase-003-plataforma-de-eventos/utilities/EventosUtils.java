package com.hackaboss.app.utilities;

import com.hackaboss.app.entities.Evento;

import java.util.ArrayList;
import java.util.List;

public class EventosUtils {

    private static final List<Evento> eventos = new ArrayList<>();
    private static Long nextId = 1L;

    public static List<Evento> findAll() {
        return eventos;
    }

    public static Evento findById(Long id) {
        return eventos.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public static Evento save(Evento evento) {
        evento.setId(nextId++);
        eventos.add(evento);
        return evento;
    }
}
