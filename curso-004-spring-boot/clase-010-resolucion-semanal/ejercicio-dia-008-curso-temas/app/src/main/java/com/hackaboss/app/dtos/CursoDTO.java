package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO {

    private Long identificador;

    @JsonProperty("primerNombre")
    private String nombre;

    @JsonProperty("tipo")
    private String tipoCurso;

    @JsonProperty("fechaFin")
    private LocalDate fechaFinalizacion;

    @JsonManagedReference
    @JsonProperty("susTemas")
    private List<TemaDTO> temas;
}
