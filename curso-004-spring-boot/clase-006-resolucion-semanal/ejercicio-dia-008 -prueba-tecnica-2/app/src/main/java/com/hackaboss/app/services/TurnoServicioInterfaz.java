package com.hackaboss.app.services;

import com.hackaboss.app.dtos.TurnoDTO;
import com.hackaboss.app.entities.Turno;

import java.time.LocalDateTime;
import java.util.List;

public interface TurnoServicioInterfaz {
    //Interfaz de la capa de logica de programacion

    List<TurnoDTO> buscarTodos();

    List<TurnoDTO> buscarPorfecha(LocalDateTime fecha);

    TurnoDTO buscarPorTurneroId(Long id);

    TurnoDTO crear(TurnoDTO entidad);

    TurnoDTO actualizar(Long id, TurnoDTO entidad);

    List<TurnoDTO> eliminar(Long id);

    //Conversores
    TurnoDTO convertirTurnoHaciaDTO(Turno turno);

    Turno convertirDTOHaciaTurno(TurnoDTO turnoDTO);

    long convertirFechaEnCodigo(LocalDateTime dateTime);
}
