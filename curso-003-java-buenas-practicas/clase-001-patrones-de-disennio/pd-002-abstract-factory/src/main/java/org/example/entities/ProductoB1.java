package org.example.entities;

import org.example.interfaces.ProductoA;
import org.example.interfaces.ProductoB;

public class ProductoB1 implements ProductoB {
    @Override
    public void operacionB() {
        System.out.println("Grupo Familiar del Producto B - 1er Producto ejecutado.");
    }
}
