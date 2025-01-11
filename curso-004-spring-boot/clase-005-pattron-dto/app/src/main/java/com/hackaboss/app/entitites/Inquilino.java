package com.hackaboss.app.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inquilino {
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;
}
