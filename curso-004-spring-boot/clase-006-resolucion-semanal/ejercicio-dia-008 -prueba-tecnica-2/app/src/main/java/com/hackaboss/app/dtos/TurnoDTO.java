package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnoDTO {

    @JsonIgnore
    private Long identificador;
    @JsonProperty("nombre")
    private String nombrePaciente;
    @JsonProperty("fechaDiaTurno")
    private LocalDateTime fechaHoraTurno;
    @JsonProperty("turneroId")
    private Long codigoTurno;
}
