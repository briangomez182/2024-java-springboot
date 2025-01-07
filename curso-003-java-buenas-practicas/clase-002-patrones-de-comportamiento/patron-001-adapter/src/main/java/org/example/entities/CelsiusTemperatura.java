package org.example.entities;

import org.example.interfaces.Temperatura;

public class CelsiusTemperatura implements Temperatura {
    private double celsius;

    public CelsiusTemperatura(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double getCelsius() {
        return celsius;
    }

}
