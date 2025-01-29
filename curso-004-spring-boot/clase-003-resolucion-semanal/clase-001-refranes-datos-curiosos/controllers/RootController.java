package com.hackaboss.app.controllers;

import com.hackaboss.app.utilities.RootUtilitie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RootController {

    @GetMapping("/frases")
    public Object fraseAleatoria() {

        List<String> frases = Arrays.asList(
                "1. Esta es una frase aleatoria.",
                "2. Otra frase más para la lista.",
                "3. ¡Sorpresa! Una frase inesperada."
        );

        return RootUtilitie.obtenerElementoRandom(frases);
    }

    @GetMapping("/datosCuriosos")
    public Object datosCuriosos() {

        List<String> datosCuriosos = Arrays.asList(
                "1. Dato curioso",
                "2. Dato Curioso",
                "3. Dato Curioso"
        );

        return RootUtilitie.obtenerElementoRandom(datosCuriosos);
    }

}
