package com.hackaboss.app.services;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.entities.Tema;

import java.time.LocalDateTime;
import java.util.List;

public interface TemaServicioInterfaz {

    List<TemaDTO> buscarTodos();

    TemaDTO crear(TemaDTO entidad);

    TemaDTO actualizar(Long id, TemaDTO entidad);



    //conversores
    TemaDTO convertirHaciaDTO(Tema tema);

    Tema convertirHaciaEntidad (TemaDTO temaDTO);

}
