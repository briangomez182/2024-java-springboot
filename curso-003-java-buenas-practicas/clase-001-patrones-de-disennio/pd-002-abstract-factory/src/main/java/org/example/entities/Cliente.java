package org.example.entities;

import org.example.interfaces.AbstractFactory;
import org.example.interfaces.ProductoA;
import org.example.interfaces.ProductoB;

public class Cliente {

    private ProductoA productoA;
    private ProductoB productoB;

    //crear constructor con su args pero pansadole por parametro el AbstractFactory
    public Cliente(AbstractFactory fabrica) {
        this.productoA = fabrica.crearProductoA();
        this.productoB = fabrica.crearProductoB();
    }

    // crear un metodo para ejecute las operaciones mediante los atributos del cliente
    public void ejecutarOperaciones() {
        this.productoA.operacionA();
        this.productoB.operacionB();
    }

}
