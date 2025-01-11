package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PropiedadInquilinoDTO;
import com.hackaboss.app.entitites.Inquilino;
import com.hackaboss.app.entitites.Propiedad;

public class PropiedadService implements IPropiedadService{
    @Override
    public PropiedadInquilinoDTO buscarInfoPropietario() {

        Propiedad a = new Propiedad(2L, "asd", "dir",20.0,10.0);
        Propiedad b = new Propiedad(2L, "asd", "dir",20.0,10.0);
        Propiedad pro = new Propiedad(2L,"Apartamento", "Av Lara", 100.0, 1000.0);
        Inquilino inq = new Inquilino(5L, "55.242.555", "Brian", "Gomez", "Ingeniero");
        PropiedadInquilinoDTO dto = new PropiedadInquilinoDTO();
        dto.setTipoPropiedad(pro.getTipoPropiedad());
        dto.setDireccion(pro.getDireccion());
        dto.setNombre(inq.getNombre());
        dto.setProfesion(inq.getProfesion());

        return dto;
    }
}
