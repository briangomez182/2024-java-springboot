package org.example.entitites;

import org.example.interfaces.Dispositivo;

public class Luces implements Dispositivo {

    @Override
    public void turnOn() {
        System.out.println("Encendiendo las luces");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando las luces");
    }
}
