package com.hackaboss.app.services;

import com.hackaboss.app.dtos.UsuarioDTO;
import com.hackaboss.app.respositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio implements UsuarioServicioInterfaz {

    UsuarioRepositorio repository;

    public UsuarioServicio(UsuarioRepositorio repository) {
        this.repository = repository;
    }

    @Override
    public List<UsuarioDTO> buscarTodos() {
        return repository.buscarTodos();
    }

    @Override
    public UsuarioDTO buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    @Override
    public UsuarioDTO crear(UsuarioDTO entidad) {
        return null;
    }

    @Override
    public UsuarioDTO actualizar(Long id, UsuarioDTO entidad) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
