package com.hackaboss.app.controllers;

import com.hackaboss.app.DTOs.ProductoDTO;
import com.hackaboss.app.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping({"/",""})
    public List<ProductoDTO> holaMundoSeguro() {
        return productoService.encontrarTodos();
    }

    @GetMapping("/id/{id}")
    public ProductoDTO holaMundoNoSeguro(@PathVariable Long id) {
        return productoService.encontrarUno(id);
    }
}
