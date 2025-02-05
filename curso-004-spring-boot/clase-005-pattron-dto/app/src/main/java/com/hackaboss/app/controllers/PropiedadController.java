package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.PropiedadInquilinoDTO;
import com.hackaboss.app.services.PropiedadService;
import com.hackaboss.app.services.PropiedadServiceInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propiedad")
public class PropiedadController {

    //Inyectamos la clase PropiedadService en este controlador
    //@Autowired
    PropiedadServiceInterfaz propiedadServiceInterfaz;

    public PropiedadController(PropiedadServiceInterfaz propiedadServiceInterfaz) {
        this.propiedadServiceInterfaz = propiedadServiceInterfaz;
    }

    //Setter
  /*  @Autowired
    public void setPropiedadServiceInterfaz(PropiedadServiceInterfaz propiedadServiceInterfaz) {
        this.propiedadServiceInterfaz = propiedadServiceInterfaz;
    }*/

    @GetMapping("/info") //si el usuario escribe al final de persona la / o no
    public PropiedadInquilinoDTO obtenerTodosLosAlumnos() {
        return propiedadServiceInterfaz.buscarInfoPropietario();
    }
}
