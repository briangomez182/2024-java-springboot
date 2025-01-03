package org.example.entities;

import org.example.interfaces.ProductoB;

public class ProductoB2 implements ProductoB {
    @Override
    public void operacionB() {
        System.out.println("Grupo Familiar del Producto B - 2do Producto ejecutado.");
    }
}
