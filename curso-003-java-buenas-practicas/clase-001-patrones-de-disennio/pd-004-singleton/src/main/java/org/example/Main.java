package org.example;

import org.example.singleton.ConfiguracionGlobal;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia y usarla
        ConfiguracionGlobal s1 = ConfiguracionGlobal.getInstancia();
        s1.mostrarMensaje();
        System.out.println("Versión app: " + s1.getVersion());


        // Intentar obtener otra instancia
        ConfiguracionGlobal s2 = ConfiguracionGlobal.getInstancia();
        s2.mostrarMensaje();
        System.out.println("Versión app: " + s2.getVersion());

        // Comprobación: ambas referencias deben apuntar al mismo objeto
        System.out.println("¿s1 y s2 son la misma instancia? " + (s1 == s2));

       Prueba.otroMetodo();
    }
}