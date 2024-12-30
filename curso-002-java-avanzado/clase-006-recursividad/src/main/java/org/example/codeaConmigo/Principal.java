package org.example.codeaConmigo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        // Crear lista de autos
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto(1, "Toyota", "Corolla", 50000));
        autos.add(new Auto(2, "Honda", "Civic", 45000));
        autos.add(new Auto(3, "Ford", "Focus", 30000));
        autos.add(new Auto(4, "Toyota", "Yaris", 20000));

        // Calcular kilometraje total
        int kilometrajeTotal = Auto.calcularKilometrajeTotal(autos, 0, 0);
        System.out.println("Kilometraje total de los autos: " + kilometrajeTotal);

        // Buscar un auto por marca
        String marcaBuscada = "Toyota";
        Auto autoEncontrado = Auto.buscarAutoPorMarca(autos, 0, marcaBuscada);
        System.out.println(autoEncontrado != null ? "Auto encontrado: " + autoEncontrado : "Auto no encontrado.");
    }
}
