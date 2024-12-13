package coleccion_003_abstraccion;

public abstract class Vehiculo {

    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    //métodos abstractos (sin implementación)
    public abstract void arrancar();
    public abstract void detener();

    //método implementado
    public void limpiarParabrisas() {
        System.out.println("Limpiando parabrisas");
    }
}
