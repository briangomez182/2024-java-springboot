package org.example.entitites;

import org.example.interfaces.Dispositivo;

public class Tv implements Dispositivo {

    @Override
    public void turnOn() {
        System.out.println("Encendiendo la televisión");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando la televisión");
    }

}
