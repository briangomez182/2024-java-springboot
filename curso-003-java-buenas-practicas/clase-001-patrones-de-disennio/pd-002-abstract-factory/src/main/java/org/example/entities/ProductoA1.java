package org.example.entities;

import org.example.interfaces.ProductoA;

public class ProductoA1 implements ProductoA {
    @Override
    public void operacionA() {
        System.out.println("Grupo Familiar del Producto A - 1er Producto ejecutado.");
    }
}
