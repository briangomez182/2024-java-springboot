package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Movie;

import java.util.List;

public class MovieJPA {

    // CREATE
    public void create(Movie movie) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(movie);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // READ: Obtener por ID
    public Movie findById(Integer id) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            return em.find(Movie.class, id);
        } finally {
            em.close();
        }
    }

    // READ: Listar todos
    public List<Movie> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<Movie> query = em.createQuery("SELECT p FROM movies p", Movie.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    // UPDATE
    public void update(Movie movie) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(movie);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // DELETE
    public void delete(Integer id) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Movie movie = em.find(Movie.class, id);
            if (movie != null) {
                em.remove(movie);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
