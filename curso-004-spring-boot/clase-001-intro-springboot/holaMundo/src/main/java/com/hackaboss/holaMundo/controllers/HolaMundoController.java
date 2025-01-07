package com.hackaboss.holaMundo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping(path = "/autos")
    public String saludo() {
        return "Hola Autos";
    }
}
