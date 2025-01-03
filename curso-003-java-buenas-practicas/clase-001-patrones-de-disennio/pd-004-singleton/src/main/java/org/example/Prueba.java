package org.example;

import org.example.singleton.ConfiguracionGlobal;

public class Prueba {

    public static void otroMetodo(){
        System.out.println("Desde otra clase " + ConfiguracionGlobal.getInstancia().getVersion());
    }
}
