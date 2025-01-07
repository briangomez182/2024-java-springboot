package org.example;

public class Auto {

    private String marca;
    private String modelo;
    private String color;
    private int numeroPuertas;


    // Constructor privado (solo se puede acceder desde el Builder)
    private Auto(ConstruirAuto builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.color = builder.color;
        this.numeroPuertas = builder.numeroPuertas;

    }

    // Getters para los atributos (opcional, dependiendo de si necesitas acceder a ellos)


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                '}';
    }

    //Creo un clase Builder dentro de la clase coche
     // Clase Builder (la que construye el objeto Coche)
    public static class ConstruirAuto {
        private String marca;
        private String modelo;
        private String color;
        private int numeroPuertas;


        public ConstruirAuto() {
            // el nombre que se estila poner a este constructor es NombreDeClase + Builder()
        }

        public ConstruirAuto conMarca(String marca) {
             this.marca = marca;
            return this;// Importante: devuelve el Builder para encadenar llamadas
        }

        public ConstruirAuto conModelo(String modelo) {
            this.modelo = modelo;
            return this; // Importante: devuelve el Builder para encadenar llamadas
        }

        public ConstruirAuto conColor(String color) {
            this.color = color;
            return this; // Importante: devuelve el Builder para encadenar llamadas
        }

        public ConstruirAuto conNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public Auto construir() {
            // el nombre que se estila poner a este metodo es build();
            return new Auto(this); // Crea el objeto Coche usando el Builder
        }
    }

}
