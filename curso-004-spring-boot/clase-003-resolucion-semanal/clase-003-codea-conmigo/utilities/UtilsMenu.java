package com.hackaboss.app.utilities;

import com.hackaboss.app.models.Menu;
import com.hackaboss.app.models.Platillo;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilsMenu {
    private final String TIPO_MENU_CARNIVORO= "carnivoro";
    private final String TIPO_MENU_VEGETARIANO= "vegetariano";

    private List<Platillo> menu;

    public UtilsMenu() {
        this.menu = new ArrayList<>();

        menu.add( new Platillo(1L, "Plato Vegetariano #1", "Lechuga y tomates", 25.00, TIPO_MENU_VEGETARIANO));
        menu.add( new Platillo(2L, "Plato Vegetariano #2", "Lechuga y tomates, morron", 25.00,TIPO_MENU_VEGETARIANO));
        menu.add( new Platillo(3L, "Plato Vegetariano #3", "Lechuga y tomates, limon", 25.00, TIPO_MENU_VEGETARIANO));
        menu.add( new Platillo(4L, "Plato de Carnes #1", "Milanesa de carne y pure", 25.00, TIPO_MENU_CARNIVORO));
        menu.add( new Platillo(5L, "Plato de Carnes #2", "Milanesa de carne, papas fritas", 25.00, TIPO_MENU_CARNIVORO));
        menu.add( new Platillo(6L, "Plato de Carnes #3", "Milanesa de carne y limon", 25.00, TIPO_MENU_CARNIVORO));

    }

    public ResponseEntity findAll(String tipoMenu) {
        if (tipoMenu == null) {
            return ResponseEntity.status(200).body(this.menu);
        }else{
            List<Platillo> menuFiltrado = this.menu.stream().filter(platillo -> platillo.getTipoMenu().equalsIgnoreCase(tipoMenu)).toList();
            return ResponseEntity.status(200).body(menuFiltrado);
        }

    }


    public ResponseEntity createPlatillo(Platillo platillo) {
        platillo.setId(this.menu.size() + 1L);
        this.menu.add(platillo);
        return ResponseEntity.status(201).body(platillo);
    }

    public Platillo encontrarPlatillo(Long idPlatilloBuscado){
        return this.menu.stream().filter(platillo -> platillo.getId() == idPlatilloBuscado).findFirst().orElse(null);
    }


}
