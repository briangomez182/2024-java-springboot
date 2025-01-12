package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.respositories.PersonaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicio implements PersonaServicioInterfaz {

    PersonaRepositorio repository;

    public PersonaServicio(PersonaRepositorio repository) {
        this.repository = repository;
    }

    @Override
    public List<PersonaDTO> buscarTodos() {
        return repository.buscarTodos();
    }

    @Override
    public PersonaDTO buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    @Override
    public PersonaDTO crear(PersonaDTO entidad) {
        return null;
    }

    @Override
    public PersonaDTO actualizar(Long id, PersonaDTO entidad) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
