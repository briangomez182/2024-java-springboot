package org.example.implementaciones;

import org.example.interfaces.Pago;

public class PagoEfectivo implements Pago {
    @Override
    public void crearPago() {
        System.out.println("Logica de Pago con EFECTIVO.");
    }
}
