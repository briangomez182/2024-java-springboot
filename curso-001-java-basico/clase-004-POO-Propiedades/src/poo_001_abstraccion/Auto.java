package poo_001_abstraccion;

public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Auto() {
    }

    // Constructor
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    // Métodos
    public void acelerar() {
        velocidad += 10;
        System.out.println("El auto está acelerando. Velocidad actual: " + velocidad + " km/h");
    }

    // TODO: 24/11/2024 publico y luego protected, y luego private
    public void frenar() {
        velocidad -= 10;
        System.out.println("El auto está frenando. Velocidad actual: " + velocidad + " km/h");
    }

}