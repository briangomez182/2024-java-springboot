package org.example;

import org.example.adapters.FahrenheitAdaptador;
import org.example.externalLibraries.FahrenheitTemperatura;

public class Main {
    public static void main(String[] args) {
        // Usando Fahrenheit con el adaptador
        FahrenheitTemperatura fahrenheitTemp = new FahrenheitTemperatura(32);
        FahrenheitAdaptador fahrenheitAdaptador = new FahrenheitAdaptador(fahrenheitTemp);
        System.out.println("Temperatura en Celsius: " + fahrenheitAdaptador.getCelsius());
    }

}