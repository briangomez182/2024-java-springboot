package com.hackaboss.NombresParametros.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Constructor sin argumentos (necesario para JPA)
@AllArgsConstructor // Constructor con todos los argumentos
public class RespuestaUsuario {

/*  Muestrales sin las anotaciones JSON

    private String parametroRecibido;
    private String parametroEnviado;
    private String status;*/

    @JsonProperty("paramRecibido")
    private String parametroRecibido;

    @JsonProperty("paramEnviado")
    private String parametroEnviado;

    @JsonIgnore
    private String status;
}
