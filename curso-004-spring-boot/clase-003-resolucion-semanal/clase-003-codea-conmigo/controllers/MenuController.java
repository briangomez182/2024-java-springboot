package com.hackaboss.app.controllers;

import com.hackaboss.app.models.Platillo;
import com.hackaboss.app.utilities.UtilsMenu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    UtilsMenu utilsMenu = new UtilsMenu();

    @GetMapping({"/", ""})
    public ResponseEntity obtenerMenu(@RequestParam(required = false) String tipoMenu){
        return utilsMenu.findAll(tipoMenu);
    }
    

    @PostMapping("/agregar")
    public ResponseEntity crearPlatillo(@RequestBody Platillo platillo){
        return utilsMenu.createPlatillo(platillo);
    }
    

}
