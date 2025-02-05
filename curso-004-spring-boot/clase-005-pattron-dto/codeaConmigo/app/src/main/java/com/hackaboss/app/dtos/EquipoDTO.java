package com.hackaboss.app.dtos;

import com.hackaboss.app.entitites.Piloto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipoDTO {

    private String nombreEquipo;
    private String pais;
}
