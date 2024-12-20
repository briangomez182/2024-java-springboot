package com.pruebajpa.mascotajpa;

import com.pruebajpa.mascotajpa.logica.Mascota;
import com.pruebajpa.mascotajpa.persistencia.ControladoraPersistencia;
import java.util.List;


public class MascotaJpa {

    public static void main(String[] args) {
       
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //Create
        Mascota masco = new Mascota (1,"Ibra","Canina", "Macho", "Luisina es la dueña");
        controlPersis.crearMascota(masco);
        controlPersis.crearMascota(new Mascota(2,"Gaia", "Canina", "Hembra", "Luisina tmb es la dueña"));
        controlPersis.crearMascota(new Mascota(3,"Morocha", "Canina", "Hembra", "Luisina tmb es la dueña 2"));
        
        //Read
        System.out.println("Las mascotas ANTES son: ");
        List<Mascota> listaMascotas = controlPersis.traerMascotas();
        for (Mascota mas : listaMascotas) {
            System.out.println(mas.toString());
        }
        
        //Delete
        controlPersis.eliminarMascota(2);
        
        //Update
        Mascota mascotita = controlPersis.buscarMascota(3);
        mascotita.setDatosDuenio("Luisina es dueña de morocha que es una mestiza");
        
        controlPersis.modificarMascota(mascotita);
        
        //Read
        System.out.println("Las mascotas DESPUÉS son: ");
        listaMascotas = controlPersis.traerMascotas();
        for (Mascota mas : listaMascotas) {
            System.out.println(mas.toString());
        }
         
    }
}
