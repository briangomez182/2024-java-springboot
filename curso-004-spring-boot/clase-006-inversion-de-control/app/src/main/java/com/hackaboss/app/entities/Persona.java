package com.hackaboss.app.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    /*esta entidad se crear para conectar con la DB con el @Entity y los @columns*/
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;

}
