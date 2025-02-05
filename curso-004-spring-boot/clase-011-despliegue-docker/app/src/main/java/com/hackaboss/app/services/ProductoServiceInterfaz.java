package com.hackaboss.app.services;

import com.hackaboss.app.DTOs.ProductoDTO;

import java.util.List;

public interface ProductoServiceInterfaz {

    List<ProductoDTO> encontrarTodos();

    ProductoDTO encontrarUno(Long id);
}
