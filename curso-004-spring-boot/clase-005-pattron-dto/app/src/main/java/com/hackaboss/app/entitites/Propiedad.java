package com.hackaboss.app.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Propiedad {
    private Long idPropiedad;
    private String tipoPropiedad;
    private String direccion;
    private Double metrosCuadrados;
    private Double valorAlquiler;
}
