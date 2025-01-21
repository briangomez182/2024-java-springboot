package org.example.facade;

import org.example.entitites.Luces;
import org.example.entitites.Sonido;
import org.example.entitites.Tv;
import org.example.interfaces.Dispositivo;

public class FachadaTeatroCasero {
    private Dispositivo  tv;
    private Dispositivo sonido;
    private Dispositivo  luces;

    public FachadaTeatroCasero(Dispositivo  tv, Dispositivo  sonido, Dispositivo  luces) {
        this.tv = tv;
        this.sonido = sonido;
        this.luces = luces;
    }

    public void verPelicula() {
        System.out.println("Preparando para ver una película...");
        tv.turnOn();
        sonido.turnOn();
        //Hago algo contrario, un metodo distinto para aplicar una fachada
        luces.turnOff();
    }

    public void finalPelicula() {
        System.out.println("Finalizando la película...");
        tv.turnOff();
        sonido.turnOff();
        //Hago algo contrario, un metodo distinto para aplicar una fachada
        luces.turnOn();
    }

}
