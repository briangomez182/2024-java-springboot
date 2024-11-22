import poo_001_clases.Auto;

public class Main {

    public static void main(String[] args) {
        Auto autoVacio = new Auto();

        autoVacio.setColor("Verde");
        autoVacio.setMarca("Ford");
        autoVacio.setVelocidad(100);

        System.out.println(autoVacio.getColor());

        Auto autoLleno = new Auto("rojo", "fiat", 50);

        System.out.println(autoLleno.getMarca());
    }
}
