package com.pruebajpa.mascotajpa.persistencia;

import com.pruebajpa.mascotajpa.logica.Mascota;
import com.pruebajpa.mascotajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    MascotaJpaController mascoJpa = new MascotaJpaController();
    
    
   public void crearMascota (Mascota masco) {
            mascoJpa.create(masco);
    }
        
     public List<Mascota> traerMascotas () {
            return mascoJpa.findMascotaEntities();
     }   
     
     
     public Mascota buscarMascota (int id) {
         return mascoJpa.findMascota(id);
     }
     
     public void eliminarMascota (int id) {
        try {
            mascoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void modificarMascota (Mascota masco) {
          try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
        
    
}
