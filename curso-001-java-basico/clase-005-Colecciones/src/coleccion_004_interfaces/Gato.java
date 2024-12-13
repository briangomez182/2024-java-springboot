package coleccion_004_interfaces;

public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }

    @Override
    public void moverse() {
        System.out.println("El gato sube a los árboles.");
    }
}