package com.hackaboss.app.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pruebasecurity")
public class HolaController {

    @GetMapping("/holaseg")
    public String holaMundoSeguro() {
        return "Hola mundo con seguridad";
    }

    @GetMapping("/holanoseg")
    public String holaMundoNoSeguro() {
        return "Hola mundo sin seguridad";
    }

    @PostMapping("/post")
    public String holaMundoSeguroPost() {
        return "Hola mundo sin seguridad";
    }
}