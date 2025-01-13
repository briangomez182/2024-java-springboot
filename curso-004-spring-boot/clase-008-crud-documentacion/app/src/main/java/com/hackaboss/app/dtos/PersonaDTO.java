package com.hackaboss.app.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
}
