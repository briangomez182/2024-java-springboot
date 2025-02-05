package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PropiedadInquilinoDTO;
import com.hackaboss.app.entitites.Inquilino;
import com.hackaboss.app.entitites.Propiedad;
import org.springframework.stereotype.Service;

@Service
public class PropiedadService implements PropiedadServiceInterfaz {

    private Propiedad propiedad;

    private Inquilino inquilino;

    public PropiedadService() {
        this.propiedad = new Propiedad(2L, "Casa", "madrid 555",80.0,1000.0);
        this.inquilino = new Inquilino(5L, "55.242.555", "Brian", "Gomez", "Profesor");
    }

    @Override
    public PropiedadInquilinoDTO buscarInfoPropietario() {

        PropiedadInquilinoDTO dto = new PropiedadInquilinoDTO();
        dto.setTipoPropiedad(propiedad.getTipoPropiedad());
        dto.setDireccion(propiedad.getDireccion());
        dto.setNombre(inquilino.getNombre());
        dto.setProfesion(inquilino.getProfesion());

        return dto;
    }
}
