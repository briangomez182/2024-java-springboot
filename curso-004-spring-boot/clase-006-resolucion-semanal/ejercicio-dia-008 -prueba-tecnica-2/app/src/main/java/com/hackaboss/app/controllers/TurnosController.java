package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.TurnoDTO;
import com.hackaboss.app.services.TurnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/turnos")
public class TurnosController {

    //iniciar con @Autowired y luego cuando todo este Ok cambiar con los otros metodos de Inyeccion de dependencia
    @Autowired
    private TurnoServicio service;

    //Inyectamos la clase UsuarioService en este controlador
    @GetMapping({"/", ""}) //si el usuario escribe al final de turno la / o no
    public ResponseEntity<List<TurnoDTO>> obtenerTodosLosTurnos() {
        List<TurnoDTO> listado = service.buscarTodos();
        return  ResponseEntity.status(200).body(listado);
    }

    //Inyectamos la clase UsuarioService en este controlador
    @GetMapping("/filtrarPor") //si el usuario escribe al final de turno la / o no
    public ResponseEntity<List<TurnoDTO>> obtenerTodosLosTurnosPorFecha(@RequestParam LocalDate fecha) {
        List<TurnoDTO> listado = service.buscarPorfecha(fecha.atStartOfDay());
        return  ResponseEntity.status(200).body(listado);
    }


    @GetMapping("/{id}") //si el usuario escribe al final de turno la / o no
    public ResponseEntity<TurnoDTO>  obtenerTurnoPorId(@PathVariable Long id) {
        TurnoDTO turnoEncontrada = service.buscarPorTurneroId(id);
        return  ResponseEntity.status(200).body(turnoEncontrada);
    }

    @PostMapping({"/", ""})
    public ResponseEntity<TurnoDTO> crearTurno(@RequestBody TurnoDTO turnoDTO) {
        TurnoDTO turnoCreada = service.crear(turnoDTO);
        return ResponseEntity.status(201).body(turnoCreada);
    }

    // Actualizar turno Completamente
    @PutMapping("/{id}")
    public ResponseEntity<TurnoDTO> actualizarTurno(@PathVariable Long id, @RequestBody TurnoDTO turnoDTO) {
        TurnoDTO turnoActualizada = service.actualizar(id, turnoDTO);
        return ResponseEntity.ok(turnoActualizada);
    }

    // Eliminar turno
    @DeleteMapping("/{id}")
    public ResponseEntity<List<TurnoDTO>> eliminarTurno(@PathVariable Long id) {
        List<TurnoDTO> listado = service.eliminar(id);
         return ResponseEntity.ok(listado);
         // codigo 204 es para decir que no hay contenido por que fue eliminado
    }


}
