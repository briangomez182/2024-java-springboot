package integradorvehiculos;

import integradorvehiculos.Interfaces.Combustion;
import integradorvehiculos.Interfaces.Electrico;
import java.util.ArrayList;

public class IntegradorVehiculos {
  
    public static void main(String[] args) {
       
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Crear objetos de diferentes tipos de vehículos y agregarlos al ArrayList
        Auto autoElectrico = new Auto(75000, 5, 1, "ABC123", "Tesla", "Model S", 2020, 80000.0);
        Camioneta camionetaCombustion = new Camioneta(80, 10.5, 2, "XYZ789", "Toyota", "Hilux", 2019, 45000.0);
        Moto motoCombustion = new Moto(600, "4 tiempos", 3, "DEF456", "Honda", "CBR600", 2021, 12000.0);

        vehiculos.add(autoElectrico);
        vehiculos.add(camionetaCombustion);
        vehiculos.add(motoCombustion);

        // Mostrar información de cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.toString();
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad());
           
            if (vehiculo instanceof Electrico) { 
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

            /*  sirve para comprobar si un objeto pertenece a un tipo de dato específico.

            ¿Qué devuelve?

            El operador instanceof devuelve un valor booleano (verdadero o falso):

            true: Si el objeto a la izquierda del operador es una instancia de la clase a la derecha (o de una subclase).
            false: Si el objeto no es una instancia de esa clase. */

        }
        
    }
    
}
