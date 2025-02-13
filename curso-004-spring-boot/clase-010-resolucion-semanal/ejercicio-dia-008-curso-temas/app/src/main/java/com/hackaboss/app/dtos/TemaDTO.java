package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hackaboss.app.entities.Curso;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TemaDTO {

    @JsonIgnore
    private Long identificador;

    @JsonProperty("titulo")
    private String nombre;

    @JsonProperty("detalles")
    private String descripcion;

    @JsonBackReference
    @JsonProperty("cursoId")
    private CursoDTO idCurso;

    @JsonProperty("curso")
    private String cursoNombre;
}
