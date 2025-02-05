package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {

    private Long identificador;
    @JsonProperty("primerNombre")
    private String nombre;
    @JsonProperty("primerApellido")
    private String apellido;
    @JsonProperty("annios")
    private Integer edad;
}
