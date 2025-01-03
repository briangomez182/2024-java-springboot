package org.example.builders;

import org.example.entities.Casa;
import org.example.interfaces.ConstructorCasa;

public class ManejadorDeConstruccion {

    private ConstructorCasa constructorCasa;

    public ManejadorDeConstruccion(ConstructorCasa constructorCasa) {
        this.constructorCasa = constructorCasa;
    }

    public void construirCasa() {
        constructorCasa.construirHabitaciones();
        constructorCasa.construirTecho();
    }

    public Casa obtenerCasaConstruida() {
        return constructorCasa.obtenerResultado();
    }
}
