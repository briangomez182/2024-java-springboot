package com.hackaboss.app.respositories;

import com.hackaboss.app.dtos.UsuarioDTO;

import java.util.List;

public interface UsuarioRepositorioInterfaz {
    //Interfaz de la capa de acceso a Datos
    List<UsuarioDTO> buscarTodos();

    UsuarioDTO buscarPorId(Long id);

    UsuarioDTO crear(UsuarioDTO entidad);

    UsuarioDTO actualizar(Long id, UsuarioDTO entidad);

    void eliminar(Long id);
}
