package org.example;

import org.example.builders.ConstructorCasaLujo;
import org.example.builders.ConstructorCasaNormal;
import org.example.builders.ManejadorDeConstruccion;
import org.example.entities.Casa;
import org.example.interfaces.ConstructorCasa;

public class Main {


    public static void main(String[] args) {
        ManejadorDeConstruccion directorNormal = new ManejadorDeConstruccion(new ConstructorCasaNormal());
        directorNormal.construirCasa();
        Casa casaNormal = directorNormal.obtenerCasaConstruida();
        System.out.println(casaNormal);

        ManejadorDeConstruccion directorLujo = new ManejadorDeConstruccion(new ConstructorCasaLujo());
        directorLujo.construirCasa();
        Casa casaLujo = directorLujo.obtenerCasaConstruida();
        System.out.println(casaLujo);
    }

}