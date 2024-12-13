package coleccion_003_abstraccion;

public class Auto extends Vehiculo{

    private String modelo; // TODO: 26/11/2024 Yo puedo crear atributos que puedo usar o no en la clase hija. 
    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El auto " + marca + " está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El auto " + marca + " se está deteniendo.");
    }
}
