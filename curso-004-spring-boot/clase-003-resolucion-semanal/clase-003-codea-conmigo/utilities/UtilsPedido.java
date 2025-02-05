package com.hackaboss.app.utilities;

import com.hackaboss.app.models.Menu;
import com.hackaboss.app.models.Pedido;
import com.hackaboss.app.models.Platillo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class UtilsPedido {

    private List<Pedido> ordenDePedidos;

    public UtilsPedido() {
        this.ordenDePedidos = new ArrayList<>();

    }

    public ResponseEntity createPedido(Pedido pedido) {
        pedido.setId(this.ordenDePedidos.size()+ 1L);
        UtilsMenu menu = new UtilsMenu();
        List<Platillo> platillosDelPedido = pedido.getPedidos().stream().map(platillo -> menu.encontrarPlatillo(platillo.getId())).toList();
        return ResponseEntity.status(201).body(platillosDelPedido);
    }

    /* Postman
    {
        "nombre": "Ensalad rusa",
        "cliente": "Brian gomez - Mesa 4",
        "pedidos": [{"id": 1},{"id": 8}]
    }*/
}
