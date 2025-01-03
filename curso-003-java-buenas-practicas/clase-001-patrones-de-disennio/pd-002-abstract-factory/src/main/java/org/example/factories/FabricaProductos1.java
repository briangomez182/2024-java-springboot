package org.example.factories;

import org.example.entities.ProductoA1;
import org.example.entities.ProductoB1;
import org.example.interfaces.AbstractFactory;
import org.example.interfaces.ProductoA;
import org.example.interfaces.ProductoB;

public class FabricaProductos1 implements AbstractFactory {
    @Override
    public ProductoA crearProductoA() {
        return new ProductoA1();
    }

    @Override
    public ProductoB crearProductoB() {
        return new ProductoB1();
    }
}
