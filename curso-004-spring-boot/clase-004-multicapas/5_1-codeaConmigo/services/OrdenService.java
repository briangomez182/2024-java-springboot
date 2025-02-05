package com.ejercicios.apiOrdenamieto.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenService implements IOrdenService{

    @Override
    public List<String> ordenarNombres(List<String> listaNombres) {
        Collections.sort(listaNombres);
        return listaNombres;
    }
    
}
