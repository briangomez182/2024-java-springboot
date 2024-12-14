package org.example.hilos_interfaz_runnable;

public class HiloRunnable implements Runnable { // Ejecutable
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador " + i);
            try {
                // Agregar una pausa para simular un peticion a n servicio
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
