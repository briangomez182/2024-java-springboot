package org.example.externalLibraries;

import org.example.interfaces.IFahrenheitTemperatura;

public class FahrenheitTemperatura implements IFahrenheitTemperatura {
    private double fahrenheit;

    public FahrenheitTemperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double getFahrenheit() {
        return fahrenheit;
    }
}
