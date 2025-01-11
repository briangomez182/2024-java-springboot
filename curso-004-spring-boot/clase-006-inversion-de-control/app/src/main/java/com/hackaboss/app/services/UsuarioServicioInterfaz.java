package com.hackaboss.app.services;

import com.hackaboss.app.dtos.UsuarioDTO;

import java.util.List;

public interface UsuarioServicioInterfaz {
    //Interfaz de la capa de logica de programacion

    List<UsuarioDTO> buscarTodos();

    UsuarioDTO buscarPorId(Long id);

    UsuarioDTO crear(UsuarioDTO entidad);

    UsuarioDTO actualizar(Long id, UsuarioDTO entidad);

    void eliminar(Long id);
}
