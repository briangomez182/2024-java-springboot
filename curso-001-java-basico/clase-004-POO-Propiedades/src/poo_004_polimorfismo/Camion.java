package poo_004_polimorfismo;

import poo_001_abstraccion.Auto;

public class Camion extends Auto {

    @Override
    public void acelerar() {
        // TODO: 23/11/2024 como ejecutar el metodo de la clase auto?
        //super.acelerar();
        System.out.println("El camión está acelerando. Pero mas lento por ser ams pesado");
    }
}
