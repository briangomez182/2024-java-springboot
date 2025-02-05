package com.hackaboss.app.repositories;

import com.hackaboss.app.DTOs.ProductoDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductoRepository implements ProductoRepositoryInterfaz {

    private List<ProductoDTO> listado;

    public ProductoRepository() {
        this.listado = List.of( new ProductoDTO(1L, "Telefono", 2000),
                new ProductoDTO(2L, "Tablet", 4000),
                new ProductoDTO(3L, "Laptop", 6000));
    }

    @Override
    public List<ProductoDTO> encontrarTodos() {
        return this.listado;
    }

    @Override
    public ProductoDTO encontrarUno(Long id) {
        return this.listado.stream().filter(productoDTO -> productoDTO.getId() == id).findFirst().orElse(null);
    }
}
