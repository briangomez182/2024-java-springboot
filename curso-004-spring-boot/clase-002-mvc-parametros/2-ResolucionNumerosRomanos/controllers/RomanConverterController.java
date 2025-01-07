package com.hackaboss.numerosRomanos.controllers;

import com.hackaboss.numerosRomanos.services.RomanConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanConverterController {

    @GetMapping("/convertir/{numeroDecimal}")
    public String convertirANumeroRomano(@PathVariable int numeroDecimal) {
        if (numeroDecimal < 1 || numeroDecimal > 1000) {
            return "El número debe estar en el rango de 1 a 1000";
        }

        String numeroRomano = RomanConverterService.convertirNumeroRomano(numeroDecimal);
        return "El número romano equivalente es: " + numeroRomano;
    }

    // Método para convertir números decimales a números romanos

}
