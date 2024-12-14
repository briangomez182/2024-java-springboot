package org.example.hilos_clase_thread;

public class MiHilo extends Thread{

    private String nombre;

    // constructor vacio del padre, y con parametro de la clase hija.
    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    //Sobrescribimos el metodo RUN
    @Override
    public void run() {
        //super.run();
        for (int i = 1; i <= 5; i++) {
                    System.out.println(this.nombre + ": Contador " + i);
                    try {
                        // Agregar una pausa para simular un peticion a n servicio
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
        }

    }
}
