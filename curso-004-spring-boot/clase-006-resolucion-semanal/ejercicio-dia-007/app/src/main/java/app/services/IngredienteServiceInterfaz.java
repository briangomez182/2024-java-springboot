package app.services;

import app.dtos.IngredientDTO;

import java.util.List;

public interface IngredienteServiceInterfaz {

    List<IngredientDTO> getAllIngredients();

    IngredientDTO findByNameIngredientes(Long idIngrediente);
}
