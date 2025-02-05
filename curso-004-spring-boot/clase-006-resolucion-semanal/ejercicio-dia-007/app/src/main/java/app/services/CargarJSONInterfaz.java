package app.services;

import app.dtos.DishDTO;
import app.dtos.IngredientDTO;

import java.util.List;

public interface CargarJSONInterfaz {

    List<IngredientDTO> loadDataBaseIngredientes();

    List<DishDTO> loadDataBasePlatos();
}
