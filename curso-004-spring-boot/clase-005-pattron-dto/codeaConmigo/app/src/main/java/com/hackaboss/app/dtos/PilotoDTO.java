package com.hackaboss.app.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PilotoDTO {

    private String nombre;
    private String apellido;
    private String equipo;
}
