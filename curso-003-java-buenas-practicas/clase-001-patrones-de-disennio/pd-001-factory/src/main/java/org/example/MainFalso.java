package org.example;

import org.example.enums.TipoDePago;

public class MainFalso {

    public static void main(String[] args) {
        // Ejemplo con if-else if
        TipoDePago tipoPagoBuscado = TipoDePago.TARJETA_CREDITO; // Ejemplo de uso

       if (tipoPagoBuscado == TipoDePago.TARJETA_CREDITO) {
            crearPagoTarjetaCredito();
       } else if (tipoPagoBuscado == TipoDePago.TARJETA_DEBITO) {
           crearPagoTarjetaDebito();
       }else {
           crearPagoEfectivo();
       }

// TODO: 03/01/2025 hasta 2 validaciones se pueden manejar, que pasa si necesitamos mas tipos de pago
//  El patron factory lo que nos recomienda en que fabriquemos una clase por cada una de
//  las condiciones que tenemos, una interfaz y una clase abstracta y devolvamos intancias.

    }

    private static void crearPagoEfectivo() {
        System.out.println("Crear pago con el constructor = new Efectivo() ");
    }

    private static void crearPagoTarjetaDebito() {
        System.out.println("Crear pago con el constructor = new TarjetaDebito() ");
    }

    private static void crearPagoTarjetaCredito() {
        System.out.println("Crear pago con el constructor = new TarjetaCredito() ");
    }
}
