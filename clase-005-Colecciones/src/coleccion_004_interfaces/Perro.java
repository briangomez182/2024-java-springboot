package coleccion_004_interfaces;

public class Perro implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre y juega.");
    }
}
