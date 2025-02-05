package app.services;

import app.dtos.DishDTO;
import app.dtos.DishResponseDTO;
import app.dtos.IngredientDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlatoService implements PlatoServiceInterfaz, IngredienteServiceInterfaz, CargarJSONInterfaz{

    private List<DishDTO> dishes = new ArrayList<>();
    private List<IngredientDTO> ingredients = new ArrayList<>();

    public PlatoService() {
        this.dishes = this.loadDataBasePlatos();
        this.ingredients = this.loadDataBaseIngredientes();

    }


    @Override
    public DishResponseDTO getDishDetails(String dishName) {
        DishDTO dish = this.findByNamePlato(dishName);
        if (dish == null) return null;

        List<IngredientDTO> ingredientDetails = dish.getIngredientes().stream()
                .map(this::findByNameIngredientes)
                .collect(Collectors.toList());

        int totalCalorias = ingredientDetails.stream().mapToInt(IngredientDTO::getCantidadCalorias).sum();
        IngredientDTO ingredienteMasCalorico = ingredientDetails.stream()
                .max(Comparator.comparingInt(IngredientDTO::getCantidadCalorias))
                .orElse(null);

        return new DishResponseDTO(dish.getNombre(), totalCalorias, ingredientDetails, ingredienteMasCalorico);
    }

    @Override
    public DishDTO findByNamePlato(String name) {
        return this.dishes.stream()
                .filter(d -> d.getNombre().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    //Metodos de Ingredientes


    @Override
    public List<IngredientDTO> getAllIngredients() {
        return this.ingredients;
    }

    @Override
    public IngredientDTO findByNameIngredientes(Long idIngrediente) {
        return this.ingredients.stream().filter(i -> i.getId().equals(idIngrediente)).findFirst().orElse(null);
    }

    @Override
    public List<IngredientDTO> loadDataBaseIngredientes() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("src/main/java/app/json/ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredientDTO>> typeRef = new TypeReference<>() {};
        List<IngredientDTO> ingreDTO= null;
        try {
            ingreDTO= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingreDTO;

    }

    @Override
    public List<DishDTO> loadDataBasePlatos() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("src/main/java/app/json/dishes.json");
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<DishDTO>> typeRef = new TypeReference<>() {};
        List<DishDTO> dishDTO= null;
        try {
            dishDTO= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return dishDTO;
    }
}
