package org.example.entities;

// Producto: Casa
public class Casa {
    private int habitaciones;
    private String tipoTecho;

    public Casa(int habitaciones, String tipoTecho) {
        this.habitaciones = habitaciones;
        this.tipoTecho = tipoTecho;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "habitaciones=" + habitaciones +
                ", tipoTecho='" + tipoTecho + '\'' +
                '}';
    }
}