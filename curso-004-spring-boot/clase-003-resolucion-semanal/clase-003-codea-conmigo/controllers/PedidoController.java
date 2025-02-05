package com.hackaboss.app.controllers;

import com.hackaboss.app.models.Pedido;
import com.hackaboss.app.models.Platillo;
import com.hackaboss.app.utilities.UtilsPedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    UtilsPedido utilsPedido = new UtilsPedido();
    @PostMapping("/agregar")
    public ResponseEntity crearPedido(@RequestBody Pedido pedido){
        return utilsPedido.createPedido(pedido);
    }


}
