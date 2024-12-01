package org.example.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entity.Movie;
import org.example.util.JPAUtil;

import java.util.List;


public class MovieService {

    // CREATE
    public void create(Movie movie) {
        EntityManager em = JPAUtil.getEntityManager();
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
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Movie.class, id);
        } finally {
            em.close();
        }
    }

    // READ: Listar todos
    public List<Movie> findAll() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Movie> query = em.createQuery("SELECT p FROM Movie p", Movie.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    // UPDATE
    public void update(Movie movie) {
        EntityManager em = JPAUtil.getEntityManager();
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
        EntityManager em = JPAUtil.getEntityManager();
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
