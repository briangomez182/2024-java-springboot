package com.hackaboss.app.respositories;

import com.hackaboss.app.dtos.PersonaDTO;

import java.util.List;

public interface PersonaRepositorioInterfaz {
    //Interfaz de la capa de acceso a Datos
    List<PersonaDTO> buscarTodos();

    PersonaDTO buscarPorId(Long id);

    PersonaDTO crear(PersonaDTO entidad);

    PersonaDTO actualizar(Long id, PersonaDTO entidad);

    void eliminar(Long id);
}
