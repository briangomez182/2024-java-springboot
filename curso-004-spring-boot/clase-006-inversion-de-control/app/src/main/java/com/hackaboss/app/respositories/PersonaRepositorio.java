package com.hackaboss.app.respositories;

import com.hackaboss.app.dtos.PersonaDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepositorio implements PersonaRepositorioInterfaz {

    List<PersonaDTO> listado;

    public PersonaRepositorio() {
        this.listado = new ArrayList<>();
        listado.add(new PersonaDTO(1L, "John", "Doe", 28));
        listado.add(new PersonaDTO(2L, "Jane", "Smith", 32));
        listado.add(new PersonaDTO(3L, "Alice", "Johnson", 24));
        listado.add(new PersonaDTO(4L, "Bob", "Brown", 40));
        listado.add(new PersonaDTO(5L, "Charlie", "Davis", 35));
    }

    @Override
    public List<PersonaDTO> buscarTodos() {
        return this.listado;
    }

    @Override
    public PersonaDTO buscarPorId(Long id) {
        return listado.stream()
                .filter(userDTO -> userDTO.getId().equals(id))
                    .findFirst().orElse(new PersonaDTO(null,null,null,null));
        //manejen una excepcion que les diga que no lo encontro
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
