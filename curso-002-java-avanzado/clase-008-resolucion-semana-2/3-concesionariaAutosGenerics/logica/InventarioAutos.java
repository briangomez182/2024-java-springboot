package com.pruebajpa.concesionariaautos.logica;

import java.util.ArrayList;
import java.util.List;

    public class InventarioAutos<T extends Auto> {
    private List<T> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        inventario.add(auto);
    }

    public List<T> buscarPorMarca(String marcaABuscar) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getMarca().equals(marcaABuscar)) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public List<T> buscarPorAnio(int anioABuscar) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getAnio() == anioABuscar) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (T auto : inventario) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}

