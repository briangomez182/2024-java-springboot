package org.example.implementaciones;

import org.example.interfaces.Pago;

public class PagoDebito implements Pago {
    @Override
    public void crearPago() {
        System.out.println("Logica de Pago con DEBITO.");
    }
}
