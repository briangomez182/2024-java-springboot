package com.pruebajpa.concesionariaautos;

import com.pruebajpa.concesionariaautos.logica.Auto;
import com.pruebajpa.concesionariaautos.logica.InventarioAutos;
import java.util.List;

public class ConcesionariaAutos {

    public static void main(String[] args) {
// Ejemplo de uso
Auto auto1 = new Auto("Toyota", "Corolla", 2023, 25000.0);
Auto auto2 = new Auto("Honda", "Civic", 2022, 22000.0);

InventarioAutos<Auto> inventario = new InventarioAutos<>();
inventario.agregarAuto(auto1);
inventario.agregarAuto(auto2);

List<Auto> autosToyota = inventario.buscarPorMarca("Toyota");
List<Auto> autos2022 = inventario.buscarPorAnio(2022);

double valorTotalInventario = inventario.calcularValorTotal();
System.out.println("Valor total del inventario: $" + valorTotalInventario);

    }
}
