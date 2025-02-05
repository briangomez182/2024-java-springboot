package app.services;

import app.dtos.DishDTO;
import app.dtos.DishResponseDTO;
import app.dtos.IngredientDTO;
import app.models.Estudiante;

import java.util.List;

public interface PlatoServiceInterfaz {

    DishResponseDTO getDishDetails(String dishName);

    DishDTO findByNamePlato(String name);

}
