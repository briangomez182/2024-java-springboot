package com.hackaboss.app.models;

import java.util.List;

public class Pedido {
    private Long id;
    private String cliente;
    private List<Platillo> pedidos;

    public Pedido(Long id, String cliente, List<Platillo> pedidos) {
        this.id = id;
        this.cliente = cliente;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Platillo> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Platillo> pedidos) {
        this.pedidos = pedidos;
    }
}
