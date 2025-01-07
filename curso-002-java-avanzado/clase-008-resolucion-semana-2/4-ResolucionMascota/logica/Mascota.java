package com.pruebajpa.resolucionmascota.logica;

public class Mascota <T>{
    
    private int id;
    private String nombre;
    private int edad;
    private T especie;

    public Mascota(int id, String nombre, int edad, T especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public T getEspecie() {
        return especie;
    }
    
}
