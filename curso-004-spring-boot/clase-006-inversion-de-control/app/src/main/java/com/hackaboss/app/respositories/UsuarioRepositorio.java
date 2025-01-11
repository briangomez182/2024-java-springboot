package com.hackaboss.app.respositories;

import com.hackaboss.app.dtos.UsuarioDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositorio implements UsuarioRepositorioInterfaz {

    List<UsuarioDTO> listado;

    public UsuarioRepositorio() {
        this.listado = new ArrayList<>();
        listado.add(new UsuarioDTO(1L, "John", "Doe", 28));
        listado.add(new UsuarioDTO(2L, "Jane", "Smith", 32));
        listado.add(new UsuarioDTO(3L, "Alice", "Johnson", 24));
        listado.add(new UsuarioDTO(4L, "Bob", "Brown", 40));
        listado.add(new UsuarioDTO(5L, "Charlie", "Davis", 35));
    }

    @Override
    public List<UsuarioDTO> buscarTodos() {
        return this.listado;
    }

    @Override
    public UsuarioDTO buscarPorId(Long id) {
        return listado.stream()
                .filter(userDTO -> userDTO.getId().equals(id))
                    .findFirst().orElse(new UsuarioDTO(null,null,null,null));
        //manejen una excepcion que les diga que no lo encontro
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
