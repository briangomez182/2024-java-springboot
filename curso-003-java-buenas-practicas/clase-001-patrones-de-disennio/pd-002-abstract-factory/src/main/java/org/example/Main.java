package org.example;

import org.example.entities.Cliente;
import org.example.factories.FabricaProductos1;
import org.example.factories.FabricaProductos2;
import org.example.interfaces.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        //crear un cliente que contenga productos 1
        AbstractFactory fabrica1 = new FabricaProductos1();
        Cliente carlos = new Cliente(fabrica1);
        carlos.ejecutarOperaciones();

        //crear un cliente que contenga productos 2
        AbstractFactory fabrica2 = new FabricaProductos2();
        Cliente brian = new Cliente(fabrica2);
        brian.ejecutarOperaciones();
    }
}