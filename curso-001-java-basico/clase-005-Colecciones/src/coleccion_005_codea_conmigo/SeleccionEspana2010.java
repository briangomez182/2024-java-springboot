package coleccion_005_codea_conmigo;

import java.util.*;

public class SeleccionEspana2010 {

    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();

        // Creando objetos Jugador
        Jugador casillas = new Jugador("Iker Casillas", "Portero", 1);

        // Agregando jugadores a la lista
        jugadores.add(casillas);

        // Buscando un jugador por su número de camiseta
        int numeroABuscar = 1;

        /*for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNumeroCamiseta() == numeroABuscar) {
                System.out.println("Jugador encontrado: " + jugadores.get(i).toString());
                break; // Salimos del bucle cuando encontramos al jugador
            }
        }*/

        for (Jugador jugador : jugadores) {
            if (jugador.getNumeroCamiseta() == numeroABuscar) {
                System.out.println("Jugador encontrado: " + jugador);
                break; // Salimos del bucle cuando encontramos al jugador
            }
        }

    }

}