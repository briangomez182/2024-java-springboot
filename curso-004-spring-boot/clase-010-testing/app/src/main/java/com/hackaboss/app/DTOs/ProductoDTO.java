package com.hackaboss.app.DTOs;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

    private Long id;
    private String nombre;
    private double precio;
}
