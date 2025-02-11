package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.services.CursoServicioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    CursoServicioInterfaz servicio;

    @GetMapping({"/",""})
    public ResponseEntity<List<CursoDTO>> buscarCurso(@RequestParam(required = false) String nombre){
        //servicio
        List<CursoDTO> listado = servicio.buscarCursosPorNombre(nombre);
        return ResponseEntity.ok(listado);
    }



    @GetMapping("/{id}")
    public ResponseEntity<CursoDTO> buscarCursoEmail(@PathVariable Long id){
        //servicio
        CursoDTO turnoEncontrado = servicio.buscarPorCurso(id);
        return ResponseEntity.ok(turnoEncontrado);
    }

    @PostMapping({"/",""})
    public ResponseEntity<CursoDTO> crearCursos(@RequestBody CursoDTO cursoDTO){
        //servicio
        CursoDTO turnoGuardado = servicio.crear(cursoDTO);
        return ResponseEntity.ok(turnoGuardado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CursoDTO> actualizarCursos(@PathVariable Long id, @RequestBody CursoDTO cursoDTO){
        //servicio
        CursoDTO turnoActualizado = servicio.actualizar(id, cursoDTO);
        return ResponseEntity.ok(turnoActualizado);
    }
}
