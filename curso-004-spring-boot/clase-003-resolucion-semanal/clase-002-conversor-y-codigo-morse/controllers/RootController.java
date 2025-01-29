package com.hackaboss.app.controllers;

import com.hackaboss.app.utilities.ConvertidorMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RootController {



    @GetMapping("/convertir")
    public String convertirCentimetrosAMetros(@RequestParam("centimetros") double cm) {
        int porCien = 100;
        double metros = cm / porCien;
        return "El equivalente a " + cm + " cm en metros es de " + metros + " metros";
    }

    @GetMapping("/morse")
    public String claveMorse(@RequestParam("clave") String key) {
        return  ConvertidorMorse.textToMorse(key);
    }

}
