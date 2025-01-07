
package com.pruebajpa.resolucionmascota.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascota {
    
    private List<Mascota<?>> registro;

    public RegistroMascota() {
        this.registro = new ArrayList<>();
    }

    public void agregarMascota(Mascota<?> mascota) {
        registro.add(mascota);
    }

    public List<Mascota<?>> buscarPorNombre(String nombre) {
        List<Mascota<?>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public List<Mascota<?>> buscarPorEspecie(Object especie) {
        List<Mascota<?>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public int cantidadTotalMascotas() {
        return registro.size();
    }

    public void generarDatosAleatorios(int cantidad) {
        
        Random random = new Random();
        String[] nombres = {"Max", "Luna", "Charlie", "Bella", "Toby", "Lola"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            int idAleatorio = i + 1; // Generar IDs únicos
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            //Este método genera un número entero aleatorio entre 0 (inclusive) y
            int edadAleatoria = random.nextInt(15) + 1;
            String especieAleatoria = especies[random.nextInt(especies.length)];

            // Agregar mascota aleatoria al registro
            agregarMascota(new Mascota<>(idAleatorio, nombreAleatorio, edadAleatoria, especieAleatoria));
        }
    }
    
}
