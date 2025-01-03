package org.example.builders;

import org.example.entities.Casa;
import org.example.interfaces.ConstructorCasa;

public class ConstructorCasaNormal implements ConstructorCasa {
    private Casa casa;

    public ConstructorCasaNormal() {
        this.casa = new Casa(0, "Normal");
    }

    @Override
    public void construirHabitaciones() {
        this.casa = new Casa(4, this.casa.getTipoTecho()); // Una casa normal suele tener 4 habitaciones
    }

    @Override
    public void construirTecho() {
        // Puede mantener el tipo de techo predeterminado o personalizar según sea necesario
    }

    @Override
    public Casa obtenerResultado() {
        return this.casa;
    }
}