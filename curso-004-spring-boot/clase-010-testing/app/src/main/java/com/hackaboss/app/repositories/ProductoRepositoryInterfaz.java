package com.hackaboss.app.repositories;

import com.hackaboss.app.DTOs.ProductoDTO;

import java.util.List;

public interface ProductoRepositoryInterfaz {

    List<ProductoDTO> encontrarTodos();

    ProductoDTO encontrarUno(Long id);
}
