package poo_003_herencia;

import poo_001_abstraccion.Auto;

public class AutoDeportivo extends Auto {
    private boolean turboActivado;

    public AutoDeportivo() {
    }

    public void activarTurbo() {
        turboActivado = true;
        System.out.println("Turbo activado!");
    }


    @Override
    public void acelerar() {
        if (turboActivado) {
            System.out.println("El auto deportivo utilizó el turbo");
        } else {
            System.out.println("El auto aceleró pero el auto deportivo NO utilizó el turbo");
        }
    }

}
