package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.entities.Curso;
import com.hackaboss.app.entities.Tema;
import com.hackaboss.app.respositories.CursoRepositorioInterfaz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CursoServiceTest {

    @InjectMocks
    private CursoServicio service;

    @Mock
    private CursoRepositorioInterfaz repository;


    @Test
    @DisplayName("Encuentrar lista de cursos")
    void encontrarTodasLasCursos() {
        // Crea una lista de objetos qeu quieres que retorne el metodo a probar
        List<Curso> cursosMock = List.of(
                new Curso(1L, "Java Basico", "Teorico", LocalDate.now(), new ArrayList<>()),
                new Curso(2L, "Java Avanzado", "Practico", LocalDate.now(), new ArrayList<>())
        );

        // Define el comportamiento del mock del repositorio
        when(repository.findAll()).thenReturn(cursosMock);

        // Llama al método del servicio
        List<CursoDTO> cursosDelServicio = service.buscarTodos();

        // Verifica los valores de los atributos de los objetos DTO
        assertThat(cursosDelServicio.get(0).getIdentificador()).isEqualTo(1L);
        assertThat(cursosDelServicio.get(0).getNombre()).isEqualTo("Java Basico");
        assertThat(cursosDelServicio.get(0).getTipoCurso()).isEqualTo("Teorico");
        assertThat(cursosDelServicio.get(0).getFechaFinalizacion()).isEqualTo("2025-02-13");
        assertThat(cursosDelServicio.get(0).getTemas().size()).isEqualTo(0);

        assertThat(cursosDelServicio.get(1).getIdentificador()).isEqualTo(2L);
        assertThat(cursosDelServicio.get(1).getNombre()).isEqualTo("Java Avanzado");
        assertThat(cursosDelServicio.get(1).getTipoCurso()).isEqualTo("Practico");
        assertThat(cursosDelServicio.get(0).getFechaFinalizacion()).isEqualTo("2025-02-13");
        assertThat(cursosDelServicio.get(0).getTemas().size()).isEqualTo(0);

        // Verifica el tamaño de la lista
        assertThat(cursosDelServicio).hasSize(2);

    }

    @Test
    @DisplayName("Encuentra una curso por ID existente")
    void buscarPorId(){

        Long idBuscado = 1L;

        // Crea un objeto que quieres que retorne el metodo a probar
        Curso cursoParaValidar =  new Curso(idBuscado, "Nuevo Curso", "Teorico", LocalDate.now(), new ArrayList<>());

        when(repository.findById(idBuscado)).thenReturn(Optional.of(cursoParaValidar));

        // Busca el objeto o la coleccion que quiere testear
        CursoDTO productoObtenido = service.buscarPorCurso(idBuscado);

        //recupar DTO
        Curso cursoEncontrado = service.convertirHaciaEntidad(productoObtenido);

        //verifica si son el mismo objeto

        assertThat(cursoEncontrado.getNombre()).isEqualTo("Nuevo Curso");
        assertThat(cursoEncontrado.getTipoCurso()).isEqualTo("Teorico");
        assertThat(cursoEncontrado.getFechaFinalizacion()).isEqualTo("2025-02-13");
        assertThat(cursoEncontrado.getTemas().size()).isEqualTo(0);

    }

}