package integradorvehiculos;

import integradorvehiculos.Interfaces.Combustion;

public class Moto extends Vehiculo implements Combustion {
    
    private int cilindrada;
    private String tipoMotor;

    public Moto(int cilindrada, String tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Moto(int cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    
    @Override
    public int calcularAntiguedad() {
        int añoActual = 2023; // Año actual, puedes obtenerlo dinámicamente
        return añoActual - super.anio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto con cilindrada de " + cilindrada + " cc y motor " + tipoMotor + ".");
    }

    
    
}
