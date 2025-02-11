package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.services.TemaServicioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    TemaServicioInterfaz servicio;

    @GetMapping({"/",""})
    public ResponseEntity<List<TemaDTO>> buscarTemas(){
        //servicio
        List<TemaDTO> listado = servicio.buscarTodos();
        return ResponseEntity.ok(listado);
    }


    @PostMapping({"/",""})
    public ResponseEntity<TemaDTO> crearTemas(@RequestBody TemaDTO temaDTO){
        //servicio
        TemaDTO temaGuardado = servicio.crear(temaDTO);
        return ResponseEntity.ok(temaGuardado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TemaDTO> actualizarTemas(@PathVariable Long id, @RequestBody TemaDTO temaDTO){
        //servicio
        TemaDTO temaActualizado = servicio.actualizar(id, temaDTO);
        return ResponseEntity.ok(temaActualizado);
    }

}
