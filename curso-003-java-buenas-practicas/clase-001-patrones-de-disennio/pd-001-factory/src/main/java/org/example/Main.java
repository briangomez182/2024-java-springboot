package org.example;

import org.example.enums.TipoDePago;
import org.example.factories.PagoFactory;
import org.example.interfaces.Pago;

public class Main {
    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();        // Instanciamos la Fabrica
        Pago pago = pagoFactory.fabricarPago(TipoDePago.TARJETA_DEBITO); // Le digo que quiero Fabricar
        pago.crearPago(); // producto fabricado
    }
}