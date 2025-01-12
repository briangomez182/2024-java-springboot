package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PersonaDTO;

import java.util.List;

public interface PersonaServicioInterfaz {
    //Interfaz de la capa de logica de programacion

    List<PersonaDTO> buscarTodos();

    PersonaDTO buscarPorId(Long id);

    PersonaDTO crear(PersonaDTO entidad);

    PersonaDTO actualizar(Long id, PersonaDTO entidad);

    void eliminar(Long id);
}
