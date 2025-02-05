package app.controllers;

import app.dtos.DishResponseDTO;
import app.services.PlatoServiceInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plato")
public class PlatoController {

    @Autowired
    PlatoServiceInterfaz platoServiceInterfaz;

    @GetMapping("/{nombrePlato}")
    public DishResponseDTO getDish(@PathVariable String nombrePlato) {
        return platoServiceInterfaz.getDishDetails(nombrePlato);
    }

}
