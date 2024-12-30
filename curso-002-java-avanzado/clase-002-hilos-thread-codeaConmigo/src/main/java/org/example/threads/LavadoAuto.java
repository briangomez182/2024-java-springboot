package org.example.threads;

import java.util.Random;

public class LavadoAuto implements Runnable {
    private final String auto;

    public LavadoAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public void run() {
        try {
            System.out.println("Inicio de lavado del " + auto);
            int tiempo = new Random().nextInt(3) + 1; // Tiempo aleatorio entre 1 y 3 segundos
            Thread.sleep(tiempo * 1000);
            System.out.println("Fin de lavado del " + auto);
        } catch (InterruptedException e) {
            System.err.println("Lavado interrumpido para " + auto);
        }
    }
}