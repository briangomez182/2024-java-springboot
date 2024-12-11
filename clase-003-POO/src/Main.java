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

        // Acelerar el doble de velocidad y un mensaje "Usted ahora va a 500Km/h"



        // Frenar N cantidad de Km/h y dar el mensaje "Usted bajo la velocidad desde 500km/h hasta 272K0/h"
        


        //Imprimir velodicad que va el auto


        System.out.println(autoLleno.acelerarAfondo());

        System.out.println(autoLleno.frenarUnPoco(115));

        System.out.println(autoLleno.getVelocidad());

    }
}
