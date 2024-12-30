package org.example.codeaConmigo;

import java.util.List;

public class Auto {
    private int id;
    private String marca;
    private String modelo;
    private int kilometraje;

    // Constructor
    public Auto(int id, String marca, String modelo, int kilometraje) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    // Método recursivo para calcular el kilometraje total
    public static int calcularKilometrajeTotal(List<Auto> autos, int index, int suma) {
        if (index == autos.size()) { // Caso base: hemos recorrido todos los autos
            return suma;
        }
        // Llamada recursiva: sumar el kilometraje actual y avanzar al siguiente índice
        return calcularKilometrajeTotal(autos, index + 1, suma + autos.get(index).getKilometraje());
    }

    // Método recursivo para buscar un auto por marca
    public static Auto buscarAutoPorMarca(List<Auto> autos, int index, String marcaBuscada) {
        if (index == autos.size()) { // Caso base: no encontramos el auto
            return null;
        }
        if (autos.get(index).getMarca().equalsIgnoreCase(marcaBuscada)) { // Auto encontrado
            return autos.get(index);
        }
        // Llamada recursiva: buscar en el siguiente índice
        return buscarAutoPorMarca(autos, index + 1, marcaBuscada);
    }

    @Override
    public String toString() {
        return "Auto{id=" + id + ", marca='" + marca + "', modelo='" + modelo + "', kilometraje=" + kilometraje + "}";
    }
}
