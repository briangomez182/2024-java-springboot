package com.pruebajpa.simuladordirectorios.logica;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        this.subdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        this.archivos.add(archivo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }
    
    
    
    
}
