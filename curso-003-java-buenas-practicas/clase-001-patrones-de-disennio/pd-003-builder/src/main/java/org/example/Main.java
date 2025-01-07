package org.example;



public class Main {


    public static void main(String[] args) {
        // Usando el Builder para crear un coche
        Auto miAuto = new Auto.ConstruirAuto()
                .conMarca("Toyota")
                .conModelo("Corolla")
                .conColor("Rojo")
                .conNumeroPuertas(5)
                .construir();

        System.out.println(miAuto.toString());
    }

}