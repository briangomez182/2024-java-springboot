package org.example;


import org.example.threads.LavadoAuto;
import org.example.threads.ReparacionAuto;

public class Main {
    public static void main(String[] args) {
        // Crear hilos para reparación

        ReparacionAuto reparacion1 = new ReparacionAuto("auto 1");
        ReparacionAuto reparacion2 = new ReparacionAuto("auto 2");

        // Crear tareas de lavado
        LavadoAuto lavado1 = new LavadoAuto("auto 3");
        LavadoAuto lavado2 = new LavadoAuto("auto 4");

        // Crear hilos para las tareas de lavado
        Thread hiloLavado1 = new Thread(lavado1);
        Thread hiloLavado2 = new Thread(lavado2);

        // Iniciar los hilos
        reparacion1.start();
        reparacion2.start();
        hiloLavado1.start();
        hiloLavado2.start();

        // Esperar a que todos los hilos terminen
        try {
            reparacion1.join();
            reparacion2.join();
            hiloLavado1.join();
            hiloLavado2.join();
        } catch (InterruptedException e) {
            System.err.println("Ejecución interrumpida.");
        }

        System.out.println("Todos los procesos han finalizado.");
    }
}