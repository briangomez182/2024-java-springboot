package org.example.adapters;

import org.example.interfaces.IFahrenheitTemperatura;
import org.example.interfaces.Temperatura;

public class FahrenheitAdaptador implements Temperatura {

    private IFahrenheitTemperatura IFahrenheitTemperatura;

    public FahrenheitAdaptador(IFahrenheitTemperatura IFahrenheitTemperatura) {
        this.IFahrenheitTemperatura = IFahrenheitTemperatura;
    }

    @Override
    public double getCelsius() {
        // Realiza la conversión de Fahrenheit a Celsius
        double fahrenheit = IFahrenheitTemperatura.getFahrenheit();
        return (fahrenheit - 32) * 5 / 9;

        //(fahrenheit - 32) = Punto de congelacion en Celsius es 0 grados. Pero en Farenheit es -32 grados
        //(5/9) = Es la relacion entre el punto de ebullicion y la de congelacion de cada medida, es decir
        //es la diferencia de la escala Fahrenheit a la escala Celsius
    }

}
