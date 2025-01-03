package org.example.factories;

import org.example.enums.TipoDePago;
import org.example.implementaciones.PagoCredito;
import org.example.implementaciones.PagoDebito;
import org.example.implementaciones.PagoEfectivo;
import org.example.interfaces.Pago;

import java.util.Map;

public class PagoFactory {

    private static final Map<TipoDePago, Pago> creadoresDePago = Map.of(
            TipoDePago.TARJETA_CREDITO, new PagoCredito(),
            TipoDePago.TARJETA_DEBITO, new PagoDebito(),
            TipoDePago.DINERO_EFECTIVO, new PagoEfectivo()
    );
    public Pago fabricarPago(TipoDePago tipoDePagoBuscado){
            return creadoresDePago.get(tipoDePagoBuscado);
    }
}
