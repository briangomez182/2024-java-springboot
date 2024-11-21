package tipoDeDatosReferencia.interfaces;

// Clase que implementa la interfaz
public class CocheHibrido implements Coche {
    @Override
    public void acelerar() {
        System.out.println("Acelerando coche híbrido");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando coche híbrido");
    }
}