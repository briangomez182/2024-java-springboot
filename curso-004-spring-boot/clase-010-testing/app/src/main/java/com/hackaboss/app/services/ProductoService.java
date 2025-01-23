package com.hackaboss.app.services;

import com.hackaboss.app.DTOs.ProductoDTO;
import com.hackaboss.app.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements ProductoServiceInterfaz {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<ProductoDTO> encontrarTodos() {
        return productoRepository.encontrarTodos();
    }

    @Override
    public ProductoDTO encontrarUno(Long id) {
        ProductoDTO productoDTO = productoRepository.encontrarUno(id);
        if ( productoDTO== null) throw new NullPointerException("No encontrado XXXXXXXXXXXXXXXX");
            else return productoDTO;

    }
}
