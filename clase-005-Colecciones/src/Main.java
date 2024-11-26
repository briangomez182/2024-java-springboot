import coleccion_003_abstraccion.Auto;
import coleccion_004_interfaces.Perro;

public class Main {
    public static void main(String[] args) {

        // TODO: 26/11/2024 Clase abstracta Parte #3 
        Auto auto = new Auto("ferrari");
        auto.arrancar();
        auto.detener();

        // TODO: 26/11/2024 Interfaces Parte #4
        Perro perro = new Perro();
        
        perro.moverse();
        perro.hacerSonido();
    }
}