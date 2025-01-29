package com.hackaboss.app.utilities;

import java.util.List;
import java.util.Random;

public class RootUtilitie {

    public static String obtenerElementoRandom(List<String> listado) {
        int aleatorio = new Random().nextInt(listado.size());
        return listado.get(aleatorio);
    }
}
