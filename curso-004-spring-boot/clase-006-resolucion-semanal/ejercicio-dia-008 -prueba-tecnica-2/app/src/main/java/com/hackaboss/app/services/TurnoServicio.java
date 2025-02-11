package com.hackaboss.app.services;

import com.hackaboss.app.dtos.TurnoDTO;
import com.hackaboss.app.entities.Turno;
import com.hackaboss.app.respositories.TurnoRepositorioInterfaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoServicio implements TurnoServicioInterfaz {

    @Autowired
    TurnoRepositorioInterfaz repository;

    @Override
    public List<TurnoDTO> buscarTodos() {
        List<Turno> turnos = repository.findAll();
        return turnos.stream()
                .map(this::convertirTurnoHaciaDTO)
                .toList();
    }

    @Override
    public List<TurnoDTO> buscarPorfecha(LocalDateTime fecha) {
        List<Turno> turnos = repository.findAll();
        return turnos.stream().filter(turno -> turno.getFechaHoraTurno().isAfter(fecha))
                .map(this::convertirTurnoHaciaDTO)
                .toList();

    }

    @Override
    public TurnoDTO buscarPorTurneroId(Long idTurnero) {
        Optional<Turno> turnoEncontrado = repository.findByCodigoTurno(idTurnero);

        return turnoEncontrado.map(this::convertirTurnoHaciaDTO)
                .orElse(new TurnoDTO(null,null,null,null));
    }

    @Override
    public TurnoDTO crear(TurnoDTO entidad) {
        //transoformar en un obj turno para ser guardada
        Turno turnoRecuperado = this.convertirDTOHaciaTurno(entidad);
        //convertir fecha en codigo
        Long formateadorFecha = this.convertirFechaEnCodigo(entidad.getFechaHoraTurno());
        turnoRecuperado.setCodigoTurno(formateadorFecha);
        Turno turnoGuardado = repository.save(turnoRecuperado);
        return this.convertirTurnoHaciaDTO(turnoGuardado);
    }

    @Override
    public TurnoDTO actualizar(Long id, TurnoDTO entidad) {
        // Verifica si la turno existe
        Optional<Turno> turnoOptional = repository.findById(id);
        if (turnoOptional.isPresent()) {
            Turno turno = turnoOptional.get();

            // Actualiza los campos de la turno con los valores de turnoDTO
            turno.setNombrePaciente(entidad.getNombrePaciente());
            turno.setFechaHoraTurno(entidad.getFechaHoraTurno());

            //convertir fecha en codigo
            Long formateadorFecha = this.convertirFechaEnCodigo(entidad.getFechaHoraTurno());
            turno.setCodigoTurno(formateadorFecha);

            // Guarda la entidad actualizada
            Turno turnoActualizada = repository.save(turno);

            // Devuelve el DTO actualizado
            return this.convertirTurnoHaciaDTO(turnoActualizada);
        } else {
            throw new RuntimeException("Turno no encontrada con id: " + id);
        }
    }


    @Override
    public  List<TurnoDTO> eliminar(Long id) {
        try {
            repository.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("Turno con el id: " + id  + " no eliminada" );
        }

        return this.buscarTodos();
    }

    @Override
    public TurnoDTO convertirTurnoHaciaDTO(Turno turno) {
        return new TurnoDTO(turno.getId(), turno.getNombrePaciente(), turno.getFechaHoraTurno(), turno.getCodigoTurno());
    }

    @Override
    public Turno convertirDTOHaciaTurno(TurnoDTO turnoDTO) {
        return new Turno(turnoDTO.getIdentificador(), turnoDTO.getNombrePaciente(), turnoDTO.getFechaHoraTurno(), turnoDTO.getCodigoTurno());
    }

    @Override
    public long convertirFechaEnCodigo(LocalDateTime dateTime) {
        // Definir el formato de salida
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        // Formatear la fecha y hora como String
        String formattedDateTime = dateTime.format(formatter);
        // Convertirlo a un número long
        return Long.parseLong(formattedDateTime);
    }
}
