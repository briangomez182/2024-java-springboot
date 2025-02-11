package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.entities.Curso;

import java.util.List;

public interface CursoServicioInterfaz {

    List<CursoDTO> buscarTodos();
    
    CursoDTO buscarPorCurso(Long idCurso);

    List<CursoDTO> buscarCursosPorNombre(String nombre);

    CursoDTO crear(CursoDTO entidad);

    CursoDTO actualizar(Long id, CursoDTO entidad);


    //conversores
    CursoDTO convertirHaciaDTO(Curso ciudadano);

    Curso convertirHaciaEntidad (CursoDTO cursoDTO);

}
