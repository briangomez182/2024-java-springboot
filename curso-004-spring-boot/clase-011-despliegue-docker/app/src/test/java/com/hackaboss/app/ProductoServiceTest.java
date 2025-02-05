package com.hackaboss.app;

import com.hackaboss.app.DTOs.ProductoDTO;
import com.hackaboss.app.repositories.ProductoRepository;
import com.hackaboss.app.services.ProductoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class) // Para usar Mockito
public class ProductoServiceTest {

    @InjectMocks // Inyecta el mock en el servicio
    private ProductoService productoService;

    @Mock // Simula el ProductoRepository
    private ProductoRepository productoRepository;

    @Test
    void encontrarTodos() {

        // Crea un objeto o una coleccion esperada
        List<ProductoDTO> productosEsperados = List.of(
                new ProductoDTO(1L, "Telefono", 2000),
                new ProductoDTO(2L, "Tablet", 4000),
                new ProductoDTO(3L, "Laptop", 6000)
        );
        when(productoRepository.encontrarTodos()).thenReturn(productosEsperados);

        // Busca el objeto o la coleccion que quiere testear
        List<ProductoDTO> productosObtenidos = productoService.encontrarTodos();

        // Assert
        assertThat(productosObtenidos).isEqualTo(productosEsperados);
        assertThat(productosObtenidos).hasSize(3);
    }

    @Test
    void encontrarUnoConIdExistente() {
        // Imita el recibir un id por parametro
        Long idExistente = 2L;

        // Crea un objeto o una coleccion esperada
        ProductoDTO productoEsperado = new ProductoDTO(idExistente, "Tablet", 4000);
        when(productoRepository.encontrarUno(idExistente)).thenReturn(productoEsperado);

        // Busca el objeto o la coleccion que quiere testear
        ProductoDTO productoObtenido = productoService.encontrarUno(idExistente);

        // Assert
        assertThat(productoObtenido).isEqualTo(productoEsperado);
        assertThat(productoObtenido.getId()).isEqualTo(idExistente);
    }

    @Test
    void encontrarUnoConIdNoExistente() {
        // Imita el recibir un id por parametro
        Long idNoExistente = 5L;

        // Crea un objeto o una coleccion esperada
        ProductoDTO productoEsperado = null;

        when(productoRepository.encontrarUno(idNoExistente)).thenReturn(productoEsperado);

        // Assert
        assertThrows(NullPointerException.class, () -> productoService.encontrarUno(idNoExistente));
    }

}
