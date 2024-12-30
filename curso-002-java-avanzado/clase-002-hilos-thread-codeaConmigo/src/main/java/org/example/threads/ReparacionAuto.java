package org.example.threads;

import java.util.Random;

public class ReparacionAuto extends Thread {
    private final String auto;

    public ReparacionAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public void run() {
        try {
            System.out.println("Inicio de reparación del " + auto);
            int tiempo = new Random().nextInt(5) + 1; // Tiempo aleatorio entre 1 y 5 segundos
            Thread.sleep(tiempo * 1000);
            System.out.println("Fin de reparación del " + auto);
        } catch (InterruptedException e) {
            System.err.println("Reparación interrumpida para " + auto);
        }
    }
}




