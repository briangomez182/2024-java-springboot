package org.example.entities;

import org.example.interfaces.ProductoA;

public class ProductoA2 implements ProductoA {
    @Override
    public void operacionA() {
        System.out.println("Grupo Familiar del Producto A - 2do Producto ejecutado.");
    }
}
