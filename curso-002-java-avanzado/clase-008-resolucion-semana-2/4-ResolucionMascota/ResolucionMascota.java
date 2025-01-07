package com.pruebajpa.resolucionmascota;

import com.pruebajpa.resolucionmascota.logica.Mascota;
import com.pruebajpa.resolucionmascota.logica.RegistroMascota;
import java.util.List;

public class ResolucionMascota {

    public static void main(String[] args) {
  
        RegistroMascota registro = new RegistroMascota();

        // Generar datos aleatorios para 10 mascotas
        registro.generarDatosAleatorios(10);

        // Buscar mascotas por nombre
        List<Mascota<?>> mascotasPorNombre = registro.buscarPorNombre("Max");
        for (Mascota<?> mascota : mascotasPorNombre) {
            System.out.println("Mascota encontrada por nombre: " + mascota.getNombre());
        }

        // Buscar mascotas por especie
        List<Mascota<?>> mascotasPorEspecie = registro.buscarPorEspecie("Gato");
        for (Mascota<?> mascota : mascotasPorEspecie) {
            System.out.println("Mascota encontrada por especie: " + mascota.getNombre() + " - " + mascota.getEspecie());
        }

        // Obtener la cantidad total de mascotas registradas
        int cantidadTotal = registro.cantidadTotalMascotas();
        System.out.println("Cantidad total de mascotas registradas: " + cantidadTotal);
    }
        
}
