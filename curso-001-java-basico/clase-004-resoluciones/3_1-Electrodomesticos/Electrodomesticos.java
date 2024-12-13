package electrodomesticos;
/**
 *
 * @author Luisina
 */
public class Electrodomesticos {
    
    public static void main(String[] args) {
        
        // Crear 3 objetos de la clase Electrodomestico utilizando parámetros
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Samsung", "ABC123", 150.5, "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "LG", "XYZ456", 200.0, "Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Sony", "123XYZ", 180.8, "Plateado");

        // Crear 1 objeto de la clase Electrodomestico sin parámetros
        Electrodomestico electrodomesticoSinParametros = new Electrodomestico();

        // Mostrar por pantalla la marca, modelo y consumo energético de los electrodomésticos creados con parámetros
        System.out.println("Electrodoméstico 1 - Marca: " + electrodomestico1.getMarca() + ", Modelo: " + electrodomestico1.getModelo() + ", Consumo: " + electrodomestico1.getConsumo() + " kWh");
        System.out.println("Electrodoméstico 2 - Marca: " + electrodomestico2.getMarca() + ", Modelo: " + electrodomestico2.getModelo() + ", Consumo: " + electrodomestico2.getConsumo() + " kWh");
        System.out.println("Electrodoméstico 3 - Marca: " + electrodomestico3.getMarca() + ", Modelo: " + electrodomestico3.getModelo() + ", Consumo: " + electrodomestico3.getConsumo() + " kWh");

        // Intentar obtener la marca del electrodoméstico creado sin parámetros
        System.out.println("Marca del electrodoméstico sin parámetros: " + electrodomesticoSinParametros.getMarca());
        
        // La marca será el valor NULL
    
        
        
    }
    
}
