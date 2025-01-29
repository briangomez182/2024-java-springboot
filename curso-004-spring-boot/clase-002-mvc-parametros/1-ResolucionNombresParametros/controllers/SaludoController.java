package com.hackaboss.NombresParametros.controllers;

import com.hackaboss.NombresParametros.DTO.RespuestaUsuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    //http://localhost:8080/saludar/brian
    @GetMapping("/saludar/{nombre}")
    public String saludarConNombre(@PathVariable String nombre) {
        return "Hola Mundo " + nombre;
    }

    //http://localhost:8080/saludar?nombre=brian
 /*   @GetMapping("/saludar")
    public String saludarConNombre(@RequestParam String nombre) {
        return "Hola Mundo " + nombre;
    }*/


    @GetMapping("/saludarConEdad")
    public String saludarConNombreYEdad(@RequestParam String nombre, @RequestParam int edad) {
        return "Hola Mundo " + nombre + " tienes " + edad + " años";
    }

    @GetMapping("/saludarConProfesion")
    public String saludarConNombreEdadYProfesion(@RequestParam String nombre, @RequestParam int edad, @RequestParam String profesion) {
        return "Hola Mundo " + nombre + " tienes " + edad + " años y eres " + profesion;
    }

    //http://localhost:8080/saludarConJSON/brian
    @GetMapping("/saludarConJSON/{nombre}")
    public RespuestaUsuario saludarConJSON(@PathVariable String nombre) {
        RespuestaUsuario res = new RespuestaUsuario();
        res.setParametroRecibido(nombre);
        res.setParametroEnviado("Saludos "  + nombre + ", esta respuesta con JSON ");
        res.setStatus("Perfecto");
        return res;
    }
}
