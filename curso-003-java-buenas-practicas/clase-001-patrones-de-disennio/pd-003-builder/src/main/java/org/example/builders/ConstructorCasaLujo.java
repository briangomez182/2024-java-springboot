package org.example.builders;

import org.example.entities.Casa;
import org.example.interfaces.ConstructorCasa;

public class ConstructorCasaLujo implements ConstructorCasa {
    private Casa casa;

    public ConstructorCasaLujo() {
        this.casa = new Casa(0, "Techo de Lujo");
    }

    @Override
    public void construirHabitaciones() {
        this.casa = new Casa(6, this.casa.getTipoTecho()); // Una casa de lujo suele tener 6 habitaciones
    }

    @Override
    public void construirTecho() {
        System.out.println(this.casa); // aqui viaje el constructor por defecto y lyo lo puedo cambiar luego
        this.casa = new Casa(this.casa.getHabitaciones(), "Lujo"); // Personaliza el tipo de techo
    }

    @Override
    public Casa obtenerResultado() {
        return this.casa;
    }
}