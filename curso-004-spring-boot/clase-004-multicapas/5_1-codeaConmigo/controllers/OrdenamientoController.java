package com.ejercicios.apiOrdenamieto.controllers;

import com.ejercicios.apiOrdenamieto.services.OrdenService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordenamiento")
public class OrdenamientoController {
   
    
    private OrdenService ordenSv = new OrdenService();

 
    //usamos post porque le vamos a enviar la lista de nombres que queremos que nos ordene
    @PostMapping("/ordenar-nombres")
    public ResponseEntity<List<String>> ordenarNombres(@RequestBody List<String> listaNombres) {
        
        List<String> listaOrdenada = ordenSv.ordenarNombres(listaNombres);
        return new ResponseEntity<>(listaOrdenada, HttpStatus.OK);
    }
    
    
}
