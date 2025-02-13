package com.app.services;

import com.app.dtos.PersonaDTO;
import com.app.entities.Persona;
import com.app.repositories.PesonaRepositorioInterfaz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class) // Para usar Mockito
public class PersonaServiceTest {

    @InjectMocks // Inyecta el mock en el servicio
    private PersonaService service;

    @Mock // Simula el ProductoRepository
    private PesonaRepositorioInterfaz repository;

    @Test
    @DisplayName("Encuentrar lista de personas")
    void encontrarTodasLasPersonas() {
        // Crea una lista de objetos qeu quieres que retorne el metodo a probar
        List<Persona> productos = List.of(
                new Persona(1L, "Brian", "Gomez", 21),
                new Persona(2L, "Jiss", "Sanchez", 22)
        );

        // Define el comportamiento del mock del repositorio
        when(repository.findAll()).thenReturn(productos);

        // Llama al método del servicio
        List<PersonaDTO> personasDelServicio = service.buscarTodos();

        // Verifica los valores de los atributos de los objetos DTO
        assertThat(personasDelServicio.get(0).getIdentificador()).isEqualTo(1L);
        assertThat(personasDelServicio.get(0).getNombre()).isEqualTo("Brian");
        assertThat(personasDelServicio.get(0).getApellido()).isEqualTo("Gomez");
        assertThat(personasDelServicio.get(0).getEdad()).isEqualTo(21);

        assertThat(personasDelServicio.get(1).getIdentificador()).isEqualTo(2L);
        assertThat(personasDelServicio.get(1).getNombre()).isEqualTo("Jiss");
        assertThat(personasDelServicio.get(1).getApellido()).isEqualTo("Sanchez");
        assertThat(personasDelServicio.get(1).getEdad()).isEqualTo(22);

        // Verifica el tamaño de la lista
        assertThat(personasDelServicio).hasSize(2);

    }

    @Test
    @DisplayName("Encuentra una persona por ID existente")
    void buscarPorId(){

        Long idBuscado = 1L;

        // Crea un objeto que quieres que retorne el metodo a probar
        Persona personaParaValidar =    new Persona(idBuscado, "Brian", "Gomez", 21);

        when(repository.findById(idBuscado)).thenReturn(Optional.of(personaParaValidar));

        // Busca el objeto o la coleccion que quiere testear
        PersonaDTO productoObtenido = service.buscarPorId(idBuscado);

        // Then: Se verifica que el producto obtenido es el esperado
        assertThat(productoObtenido).isNotNull();

        //convertir de entidad a DTO
        PersonaDTO PersonaConvertida = service.convertirPersonaHaciaDTO(personaParaValidar);

        //verifica si son el mismo objeto
        assertThat(productoObtenido).isEqualTo(PersonaConvertida);

    }

    @Test
    @DisplayName("idPersona no existente lanza un NULL")
    void encontrarUnoConIdNoExistente() {
        // Imita el recibir un id por parametro
        Long idNoExistente = 5L;

        // Crea un objeto o una coleccion esperada
        Persona productoEsperado = new Persona(null,null,null,null);

        when(repository.findById(idNoExistente)).thenReturn(Optional.of(productoEsperado));

        // Busca el objeto o la coleccion que quiere testear
        PersonaDTO productoObtenido = service.buscarPorId(idNoExistente);

        //convertir de DTO a Entidad
        Persona PersonaConvertida = service.convertirDTOHaciaPersona(productoObtenido);

        //verifica si son el mismo objeto
        assertThat(productoEsperado).isEqualTo(PersonaConvertida);
    }
}
