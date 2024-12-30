package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Movie;

import java.util.List;

public class MovieJPA {
    public void create(Movie nuevaPelicula) {
        EntityManager em = ConfigJPA.getEntityManager();

        try{
            // guardar algo en la DB
            em.getTransaction().begin(); // Iniciar una transaccion
            em.persist(nuevaPelicula);
            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }

    public Movie findOne(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            return em.find(Movie.class, idBuscado);
        }finally {
            em.close();
        }

    }

    public List<Movie> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Movie> query = em.createQuery("SELECT p FROM movies p", Movie.class);
            return query.getResultList();
        }finally {
            em.close();
        }

    }

    public void update(Movie actualizarPelicula) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            em.merge(actualizarPelicula);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            Movie movie = em.find(Movie.class, idEliminar);
            if (movie != null){
                em.remove(movie);
            }else{
                System.err.println("El id " + idEliminar + " No existe, gracias a antonio");
            }
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
