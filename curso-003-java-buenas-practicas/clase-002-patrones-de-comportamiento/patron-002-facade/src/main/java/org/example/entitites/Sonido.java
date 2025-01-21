package org.example.entitites;

import org.example.interfaces.Dispositivo;

public class Sonido implements Dispositivo {
    @Override
    public void turnOn() {
        System.out.println("Encendiendo el sistema de sonido");
    }
    @Override
    public void turnOff() {
        System.out.println("Apagando el sistema de sonido");
    }

}
