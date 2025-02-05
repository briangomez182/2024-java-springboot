package app.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishResponseDTO {
    private String nombrePlato;
    private int totalCalorias;
    private List<IngredientDTO> ingredientes;
    private IngredientDTO ingredienteMasCalorico;
}