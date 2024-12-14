package org.example;

import org.example.hilos_clase_thread.MiHilo;
import org.example.hilos_interfaz_runnable.HiloRunnable;

public class Main {
    public static void main(String[] args) {

       /* MiHilo miHilo1 = new MiHilo("Hilo 1)--->");
        MiHilo miHilo2 = new MiHilo("Hilo 2)--->");*/

        //miHilo1.start();     // Iniciamos los hilos con .start()
        //miHilo2.start();    // Mi app NO esperar que finalice el primer hilo para arrancar el siguiente

        /*----------------------    Runnable    --------------------------------------------*/
        /*Clase padre         instanciando al hijo*/
        Runnable miRunnable = new HiloRunnable();
        Thread miHilo1 = new Thread(miRunnable);
        miHilo1.start();

        Thread miHilo2 = new Thread(miRunnable);
        miHilo2.start();


    }
}