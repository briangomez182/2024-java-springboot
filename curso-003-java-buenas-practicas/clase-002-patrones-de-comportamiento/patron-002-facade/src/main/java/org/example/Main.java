package org.example;

import org.example.entitites.Luces;
import org.example.entitites.Sonido;
import org.example.entitites.Tv;
import org.example.facade.FachadaTeatroCasero;

public class Main {

    public static void main(String[] args) {
        // Crear subsistemas
        Tv tv = new Tv();
        Sonido sonido = new Sonido();
        Luces luces = new Luces();

        // Crear fachada
        FachadaTeatroCasero ftc = new FachadaTeatroCasero(tv, sonido, luces);

        // Utilizar la fachada para ver una película
        ftc.verPelicula();

        // Utilizar la fachada para finalizar la película
        ftc.finalPelicula();
    }


}