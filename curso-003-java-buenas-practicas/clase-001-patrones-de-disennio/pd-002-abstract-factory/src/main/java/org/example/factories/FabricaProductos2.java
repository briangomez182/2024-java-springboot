package org.example.factories;

import org.example.entities.ProductoA2;
import org.example.entities.ProductoB2;
import org.example.interfaces.AbstractFactory;
import org.example.interfaces.ProductoA;
import org.example.interfaces.ProductoB;

public class FabricaProductos2 implements AbstractFactory {
    @Override
    public ProductoA crearProductoA() {
        return new ProductoA2();
    }

    @Override
    public ProductoB crearProductoB() {
        return new ProductoB2();
    }
}
