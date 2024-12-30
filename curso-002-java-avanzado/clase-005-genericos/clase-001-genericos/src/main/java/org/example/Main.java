package org.example;

import org.example.entities.Electronico;
import org.example.entities.Producto;
import org.example.entities.Ropa;
import org.example.genericas.ProductoInventario;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // Crear inventario para electrónicos
        ProductoInventario<Electronico> inventarioElectronico = new ProductoInventario<>();
        inventarioElectronico.agregarProducto(new Electronico("Laptop", 1200.0, "MarcaX"));
        inventarioElectronico.agregarProducto(new Electronico("Smartphone", 800.0, "MarcaY"));

        // Crear inventario para ropa
        ProductoInventario<Ropa> inventarioRopa = new ProductoInventario<>();
        inventarioRopa.agregarProducto(new Ropa("Camiseta", 20.0, "M", "Algodón"));
        inventarioRopa.agregarProducto(new Ropa("Jeans", 50.0, "32", "Denim"));


        // Mostrar inventarios
        inventarioElectronico.mostrarInventario();
        inventarioRopa.mostrarInventario();



    }

}